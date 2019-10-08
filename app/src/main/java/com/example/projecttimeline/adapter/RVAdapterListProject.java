package com.example.projecttimeline.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.projecttimeline.R;
import com.example.projecttimeline.model.Project;
import com.example.projecttimeline.model.Report;

import java.util.List;


public class RVAdapterListProject extends RecyclerView.Adapter<RVAdapterListProject.MyViewHolder> {

    private Context mContext ;
    private List<Project> mData ;


    public RVAdapterListProject(Context mContext, List<Project> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public RVAdapterListProject.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_list_project,parent,false);
        return new RVAdapterListProject.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RVAdapterListProject.MyViewHolder holder, final int position) {


        holder.namaProject.setText(mData.get(position).getNamaProject());
        holder.divisi.setText(mData.get(position).getDivisiProject());
        holder.dueDate.setText(mData.get(position).getTanggalMulaiProject());
        holder.progress.setText(mData.get(position).getProgressProject());
        holder.namaCLient.setText(mData.get(position).getNamaClient());
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
        TextView namaProject,divisi, dueDate, progress, namaCLient;


        public MyViewHolder(View itemView) {
            super(itemView);

            namaProject = itemView.findViewById(R.id.tvNamaProject);
            divisi = itemView.findViewById(R.id.divisiProject);
            dueDate = itemView.findViewById(R.id.tvDueDateProject);
            progress = itemView.findViewById(R.id.tvProgressProject);
            namaCLient = itemView.findViewById(R.id.tvNamaClient);

        }
    }


}
