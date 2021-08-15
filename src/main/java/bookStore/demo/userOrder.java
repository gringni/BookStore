package bookStore.demo;

import javax.persistence.*;
import java.io.IOException;
import java.util.List;

@Entity
@Table
public class userOrder {
    @Id
    @SequenceGenerator(name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private String username;
    private int[] bookID;
    private float price;

    public userOrder(String username, int[] bookID) throws IOException {
        this.username = username;
        this.bookID = bookID;
        setPrice();
    }

    public userOrder() {
    }

    public String getUsername() {
        return username;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice() throws IOException {
        List<book> books = bookStoreService.allBook();

        for(int a :bookID){
            this.price = this.price + books.get(a-1).getPrice();
        }

    }
}
