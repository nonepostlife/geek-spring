package ru.postlife.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.postlife.spring.mvc.entites.Student;
import ru.postlife.spring.mvc.repositories.StudentsRepository;

@Service
public class StudentsService {
    private StudentsRepository studentsRepository;

    @Autowired
    public void setStudentsRepository(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public Student getStudentById(int id) {
        return studentsRepository.findOneById(id);
    }

    public StudentsService() {

    }
}