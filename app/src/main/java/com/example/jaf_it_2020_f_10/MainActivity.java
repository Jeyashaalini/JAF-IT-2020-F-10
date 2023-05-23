package com.example.jaf_it_2020_f_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    String[] CourseArray = {"HNDA","HNDM","HNDE","HNDIT","HNDTHM","HNDPM"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line, CourseArray);
        ListView CourseListView = (ListView) findViewById(R.id.listView);
        CourseListView.setAdapter(adapter);

        CourseListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id)
            {
                String item = ((TextView) view).getText().toString();
                Toast.makeText(getBaseContext(), item, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("course",item);
                startActivity(intent);
            }
        });
    }
    }