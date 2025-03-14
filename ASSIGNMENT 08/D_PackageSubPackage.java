import mathoperations.BasicMath;
import mathoperations.advanced.AdvancedMath;
public class D_PackageSubPackage
{
    public static void main(String[] args)
    {
        BasicMath basic = new BasicMath();
        AdvancedMath advanced = new AdvancedMath();
        int a = 55, b = 23;
        System.out.println("Addition: " + a + " + " + b + " = " + basic.add(a, b));
        System.out.println("Subtraction: " + a + " - " + b + " = " + basic.subtract(a, b));
        System.out.println("Multiplication: " + a + " * " + b + " = " + advanced.multiply(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + advanced.divide(a, b));
    }
}