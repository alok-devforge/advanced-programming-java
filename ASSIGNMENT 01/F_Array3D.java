public class F_Array3D
{
    public static void main(String[] args)
    {
        int arr[][][]= new int[2][3][4];   // 2 Layers 3 Rows 4 Columns
        int val= 1;
        for(int x= 0;x<2;x++)
        {
            for(int y= 0;y<3;y++)
            {
                for(int z= 0;z<4;z++)
                { 
                    arr[x][y][z]= val++;
                }
            }
        }
        System.out.println("3D Array: ");
        for(int x= 0;x<2;x++)
        {
            System.out.println("Layer " + (x+1) + ":");
            for (int y= 0;y<3;y++)
            {
                for(int z= 0;z<4;z++)
                {
                    System.out.print(arr[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}