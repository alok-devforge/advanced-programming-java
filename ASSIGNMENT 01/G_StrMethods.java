public class G_StrMethods 
{
    public static void main(String args[])
    {
        String str= "alok kumar";
        System.out.println("Length of the string: "+str.length());
        System.out.println("Character present at 7th index: "+str.charAt(7));
        System.out.println("Index at which K is present: "+str.indexOf('K'));
        System.out.println("Given string in lower case: "+str.toLowerCase());
        System.out.println("Replace s with s: "+str.replace('a','s'));
        System.out.println("Check string is empty or not: "+str.isEmpty());
    }    
}
