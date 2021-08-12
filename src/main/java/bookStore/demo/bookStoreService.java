package bookStore.demo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public void deleteUser(String username){
        Optional<user> userOptional = bookRepository.findUserByUsername(user.getUsername());
        if(!userOptional.isPresent()){
            thorw new IllegalAccessError("User not Exist");
        }
        bookRepository.deleteByUsername(username)
    }

    public void postUser(user user) {
        Optional<user> userOptional = bookRepository.findUserByUsername(user.getUsername());
        if(userOptional.isPresent()){
            thorw new IllegalAccessError("User Exist");
        }
        bookRepository.save(user);
    }


}
