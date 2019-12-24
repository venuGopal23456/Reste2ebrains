package com.example.e2e;

public class topicpojo {

    private String name;
    private int id;
    private int sub;

    @Override
    public String toString() {
        return "topicpojo{" +
                "name=" + name +
                ", id=" + id +
                ", sub=" + sub +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public topicpojo(String name, int id, int sub) {
        this.name = name;
        this.id = id;
        this.sub = sub;
    }
}
