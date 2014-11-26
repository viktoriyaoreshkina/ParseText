import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParseText {

   // protected List<String> sentences = new ArrayList<>();

    protected String data = "abc";
    public List<String> arr = explode(data);

    public static List<String> explode(String s) {
        List<String> arr = new ArrayList<String>();
        for(int i = 0; i < s.length(); i++)
        {
            arr.add(i, String.valueOf(s.charAt(i)));
            //  System.out.println(arr[1]);
        }
        return arr;
    }


    public static void main(String[] args) {
     String text = "-Is London a capital of Great Britain?\n-Yes, of course?\n- How many people live in London?\n- Near 2 568 078";
     //   System.out.println(text);

        String[] t = text.split("\n");
        List<String> sentences = new ArrayList<>(); //add list of sentences
        String s = "";
        for (String c : t) {
            sentences.add(c);
            s = s + c + " ";
            System.out.println(c);
        }
        //System.out.println(sentences.get(1));  //test
        System.out.println(sentences);

        Collections.sort(sentences, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println(sentences);
//------------------------------------------------------------------------------------


        String[] t1 = text.split("\\s");
        List<String> words = new ArrayList<>(); //add list of words
        String w = "";
        for (String c : t1) {
            words.add(c);
            w = w + c + " ";
    //        System.out.println(c);
        }

        System.out.println(words);

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toString().compareTo(o1.toString());
            }
        });
        System.out.println(words);
//------------------------------------------------------------------------------------
        List<String> letters = explode(text);  //add list of letters
        System.out.println(letters);

        Collections.sort(letters, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println(letters);


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
