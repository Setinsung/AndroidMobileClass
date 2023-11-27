package com.hdu.kaboziapp;

public class NewsItem {
    private String title;
    private int imageId;
    private String content;

    public NewsItem(String title, int imageId, String content) {
        this.title = title;
        this.imageId = imageId;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
