import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParseText {

    // protected List<String> sentences = new ArrayList<>();

    public static final String TEXT =
            "-Is London a capital of Great Britain?\n" +
                    "-Yes, of course!\n" +
                    "- How many people live in London?\n" +
                    "- Near 2 568 078.";
    // public List<String> arr = explode(text);

    public static List<Character> explode(String s) {
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            arr.add(i, s.charAt(i));
            //  System.out.println(arr[1]);
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] t = TEXT.split("\n");
        List<String> sentences = new ArrayList<>(); //add list of sentences
        String s = "";
        for (String c : t) {
            sentences.add(c);
            s = s + c + " ";
            System.out.println(c);
        }
        //System.out.println(sentences.get(1));  //test
        System.out.println(sentences);

        Collections.sort(sentences);
        System.out.println(sentences);
//------------------------------------------------------------------------------------

        String[] t1 = TEXT.split("\\s");
        List<String> words = new ArrayList<>(); //add list of words
        String w = "";
        for (String c : t1) {
            words.add(c);
            w = w + c + " ";
            //        System.out.println(c);
        }

        System.out.println(words);

        Collections.sort(words);
        System.out.println(words);
//------------------------------------------------------------------------------------
        List<Character> letters = explode(TEXT);  //add list of letters
        System.out.println(letters);

        Collections.sort(letters);
        System.out.println(letters);

        String ss = letters.toString();
        System.out.println(ss);
        int k = 0;

        for (int i = 0; i <= (ss.length() + 1); i++) {
            String r1 = String.valueOf(ss.charAt(i));
            String r2 = String.valueOf(ss.charAt(i + 1));
            if (r1.equals(r2)) {
                k = k + 1;
                System.out.print("Символ " + r1 + " повторяется" + k + " раз!" + "\n");
            }

        }

    }

    //   private static final Map<Integer, String> regexes = new HashMap<>();

   /* static { //сделать мапу, куда передавать сущности - абзацы, предложния, слова и т.п. и регексы
        regexes.put(Parameter, "\\n");
        regexes.put(Parameter, "\\n");
        regexes.put(Parameter, "\\n");
        regexes.put(Parameter, "\\n");
        regexes.put(Parameter, "\\n");
        regexes.put(Parameter, "\\n");
        regexes.put(Parameter, "\\n");
        regexes.put(Parameter, "\\n");
    }*/

/*    public static void main(String[] args) throws Exception {

        char[] chars = "123".toCharArray();
        List<Character> characters = new ArrayList<>(10);
        for (char c : chars) characters.add(c);
        characters.add('4');
        System.out.println(characters);
    }*/
}
