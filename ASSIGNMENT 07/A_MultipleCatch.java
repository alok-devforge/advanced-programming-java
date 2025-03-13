public class A_MultipleCatch
{
    public static void main(String[] args)
    {
        try
        {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        }
        try {
            int[] arr = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
