package com.petitemasrata.myfragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rata on 23/04/15.
 */
public class CosaAdapter extends ArrayAdapter<CosasVarias> {

    ArrayList<CosasVarias> cosas;
    Context context;

    public CosaAdapter(Context context, ArrayList<CosasVarias> cosas) {
        super(context, 0, cosas);
        this.cosas = cosas;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater lf = LayoutInflater.from(context);
        View itemView = lf.inflate(R.layout.item_cosas, parent, false);

        TextView tName = (TextView) itemView.findViewById(R.id.txt_name);
        TextView tAntique = (TextView) itemView.findViewById(R.id.txt_antique);

        tName.setText(cosas.get(position).getNombre());
        tAntique.setText(cosas.get(position).getAntiguedad() + " A. C.");

        return itemView;
    }


    @Override
    public int getCount() {
        return cosas.size();
    }
}
