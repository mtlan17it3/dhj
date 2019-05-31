package com.example.my2.doituong;

public class DataCollect {
    private String id;
    private int hinh;
    private String text;
    private String watch;

    public DataCollect(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getWatch() {
        return watch;
    }

    public void setWatch(String watch) {
        this.watch = watch;
    }

    public DataCollect(String id, int hinh, String text, String watch) {
        this.id=id;
        this.hinh=hinh;
        this.text=text;
        this.watch=watch;
    }
}
    

    
