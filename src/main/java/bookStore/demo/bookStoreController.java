package bookStore.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class bookStoreController {

    private final bookStoreService bookStoreService;

    @Autowired
    public bookStoreController(bookStoreService bookStoreService){
        this.bookStoreService = bookStoreService;
    }

    @GetMapping (value = "/user")
    public List<user> getUser(@RequestHeader("username") String username){
        return bookStoreService.getUser(username);
    }

    @DeleteMapping (value = "/user",)
    public void deleteUser(@RequestHeader("username") String username){bookStoreService.deleteUser(username);}

    @PostMapping (value = "/user")
    public void postUser(@RequestBody user user){bookStoreService.postUser(user);}

    @PostMapping (value = "/user/orders")
    public void postOrder(@RequestBody user user) throws IOException {bookStoreService.postOrder(user);}

    @GetMapping (value = "/book")
    public List<book> showBook() throws IOException {return bookStoreService.showBook();}


}
