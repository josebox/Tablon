package com.example.jose.tablon;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jose on 27/01/2018.
 */

public class RecyclerViewAdaptador  extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder>{
    public static  class ViewHolder extends RecyclerView.ViewHolder{
        private TextView titulo,descripcion;
        ImageView imgFoto;

        public ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.tvTitulo);
            descripcion = (TextView)itemView.findViewById(R.id.tvDescipcion);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);

        }
    }

    public List<Modelo> lista;

    public RecyclerViewAdaptador(List<Modelo> crearLista) {
        this.lista = crearLista;
    }

    @Override
    public RecyclerViewAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_lista,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdaptador.ViewHolder holder, int position) {
        holder.titulo.setText(lista.get(position).getTitulo());
        holder.descripcion.setText(lista.get(position).getDescripcion());
        holder.imgFoto.setImageResource(lista.get(position).getImgFoto());


    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

}
