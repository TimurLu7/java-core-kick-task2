package com.timur.textparserapp.parser;

import com.timur.textparserapp.component.TextComponent;
import com.timur.textparserapp.component.CompositeTextComponent;
import com.timur.textparserapp.component.TextComponentType;
import com.timur.textparserapp.component.Symbol;

public class LexemeParser extends AbstractTextParser{

    @Override
    public TextComponent parse(String input) {
        CompositeTextComponent lexeme = new CompositeTextComponent(TextComponentType.LEXEME);
        for (char ch : input.toCharArray()) {
            TextComponentType type = Character.isLetterOrDigit(ch) ? TextComponentType.SYMBOL : TextComponentType.PUNCTUATION;
            lexeme.add(new Symbol(ch, type));
        }
        return lexeme;
    }
}
