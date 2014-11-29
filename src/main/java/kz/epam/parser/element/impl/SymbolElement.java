package kz.epam.parser.element.impl;

import kz.epam.parser.element.Element;

/**
 * Created by Кирилл on 29.11.2014.
 */
public class SymbolElement implements Element{
    private String symbol;

    public SymbolElement(String symbol) {
        this.symbol = symbol;
    }

    public String printElement(){
        return symbol;
    }
}
