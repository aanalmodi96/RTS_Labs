import java.util.Arrays;
import java.util.Scanner;

public class Rotate_String {
    public static void main(String args[])
    {
        String str;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the input String: ");
        str = scan.nextLine();

        System.out.println("Enter the input number for rotating the string: ");
        int n = scan.nextInt();

        int size=str.length();
        char arr[]=str.toCharArray();
        rotate(arr,0,size-1);
        rotate(arr,0,n-1);
        rotate(arr,n,size-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(char [] arr,int i ,int j)
    {
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }
}
