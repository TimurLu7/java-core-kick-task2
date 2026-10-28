package com.timur.textparserapp.parser;

public class ParserChainFactory {
    private static final AbstractTextParser CHAIN = buildChain();

    private ParserChainFactory() {}

    private static AbstractTextParser buildChain() {
        AbstractTextParser textParser = new TextParser();
        AbstractTextParser paragraphParser = new ParagraphParser();
        AbstractTextParser sentenceParser = new SentenceParser();
        AbstractTextParser lexemeParser = new LexemeParser();

        textParser.setNext(paragraphParser);
        paragraphParser.setNext(sentenceParser);
        sentenceParser.setNext(lexemeParser);

        return textParser;
    }

    public static AbstractTextParser getChain() {
        return CHAIN;
    }
}
