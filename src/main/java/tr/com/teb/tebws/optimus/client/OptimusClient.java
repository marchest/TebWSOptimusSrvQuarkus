package tr.com.teb.tebws.optimus.client;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import tr.com.teb.tebws.optimus.model.OptimusExceptionWrapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


//@Path("/WSCardOPTIMUS")
@RegisterRestClient
public interface OptimusClient {

    @POST
    @Consumes(MediaType.TEXT_XML)
    @Produces(MediaType.TEXT_XML)
    public String getMainMethodResponse(
//            @HeaderParam("Content-Type")String contentType,
            String requestBody)throws OptimusExceptionWrapper;

}
