import java.util.ArrayList;
import java.util.List;

public class ParseText {

    public static void main(String[] args) {
        String text = "London is a capital of Great Britain";

        char[] chars = text.toCharArray();
        List<Character> characters = new ArrayList<Character>();
        for (char c : chars) characters.add(c);
        System.out.println(characters);

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
