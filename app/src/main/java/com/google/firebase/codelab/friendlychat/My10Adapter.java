package com.google.firebase.codelab.friendlychat;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import android.support.annotation.NonNull;

import org.w3c.dom.Text;

public class My10Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    //My10Adapter : 데이터와 아이템에 대한 VIew생성

    // 각 데이터 항목에 대한 뷰 참조 제공
    // 복잡한 데이터 항목은 항목당 둘 이상의 보기가 필요할 수 있으며,
    // 뷰 홀더의 데이터 항목에 대한 모든 뷰에 대한 액세스 제공

    static class MyViewHolder extends RecyclerView.ViewHolder {
        //My10Adapter RecyclerView에 대한 모든 서브뷰를 보유
        TextView mytitle;
        TextView mydescriptioin;
        TextView mydate;
        TextView mylink;


        MyViewHolder(View v) {
            super(v);
            //activity_board10s에 있는 Id를 가져온다
            //예를 들어 activity_board10s에 title 에는 mytitle의 내용이 들어갈것이다
            mytitle = v.findViewById(R.id.title);
            mydescriptioin = v.findViewById(R.id.description);
            mydate = v.findViewById(R.id.date);
            mylink = v.findViewById(R.id.link);
        }
    }

    private ArrayList<Item> MyItemArrayList;//총 10개의 기사내용을 가지고 있음
    // Provide a suitable constructor (depends on the kind of dataset)
    My10Adapter(ArrayList<Item> ItemArrayList) {
        MyItemArrayList = ItemArrayList;
    }


    // 새로운 뷰를 만든다 ( activity_board10s 레이아웃 )
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        //RecyclerView에 대한 모든 서브뷰를 보유
        //새로운 View를 만든다
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_board10s, parent, false);

        return new MyViewHolder(v);
    }

    // View에 content(기사의 제목,내용,날짜,링크)로 대체한다
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //뷰에 있는 곳에 가져온 내용들로 대처한다
        //예를 들어서 앞서 mytitle은 activity_board10s에 title 위치할건데 (MyViewHolder참고)
        //MyItemArrayList에 title에 담긴 내용을 mytitle에 문자화하여 가져온것이다
        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.mytitle.setText(MyItemArrayList.get(position).title);
        myViewHolder.mydescriptioin.setText(MyItemArrayList.get(position).description);
        myViewHolder.mydate.setText(MyItemArrayList.get(position).date);
        myViewHolder.mylink.setText(MyItemArrayList.get(position).link);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return MyItemArrayList.size(); //return 10
    }

}