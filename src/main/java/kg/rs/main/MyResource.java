package kg.rs.main;

import kg.rs.manager.RequestManager;
import kg.rs.models.request.type1.Request;
import kg.rs.models.response.type1.Response;
import kg.rs.service.TransferBodyServiceToFromXMLImpl;

import javax.jws.WebParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mypath")
public class MyResource {

    private TransferBodyServiceToFromXMLImpl transferBodyServiceToFromXML = new TransferBodyServiceToFromXMLImpl();
    private RequestManager requestManager = new RequestManager();

    @GET
    @Path("/request_type20")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Get it test response";
    }

    @POST
    @Path("/request_type1")
    @Produces(MediaType.TEXT_XML)
    public String request_type1(@WebParam(name = "request") String requestBody) {
        Request request = new Request();
        request = (Request) transferBodyServiceToFromXML.fromXML(request, requestBody);
        Response response = (Response) requestManager.getRequestType(request.getRequestType());
        String responseBodyXML = (String) transferBodyServiceToFromXML.toXML(response);
        return responseBodyXML;
    }

    @POST
    @Path("/request_type2")
    @Produces(MediaType.TEXT_XML)
    public String request_type2(@WebParam(name = "request") String requestBody) {
        Request request = new Request();
        //request = (Request) transferBodyServiceToFromXML.fromXML(request);
        return requestBody;
    }
}