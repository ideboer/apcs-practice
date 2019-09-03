import java.util.Scanner;

public class SignUp
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in );
        String username, password, first_char, not_last_two;
    
        
        System.out.println("Enter your username: ");
        username = scan.nextLine();

        if (username.equals("admin person") || username.equals("jimbob234") || username.equals("skater_gurl17") || username.equals("gary")  )
        {
            System.out.println("That username is used");
        }
        else
        {
            System.out.println("Enter your password: ");
            password = scan.nextLine();

            first_char = password.substring(0,1);
            not_last_two = password.substring( 0, ( password.length() - 1 ) );

            if (first_char.equals("a") || first_char.equals("e") || first_char.equals("i") || first_char.equals("o") || first_char.equals("u") || first_char.equals("A") || first_char.equals("E") || first_char.equals("I") || first_char.equals("O") || first_char.equals("U") )
            {
                if (password.contains("#") || password.contains("!") || password.contains("$") || password.contains("&") || password.contains("*"))
                {
                    if (password.contains(username))
                    {
                        System.out.println("Your password must not contain your username");
                    }
                    else
                    {
                        if (not_last_two.contains("0") || not_last_two.contains("1") || not_last_two.contains("2") || not_last_two.contains("3") || not_last_two.contains("4") || not_last_two.contains("5") || not_last_two.contains("6") || not_last_two.contains("7") || not_last_two.contains("8") || not_last_two.contains("9") )
                        {
                            System.out.println("Your password may only contain numbers in the last two characters.");
                        }
                        else
                        {
                            System.out.println("Sign up successful.");
                        }
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
    }
}