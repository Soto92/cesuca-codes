
/**
 * Trabalho de POO
 * 
 * @author Mauricio Soto, Rodrigo Pereira, Tiago Amaral
 * @version 1.0.0
 */
import java.util.Date;
import java.sql.Timestamp;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Contato
{
    private String name;
    private int ID;
    private String phone;
    private String email;
    private String birthdate; 

    public Contato(String name, String phone){
        this.setName(name);
        this.setPhone(phone);
        this.setID();
    }
    public void setID() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long milis = timestamp.getTime();
        this.ID = (int) milis;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        if(name != null && !name.isEmpty() && name.length() > 3) {
            this.name = name;
        } else {
            System.out.println("Nome Invalido!");
        }
    }
    public void setPhone(String phone) {
        if(phone != null && !phone.isEmpty() && phone.length() > 7) {
            this.phone = phone;
        } else {
            System.out.println("Telefone Invalido!");
        }
        
    } 
    public static boolean isValidEmail(String email) {
        String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public void setEmail(String email) {
        if(isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Email Invalido!");
        }
        
    }
}
