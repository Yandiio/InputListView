package com.example.inputlistview;

public class Hero {
    int image;

    public Hero(int image, String nama, String team) {
        this.image = image;
        this.nama = nama;
        this.team = team;
    }

    String nama,team;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
