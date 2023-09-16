package org.tensorflow.lite.examples.classification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {
    private EditText emailEt,passwordEt1,passwordEt2,ageEt;
    private Button SignUpButton;
    private TextView SignInTv;
    private RadioGroup radioGroup;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    private String gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        firebaseAuth = FirebaseAuth.getInstance();
        emailEt = findViewById(R.id.email);
        ageEt = findViewById(R.id.age);
        passwordEt1 = findViewById(R.id.password1);
        passwordEt2 = findViewById(R.id.password2);
        SignUpButton = findViewById(R.id.register);
        progressDialog =new ProgressDialog(this);
        SignInTv = findViewById(R.id.signIntv);
        radioGroup =findViewById(R.id.radio_grp);

        onRadioButtonClicked();

        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();

            }
        });
        SignInTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SignUp.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });


    }

    private void Register(){
        String email= emailEt.getText().toString() ;
        String password1=  passwordEt1.getText().toString();
        String password2= passwordEt2.getText().toString();
        String age =ageEt.getText().toString();

        if(TextUtils.isEmpty(email)){
            emailEt.setError("Enter your email");
            return;
        }
        else if(TextUtils.isEmpty(password1)){
            passwordEt1.setError("Enter your password");
            return;
        }
        else if(TextUtils.isEmpty(password2)){
            passwordEt2.setError("Enter your password");
            return;
        }
        else if(!password1.equals(password2)){
            passwordEt2.setError("Different password");
            return;
        }
        else if(password1.length()<4) {
            passwordEt1.setError("The password is to short");
            return;
        }

        else if(!isVallidEmail(email)) {
            emailEt.setError("EnValid email");
            return;
        }
        else if(TextUtils.isEmpty(age)){
            ageEt.setError("Enter your age please");
            return;
        }

        if (TextUtils.isEmpty(gender))
        {
            Toast.makeText(getApplicationContext(), "Please choose gender", Toast.LENGTH_SHORT).show();
            return;
        }


        progressDialog.setMessage("please wait....");
        progressDialog .show();
        progressDialog.setCanceledOnTouchOutside(false);

        firebaseAuth.createUserWithEmailAndPassword(email,password1).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(SignUp.this,"Successful registered",Toast.LENGTH_LONG).show();
                    Intent intent =new Intent(SignUp.this,choose_test.class);
                    startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(SignUp.this,"Sign Up fail!",Toast.LENGTH_LONG).show();
                }
                progressDialog.dismiss();

            }
        });


    }



    private Boolean isVallidEmail(CharSequence target){
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    private void onRadioButtonClicked(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.radio_male :
                        gender = "male";
                        break;
                    case R.id.radio_female :
                        gender = "female";
                        break;
                }
            }
        });


    }


}
