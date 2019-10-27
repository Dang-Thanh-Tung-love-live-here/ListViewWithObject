package com.example.listview_with_object.hs;

public class hs {
    private String iD;

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "hs{" +
                "iD='" + iD + '\'' +
                '}';
    }

    public hs(String iD) {
        this.iD = iD;
    }
}
