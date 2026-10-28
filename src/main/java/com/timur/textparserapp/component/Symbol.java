package com.timur.textparserapp.component;

import com.timur.textparserapp.exception.TextParserException;
import java.util.List;

public class Symbol implements TextComponent {

    private final char value;
    private final TextComponentType type;

    public Symbol(char value, TextComponentType type){
        this.value=value;
        this.type=type;
    }

    @Override
    public String getContent(){
        return String.valueOf(value);
    }

    @Override public void add(TextComponent c) throws TextParserException{
        throw new TextParserException("Лист типа " + type + " не может содержать дочерние компоненты");
    }

    @Override public void remove(TextComponent c) throws TextParserException{
        throw new TextParserException("Лист типа " + type + " не поддерживает удаление дочерних компонентов");
    }

    @Override public List<TextComponent> getChildren() {
        return List.of();
    }

    @Override public TextComponentType getType() {
        return type;
    }
}
