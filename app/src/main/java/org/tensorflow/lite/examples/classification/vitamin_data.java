package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class vitamin_data extends AppCompatActivity {
    Button btn111,btn112,btn113,btn114,btn115,btn116,btn117;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamin_data);

        ///defind of the button by the id in the variable
        btn111=findViewById(R.id.button111);
        btn112=findViewById(R.id.button112);
        btn113=findViewById(R.id.button113);
        btn114=findViewById(R.id.button114);
        btn115=findViewById(R.id.button115);
        btn116=findViewById(R.id.button116);
        btn117=findViewById(R.id.button117);
        // make the listener to the button
        btn111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(vitamin_data.this,vitaminA.class);
                startActivity(intent);
                finish();

            }
        });
        btn112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(vitamin_data.this,vitaminD.class);
                startActivity(intent);
                finish();

            }
        });
        btn113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(vitamin_data.this,vitaminK.class);
                startActivity(intent);
                finish();

            }
        });
        btn114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(vitamin_data.this,vitaminC.class);
                startActivity(intent);
                finish();

            }
        });
        btn115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(vitamin_data.this,vitaminB12.class);
                startActivity(intent);
                finish();

            }
        });
        btn116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(vitamin_data.this,vitaminB6.class);
                startActivity(intent);
                finish();

            }
        });
        btn117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(vitamin_data.this,vitaminE.class);
                startActivity(intent);
                finish();
            }
        });

        ImageView imageView=findViewById(R.id.backicon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(vitamin_data.this, choose_test.class);
                startActivity(intent);
                finish();
            }
        });

    }
}