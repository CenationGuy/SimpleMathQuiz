package com.example.simplemathquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView finalscore;
    Button playagain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        finalscore = findViewById(R.id.finalscore);
        playagain = findViewById(R.id.playagain);

        Intent it = getIntent();
        String points = it.getStringExtra("points");
        String questions = it.getStringExtra("questions");

        finalscore.setText(points + "/" + questions);

        playagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(it);
            }
        });
    }

}