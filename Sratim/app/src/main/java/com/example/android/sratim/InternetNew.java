package com.example.android.sratim;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class InternetNew extends AppCompatActivity {
private SingleMovieReaderController controller;
private  ListView listViewMovies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internet_new);
        controller = new SingleMovieReaderController(this);

    }

public void onClick_getItems(View view){
    EditText search = (EditText) findViewById(R.id.search);
    String str = search.getText().toString();
        controller.readAllMovies(str);
 /*   Intent intent = getIntent();
    Movie movie = (Movie) getIntent().getSerializableExtra("movie");
    onActivityResult(1, RESULT_OK, intent);  here is the try, the listview doesnt open and I don`t know why, and the movie is null. */
    }

}

