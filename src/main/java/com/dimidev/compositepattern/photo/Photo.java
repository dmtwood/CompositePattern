package com.dimidev.compositepattern.photo;

public class Photo extends PhotoTreeComponent {
    public Photo(String name) {
        super(name);
    }
    public void print(){
        System.out.println("photo " + super.getName());
    }
}
