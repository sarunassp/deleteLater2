package lt.vu.usecases.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named ("Test")
//@RequestScoped
@SessionScoped
public class Test implements Serializable {
    private int count = 0;
    public String sakykLabas() {
        return "Labas " + new Date() + " " + toString();
    }

    public int count(){
        count++;
        return count;
    }

    @PostConstruct
    public void init() {
        System.out.println(toString() + " constructed.");
    }

    @PreDestroy
    public void aboutToDie() {
        System.out.println(toString() + " ready to die.");
    }
}
