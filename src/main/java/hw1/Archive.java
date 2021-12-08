package hw1;

import org.springframework.stereotype.Component;

@Component("Archive")
public class Archive {
    public void getMedicalCard() {
        System.out.println("Карта пациента найдена в архиве");
    }
}
