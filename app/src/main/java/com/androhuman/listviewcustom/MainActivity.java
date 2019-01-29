package com.androhuman.listviewcustom;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText name ;
    EditText reg ;
    ArrayList<CustomClass> arrayList = new ArrayList<CustomClass>();
    ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        reg = findViewById(R.id.reg);
        listView = findViewById(R.id.list);

        findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                custom();
            }
        });

    }

    public  void custom(){
        Toast.makeText(MainActivity.this,"HELLO",Toast.LENGTH_SHORT).show();

        Uri image = Uri.parse("android.resource://com.androhuman.listviewcustom/drawable/"+name.getText().toString());


        CustomClass obj = new CustomClass(""+name.getText().toString(),""+reg.getText().toString(),"android.resource://com.androhuman.listviewcustom/drawable/"+name.getText().toString());
        arrayList.add(obj);

        CustomAdapter adapter = new CustomAdapter(this,arrayList);

        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
