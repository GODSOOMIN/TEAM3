package com.google.firebase.codelab.friendlychat;
//기사 content를 담을 클래스 Item
public class Item {
    public String title;  //제목
    public String description;  //본문내용
    public String date;  //날짜
    public String link;  //링크

    public Item(String title,String description,String date,String link){
        this.title = title;
        this.description = description;
        this.date = date;
        this.link = link;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getDate(){
        return date;
    }
    public String getLink(){
        return link;
    }
}