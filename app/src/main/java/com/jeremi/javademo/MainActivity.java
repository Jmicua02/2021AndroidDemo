package com.jeremi.javademo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editName, editAge;
    TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName=findViewById(R.id.editName);
        editAge= findViewById(R.id.editAge);
        display= findViewById(R.id.txtDisplay);

    }

    public void functionSubmit(View view) {
        String name, age;

        name=editName.getText().toString();
        age= editAge.getText().toString();

        display.setText("Name: "+name+"\nAge: "+ age+" years old");
    }
}