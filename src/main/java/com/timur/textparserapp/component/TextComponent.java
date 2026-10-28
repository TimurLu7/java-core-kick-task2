package com.timur.textparserapp.component;

import com.timur.textparserapp.exception.TextParserException;

import java.util.List;

public interface TextComponent {
    String getContent();
    void add(TextComponent component) throws TextParserException;
    void remove(TextComponent component) throws TextParserException;
    List<TextComponent> getChildren();
    TextComponentType getType();
}
