package bookStore.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class bookStoreController {

    private final bookStoreService bookStoreService;


    @Autowired
    public bookStoreController(bookStoreService bookStoreService){
        this.bookStoreService = bookStoreService;
    }

    @GetMapping
    public List<user> getUser(){
        return bookStoreService.getUser();
    }
}
