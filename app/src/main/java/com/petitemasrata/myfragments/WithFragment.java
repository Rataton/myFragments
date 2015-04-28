package com.petitemasrata.myfragments;


import android.app.Activity;
//import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment; // Esta es la que ay que importar
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 * Si tuviera un error quuzá sea el soporte de versiones anteriores de Android
 */
public class WithFragment extends Fragment {

    private ListView mListView;

    //private List<String> mItems; // la m entodo esto indica que es una variable miembro de la clase
    //private ArrayAdapter<String> mAdapter;

    private ArrayList<CosasVarias> mItems;
    private CosaAdapter mAdapter;
    private Context CONTEXT;

    public WithFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mItems = new ArrayList<>();

        createInicialItems(100);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_w_activity_with, container, false);
        mListView = (ListView) rootView.findViewById(R.id.listFragment);
        mAdapter = new CosaAdapter(CONTEXT, mItems);

        //mAdapter = new CosaAdapter(CONTEXT, R.layout.list_item, mItems);
        //mAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item, mItems);
        mListView.setAdapter(mAdapter);
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        CONTEXT = activity;
    }

    public void createInicialItems(int size){
        for (int i = 0; i < size; i++) {
            mItems.add(new CosasVarias("Yo soy " + i + 1, i*0.33));
            //mItems.add("Yo soy " + (i + 1));
        }
    }
}
