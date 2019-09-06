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
    String[] objects = {"Choose an object to measure to", "Sheets of paper", "Cans of soda", "Army men", "Cucumber", "Dollars", "Rickarum", "Pizza boxes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.object);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, objects);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final DecimalFormat df = new DecimalFormat("0.00");
        final TextView height = findViewById(R.id.height);

        final TextView txtTitle = findViewById(R.id.txtTitle);
        final TextView objAnswer = findViewById(R.id.objAnswer);
        final TextView txtAnswer = findViewById(R.id.txtAnswer);

        final ImageView image = (ImageView)findViewById(R.id.outputImage);
        final Button button = findViewById(R.id.convert);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick (View v){
                //do stuff
                int idiot = 0;
                txtTitle.setVisibility(View.VISIBLE);
                objAnswer.setVisibility(View.VISIBLE);
                txtAnswer.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                if (spinner.getSelectedItem() == "Sheets of paper"){
                    objAnswer.setText("Sheets of paper:");
                    double answer = 0;
                    try {
                        answer = Double.parseDouble(height.getText().toString());
                    }catch (Exception e){
                        idiot = 1;
                    }
                    txtAnswer.setText(df.format(answer/11));
                    image.setImageResource(R.drawable.paper);

                }
                if (spinner.getSelectedItem() == "Cans of soda"){
                    objAnswer.setText("Cans of soda:");
                    double answer = 0;
                    try {
                        answer = Double.parseDouble(height.getText().toString());
                    }catch (Exception e){
                        idiot = 1;
                    }
                    txtAnswer.setText(df.format(answer/4.83));
                    image.setImageResource(R.drawable.soda);

                }
                if (spinner.getSelectedItem() == "Army men"){
                    objAnswer.setText("Army men:");
                    double answer = 0;
                    try {
                        answer = Double.parseDouble(height.getText().toString());
                    }catch (Exception e){
                        idiot = 1;
                    }
                    txtAnswer.setText(df.format(answer/2));
                    image.setImageResource(R.drawable.army);

                }
                if (spinner.getSelectedItem() == "Cucumber"){
                    objAnswer.setText("Cucumber:");
                    double answer = 0;
                    try {
                        answer = Double.parseDouble(height.getText().toString());
                    }catch (Exception e){
                        idiot = 1;
                    }
                    txtAnswer.setText(df.format(answer/67));
                    image.setImageResource(R.drawable.cucumber);

                }
                if (spinner.getSelectedItem() == "Dollars"){
                    objAnswer.setText("Dollars:");
                    double answer = 0;
                    try {
                        answer = Double.parseDouble(height.getText().toString());
                    }catch (Exception e){
                        idiot = 1;
                    }
                    txtAnswer.setText(df.format(answer/6.14));
                    image.setImageResource(R.drawable.dollar);
                }
                if (spinner.getSelectedItem() == "Rickarum"){
                    objAnswer.setText("Ikea lamps:");
                    double answer = 0;
                    try {
                        answer = Double.parseDouble(height.getText().toString());
                    }catch (Exception e){
                        idiot = 1;
                    }
                    txtAnswer.setText(df.format(answer/23));
                    image.setImageResource(R.drawable.rickarum);
                }
                if (spinner.getSelectedItem() == "Pizza boxes"){
                    objAnswer.setText("Pizza boxes:");
                    double answer = 0;
                    try {
                        answer = Double.parseDouble(height.getText().toString());
                    }catch (Exception e){
                        idiot = 1;
                    }
                    txtAnswer.setText(df.format(answer/1.75));
                    image.setImageResource(R.drawable.pizza);
                }
                if (spinner.getSelectedItem() == "Choose an object to measure to" || idiot == 1){
                    objAnswer.setText("Idiots:");
                    txtAnswer.setText("1");
                    image.setImageResource(R.drawable.idiot);
                }

            }
        });
    }
}
