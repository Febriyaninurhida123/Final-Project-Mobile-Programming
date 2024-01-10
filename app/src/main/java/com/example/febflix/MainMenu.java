package com.example.febflix;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        // Inisialisasi CardView
        CardView cdMenu1 = findViewById(R.id.cdMenu1);
        CardView cdMenu2 = findViewById(R.id.cdMenu2);
        CardView cdMenu3 = findViewById(R.id.cdMenu3);
        CardView cdMenu4 = findViewById(R.id.cdMenu4);
        CardView cdMenu5 = findViewById(R.id.cdMenu5);
        CardView cdMenu6 = findViewById(R.id.cdMenu6);
        CardView cdMenu7 = findViewById(R.id.cdMenu7);
        CardView cdMenu8 = findViewById(R.id.cdMenu8);

        // Set OnClickListener untuk setiap CardView
        cdMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ... kode onClick
            }
        });

        cdMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ... kode onClick
                launchCountProject(v);
            }
        });

        cdMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ... kode onClick
                launchSianidaProject(v);
            }
        });

        cdMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ... kode onClick
                launchAlarmProject(v);
            }
        });

        cdMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ... kode onClick
                launchFibonacciProject(v);
            }
        });

        cdMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ... kode onClick
                launchMessegeProject(v);
            }
        });

        cdMenu7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ... kode onClick
                launchMapProject(v);
            }
        });

        cdMenu8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ... kode onClick
                launchMovieProject(v);
            }
        });
    }

    // Metode untuk menjalankan aktivitas Count
    public void launchCountProject(View v) {
        Intent intent = new Intent(this, Count.class);
        startActivity(intent);
    }

    // Metode untuk menjalankan aktivitas Sianida
    public void launchSianidaProject(View v) {
        Intent intent = new Intent(this, Sianida.class);
        startActivity(intent);
    }

    // Metode untuk menjalankan aktivitas Alarm
    public void launchAlarmProject(View v) {
        Intent intent = new Intent(this, Alarm.class);
        startActivity(intent);
    }

    // Metode untuk menjalankan aktivitas Fibonacci
    public void launchFibonacciProject(View v) {
        Intent intent = new Intent(this, Fibonacci.class);
        startActivity(intent);
    }

    // Metode untuk menjalankan aktivitas Messege
    public void launchMessegeProject(View v) {
        Intent intent = new Intent(this, Messege1.class);
        startActivity(intent);
    }

    // Metode untuk menjalankan aktivitas Map
    public void launchMapProject(View v) {
        Intent intent = new Intent(this, Maps.class);
        startActivity(intent);
    }

    // Metode untuk menjalankan aktivitas Movie
    public void launchMovieProject(View v) {
        Intent intent = new Intent(this, ViewPager.class);
        startActivity(intent);
    }

}
