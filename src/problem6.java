public class problem6 {
    public int[] binary(int z){
        int[] arr=new int[4];
        int[] ar=new int[4];
        int i=0;
        while(z>0){
            arr[i++]=(z%2);
            z/=2;
        }int j=0;
        for(int r=arr.length-1;r>=0;r--){
            ar[j++]=arr[r];
        }
        return ar;
    }
    public static void main(String[] args) {
        problem6 p=new problem6();
        int x=0,y=0,count=0,q;
        int x1[]=p.binary(x);
        for( q=0;q<x1.length;q++){
            System.out.print(x1[q]+",");
        }
        System.out.println();
        int y1[]=p.binary(y);
        for( q=0;q<y1.length;q++){
            System.out.print(y1[q]+",");
        }
        System.out.println();
        for(int l=0;l<x1.length;l++){
            if(x1[l]!=y1[l]){
                count++;
            }
        }
        System.out.println(count);
    }
    }
