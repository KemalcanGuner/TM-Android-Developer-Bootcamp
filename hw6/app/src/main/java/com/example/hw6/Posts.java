package com.example.hw6;

import java.io.Serializable;

public class Posts implements Serializable {
    private int id;
    private String title;
    private String imgName;
    private String upvote;
    private String subReddit;

    public Posts(int id, String title, String imgName, String upvote, String subReddit) {
        this.id = id;
        this.title = title;
        this.imgName = imgName;
        this.upvote = upvote;
        this.subReddit = subReddit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getUpvote() {
        return upvote;
    }

    public void setUpvote(String upvote) {
        this.upvote = upvote;
    }

    public String getSubReddit() {
        return subReddit;
    }

    public void setSubReddit(String subReddit) {
        this.subReddit = subReddit;
    }
}
