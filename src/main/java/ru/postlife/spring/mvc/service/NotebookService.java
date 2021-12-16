package ru.postlife.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.postlife.spring.mvc.entites.Notebook;
import ru.postlife.spring.mvc.entites.Student;
import ru.postlife.spring.mvc.repositories.NotebooksRepository;
import ru.postlife.spring.mvc.repositories.StudentsRepository;

import java.util.List;

@Service
public class NotebookService {
    private NotebooksRepository notebooksRepository;

    @Autowired
    public void setStudentsRepository(NotebooksRepository notebooksRepository) {
        this.notebooksRepository = notebooksRepository;
    }

    public Notebook getStudentById(int id) {
        return notebooksRepository.findOneById(id);
    }

    public List<Notebook> getNotebooks() {
        return notebooksRepository.findAll();
    }

    public NotebookService() {

    }

    public void addNotebook(Notebook notebook) {
        notebooksRepository.addNotebook(notebook);
    }
}