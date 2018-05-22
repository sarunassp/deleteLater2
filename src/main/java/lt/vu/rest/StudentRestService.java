package lt.vu.rest;

import lt.vu.asynchronous.CompA;
import lt.vu.entities.Student;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
public class StudentRestService {

    @Inject private EntityManager em;

    @GET
    @Path("/{studentId}")
    public Student find(@PathParam("studentId") Integer studentId) {
        return em.find(Student.class, studentId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Student create(Student student) {
        student.setId(null);
        em.persist(student);
        return student;
    }

    @PUT
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Student modify(Student student) {
        Student oldStudent = em.getReference(Student.class, student.getId());

        if (oldStudent == null) {
            throw new IllegalArgumentException("user id "
                    + student.getId() + " not found");
        }
        if (student.getFirstName() != null)
            oldStudent.setFirstName(student.getFirstName());
        if (student.getLastName() != null)
            oldStudent.setLastName(student.getLastName());

        return student;
    }
}
