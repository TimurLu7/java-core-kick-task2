package com.timur.textparserapp.parser;

import com.timur.textparserapp.component.TextComponent;
import com.timur.textparserapp.component.CompositeTextComponent;
import com.timur.textparserapp.component.TextComponentType;
import com.timur.textparserapp.regex.RegexConstant;

public class ParagraphParser extends AbstractTextParser{

    @Override
    public TextComponent parse(String input) {
        CompositeTextComponent paragraph = new CompositeTextComponent(TextComponentType.PARAGRAPH);
        String[] sentences = input.split(RegexConstant.SENTENCE_DELIMITER);
        for (String sen : sentences) {
            paragraph.add(next.parse(sen));
        }
        return paragraph;
    }
}
