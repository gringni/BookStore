package bookStore.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @DeleteMapping (value = "/user")
    public void deleteUser(){return bookStoreService.deleteUser();}

    @PostMapping (value = "/user")
    public void postUser(){return bookStoreService.postUser();}

    @PostMapping (value = "/user/orders")
    public void postOrder(){return bookStoreService.postOrder();}

    
}
