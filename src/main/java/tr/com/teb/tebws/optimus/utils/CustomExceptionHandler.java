package tr.com.teb.tebws.optimus.utils;

import tr.com.teb.tebws.optimus.model.OptimusExceptionWrapper;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomExceptionHandler implements ExceptionMapper<OptimusExceptionWrapper> {


    @Override
    public Response toResponse(OptimusExceptionWrapper optimusExceptionWrapper) {
        optimusExceptionWrapper.printStackTrace();
        return Response.ok("HATA OLUSTU").build();
    }
}
