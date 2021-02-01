package com.dimidev.compositepattern.photo;

import java.util.ArrayList;
import java.util.List;

public class Location extends PhotoTreeComponent {

    private final List<PhotoTreeComponent> children;

    public Location(String name) {
        super(name);
        children = new ArrayList<>();
    }

    public void add(PhotoTreeComponent o) {
        children.add(o);
    }

    public PhotoTreeComponent remove(int i) {
        return children.remove(i);
    }

    public void remove(PhotoTreeComponent o) {
        children.remove(o);
    }

    public PhotoTreeComponent getChild(int i) {
        return children.get(i);
    }
    public void print(){
        for (PhotoTreeComponent child : children){
            System.out.println( child.getName() );
            if (child instanceof Location) {
                child.print();
            }
        }
    }
}














