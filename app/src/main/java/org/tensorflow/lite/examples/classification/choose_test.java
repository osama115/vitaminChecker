package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import org.tensorflow.lite.examples.classification.tflite.Classifier;

public class choose_test extends AppCompatActivity {
    private CardView help,physical,testin,testout,vitamindata,logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_test);

        testout = findViewById(R.id.card1);
        testin = findViewById(R.id.card2);
        physical = findViewById(R.id.card3);
        logout = findViewById(R.id.card4);
        help = findViewById(R.id.card5);
        vitamindata = findViewById(R.id.card8);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(choose_test.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        testout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(choose_test.this,question_2.class);
                startActivity(intent);
                finish();

            }
        });

        testin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(choose_test.this,question.class);
                startActivity(intent);
                finish();

            }
        });
        physical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(choose_test.this,ClassifierActivity.class);
                startActivity(intent);
                finish();

            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent =new Intent(choose_test.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(choose_test.this,help.class);
                startActivity(intent);
                finish();

            }
        });

        vitamindata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(choose_test.this,vitamin_data.class);
                startActivity(intent);
                finish();

            }
        });
    }
}