package edu.temple.coloractivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = findViewById(R.id.spinner);
        final ListView listView = findViewById(R.id.listView);


        final String colors[] = {"RED", "DARKGRAY", "YELLOW", "GREEN", "BLUE",
                "CYAN", "MAGENTA", "LIGHTGRAY", "GRAY", "BLACK"};

        final ColorAdapter adapter = new ColorAdapter(MainActivity.this, colors);

        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listView.setBackgroundColor(Color.parseColor(colors[position]));
            }
        });

    }
}
