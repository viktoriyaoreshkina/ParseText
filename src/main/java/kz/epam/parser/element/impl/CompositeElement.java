package kz.epam.parser.element.impl;

import kz.epam.parser.element.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Кирилл on 29.11.2014.
 */
public class CompositeElement implements Element {

    private String param;

    private List<Element> word = new ArrayList<>();

    public CompositeElement(List<Element> word) {
        this.word = word;
    }

    public CompositeElement(String param) {
        this.param = param;
    }

    /**
     *  будет добавлять в коллекцию символы
     * @param element - символ
     */
    public void add(Element element){
        word.add(element);
    }

    public String printElement(){
        String line = "";
        for (Element c : this.word) {
            line += c.printElement();
        }
        return param + ": " + line + "\n";

    }
}
