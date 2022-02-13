package ru.postlife.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.postlife.spring.mvc.entites.Notebook;
import ru.postlife.spring.mvc.service.NotebookService;

import java.util.List;

@Controller
@RequestMapping("/notebooks")
public class NotebooksController {
    private NotebookService notebookService;

    @Autowired
    public void setNotebookService(NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @RequestMapping(path = "/showNotebooks", method = RequestMethod.GET)
    @ResponseBody
    public List<Notebook> showNotebooks(Model uiModel) {
        return notebookService.getNotebooks();
    }

    @RequestMapping(path = "/showNotebookById", method = RequestMethod.GET)
    @ResponseBody
    public Notebook showNotebookById(Model uiModel, @RequestParam int id) {
        return notebookService.getNotebookById(id);
    }

    @RequestMapping(path = "/showNotebookById/{sid}", method = RequestMethod.GET)
    @ResponseBody
    public Notebook showNotebookById(@PathVariable("sid") int id) {
        return notebookService.getNotebookById(id);
    }

    @RequestMapping("/addNotebookForm")
    public String showSimpleForm(Model uiModel) {
        Notebook notebook = new Notebook();
        uiModel.addAttribute("notebook", notebook);
        return "notebook-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("notebook") Notebook notebook) {
        notebookService.addNotebook(notebook);
        return "notebook-form-result";
    }
}
