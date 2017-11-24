package ck.ordering.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {

    @Id
    private int id;
    private String name;
    private Double price;

    public Menu(){}

    public Menu(int id,String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {this.price = price;}
}
