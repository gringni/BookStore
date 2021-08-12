package bookStore.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface bookRepository extends JpaRepository<user,String>{

    Optional<user> findUserByUsername(String Username);
}