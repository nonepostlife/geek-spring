package ru.postlife.spring.hw1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Schedule")
@Scope("prototype")
public class Schedule {

    public void findScheduleForDoctor(Doctor doctor) {
        switch (doctor.getName()) {
            case "Surgeon":
                System.out.println("Хирург принимает с 09:00 до 17:00");
                break;
            case "Dentist":
                System.out.println("Стоматолог принимает с 08:00 до 15:00");
                break;
            case "Therapist":
                System.out.println("Терапевт принимает с 09:00 до 18:00");
                break;
        }
    }
}
