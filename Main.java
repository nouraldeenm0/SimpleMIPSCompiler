public class Main {
    
    public static void main(String[] args) {
        StringBuilder asm = new StringBuilder(
            "this is the first sentence\n\n"+
            "this is the second sentence" 
        );   
        
        System.out.println(asm);
    }
    
    
    public static void removeExtraLines(StringBuilder sb) {
        boolean foundALineBreak = false;
        for (int i = 0; i < sb.length(); ++i) {
            foundALineBreak = (sb.charAt(i) == '\n');
        }
    }
}
