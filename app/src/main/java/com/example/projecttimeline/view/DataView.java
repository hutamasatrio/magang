package com.example.projecttimeline.view;

import com.example.projecttimeline.model.DataProject;
import com.example.projecttimeline.model.DataTimeline;
import com.example.projecttimeline.model.DataTimelineAll;

import java.util.List;

public interface DataView {

    public void projectView(List<DataProject> project);

    void timelineView(List<DataTimelineAll> timeline);
}
