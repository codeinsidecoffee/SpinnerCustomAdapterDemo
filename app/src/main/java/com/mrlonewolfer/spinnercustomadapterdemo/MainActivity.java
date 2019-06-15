package com.mrlonewolfer.spinnercustomadapterdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    Spinner citySpinner;
    Context context;
    ArrayList<PersonBean> personBeans;
    ArrayList<HashMap<String,ArrayList<PersonBean>>> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);
        citySpinner=findViewById(R.id.cityspinner);
        preparedData();
        PersonAdapter adapter=new PersonAdapter(personBeans);
        citySpinner.setAdapter(adapter);
    }

    private void preparedData() {
        personBeans=new ArrayList<>();
        personBeans.add(new PersonBean("Status Video","Download Love Song,Sad Song Videos",R.drawable.statusvideologo));
        personBeans.add(new PersonBean("Status Saver Pro","Download Love Song,Sad Song Videos",R.drawable.statussaverlogo));
        personBeans.add(new PersonBean("Ramayan By Ramanand Sagar","Download Love Song,Sad Song Videos",R.drawable.ramayanlogo));
        personBeans.add(new PersonBean("Mahabharat By B.R.Chopra","Download Love Song,Sad Song Videos",R.drawable.mahabharatlogo));



    }
}
