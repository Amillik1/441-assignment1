package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    String[] objects = {"Choose an object to measure to", "Sheets of paper", "Cans of soda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.object);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, objects);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final DecimalFormat df = new DecimalFormat("0.0");
        final TextView height = findViewById(R.id.height);

        final TextView txtTitle = findViewById(R.id.txtTitle);
        final TextView objAnswer = findViewById(R.id.objAnswer);
        final TextView txtAnswer = findViewById(R.id.txtAnswer);

        final ImageView image = (ImageView)findViewById(R.id.outputImage);
        final Button button = findViewById(R.id.convert);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                //do stuff
                txtTitle.setVisibility(View.VISIBLE);
                objAnswer.setVisibility(View.VISIBLE);
                txtAnswer.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                if (spinner.getSelectedItem() == "Choose an object to measure to"){
                    objAnswer.setText("Idiots:");
                    txtAnswer.setText("1");
                    image.setImageResource(R.drawable.idiot);
                }
                if (spinner.getSelectedItem() == "Sheets of paper"){
                    objAnswer.setText("Sheets of paper:");
                    double answer = Double.parseDouble(height.getText().toString());
                    txtAnswer.setText(df.format(answer/11));
                    image.setImageResource(R.drawable.paper);

                }
            }
        });
    }
}
