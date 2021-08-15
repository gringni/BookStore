package bookStore.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class bookStoreService {

    @Autowired
    private bookRepository bookRepository;

    public List<user> getUser(String username){
        return List.of(bookRepository.getById(username));

//                List.of(
//                new user(
//                        "john.doe",
//                        "thisismysecreat",
//                        LocalDate.of(1985,01,15)
//        )
//        );
    }

    public void deleteUser(String username){
        Optional<user> userOptional = bookRepository.findById(username);
        if(!userOptional.isPresent()){
            throw  new IllegalAccessError("User not Exist");
        }
        bookRepository.delete(bookRepository.getById(username));
    }

    public void postUser(user user) {
        Optional<user> userOptional = bookRepository.findById(user.getUsername());
        if(userOptional.isPresent()){
            throw new IllegalAccessError("User Exist");
        }
        bookRepository.save(user);
    }

    public void postOrder(user user) throws IOException {
        List<book> bookL =allBook();
        bookRepository.

    }

    public List<book> showBook() throws IOException {
        List<book> bookL =allBook();
        
        return bookL;}

    private List<book> allBook() throws IOException {
            URL url = new URL("https://scb-test-book-publisher.herokuapp.com/books");
            HttpURLConnection connection1 = (HttpURLConnection) url.openConnection();
            connection1.setRequestProperty("accept", "application/json");
            InputStream responseStream = connection1.getInputStream();
            ObjectMapper mapper = new ObjectMapper();
            book[] bookAll = mapper.readValue(responseStream, book[].class);

            URL url2 = new URL("https://scb-test-book-publisher.herokuapp.com/books/recommendation");
            HttpURLConnection connection2 = (HttpURLConnection) url2.openConnection();
            connection1.setRequestProperty("accept", "application/json");
            InputStream responseStream2 = connection1.getInputStream();
            ObjectMapper mapper2 = new ObjectMapper();
            book[] bookRec = mapper2.readValue(responseStream2, book[].class);

            List<book> bookL = null;
            for(book a : bookRec) {
                bookL.add(a);
            }
            for (book b :bookAll){
                for (book a : bookAll)
                    if (b.getId()==a.getId()){continue;}
                bookL.add(b);
            }
            return bookL;
    }


}
