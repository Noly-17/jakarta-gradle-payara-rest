package endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/hello-resource")
public class HelloResource {
    @GET
    public String sayHello() {
        return "Hello Shit";
    }
}
