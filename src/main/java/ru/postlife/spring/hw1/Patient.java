package ru.postlife.spring.hw1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Patient")
@Scope("prototype")
public class Patient {

    private Registry registry;

    @Autowired
    public void setRegistry(Registry registry) {
        this.registry = registry;
    }

    public void goToHospital(Doctor doctor) {
        System.out.println("Клиент обратился в регистратуру");
        registry.acceptClient(doctor);
    }
}
