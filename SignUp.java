import java.util.Scanner;

public class SignUp
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in );
        String = username, password, first_char;
        String[] used_username = new String[]{"admin person", "jimbob234", "skater_gurl17", "gary"};
    
        
        System.out.println("Enter your username: ");
        username = scan.nextString();

        if (username != used_username)
        {
            System.out.println("Enter your password: ");
            password = scan.nextString();

            first_char = password.substring(0,1);
            not_last_two = password.substring( (password.length() - 1), password.length() );

            if (first_char == "a" || first_char == "e" || first_char == "i" || first_char == "o" || first_char == "u" || first_char == "A" || first_char == "E" || first_char == "I" || first_char == "O" || first_char == "U" );
            {
                if (password.contains("#") || password.contains("!") || password.contains("$") || password.contains("&") || password.contains("*"));
                {
                    if (password.contains(username))
                    {
                        System.out.println("Your password must not contain your username");
                    }
                    else
                    {
                        if (not_last_two.contains("0") || last_two.contains("1") || last_two.contains("2") || last_two.contains("3") || last_two.contains("4") || last_two.contains("5") || last_two.contains("6") || last_two.contains("7") || last_two.contains("8") || last_two.contains("9")  );

                    }
                }
                else
                {
                    System.out.println("Your password must contain #, $, !, &, or *");
                }
            }
            else
            {
                System.out.println("Your password must begin with a vowel");
            }
        }
        else
        {
            System.out.println("That username is used");
        }
    }
}