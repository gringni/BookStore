package bookStore.demo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class bookStoreService {

    public List<user> getUser(){
        return List.of(
                new user(
                        "john.doe",
                        "thisismysecreat",
                        LocalDate.of(1985,01,15)
                )
        );
    }
}
