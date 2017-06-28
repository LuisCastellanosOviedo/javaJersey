package com.example.javaJersey.javaJersey.Service;

import com.example.javaJersey.javaJersey.Entity.Activity;
import com.example.javaJersey.javaJersey.Entity.User;
import com.example.javaJersey.javaJersey.Repository.ActivityRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by luis on 6/28/2017.
 */



@Path("/activity")
@Component
public class RestActivityService {

    ActivityRepository activityRepository = new ActivityRepository();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Activity getFirstActivity(){
        return activityRepository.getFirstActivity();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{idActivity}/User") // http://localhost:8080/activity/0/User
    public User getUser(@PathParam("idActivity") String idActivity ){
        return activityRepository.getuser( Integer.valueOf(idActivity));
    }


}
