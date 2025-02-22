package com.example.resource;

import com.example.model.Shelter;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;
import com.example.util.LoggerUtil;

@Path("/shelters")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ShelterResource {
    private static List<Shelter> shelters = new ArrayList<>();

    @GET
    public List<Shelter> getAllShelters() {
        return shelters;
    }

    @POST
    public void addShelter(Shelter shelter) {
        shelters.add(shelter);
    }

    @GET
    @Path("/{id}")
    public Shelter getShelterById(@PathParam("id") int id) {
        return shelters.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
}