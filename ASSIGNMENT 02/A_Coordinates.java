public class A_Coordinates
{
   int x,y;
   A_Coordinates(int a,int b)
   {
        x= a;
        y= b;
   } 
   void display()
   {
        System.out.println("The coordinates are- x: "+x+" y: "+y);
   }
   public static void main(String[] args)
   {
        A_Coordinates ob= new A_Coordinates(8, 2);
        ob.display();
   }
}