package com.timur.textparserapp.component;

import java.util.ArrayList;
import java.util.List;

public class CompositeTextComponent implements TextComponent{

    private final TextComponentType type;
    private final List<TextComponent> children = new ArrayList<>();

    public CompositeTextComponent(TextComponentType type){
        this.type = type;
    }

    @Override
    public void add(TextComponent component){
        children.add(component);
    }

    @Override
    public void remove(TextComponent component){
        children.remove(component);
    }

    @Override
    public List<TextComponent> getChildren(){
        return children;
    }

    @Override
    public TextComponentType getType(){
        return type;
    }

    @Override
    public String getContent(){
        StringBuilder sb = new StringBuilder();
        for(TextComponent child: children){
            sb.append(child.getContent());
        }
        return sb.toString();
    }
}
