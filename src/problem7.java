import java.util.ArrayList;

public class problem7 {
    public StringBuffer prefix(String[] s){
        int index=0;
        StringBuffer al=new StringBuffer();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length;i++){
        al.append(s[i].length());}
        int min= al.charAt(0)-'0';
        for(int j=1;j<al.length();j++){
            if(al.charAt(j)-'0'<min){
                min=al.charAt(j)-'0';
            }
        }for(int b=0;b<min;b++){
        if(((s[0].charAt(index)==s[1].charAt(index)) && (s[0].charAt(index)==s[2].charAt(index)))){
        if(index<min){
        sb.append(s[0].charAt(index));
        index++;
        }}}
        return sb;
    }
    public static void main(String[] args) {
        String[] strs={"flower","kflower","flower",""};
        problem7 p=new problem7();
        System.out.println(p.prefix(strs));
    }
}
