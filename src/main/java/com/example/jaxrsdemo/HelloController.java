package com.example.jaxrsdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/api")
public class HelloController {
    @GET
    @Path("/hello")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response sayHello() {
        Person p = new Person("John", "Smith");
        return Response
                .status(Response.Status.OK)
                .entity(p)
                .build();
    }
}
