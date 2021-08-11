package bookStore.demo.User;

import java.time.LocalDate;

public class user {
    private String Name;
    private String Surname;
    private LocalDate Dob;
    private String Username;
    private String Password;

    public user(String Username,String Password,LocalDate Dob){
        this.Username = Username;
        this.Password = Password;
        this.Dob = Dob;
        String[] Fullname = Username.split(".");
        this.Name = Fullname[0];
        this.Surname = Fullname[1];
    }

    public user(){}

}
