package com.timur.textparserapp.parser;

import com.timur.textparserapp.component.TextComponent;
import com.timur.textparserapp.component.CompositeTextComponent;
import com.timur.textparserapp.component.TextComponentType;
import com.timur.textparserapp.regex.RegexConstant;

public class SentenceParser extends AbstractTextParser{

    @Override
    public TextComponent parse(String input) {
        CompositeTextComponent sentence = new CompositeTextComponent(TextComponentType.SENTENCE);
        String[] lexemes = input.split(RegexConstant.LEXEME_DELIMITER);
        for (String lex : lexemes) {
            sentence.add(next.parse(lex));
        }
        return sentence;
    }
}
