public class Main {
    
    public static void main(String[] args) {
        StringBuilder code = new StringBuilder(
            "this is the first sentence\n"+
            "this is the second sentence"
        );
     
        System.out.println(removeAllLineBreaks(code));
    }
    
    
    public static StringBuilder removeAllLineBreaks(StringBuilder sb) {
        StringBuilder ret = new StringBuilder(sb);
        for (int i = 0; i < ret.length(); ++i) {
            if (ret.charAt(i) == '\n') {
                ret.deleteCharAt(i);
                --i;
            }
        }
        return ret;
    }
}
