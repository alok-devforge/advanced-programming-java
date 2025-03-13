import java.util.*;
class InvalidMobileNumberException extends Exception
{
    public InvalidMobileNumberException(String message)
    {
        super(message);
    }
}
public class D_CheckMobNo
{
    public static void validateMobNum(String mobile) throws InvalidMobileNumberException
    {
        if (mobile.length() != 10)
        {
            throw new InvalidMobileNumberException("Mobile number must be exactly 10 digits long.");
        }
        if (!mobile.matches("\\d{10}"))
        {
            throw new InvalidMobileNumberException("Mobile number must contain digits only.");
        }
        System.out.println("Mobile number is valid: " + mobile);
    }

    public static void main(String[] args)
    {
        Scanner ob= new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String mob= ob.nextLine();
        try {
            validateMobNum(mob);
        } catch (InvalidMobileNumberException e) {
            System.out.println("User-defined Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Succesfully checked correctness of mobile number");
        }
    }
}