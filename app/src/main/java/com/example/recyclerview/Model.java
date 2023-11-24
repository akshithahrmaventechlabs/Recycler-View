package com.example.recyclerview;

public class Model {
    int image;
    String player_name,player_email,player_phonenumber;

    public Model(int image, String player_name, String player_email, String player_phonenumber) {
        this.image = image;
        this.player_name = player_name;
        this.player_email = player_email;
        this.player_phonenumber = player_phonenumber;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_email() {
        return player_email;
    }

    public void setPlayer_email(String player_email) {
        this.player_email = player_email;
    }

    public String getPlayer_phonenumber() {
        return player_phonenumber;
    }

    public void setPlayer_phonenumber(String player_phonenumber) {
        this.player_phonenumber = player_phonenumber;
    }
}
