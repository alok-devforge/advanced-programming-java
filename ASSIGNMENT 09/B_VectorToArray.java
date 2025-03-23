import java.util.*;
public class B_VectorToArray
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of elements to add to the vector: ");
        int n = ob.nextInt();
        Vector<Integer> vec = new Vector<>();
        System.out.println("Enter " + n + " integer elements:");
        for (int i = 0; i < n; i++) {
            vec.add(ob.nextInt());
        }
        Object[] obArr = vec.toArray();
        System.out.println("Vector converted to Object array: " + Arrays.toString(obArr));
        Integer[] intArr = vec.toArray(new Integer[0]);
        System.out.println("Vector converted to Integer array: " + Arrays.toString(intArr));
    }
}