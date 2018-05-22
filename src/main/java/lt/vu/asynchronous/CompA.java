package lt.vu.asynchronous;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Named
@ApplicationScoped
public class CompA implements Serializable {

    @Inject
    private CompB compB;

    public String callAsyncMethod() throws ExecutionException, InterruptedException {
        Future<String> resultInFuture;
        resultInFuture = compB.asyncMethod();
        System.out.println("I just have called CompB. Result is ready? " + resultInFuture.isDone());

        if (resultInFuture.isDone()){
            System.out.println("Result is ready, and it is: " + resultInFuture.get());
        } else
            System.out.println("Result is not yet ready... please wait a moment...");

        String result = resultInFuture.get();
        System.out.println("its finally ready!");
        return result;
    }

}
