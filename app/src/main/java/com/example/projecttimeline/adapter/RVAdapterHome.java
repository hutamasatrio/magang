package com.example.projecttimeline.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.projecttimeline.R;
import com.example.projecttimeline.model.Home;

import java.util.List;


public class RVAdapterHome extends RecyclerView.Adapter<RVAdapterHome.MyViewHolder> {

    private Context mContext ;
    private List<Home> mData ;


    public RVAdapterHome(Context mContext, List<Home> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public RVAdapterHome.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_dasboard_admin,parent,false);
        return new RVAdapterHome.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RVAdapterHome.MyViewHolder holder, final int position) {


        holder.nama.setText(mData.get(position).getNama());
        holder.divisi.setText(mData.get(position).getDivisi());
        holder.ci.setText(mData.get(position).getCi());
        holder.co.setText(mData.get(position).getCo());
        holder.jmlProjek.setText(mData.get(position).getJmlProject());
        holder.progress.setText(mData.get(position).getProgress());
//        holder.tv_book_title.setText(mData2.get(position).getTitle2());
//        holder.img_book_thumbnail.setImageResource(mData2.get(position).getThumbnail2());
//        holder.cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(mContext,Pilih.class);
//                // passing data to the book activity
//                intent.putExtra("Harga",mData2.get(position).getHarga());
//                intent.putExtra("Title",mData2.get(position).getTitle2());
//                intent.putExtra("Description",mData2.get(position).getDescription2());
//                intent.putExtra("Thumbnail",mData2.get(position).getThumbnail2());
//                // start the activity
//                mContext.startActivity(intent);
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView nama,divisi,ci,co, jmlProjek,progress;


        public MyViewHolder(View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.tvNamaHome);
            divisi = itemView.findViewById(R.id.divisiHome);
            ci = itemView.findViewById(R.id.tvCI);
            co = itemView.findViewById(R.id.tvCO);
            jmlProjek = itemView.findViewById(R.id.tvJmlProject);
            progress = itemView.findViewById(R.id.tvProgress);

        }
    }


}
