package com.example.vikram.retrofitpostwitharguments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call = (Button) findViewById(R.id.call);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ApInterface taskService = ServiceGenerator.createService(ApInterface.class);
                Call<Model> call = taskService.calbk(/*"id"*/0, /*"time"*/0);
                call.enqueue(new Callback<Model>() {
                    @Override
                    public void onResponse(Call<Model> call, Response<Model> response) {


                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {

                    }


                });

            }
        });
    }
}
