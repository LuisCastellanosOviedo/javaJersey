package com.example.javaJersey.javaJersey.Repository;

import com.example.javaJersey.javaJersey.Entity.Activity;
import com.example.javaJersey.javaJersey.Entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 6/28/2017.
 */
public class ActivityRepository {



    private List<Activity>  activities=new ArrayList<>();

    public ActivityRepository() {

        User user = new User(" test " , "machete ");

        Activity activity = new Activity("Running","Time to run",2);
        activity.setUser(user);


        activities.add(activity);
    }

    public Activity getFirstActivity(){
        return activities.get(0);
    }

    public User getuser(int activityId){
        return  activities.get(activityId).getUser();
    }


}
