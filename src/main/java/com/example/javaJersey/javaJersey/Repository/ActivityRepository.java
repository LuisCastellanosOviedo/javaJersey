package com.example.javaJersey.javaJersey.Repository;

import com.example.javaJersey.javaJersey.Entity.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 6/28/2017.
 */
public class ActivityRepository {



    private List<Activity>  activities=new ArrayList<>();

    public ActivityRepository() {
        Activity activity = new Activity("Running","Time to run",2);
        activities.add(activity);
    }

    public Activity getFirstActivity(){
        return activities.get(0);
    }

}
