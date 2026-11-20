package dsh.learning.java.exercise4;

public class Book extends Product{
    String author;
    int pages;

    Book(String name, double price, int pages, String author){
        super(name,price);
        this.pages = pages;
        this.author = author;
    }
    public double getFinalPrice(){
       if(getPrice()>50){
           getPrice()=getPrice()*0.8;
       }
    }
    public String describe(){
        System.out.println(getName() getPrice() author);
    }
}
