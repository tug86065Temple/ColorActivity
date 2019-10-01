package edu.temple.coloractivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        ListView listView = findViewById(R.id.listView);


        String colors[] = {"RED", "LTGRAY", "YELLOW", "GREEN", "BLUE",
                "CYAN", "MAGENTA", "PINK", "GRAY", "BLACK"};

        ColorAdapter adapter = new ColorAdapter(MainActivity.this, colors);

        spinner.setAdapter(adapter);
        listView.setAdapter(adapter);

        /*spinner.setOnItemSelectedListener();
        listView.setOnItemClickListener();
*/
    }
}
