package com.dimidev.compositepattern.photo;

public abstract class PhotoTreeComponent {
    private String name;
    public PhotoTreeComponent(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void add(PhotoTreeComponent o) {
        throw new UnsupportedOperationException();
    }
    public PhotoTreeComponent remove(int i) {
        throw new UnsupportedOperationException();
    }
    public void remove(PhotoTreeComponent o) {
        throw new UnsupportedOperationException();
    }
    public PhotoTreeComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public void print() {throw new UnsupportedOperationException(); }
}

