package bookStore.demo.Book;

public class book {
    private int Id;
    private String Name;
    private String Author;
    private float Price;
    private boolean is_recommend;

    public book(int id, String name, String author, float price, boolean is_recommend) {
        Id = id;
        Name = name;
        Author = author;
        Price = price;
        this.is_recommend = is_recommend;
    }

    public book(){}

}
