package co.kuali.jaxrsstarter.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SimpleResource {
    @GET
    public Response getIndex() {
        Map<String, String> message = new HashMap<>();
        message.put("message", "hi");
        return Response.ok(message).build();
    }
}
