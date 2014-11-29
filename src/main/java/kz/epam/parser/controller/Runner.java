package kz.epam.parser.controller;

import kz.epam.parser.element.impl.CompositeElement;
import kz.epam.parser.util.ParserUtil;

/**
 * Created by Кирилл on 29.11.2014.
 */
public class Runner {
    public static final String TEXT =
            "-Is London a capital of Great Britain?\n" +
                    "-Yes, of course!\n" +
                    "- How many people live in London?\n" +
                    "- Near 2 568 078.";

    public static void main(String[] args) {
        CompositeElement resultText = ParserUtil.parse(TEXT);
        System.out.println(resultText.printElement());
    }
}
