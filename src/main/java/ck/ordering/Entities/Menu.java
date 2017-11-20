package ck.ordering.Entities;

public class Menu {
    private String name;
    private String price;

    public Menu(String name, String price) {
        this.name = name;
        this.price = price;
    }
    
    public Menu(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
