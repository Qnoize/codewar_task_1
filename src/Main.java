
//Write a function that takes in a string of one or more words, and returns the same string,
//        but with all five or more letter words reversed (Just like the name of this Kata).
//        Strings passed in will consist of only letters and spaces. Spaces will be included
//        only when more than one word is present.
//
//        Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw" spinWords( "This is a test")
//        => returns "This is a test" spinWords( "This is another test" )=> returns "This is rehtona test"
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
