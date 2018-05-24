package com.example.jikur.samplegridview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by jikur on 2017-05-21.
 */

public class SingerItemView extends LinearLayout {
    TextView textView;
    TextView textView2;
    TextView textView3;
    ImageView imageView;

    public SingerItemView(Context context) //생성자
    {
        super(context); //부모클래스
        init(context); //내 클래스
    }

    public SingerItemView(Context context, AttributeSet attrs) //생성자
    {
        super(context, attrs);
        init(context);
    }

    public void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.singer_item, this, true); //inflate를 통해 singer.xml이 this로

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void setName(String name) {
        textView.setText(name);
    }

    public void setMobile(String mobile) {
        textView2.setText(mobile);
    }

    public void setAge(int age) {
        textView3.setText(String.valueOf(age));} //int형 age를 string형으로 변환

    public void setImage(int resId) {
        imageView.setImageResource(resId);
    }


}