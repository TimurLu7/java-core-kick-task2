package com.timur.textparserapp.parser;

import com.timur.textparserapp.component.TextComponent;

public abstract class AbstractTextParser {

    protected AbstractTextParser next;

    public void setNext(AbstractTextParser next){
        this.next=next;
    }

    public abstract TextComponent parse(String input);
}
