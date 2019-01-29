package com.androhuman.listviewcustom;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<CustomClass> {


    public CustomAdapter( Context context, ArrayList<CustomClass> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.customlayout,parent,false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageView);
        TextView textView = convertView.findViewById(R.id.name);
        TextView textView1 = convertView.findViewById(R.id.reg);

        CustomClass customClass = getItem(position);

        imageView.setImageURI(Uri.parse(customClass.getImageView()));

        textView.setText(customClass.getName());
        textView1.setText(customClass.getReg());

        return convertView;
    }
}
