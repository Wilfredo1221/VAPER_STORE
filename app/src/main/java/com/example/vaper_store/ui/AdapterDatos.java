package com.example.vaper_store.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.vaper_store.Items;
import com.example.vaper_store.R;

import java.util.List;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolder>{
    private List<Items> itemsList;
    private Context contex;

    public AdapterDatos(List<Items> itemsList, Context contex) {
        this.itemsList = itemsList;
        this.contex = contex;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//    holder.nombre1.setText(itemsList.get(position).getNombre());
//    holder.info1.setText(itemsList.get(position).getInfo());
//    holder.costo1.setText(itemsList.get(position).getCosto());
//    holder.nombre.setText(itemsList.get(position).getNombre());
//    holder.info.setText(itemsList.get(position).getInfo());
//    holder.costo.setText(itemsList.get(position).getCosto());
//    Glide.with(contex).load(itemsList.get(position).getImage()).centerCrop().into(holder.image1);
//    Glide.with(contex).load(itemsList.get(position).getImage()).centerCrop().into(holder.image);
    holder.nombre2.setText(itemsList.get(position).getNombre());
    holder.info2.setText(itemsList.get(position).getInfo());
    holder.costo2.setText(itemsList.get(position).getCosto());
    holder.nombre3.setText(itemsList.get(position).getNombre());
    holder.info3.setText(itemsList.get(position).getInfo());
    holder.costo3.setText(itemsList.get(position).getCosto());
    Glide.with(contex).load(itemsList.get(position).getImage()).centerCrop().into(holder.image2);
    Glide.with(contex).load(itemsList.get(position).getImage()).centerCrop().into(holder.image3);
    holder.nombre4.setText(itemsList.get(position).getNombre());
    holder.info4.setText(itemsList.get(position).getInfo());
    holder.costo4.setText(itemsList.get(position).getCosto());
    holder.nombre5.setText(itemsList.get(position).getNombre());
    holder.info5.setText(itemsList.get(position).getInfo());
    holder.costo5.setText(itemsList.get(position).getCosto());
    Glide.with(contex).load(itemsList.get(position).getImage()).centerCrop().into(holder.image4);
    Glide.with(contex).load(itemsList.get(position).getImage()).centerCrop().into(holder.image5);

    }

    @Override
    public int getItemCount() {

        return itemsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView image1;
        private TextView nombre1;
        private TextView info1;
        private TextView costo1;
        private ImageView image;
        private TextView nombre;
        private TextView info;
        private TextView costo;
        private ImageView image2;
        private TextView nombre2;
        private TextView info2;
        private TextView costo2;
        private ImageView image3;
        private TextView nombre3;
        private TextView info3;
        private TextView costo3;
        private ImageView image4;
        private TextView nombre4;
        private TextView info4;
        private TextView costo4;
        private ImageView image5;
        private TextView nombre5;
        private TextView info5;
        private TextView costo5;
        private ImageView image6;
        private TextView nombre6;
        private TextView info6;
        private TextView costo6;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
//            image1=itemView.findViewById(R.id.image1);
//            nombre1=itemView.findViewById(R.id.nombre1);
//            info1=itemView.findViewById(R.id.info1);
//            costo1=itemView.findViewById(R.id.costo1);
//            image=itemView.findViewById(R.id.image);
//            nombre=itemView.findViewById(R.id.nombre);
//            info=itemView.findViewById(R.id.info);
//            costo=itemView.findViewById(R.id.costo);
            image2=itemView.findViewById(R.id.image2);
            nombre2=itemView.findViewById(R.id.nombre3);
            info2=itemView.findViewById(R.id.info3);
            costo2=itemView.findViewById(R.id.costo3);
            image3=itemView.findViewById(R.id.image3);
            nombre3=itemView.findViewById(R.id.nombre4);
            info3=itemView.findViewById(R.id.info4);
            costo3=itemView.findViewById(R.id.costo4);
            image4=itemView.findViewById(R.id.image4);
            nombre4=itemView.findViewById(R.id.nombre5);
            info4=itemView.findViewById(R.id.info5);
            costo4=itemView.findViewById(R.id.costo5);
            image5=itemView.findViewById(R.id.image5);
            nombre5=itemView.findViewById(R.id.nombre6);
            info5=itemView.findViewById(R.id.info6);
            costo5=itemView.findViewById(R.id.costo6);
        }
    }
}
