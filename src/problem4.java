import java.util.Scanner;

public class problem4 {
    public boolean can_place_flowers(int [] flowerbed){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=sc.nextInt();
        if(n>0){
            for(int i=0;i<flowerbed.length;i++) {
                if (n > 0) {
                    if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] != 1) {
                       flowerbed[i]=1;
                        n--;
                    } else if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] != 1) {
                        flowerbed[i]=1;
                        n--;
                    } else if (n > 0 && flowerbed[i] == 0 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                        flowerbed[i]=1;
                        n--;
                    }
                }
                else {
                    break;
                }
            }
        }
        if(n==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] flowerbed={0,0,0,0,0,0,0,1};
        problem4 p=new problem4();
        System.out.println(p.can_place_flowers(flowerbed));
    }
}
