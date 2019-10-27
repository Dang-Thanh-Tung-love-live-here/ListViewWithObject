package com.example.listview_with_object.Activitis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listview_with_object.R;
import com.example.listview_with_object.adapter.AdapterHS;
import com.example.listview_with_object.hs.hs;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lsHS;
AdapterHS adapterHS;
ArrayList<hs> h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsHS=findViewById(R.id.lv_hs);
        h.add(new hs("invocker"));
        h.add(new hs("invocker2k"));
        adapterHS=new AdapterHS(MainActivity.this,R.layout.hs_list_view,h);
        lsHS.setAdapter(adapterHS);

    }
}
