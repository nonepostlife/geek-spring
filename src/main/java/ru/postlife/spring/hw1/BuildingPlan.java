package ru.postlife.spring.hw1;

import org.springframework.stereotype.Component;

@Component("BuildingPlan")
public class BuildingPlan implements Plan{

    @Override
    public void findOffice(Doctor doctor) {
        System.out.println("Клиент смотрит план здания в поликлинике");
        switch (doctor.getName()) {
            case "Surgeon":
                System.out.println("Хирург принимает в кабинете в кабинете 23 на 2 этаже");
                break;
            case "Dentist":
                System.out.println("Стоматолог принимает в кабинете в кабинете 11 на 1 этаже");
                break;
            case "Therapist":
                System.out.println("Терапевт принимает в кабинете в кабинете 28 на 2 этаже");
                break;
        }
    }
}
