package kz.epam.parser.util;

import kz.epam.parser.element.impl.CompositeElement;
import kz.epam.parser.element.impl.SymbolElement;

/**
 * Created by Кирилл on 29.11.2014.
 */
public class ParserUtil {
    public static CompositeElement parse (String text){
        return parseText(text);
    }

    private static CompositeElement parseText(String text){
        String[] paragraphs = text.split("\n");
        CompositeElement result = new CompositeElement("TEXT");
        for (int i = 0; i < paragraphs.length; i++) {
            result.add(parseParagraph(paragraphs[i]));
        }
        return result;
    }

    private static CompositeElement parseParagraph(String line){
        String[] lines = line.split("\\.\\!\\?");
        CompositeElement paragraph = new CompositeElement("PARAGRAPH");
        for (int i = 0; i < lines.length; i++) {
            paragraph.add(parseSentence(lines[i]));
        }
        return paragraph;
    }

    private static CompositeElement parseSentence(String sentence){
        String[] words = sentence.split(" ");
        CompositeElement sentences = new CompositeElement("SENTENCE");
        for (int i = 0; i < words.length; i++) {
            sentences.add(parseWord(words[i]));
        }
        return sentences;
    }

    private static CompositeElement parseWord(String word){
        String[] symbols = explode(word);
        CompositeElement result = new CompositeElement("WORD");
        for (int i = 0; i < symbols.length; i++) {
            CompositeElement symbol = new CompositeElement("SYMBOL");
            symbol.add(new SymbolElement(symbols[i]));
            result.add(symbol);
        }
        return result;

    }

    private static String[] explode(String s) {
        String[] arr = new String[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            arr[i] = String.valueOf(s.charAt(i));
        }
        return arr;
    }
}
