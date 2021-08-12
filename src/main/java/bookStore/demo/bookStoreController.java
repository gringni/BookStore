package bookStore.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class bookStoreController {

    private final bookStoreService bookStoreService;



    @Autowired
    public bookStoreController(bookStoreService bookStoreService){
        this.bookStoreService = bookStoreService;
    }

    @GetMapping (value = "/user")
    public List<user> getUser(){
        return bookStoreService.getUser();
    }

    @DeleteMapping (value = "/user",path = "{username}")
    public void deleteUser(@PathVariable("username") String username){bookStoreService.deleteUser(username);}

    @PostMapping (value = "/user")
    public void postUser(@RequestBody user user){bookStoreService.postUser(user);}

    @PostMapping (value = "/user/orders")
    public void postOrder(@RequestBody user user){bookStoreService.postOrder(user);}


}
