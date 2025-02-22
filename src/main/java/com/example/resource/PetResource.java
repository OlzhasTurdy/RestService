package com.example.resource;

import com.example.model.Pet;
import com.example.util.LoggerUtil;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/pets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PetResource {
    private static List<Pet> pets = new ArrayList<>();

    @GET
    public List<Pet> getAllPets() {
        LoggerUtil.log("GET /pets called - Returned all pets");
        return pets;
    }

    @POST
    public Response addPet(Pet pet) {
        if (pet == null) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Invalid JSON payload")
                    .build();
        }

        pets.add(pet);
        LoggerUtil.log("POST /pets called - Added pet: " + pet.getName() + " (ID: " + pet.getId() + ")");
        return Response.status(Response.Status.CREATED)
                .entity(pet)
                .build();
    }

    @GET
    @Path("/{id}")
    public Response getPetById(@PathParam("id") int id) {
        Pet pet = pets.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

        if (pet == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Pet not found with ID: " + id)
                    .build();
        }

        LoggerUtil.log("GET /pets/" + id + " called - Returned pet: " + pet.getName());
        return Response.ok(pet).build();
    }
}
