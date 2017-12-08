package com.fri.series.stream;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Produces(MediaType.APPLICATION_JSON)
@Path("demo")
public class InfoResource {

    @GET
    @Path("info")
    public Response getInfo() {
        System.out.println("Info geted");
        Info info = new Info();
        return Response.ok(info).build();
    }
}
