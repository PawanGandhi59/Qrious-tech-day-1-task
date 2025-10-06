import java.util.Scanner;

public class problem2 {
    public int[] rotate_array(int[] nums){
        int [] n =new int[nums.length];
        int k,t=0;
        System.out.println("Enter value of k:");
        Scanner sc=new Scanner(System.in);
        k=sc.nextInt();
        if(k> nums.length){
            k%= nums.length;
        }
        int value=nums.length-k,temp=nums.length-k;
        for(int i=0;i<k;i++){
            n[i]=nums[temp++];
        }
        for(int j=k;j< nums.length;j++){
            n[j]=nums[t++];
        }

        return n;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        problem2 p=new problem2();
        nums=p.rotate_array(nums);
        for(int m=0;m<nums.length;m++){
            System.out.print(nums[m]+" ");
        }
    }
}
