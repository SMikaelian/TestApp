package com.sarkismikaelian.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Need to reference all identifiers for the button, text field and answer.
    private EditText textField;
    private TextView answerLabel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textField= findViewById(R.id.text_field);
        Button submitButton= findViewById(R.id.submit_button);
        submitButton.setOnClickListener(this);
        answerLabel= findViewById(R.id.answer_label);

        //onclick listener and oncreate listener
        //submitButton.setOnClickListener(thus);
    }
    @Override
    public void onClick(View v)
    {
        String textFieldText= textField.getText().toString();
        if(textFieldText.equalsIgnoreCase("42")){
            answerLabel.setText(R.string.answer_label_correct);
        }
        else {
            answerLabel.setText(R.string.answer_label_incorrect);
        }
    }


}
