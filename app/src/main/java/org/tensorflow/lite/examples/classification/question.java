package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.TransitionManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Switch;

import java.util.ArrayList;

public class question extends AppCompatActivity {
    Switch sbutton1,sbutton2,sbutton3,sbutton4,sbutton5,sbutton6,sbutton7;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    ViewGroup tg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        // Definition of the view group
        tg=findViewById(R.id.tg);
        //Definition of the switch butooms
        sbutton1=findViewById(R.id.switch1);
        sbutton2=findViewById(R.id.switch23);
        sbutton3=findViewById(R.id.switch3);
        sbutton4=findViewById(R.id.switch4);
        sbutton5=findViewById(R.id.switch5);
        sbutton6=findViewById(R.id.switch6);
        sbutton7=findViewById(R.id.switch7);
        //Definition of the buttons
        btn1=findViewById(R.id.fbutton1);
        btn2=findViewById(R.id.fbutton2);
        btn3=findViewById(R.id.fbutton3);
        btn4=findViewById(R.id.fbutton4);
        btn5=findViewById(R.id.fbutton5);
        btn6=findViewById(R.id.fbutton6);
        btn7=findViewById(R.id.fbutton7);
        //to make save state of switch make the refernce in the storage inthe device
        SharedPreferences sharedPreferences1=getSharedPreferences("save1",MODE_PRIVATE);
        SharedPreferences sharedPreferences2=getSharedPreferences("save2",MODE_PRIVATE);
        SharedPreferences sharedPreferences3=getSharedPreferences("save3",MODE_PRIVATE);
        SharedPreferences sharedPreferences4=getSharedPreferences("save4",MODE_PRIVATE);
        SharedPreferences sharedPreferences5=getSharedPreferences("save5",MODE_PRIVATE);
        SharedPreferences sharedPreferences6=getSharedPreferences("save6",MODE_PRIVATE);
        SharedPreferences sharedPreferences7=getSharedPreferences("save7",MODE_PRIVATE);
        //give the preference the intial value
        sbutton1.setChecked(sharedPreferences1.getBoolean("value1",true));
        sbutton2.setChecked(sharedPreferences2.getBoolean("value2",true));
        sbutton3.setChecked(sharedPreferences3.getBoolean("value3",true));
        sbutton4.setChecked(sharedPreferences4.getBoolean("value4",true));
        sbutton5.setChecked(sharedPreferences5.getBoolean("value5",true));
        sbutton6.setChecked(sharedPreferences6.getBoolean("value6",true));
        sbutton7.setChecked(sharedPreferences7.getBoolean("value7",true));


        //make the listener in on click to the frist switch button make it on
        sbutton1.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg);//set the group view
                //set the visiblty to invisible
                visible =!visible;
                //make the condition to check the swithch is on or of and save the state
                if(sbutton1.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save1",MODE_PRIVATE).edit();//save the state of switch button
                    editor.putBoolean("value1",true);//set value 1 to true
                    editor.apply();
                    sbutton1.setChecked(true);
                    btn1.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save1",MODE_PRIVATE).edit();//save the state of switch button
                    editor.putBoolean("value1",false);//set value 1 to false
                    editor.apply();
                    sbutton1.setChecked(false);
                    btn1.setVisibility( View.GONE);
                }

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            //that intent make the botton when clicked go to the vitamin A page inthe application
            {
                Intent intent =new Intent(question.this, vitaminA.class);
                startActivity(intent);
                finish();
            }
        });



        sbutton2.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg);
                visible =!visible;

                if(sbutton2.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save2",MODE_PRIVATE).edit();
                    editor.putBoolean("value2",true);
                    editor.apply();
                    sbutton2.setChecked(true);
                    btn2.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save2",MODE_PRIVATE).edit();
                    editor.putBoolean("value2",false);
                    editor.apply();
                    sbutton2.setChecked(false);
                    btn2.setVisibility( View.GONE);
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question.this, vitaminD.class);
                startActivity(intent);
                finish();
            }
        });


        sbutton3.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg);
                visible =!visible;

                if(sbutton3.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save3",MODE_PRIVATE).edit();
                    editor.putBoolean("value3",true);
                    editor.apply();
                    sbutton3.setChecked(true);
                    btn3.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save3",MODE_PRIVATE).edit();
                    editor.putBoolean("value3",false);
                    editor.apply();
                    sbutton3.setChecked(false);
                    btn3.setVisibility( View.GONE);
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question.this, vitaminK.class);
                startActivity(intent);
                finish();
            }
        });




        sbutton4.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg);
                visible =!visible;
                if(sbutton4.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save4",MODE_PRIVATE).edit();
                    editor.putBoolean("value4",true);
                    editor.apply();
                    sbutton4.setChecked(true);
                    btn4.setVisibility( View.VISIBLE);
                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save4",MODE_PRIVATE).edit();
                    editor.putBoolean("value4",false);
                    editor.apply();
                    sbutton4.setChecked(false);
                    btn4.setVisibility( View.GONE);
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question.this, vitaminC.class);
                startActivity(intent);
                finish();
            }
        });


        sbutton5.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg);
                visible =!visible;

                if(sbutton5.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save5",MODE_PRIVATE).edit();
                    editor.putBoolean("value5",true);
                    editor.apply();
                    sbutton5.setChecked(true);
                    btn5.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save5",MODE_PRIVATE).edit();
                    editor.putBoolean("value5",false);
                    editor.apply();
                    sbutton5.setChecked(false);
                    btn5.setVisibility( View.GONE);
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question.this, vitaminB12.class);
                startActivity(intent);
                finish();
            }
        });



        sbutton6.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg);
                visible =!visible;

                if(sbutton6.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save6",MODE_PRIVATE).edit();
                    editor.putBoolean("value6",true);
                    editor.apply();
                    sbutton6.setChecked(true);
                    btn6.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save6",MODE_PRIVATE).edit();
                    editor.putBoolean("value6",false);
                    editor.apply();
                    sbutton6.setChecked(false);
                    btn6.setVisibility( View.GONE);
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question.this, vitaminB6.class);
                startActivity(intent);
                finish();
            }
        });



        sbutton7.setOnClickListener(new View.OnClickListener() {

            boolean visible;
            @Override
            public void onClick(View view) {
                TransitionManager.beginDelayedTransition(tg);
                visible =!visible;

                if(sbutton7.isChecked()){
                    SharedPreferences.Editor editor=getSharedPreferences("save7",MODE_PRIVATE).edit();
                    editor.putBoolean("value7",true);
                    editor.apply();
                    sbutton7.setChecked(true);
                    btn7.setVisibility(View.VISIBLE);

                }else {
                    SharedPreferences.Editor editor=getSharedPreferences("save7",MODE_PRIVATE).edit();
                    editor.putBoolean("value7",false);
                    editor.apply();
                    sbutton7.setChecked(false);
                    btn7.setVisibility( View.GONE);
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question.this, vitaminE.class);
                startActivity(intent);
                finish();
            }
        });


        ImageView imageView=findViewById(R.id.backicon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(question.this, choose_test.class);
                startActivity(intent);
                finish();
            }
        });
    }
}