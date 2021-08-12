package bookStore.demo;

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

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public float getPrice() {
        return Price;
    }

    public boolean isIs_recommend() {
        return is_recommend;
    }

    @Override
    public String toString() {
        return "book{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", Price=" + Price +
                ", is_recommend=" + is_recommend +
                '}';
    }
}
