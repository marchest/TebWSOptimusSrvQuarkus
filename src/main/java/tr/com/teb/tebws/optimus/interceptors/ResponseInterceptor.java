package tr.com.teb.tebws.optimus.interceptors;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.ext.Provider;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

@Provider
public class ResponseInterceptor implements ClientResponseFilter {
    @Override
    public void filter(ClientRequestContext clientRequestContext, ClientResponseContext clientResponseContext) throws IOException {

//        clientResponseContext.getHeaders().add("Content-Type", "text/html; charset=UTF-8");
//        InputStream inputStream = clientResponseContext.getEntityStream();
//
//        StringBuilder textBuilder = new StringBuilder();
//        try (Reader reader = new BufferedReader(new InputStreamReader
//                (inputStream, Charset.forName(StandardCharsets.UTF_8.name())))) {
//            int c = 0;
//            while ((c = reader.read()) != -1) {
//                textBuilder.append((char) c);
//            }
//        }
//
//        System.out.println(textBuilder.toString());
    }
}
