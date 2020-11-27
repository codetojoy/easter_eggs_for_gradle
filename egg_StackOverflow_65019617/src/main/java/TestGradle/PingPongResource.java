package TestGradle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.inject.Singleton;

@Singleton
@Path("/ping")
public class PingPongResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTopics() {
        return Response.ok("{\"Response\" : \"Pong\"}").build();
    }
}

