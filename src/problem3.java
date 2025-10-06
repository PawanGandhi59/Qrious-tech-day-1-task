public class problem3 {
    public StringBuffer rotate_vowels(String s){
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer();
        int i;
        for(i=0;i<s.length();i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'U' || s.charAt(i) == 'u') {
                sb.append(s.charAt(i));
            }
        }
        int k=sb.length();
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e' || s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o' || s.charAt(i) == 'U' || s.charAt(i) == 'u'){
                sb1.append(sb.charAt(k-1));
                k--;
            }
            else{
                sb1.append(s.charAt(i));
            }

        }
        return sb1;
    }
    public static void main(String[] args) {
        String s="charAt";
        problem3 p=new problem3();
        System.out.println(p.rotate_vowels(s));
    }
}
