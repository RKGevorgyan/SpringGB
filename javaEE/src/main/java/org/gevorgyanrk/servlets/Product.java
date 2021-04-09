package org.gevorgyanrk.servlets;

public class Product {
    int id;
    int cost;
    String title;

    private Product(int id, int cost, String title) {
        this.id = id;
        this.cost = cost;
        this.title = title;
    }
    public static Product createProduct(int id, int cost, String title){
        return new Product(id,cost,title);
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "<li><ul>\n" +
                "<li>id: " + id + "</li>\n"+
                "<li>cost: " + cost + "</li>\n"+
                "<li>title: " + title + "</li>\n"
                +"</ul></li>";
    }
}
