package com.timur.textparserapp.parser;

import com.timur.textparserapp.component.TextComponent;
import com.timur.textparserapp.component.CompositeTextComponent;
import com.timur.textparserapp.component.TextComponentType;
import com.timur.textparserapp.regex.RegexConstant;

public class TextParser extends AbstractTextParser{

    @Override
    public TextComponent parse(String input) {
        CompositeTextComponent text = new CompositeTextComponent(TextComponentType.TEXT);
        String[] paragraphs = input.split(RegexConstant.PARAGRAPH_DELIMITER);
        for (String par : paragraphs) {
            text.add(next.parse(par));
        }
        return text;
    }
}
