import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static boolean valid(String first_name){
        String re = "^[A-Z][A-Za-z0-9_]{3,}$";
        Pattern p = Pattern.compile(re);
        Matcher m  = p.matcher(first_name);
        return m.matches();
    }

    public static void main(String[] args) {
        Regex obj = new Regex();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String first_name = sc.next();
        if(obj.valid(first_name) == true){
            System.out.println("Name is Valid");}
        else{
            System.out.println("Name is Invalid");
        }



    }
    }