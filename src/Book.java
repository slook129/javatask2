public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
    public void setQty(int newQty){
        this.qty = newQty;
    }
    public Book(String n, Author a){
        this.name = n;
        this.author = a;
    }
    public String toString(){
        return name + " " + author.toString();
    }
}
