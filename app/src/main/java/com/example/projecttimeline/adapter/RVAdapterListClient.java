package com.example.projecttimeline.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.projecttimeline.R;
import com.example.projecttimeline.model.Client;
import com.example.projecttimeline.model.Report;

import java.util.List;


public class RVAdapterListClient extends RecyclerView.Adapter<RVAdapterListClient.MyViewHolder> {

    private Context mContext ;
    private List<Client> mData ;


    public RVAdapterListClient(Context mContext, List<Client> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public RVAdapterListClient.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_list_client,parent,false);
        return new RVAdapterListClient.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RVAdapterListClient.MyViewHolder holder, final int position) {


        holder.nama.setText(mData.get(position).getNamaClient());
        holder.email.setText(mData.get(position).getEmailCLient());
        holder.alamat.setText(mData.get(position).getAlamatClient());
//        holder.project.setText(mData.get(position).get);


//        holder.progress.setText(mData.get(position).getProgress());
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
        TextView nama, email, alamat, project;


        public MyViewHolder(View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.tvNamaClient);
            email = itemView.findViewById(R.id.tvEmailClient);
            alamat = itemView.findViewById(R.id.tvAlamatClient);
            project = itemView.findViewById(R.id.tvProjectClient);

        }
    }


}
