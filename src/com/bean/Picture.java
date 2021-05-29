package com.bean;

public class Picture {
    private int id;
    private String name;
    private String bigHead;

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bigHead='" + bigHead + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBigHead() {
        return bigHead;
    }

    public void setBigHead(String bigHead) {
        this.bigHead = bigHead;
    }
}
