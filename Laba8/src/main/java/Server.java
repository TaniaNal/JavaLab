import birds.Bird;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.core.Response;

@Path("/birds")
public class Server {
    private static Map<Integer, Bird> birdsMap  = new HashMap<>();

    @GET
    @Path("{id}/")
    @Produces(MediaType.APPLICATION_JSON)
    public final Bird getBird(final @PathParam("id") Integer id) {
        return birdsMap.get(id);
    }

    @PUT
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createBird(final @PathParam("id") Integer id, final Bird bird) {
        birdsMap.put(id, bird);
        return Response.status(200).entity("Bird").build();
    }

    @DELETE
    @Path("{id}/")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response replaceBird(final @PathParam("id") Integer id) {
        birdsMap.remove(id);
        return Response.status(200).entity("Bird").build();
    }

    @POST
    @Path("{id}/")
    public final Response deleteBird(final @PathParam("id") Integer id, final Bird bird) {
        birdsMap.replace(id, bird);
        return Response.status(200).entity("Bird").build();
    }
}
