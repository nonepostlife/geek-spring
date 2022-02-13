package ru.postlife.spring.mvc.entites;

public class Notebook {

    private int id;
    private String brand;
    private int ram;
    private int price;

    public Notebook() {
    }

    public Notebook(int id, String brand, int ram, int price) {
        this.id = id;
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook [" +
                "brand ='" + brand + '\'' +
                ", ram =" + ram +
                "GB, price =" + price +
                "$]";
    }
}
