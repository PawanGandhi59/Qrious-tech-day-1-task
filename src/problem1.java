import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class problem1 {
    public ArrayList<Integer> rem_dup(int[] arr){
        int i=arr[0];int count=0,j;
        ArrayList<Integer>al = new ArrayList<>();
        al.add(i);
        for(j=1;j< arr.length;j++){
            if(arr[j]==i){
                count++;
                continue;
            }
            else{
                i=arr[j];
                al.add(i);
            }
        }
        for(j=0;j<count;j++){
            al.add(-1);
        }
        return al;
    }
    public static void main(String[] args) {
        int[] nums={0,1,1,2,2,3,4,4,5,5,5};
        problem1 m=new problem1();
        System.out.println(m.rem_dup(nums));
    }
}