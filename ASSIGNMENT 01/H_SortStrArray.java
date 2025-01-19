import java.util.*;
public class H_SortStrArray
{
    public static void main(String args[])
    {
        String str[]= {"alok","yash","naman","rahul","pranav"};
        Arrays.sort(str);
        System.out.println("String is sorted order: ");
        for(int x= 0;x<str.length;x++)
        {
            System.out.print(str[x]+" ");
        }
    }   
}