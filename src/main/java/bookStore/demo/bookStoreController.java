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

//    @PostMapping (value = "/login")
//    public  void login(@RequestParam(value="username") String username,@RequestParam(value ="password") String password){
//        bookStoreService.login(username,password);
//    }

    @GetMapping (value = "/user")
    public List<user> getUser(@RequestHeader("username") String username){
        return bookStoreService.getUser(username);
    }

    @DeleteMapping (value = "/user")
    public void deleteUser(@RequestHeader("username") String username){bookStoreService.deleteUser(username);}

    @PostMapping (value = "/user")
    public void postUser(@RequestBody user user){bookStoreService.postUser(user);}

    @PostMapping (value = "/user/orders")
    public float postOrder(@RequestBody userOrder userOrder) throws IOException {return bookStoreService.postOrder(userOrder);}

    @GetMapping (value = "/book")
    public List<book> showBook() throws IOException {return bookStoreService.showBook();}


}
