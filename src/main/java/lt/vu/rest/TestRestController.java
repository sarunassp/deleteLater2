package lt.vu.rest;

import lt.vu.asynchronous.CompA;
import lt.vu.asynchronous.CompB;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.ExecutionException;

@ApplicationScoped
@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
public class TestRestController {

    @Inject
    private CompA asyncCompA;

    @Inject
    private CompB asyncCompB;

    @GET
    public void test() throws ExecutionException, InterruptedException {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(asyncCompA.callAsyncMethod());

    }
}
