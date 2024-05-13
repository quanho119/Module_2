//import java.util.Scanner;
import java.util.Arrays;
public class App {
    static int[] removeItemByIndex(int index, int[] array)
    {
        int[] newArr=new int[array.length-1];
        for(int i=0;i<newArr.length;i++)
        {
            if(i<index)
                newArr[i]=array[i];
            else
                newArr[i]=array[i+1];
        }
        return newArr;
    }
    static int[] addItem(int Item, int[] array)
    {
        int[] newArr=new int[array.length+1];
        for(int i=0;i< array.length;i++)
            newArr[i]=array[i];
        newArr[array.length]=Item;
        return newArr;
    }
    static int findIndexByValue (int Value,int[] array)
    {
        for(int i=0;i< array.length;i++)
        {
            if(array[i]==Value)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        a=removeItemByIndex(0,a);
        a=addItem(1,a);
        System.out.println(Arrays.toString(a));
        int num=4;
        num=findIndexByValue(num,a);
        System.out.println(num);
    }
}