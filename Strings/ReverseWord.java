
public class ReverseWord {
    public static String reverseWords(String s) {
        String[] strs=s.split("\\s+");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i =strs.length-1; i >=0; i--) {
            stringBuilder.append(strs[i]);
            if(i!=0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
    public static void main(String[] args) {
        System.out.println(ReverseWord.reverseWords("the sky is blue"));
    }
    
}
