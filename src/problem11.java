import java.util.TreeSet;

public class problem11 {
    public void prefix_sum(int[][] arr){
                for(int r=1;r<arr.length;r++){
                    for(int c=0;c<arr[r].length;c++){
                        if(arr[r][c]==0){arr[r][c]=0;}
                        else{
                            arr[r][c]+=arr[r-1][c];
                        }
                    }
                }
       // TreeSet<Integer> ts=new TreeSet<>();
                int max=0,a;
                for(int i=0;i<arr.length;i++){
                    a=maxarea(arr[i]);
                    if(a>max){max=a;}
                }
        System.out.println("Max area="+max);

    }
    public int maxarea(int[] arr){
        int w,max=0,area;
                for(int i=0;i<arr.length;i++){ w=1;
                    for(int l=i-1;l>=0;l--){
                        if(arr[l]<arr[i]){break;}
                        else{w++;}
                    }
                    for(int r=i+1;r<arr.length;r++){
                        if(arr[r]<arr[i]){break;}
                        else{w++;}
                    }
                   area=w*arr[i];
                    if(area>max){max=area;}
                }
                return max;


    }


    public static void main(String[] args) {
        int[][] arr={
                {1,0,1,0,0},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0},
        };
        problem11 p=new problem11();
        p.prefix_sum(arr);
    }
}
