package com.example.projecttimeline.presenter;

import android.util.Log;

import com.example.projecttimeline.model.DataTimeline;
import com.example.projecttimeline.model.DataTimelineAll;
import com.example.projecttimeline.model.ResponseTimeline;
import com.example.projecttimeline.model.ResponseTimelineAll;
import com.example.projecttimeline.network.RetrofitService;
import com.example.projecttimeline.view.DataView;
import com.example.projecttimeline.view.timeline.DataViewTimeline;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TimelinePresenter {

    private Integer id = null;
    private DataViewTimeline timelineView;
    private RetrofitService timelineService;

    public TimelinePresenter(DataViewTimeline view) {
        this.timelineView = view;

        if (this.timelineService == null) {
            this.timelineService = new RetrofitService();
        }
    }

    public void setid(Integer id){
        this.id =id;

    }


    public void getdata() {
        timelineService.
                getAPI()
                .getTimeline(id)
                .enqueue(new Callback<ResponseTimelineAll>() {
                    @Override
                    public void onResponse(Call<ResponseTimelineAll> call, Response<ResponseTimelineAll> response) {
                        ResponseTimelineAll data = response.body();

                        if (data != null && data.getData() != null) {
                            List<DataTimelineAll> result = data.getData();
                            timelineView.timelineView(result);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseTimelineAll> call, Throwable t) {

                        Log.d("krlkjf","fefef");

                    }


                });
    }
}
