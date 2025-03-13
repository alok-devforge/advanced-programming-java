import java.util.*;
class MyCustomException extends Exception
{
    public MyCustomException(String message)
    {
        super(message);
    }
}

public class C_UserDefinedFunc
{
    static void validateAge(int age) throws MyCustomException
    {
        if(age < 18)
        {
            throw new MyCustomException("Invalid Age: Age must be 18 or above.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            validateAge(age);
        } catch (MyCustomException e) {
            System.out.println("User-defined Exception caught: " + e.getMessage());
        }
    }
}