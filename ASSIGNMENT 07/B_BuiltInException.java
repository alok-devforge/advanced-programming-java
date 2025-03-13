public class B_BuiltInException
{
    public static void main(String[] args)
    {
        try
        {
            String str = null;
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
        try
        {
            int num = Integer.parseInt("XYZ");
            System.out.println("Parsed Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
        try
        {
            Object obj = Integer.valueOf(100);
            String s = (String) obj;
            System.out.println("Value: " + s);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
        try
        {
            int arr[] = new int[-5];
            System.out.println("Array length: " + arr.length);
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
    }
}