import java.util.Scanner;

public class Element_larger {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter value of elements : ");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target : ");
        int target=sc.nextInt();
        int above=0;
        int below=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<target)
                below++;
            else
                above++;
        }
        System.out.println("above: " +above);
        System.out.println("below: "+below);
    }
}
