package ru.postlife.spring.mvc.repositories;

import org.springframework.stereotype.Component;
import ru.postlife.spring.mvc.entites.Student;

@Component
public class StudentsRepository {

    public Student findOneById(int id) {
        Student student = new Student();
        student.setFirstName("Ivan " + id);
        student.setLastName("Ivanov " + id);
        return student;
    }
}
