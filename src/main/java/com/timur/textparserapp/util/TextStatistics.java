package com.timur.textparserapp.util;

import com.timur.textparserapp.component.TextComponent;
import com.timur.textparserapp.component.TextComponentType;
import java.util.List;

public class TextStatistics {

    public static long countLetters(TextComponent text) {
        return calculateCount(text, true);
    }

    public static long countSymbols(TextComponent text) {
        return calculateCount(text, false);
    }

    private static long calculateCount(TextComponent component, boolean countOnlyLetters) {
        if (component.getType() == TextComponentType.SYMBOL ||
                component.getType() == TextComponentType.PUNCTUATION) {

            char ch = component.getContent().charAt(0);

            if (countOnlyLetters) {
                return Character.isLetter(ch) ? 1 : 0;
            } else {
                return Character.isWhitespace(ch) ? 0 : 1;
            }
        }

        long count = 0;
        List<TextComponent> children = component.getChildren();
        for (TextComponent child : children) {
            count += calculateCount(child, countOnlyLetters);
        }

        return count;
    }
}
