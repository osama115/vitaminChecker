package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.TransitionManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class question_2 extends AppCompatActivity {
    Switch sbutton11,sbutton12,sbutton13,sbutton14,sbutton15,sbutton16;
    Button btn11,btn12,btn13,btn14,btn15,btn16;
    ViewGroup tg1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_2);
        // Definition of the view group
        tg1=findViewById(R.id.tg1);
        //Definition of the switch butooms
        sbutton11=findViewById(R.id.switch11);
        sbutton12=findViewById(R.id.switch12);
        sbutton13=findViewById(R.id.switch13);
        sbutton14=findViewById(R.id.switch14);
        sbutton15=findViewById(R.id.switch15);
        sbutton16=findViewById(R.id.switch16);

        //Definition of the buttons
        btn11=findViewById(R.id.fbutton11);
        btn12=findViewById(R.id.fbutton12);
        btn13=findViewById(R.id.fbutton13);
        btn14=findViewById(R.id.fbutton14);
        btn15=findViewById(R.id.fbutton15);
        btn16=findViewById(R.id.fbutton16);

        //to make save state of switch make the refernce in the storage inthe device
        SharedPreferences sharedPreferences11=getSharedPreferences("save11",MODE_PRIVATE);
        SharedPreferences sharedPreferences12=getSharedPreferences("save12",MODE_PRIVATE);
        SharedPreferences sharedPreferences13=getSharedPreferences("save13",MODE_PRIVATE);
        SharedPreferences sharedPreferences14=getSharedPreferences("save14",MODE_PRIVATE);
        SharedPreferences sharedPreferences15=getSharedPreferences("save15",MODE_PRIVATE);
        SharedPreferences sharedPreferences16=getSharedPreferences("save16",MODE_PRIVATE);

        //give the preference the intial value
        sbutton11.setChecked(sharedPreferences11.getBoolean("value11",true));
        sbutton12.setChecked(sharedPreferences12.getBoolean("value12",true));
        sbutton13.setChecked(sharedPreferences13.getBoolean("value13",true));
        sbutton14.setChecked(sharedPreferences14.getBoolean("value14",true));
        sbutton15.setChecked(sharedPreferences15.getBoolean("value15",true));
        sbutton16.setChecked(sharedPreferences16.getBoolean("value16",true));



        //make the listener in on click to the frist switch button make it on
        sbutton11.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg1); //set the group view
                //set the visiblty to invisible
                visible =!visible;
                if(sbutton11.isChecked())//make the condition to check the swithch is on or of and save the state
                     {
                    SharedPreferences.Editor editor=getSharedPreferences("save11",MODE_PRIVATE).edit();
                    editor.putBoolean("value11",true);
                    editor.apply();
                    sbutton11.setChecked(true);
                    btn11.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save11",MODE_PRIVATE).edit();//save the state of switch button
                    editor.putBoolean("value11",false);
                    editor.apply();
                    sbutton11.setChecked(false);
                    btn11.setVisibility( View.GONE);
                }
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question_2.this, vitaminA.class);//that intent make the botton when clicked go to the vitamin A page inthe application
                startActivity(intent);
                finish();
            }
        });



        sbutton12.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg1);
                visible =!visible;

                if(sbutton12.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save12",MODE_PRIVATE).edit();
                    editor.putBoolean("value12",true);
                    editor.apply();
                    sbutton12.setChecked(true);
                    btn12.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save12",MODE_PRIVATE).edit();
                    editor.putBoolean("value12",false);
                    editor.apply();
                    sbutton12.setChecked(false);
                    btn12.setVisibility( View.GONE);
                }
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question_2.this, vitaminD.class);
                startActivity(intent);
                finish();
            }
        });


        sbutton13.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg1);
                visible =!visible;

                if(sbutton13.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save13",MODE_PRIVATE).edit();
                    editor.putBoolean("value13",true);
                    editor.apply();
                    sbutton13.setChecked(true);
                    btn13.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save13",MODE_PRIVATE).edit();
                    editor.putBoolean("value13",false);
                    editor.apply();
                    sbutton13.setChecked(false);
                    btn13.setVisibility( View.GONE);
                }
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question_2.this, vitaminK.class);
                startActivity(intent);
                finish();
            }
        });




        sbutton14.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg1);
                visible =!visible;
                if(sbutton14.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save14",MODE_PRIVATE).edit();
                    editor.putBoolean("value14",true);
                    editor.apply();
                    sbutton14.setChecked(true);
                    btn14.setVisibility( View.VISIBLE);
                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save14",MODE_PRIVATE).edit();
                    editor.putBoolean("value14",false);
                    editor.apply();
                    sbutton14.setChecked(false);
                    btn14.setVisibility( View.GONE);
                }
            }
        });

        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question_2.this, vitaminC.class);
                startActivity(intent);
                finish();
            }
        });


        sbutton15.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg1);
                visible =!visible;

                if(sbutton15.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save15",MODE_PRIVATE).edit();
                    editor.putBoolean("value15",true);
                    editor.apply();
                    sbutton15.setChecked(true);
                    btn15.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save15",MODE_PRIVATE).edit();
                    editor.putBoolean("value15",false);
                    editor.apply();
                    sbutton15.setChecked(false);
                    btn15.setVisibility( View.GONE);
                }
            }
        });

        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question_2.this, vitaminB12.class);
                startActivity(intent);
                finish();
            }
        });



        sbutton16.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg1);
                visible =!visible;

                if(sbutton16.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save16",MODE_PRIVATE).edit();
                    editor.putBoolean("value16",true);
                    editor.apply();
                    sbutton16.setChecked(true);
                    btn16.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save16",MODE_PRIVATE).edit();
                    editor.putBoolean("value16",false);
                    editor.apply();
                    sbutton16.setChecked(false);
                    btn16.setVisibility( View.GONE);
                }
            }
        });

        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question_2.this, vitaminB6.class);
                startActivity(intent);
                finish();
            }
        });


        ImageView imageView=findViewById(R.id.backicon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question_2.this, choose_test.class);
                startActivity(intent);
                finish();
            }
        });


    }
}