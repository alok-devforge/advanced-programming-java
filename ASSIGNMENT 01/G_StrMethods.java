public class G_StrMethods 
{
    public static void main(String args[])
    {
        String str= "alok kumar";
        System.out.println("Length of the string: "+str.length());
        System.out.println("Character present at 7th index: "+str.charAt(7));
        System.out.println("Index at which k is present: "+str.indexOf('k'));
        System.out.println("Given string in upper case: "+str.toUpperCase());
        System.out.println("Replace a with s: "+str.replace('a','s'));
        System.out.println("Check string is empty or not: "+str.isEmpty());
    }    
}
