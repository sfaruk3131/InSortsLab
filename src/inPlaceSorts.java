public class inPlaceSorts {
    public static void insertionSort(int[] list1)
    {

    }
    public static void selectionSort(double[] list1)
    {
        int len = list1.length;

        for(int i = 0; i < len - 1; i++)
        {
            int minidx = i;
            for(int j = i +1; j < len; j++)
            {
                if(list1[j] < list1[minidx])
                {
                    minidx = j;
                }
                int temp = (int)list1[minidx];
                list1[minidx] = list1[i];
                list1[i] = temp;
            }
        }
    }
    public static void bubbleSort(String[] list1)
    {

    }
}
