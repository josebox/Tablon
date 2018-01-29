package com.example.jose.tablon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewTabla;
    private RecyclerViewAdaptador adaptadorTabla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewTabla = (RecyclerView) findViewById(R.id.recyclerTablon);
        recyclerViewTabla.setLayoutManager((new LinearLayoutManager(this)));

        adaptadorTabla = new RecyclerViewAdaptador(ObtenerUsuarios());
        recyclerViewTabla.setAdapter(adaptadorTabla);



    }
    public List<Modelo> ObtenerUsuarios (){
        List<Modelo> usuarios = new ArrayList<>();
        usuarios.add(new Modelo("stewie", "majo", R.drawable.stewie));
        usuarios.add(new Modelo("peter", "gordo", R.drawable.peter));
        usuarios.add(new Modelo("stewie", "majo", R.drawable.stewie));

        return usuarios;
    }

}
