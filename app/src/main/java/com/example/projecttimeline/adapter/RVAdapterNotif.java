package com.example.projecttimeline.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.projecttimeline.R;
import com.example.projecttimeline.model.HomeDasboard;
import com.example.projecttimeline.model.Notification;

import java.util.List;


public class RVAdapterNotif extends RecyclerView.Adapter<RVAdapterNotif.MyViewHolder> {

    private Context mContext ;
    private List<Notification> mData ;


    public RVAdapterNotif(Context mContext, List<Notification> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public RVAdapterNotif.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_notification,parent,false);
        return new RVAdapterNotif.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RVAdapterNotif.MyViewHolder holder, final int position) {


        holder.title.setText(mData.get(position).getTitle());
        holder.subtitle.setText(mData.get(position).getSubTitle());
        holder.subsubtitle.setText(mData.get(position).getSubSubTitle());

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
        TextView title,subtitle,subsubtitle;


        public MyViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            subtitle = itemView.findViewById(R.id.subtitle);
            subsubtitle = itemView.findViewById(R.id.subsubtitle);

        }
    }


}
