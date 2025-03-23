import java.util.*;
public class A_MergAndSortArray
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number of lists to merge: ");
        int num = ob.nextInt();
        List<List<Integer>> coll = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the number of elements for list " + (i + 1) + ": ");
            int size = ob.nextInt();
            List<Integer> temp = new ArrayList<>();
            System.out.println("Enter " + size + " integer elements for list " + (i + 1) + ": ");
            for (int j = 0; j < size; j++) {
                temp.add(ob.nextInt());
            }
            coll.add(temp);
        }
        @SuppressWarnings("unchecked")
        List<Integer>[] listsArray = coll.toArray(new List[0]);
        List<Integer> mergedSortedList = ArrayListUtil.mergeAndSort(listsArray);
        System.out.println("Merged and sorted list: " + mergedSortedList);
    }
}
class ArrayListUtil
{
    @SafeVarargs
    public static <T extends Comparable<? super T>> List<T> mergeAndSort(List<T>... lists)
    {
        List<T> mergedList = new ArrayList<>();
        for (List<T> list : lists) {
            mergedList.addAll(list);
        }
        Collections.sort(mergedList);
        return mergedList;
    }
    @SafeVarargs
    public static <T> List<T> merge(List<T>... lists)
    {
        List<T> mergedList = new ArrayList<>();
        for (List<T> list : lists) {
            mergedList.addAll(list);
        }
        return mergedList;
    }
    public static <T extends Comparable<? super T>> void sort(List<T> list)
    {
        Collections.sort(list);
    }
}