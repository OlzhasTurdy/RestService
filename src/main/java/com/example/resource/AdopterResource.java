package com.example.resource;

import com.example.model.Adopter;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import com.example.util.LoggerUtil;

@Path("/adopters")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AdopterResource {
    private static List<Adopter> adopters = new ArrayList<>();

    @GET
    public List<Adopter> getAllAdopters() {
        return adopters;
    }

    @POST
    public void addAdopter(Adopter adopter) {
        adopters.add(adopter);
    }

    @GET
    @Path("/{id}")
    public Adopter getAdopterById(@PathParam("id") int id) {
        return adopters.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}