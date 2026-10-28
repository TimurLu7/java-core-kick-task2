package com.timur.textparserapp.regex;

import java.util.regex.Pattern;

public final class RegexConstant {

    public static final String PARAGRAPH_DELIMITER = "\\n\\s*\\n";
    public static final String SENTENCE_DELIMITER = "(?<=[.!?])\\s+";
    public static final String LEXEME_DELIMITER = "\\s+";
    public static final String WORD_DELIMITER = "(?<=\\p{L})(?=\\P{L})|(?<=\\P{L})(?=\\p{L})";

    private RegexConstant() {}
}
