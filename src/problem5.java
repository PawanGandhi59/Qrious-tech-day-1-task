public class problem5 {
    public int first_occurence(String haystack,String needle){
        int start=0,index,flag=1;
        for(int i=0;i<haystack.length();i++){
            index=i;
            if(needle.charAt(start)== haystack.charAt(i)){
                if(start<needle.length()-1){
                    start++;
                }
                else{
                    flag=0;
                    return (index-(needle.length()-1));

                }
            }
            else{
                start=0;
            }
        }
        if(flag==1){
            return(-1);
        }
        return 0;
    }
    public static void main(String[] args) {
        String haystack="ldd",needle="dd";
        problem5 p=new problem5();
        System.out.println(p.first_occurence(haystack,needle));
    }
}
