package ru.postlife.spring.mvc.repositories;

import org.springframework.stereotype.Component;
import ru.postlife.spring.mvc.entites.Brand;
import ru.postlife.spring.mvc.entites.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class NotebooksRepository {

    private static int COUNT = 10;
    private static final Random RANDOM = new Random();
    private List<Notebook> notebooks;

    public NotebooksRepository() {
        notebooks = new ArrayList<>();
        for (int i = 0; i < COUNT; i++) {
            float rnd = (float) Math.random();
            notebooks.add(new Notebook(i + 1, generateBrand(rnd), generateRam(4, 20, 4), generatePrice(500, 2100, 100)));
        }
    }

    public Notebook findOneById(int id) {
        for (Notebook notebook : notebooks) {
            if (notebook.getId() == id) {
                return notebook;
            }
        }
        return new Notebook();
    }

    public List<Notebook> findAll() {
        return notebooks;
    }

    public static String generateBrand(float rnd) {
        if (rnd < 0.2) {
            return Brand.LENOVO.toString();
        } else if (rnd < 0.4) {
            return Brand.ASUS.toString();
        } else if (rnd < 0.6) {
            return Brand.MACBOOK.toString();
        } else if (rnd < 0.8) {
            return Brand.ACER.toString();
        } else {
            return Brand.MSI.toString();
        }
    }

    public static int generatePrice(int min, int max, int step) {
        return RANDOM.nextInt((max - min) / step) * step + min;
    }

    public static int generateRam(int min, int max, int step) {
        return RANDOM.nextInt((max - min) / step) * step + min;
    }

    public void addNotebook(Notebook notebook) {
        notebook.setId(++COUNT);
        notebooks.add(notebook);
    }
}
