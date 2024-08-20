public class LoginForm{
    String name;
    int luckyNumber;
    int dateOfBirth;
    public LoginForm() {
    }
    public String email(){
        return name.toLowerCase()+luckyNumber+"@gmail.com";
    }
    public int password(){
       return (dateOfBirth);
    }
}
