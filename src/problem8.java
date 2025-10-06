import java.util.ArrayList;

public class problem8 {
    public ArrayList<Integer> flatten_array(Object[] arr,ArrayList arrayList){

        for(Object element:arr){
            if(element instanceof Integer){
                arrayList.add((Integer) element);
            } else if (element instanceof Object) {
                flatten_array((Object[]) element,arrayList);
            }
        }
        return arrayList;
    }
    public static void main(String[] args) {
        Object[] arr={1,2,new Object[]{3,4,5},6,7,new Object[]{93,76,55}};
        ArrayList<Integer> arrayList=new ArrayList<>();
        problem8 p=new problem8();
        System.out.println(p.flatten_array(arr,arrayList));
    }
}
