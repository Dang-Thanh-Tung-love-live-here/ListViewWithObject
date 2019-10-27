package com.example.listview_with_object.adapter;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listview_with_object.R;
import com.example.listview_with_object.hs.hs;

import java.util.ArrayList;
import java.util.List;

public class AdapterHS extends ArrayAdapter<hs> {
    Context context;
    private int resource;
    List objects;
    private ArrayList<hs> arrhs;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View v=LayoutInflater.from(context).inflate(this.resource,null);
        TextView txtID=v.findViewById(R.id.txtid);
        hs hs=getItem(position);
        txtID.setText(hs.getiD());
        return v;
    }

    public AdapterHS(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }
}
