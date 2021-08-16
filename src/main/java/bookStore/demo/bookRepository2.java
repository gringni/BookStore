package bookStore.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface bookRepository2 extends JpaRepository<userOrder,String> {

}
