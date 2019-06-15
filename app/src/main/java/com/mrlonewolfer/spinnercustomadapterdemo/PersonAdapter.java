package com.mrlonewolfer.spinnercustomadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

class PersonAdapter extends BaseAdapter {
    ArrayList<PersonBean> personBeans;

    public PersonAdapter(ArrayList<PersonBean> personBeans) {
        this.personBeans=personBeans;
    }


    @Override
    public int getCount() {
        return personBeans.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView appName,appDesc;
        ImageView appImg;
        if(convertView==null){
            LayoutInflater inflater= LayoutInflater.from(parent.getContext());
            convertView=inflater.inflate(R.layout.person_row_item,parent,false);
        }
        PersonBean personBean=personBeans.get(position);
        appName=convertView.findViewById(R.id.appName);
        appDesc=convertView.findViewById(R.id.appDesc);
        appImg=convertView.findViewById(R.id.appImg);

        appName.setText(personBean.getAppName());
        appDesc.setText(personBean.getAppDescription());
        appImg.setBackgroundResource(personBean.getAppImg());
        return convertView;
    }
}