package com.example.practiceactvity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText login_Username;
    private EditText login_Password;
    private TextView login_Error;
    private Button login_Button;

    String username = "Test123";
    String password = "Test123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //R.id.objectID is used to connect the variable with the ui element
        //the casting is to be sure that it is the element desired.

        login_Username = (EditText) findViewById(R.id.loginUsername);
        login_Password = (EditText) findViewById(R.id.loginPassword);
        login_Button = (Button) findViewById(R.id.loginBtn);
        login_Error = (TextView) findViewById(R.id.loginErrorMsg);

        login_Button.setOnClickListener(v -> {
            String inputName = login_Username.getText().toString();
            String inputPassword = login_Password.getText().toString();

            if(inputName.equals(username)){
                if(inputPassword.equals(password)){
                    Toast.makeText(MainActivity.this, "Login Succeed", Toast.LENGTH_SHORT).show();
                    sendToHomeScreen();
                }
                else{
                    login_Error.setText("Password is incorrect.");
                }
            }else{
                login_Error.setText("Username entered does not exist.");
            }
        });

    }

    private void sendToHomeScreen() {
        //In order to move from one screen to the other you need to create an Intent with the context
        //and the java class of the activity you want  to pass it onto.
        Intent intent = new Intent(this, HomeScreen.class);
        //Once you have the intent you need to use the method called startActivity and pass it the
        //previously made intent.
        startActivity(intent);

    }
}