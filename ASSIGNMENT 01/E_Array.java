public class E_Array
{
    public static void main(String[] args)
    {
        int row= 4;
        int[][] arr= new int[row][];
        arr[0] = new int[] {7,2,4,1};
        arr[1] = new int[] {3,2,1};
        arr[2] = new int[] {9,1};
        arr[3] = new int[] {4,6,7};
        System.out.println("2D array with diff no of rows in diff columns: ");
        for (int x= 0;x<arr.length;x++)
        {
            for (int y= 0;y<arr[x].length;y++)
            {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}