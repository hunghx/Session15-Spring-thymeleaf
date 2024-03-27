package ra.springthymeleaf.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ra.springthymeleaf.model.dto.StudentResponse;

import java.util.List;

@Component
public class StudentDao {
    @Autowired
    public SessionFactory sessionFactory;
    public void getAll(){
        Session session = sessionFactory.getCurrentSession();
        // viet native query
       List<StudentResponse> studentResponses =
               session.createQuery("SELECT new ra.springthymeleaf.model.dto.StudentResponse(S.id,S.firstName,S.lastName,S.birthday) from Student S" , StudentResponse.class).list();
    }
}
