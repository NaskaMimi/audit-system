package ru.vr.system.resources;

import ru.vr.system.dto.SimpleDto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigInteger;

@Path("/audit")
public class AuditSystemResource
{
    @Path("hello")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleDto hello()
    {
        return new SimpleDto(BigInteger.ZERO, "sssasss");
    }
}
