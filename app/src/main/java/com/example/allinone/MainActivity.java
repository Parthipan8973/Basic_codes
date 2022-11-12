package com.example.allinone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    EditText entertext;
    TextView viewtext;
    String textt;
    TextView dateview;
    TextView timeview;
    EditText intenttext;
    MediaPlayer song;
    VideoView videoplay;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entertext=findViewById(R.id.editTextTextPersonName);
        viewtext=findViewById(R.id.textView);
        dateview=findViewById(R.id.textView3);
        timeview=findViewById(R.id.textView4);
        intenttext=findViewById(R.id.editTextTextPersonName2);
        videoplay=findViewById(R.id.videoView);

    }

    public void textdisplay(View view) {
       textt=entertext.getText().toString();
        viewtext.setText(textt);
    }

    public void alert(View view) {

        AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
        alert.setTitle("Alert");
        alert.setIcon(R.drawable.ic_launcher_background);
        alert.setMessage("this page very usefull for you");
        alert.setPositiveButton("yes",null);
        alert.setNegativeButton("no",null);
        alert.setNeutralButton("cancel",null);
        alert.show();
    }

    public void Custom(View view) {

        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.activity_main);
        dialog.show();


    }

    public void Datepicker(View view) {
        DatePickerDialog datepicker = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                dateview.setText(i+"/"+(i1+1)+"/"+i2);


            }
        },2021,11,15);
        datepicker.show();

    }

    public void Timebtn(View view) {

        TimePickerDialog timepicker = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {

                timeview.setText(i+":"+i1);



            }
        },12,00,true);
        timepicker.show();

    }

    public void intent(View view) {

        Intent nextpage = new Intent(MainActivity.this,Intentpage.class);

        nextpage.putExtra("intent",intenttext.getText().toString());



        startActivity(nextpage);
    }

    boolean isPlaying = false;



    public void music(View view) {

        MediaPlayer song = MediaPlayer.create(MainActivity.this,R.raw.master);



        if (isPlaying){
           song.pause();
        }
        else {song.start();

        }





    }

    public void video(View view) {
        Uri videolink = Uri.parse("https://www.ebookfrenzy.com/android_book/movie.mp4");
        videoplay.setVideoURI(videolink);
        videoplay.start();
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.list,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void toast(View view) {
        Toast.makeText(this, "You are Touched this text", Toast.LENGTH_SHORT).show();
    }

    public void webpage(View view) {

        Intent webpg = new Intent(MainActivity.this, Webview.class);
        startActivity(webpg);
    }
}