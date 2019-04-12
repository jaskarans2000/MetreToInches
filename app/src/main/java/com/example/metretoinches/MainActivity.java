package com.example.metretoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText editText;
private Button button;
private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.editText);
        button=(Button)findViewById(R.id.button);
        textView=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().equals(""))
                {
                    textView.setVisibility(View.VISIBLE);
                    textView.setText(R.string.empty_String);
                }
                else{
                button.setTextColor(Color.CYAN);
                button.setText(R.string.button_name);
                double d=Double.parseDouble(editText.getText().toString());
                double result=d*39.37;
                textView.setVisibility(View.VISIBLE);
                textView.setTextColor(Color.MAGENTA);
                textView.setText(String.format("%.2f",result)+"inches");
            }}
        });
    }
}
