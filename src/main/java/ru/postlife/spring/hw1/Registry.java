package ru.postlife.spring.hw1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Registry")
@Scope("prototype")
public class Registry {
    private Archive archive;
    private Schedule schedule;
    private Plan plan;

    @Autowired
    public void setArchive(Archive archive) {
        this.archive = archive;
    }

    @Autowired
    @Qualifier("ElectronicPlan")
    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Autowired
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void acceptClient(Doctor doctor) {
        archive.getMedicalCard();
        schedule.findScheduleForDoctor(doctor);
        plan.findOffice(doctor);
        System.out.println("Клиент ушел на прием к врачу!");
    }
}
