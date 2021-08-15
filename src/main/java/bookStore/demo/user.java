package bookStore.demo;

import org.springframework.context.annotation.Bean;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class user {
    @Id
    @SequenceGenerator(name = "user_sequence",
                    sequenceName = "user_sequence",
                    allocationSize = 1)
    @GeneratedValue(
                    strategy = GenerationType.SEQUENCE,
                    generator = "user_sequence"
    )

    private String Username;
    private String Name;
    private String Surname;
    private LocalDate Dob;
    private String Password;

    public user(String Username,String Password,LocalDate Dob){
        this.Username = Username;
        this.Password = bookSecurity.passwordEncoder().encode("Password");
        this.Dob = Dob;
        String[] Fname = Username.split("\\.");
        this.Name = Fname[0];
        this.Surname = Fname[1];
    }

    public user(){}

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public LocalDate getDob() {
        return Dob;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    @Override
    public String toString() {
        return "user{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Dob=" + Dob +
                ", Username='" + Username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }


}
