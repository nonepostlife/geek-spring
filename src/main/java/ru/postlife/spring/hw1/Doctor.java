package ru.postlife.spring.hw1;

public enum Doctor {
    Dentist(1, "Dentist"),
    Surgeon(2, "Surgeon"),
    Therapist(3, "Therapist");

    private final int id;
    private final String name;

    Doctor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
