
public class Main {
    public static void main(String[] args) {
        //String sentence = "Welcome";
        String sentence = "Hey fellow warriors";
        System.out.println(spinWords(sentence));
    }

     public static String spinWords(String sentence) {
         String result = "";
         if (sentence.contains(" ")) {
             String[] words = sentence.split(" ");
             for (int i = 0; i < words.length; i++) {
                 StringBuffer stringBuffer = new StringBuffer(words[i]);
                 if (stringBuffer.length() >= 5) {
                     stringBuffer.reverse();
                 }
                 result = result.concat(String.valueOf(stringBuffer));
                 if (i < words.length - 1) {
                     result = result + " ";
                 }
             }
         } else {
             StringBuffer stringBuffer = new StringBuffer(sentence);
             result = stringBuffer.reverse().toString();
         }
         return result;
     }
}
