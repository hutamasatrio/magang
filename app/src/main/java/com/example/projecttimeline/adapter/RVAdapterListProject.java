package com.example.projecttimeline.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projecttimeline.R;
import com.example.projecttimeline.model.DataProject;
import com.example.projecttimeline.view.timeline.OnlyTimelineActivity;

import java.util.ArrayList;
import java.util.List;


public class RVAdapterListProject extends RecyclerView.Adapter<RVAdapterListProject.MyViewHolder> {

    private Context mContext ;
    private List<DataProject> projects = new ArrayList<>();


    public RVAdapterListProject(Context mContext) {
        this.mContext = mContext;

    }
    public void setdata(List<DataProject> datas) {
        this.projects = datas;
    }

    @Override
    public RVAdapterListProject.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.item_list_project,parent,false);
        return new RVAdapterListProject.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final DataProject mdata = projects.get(position);
        holder.namaProject.setText(mdata.getNamaProject());
        holder.divisi.setText(mdata.getTypeProject());
        holder.dueDate.setText(mdata.getStartDate());
        holder.progress.setText(mdata.getKeterangan());
        holder.namaCLient.setText(mdata.getClient());
        holder.cardListProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, OnlyTimelineActivity.class);
                intent.putExtra("id",projects.get(position).getIdProject());
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return projects.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView namaProject,divisi, dueDate, progress, namaCLient;
        CardView cardListProject;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cardListProject = itemView.findViewById(R.id.cardListProject);
            namaProject = itemView.findViewById(R.id.tvNamaProject);
            divisi = itemView.findViewById(R.id.divisiProject);
            dueDate = itemView.findViewById(R.id.tvDueDateProject);
            progress = itemView.findViewById(R.id.tvProgressProject);
            namaCLient = itemView.findViewById(R.id.tvNamaClient);


        }
    }


}
