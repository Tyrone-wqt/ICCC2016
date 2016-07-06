package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 127-72 on 2016/7/5.
 */
public class MyViewPagerAdapter extends PagerAdapter{


    Context mContext;
    List<View> mList;
    ListView mListViewDay1;
    ListView mListViewDay2;
    ListView mListViewDay3;
    List<String> mTimeLine;
    List<String> mTimeLineContent;
    LayoutInflater mLayoutInflater;
    public MyViewPagerAdapter(Context mContext){
        this.mContext=mContext;
        mLayoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mTimeLine=new ArrayList<>();
        mTimeLine.add("00:00-06:00");
        mTimeLine.add("06:00-08:00");
        mTimeLine.add("08:00-10:00");
        mTimeLine.add("10:00-12:00");
        mTimeLine.add("12:00-14:00");
        mTimeLine.add("14:00-18:00");
        mTimeLine.add("18:00-20:00");
        mTimeLine.add("20:00-24:00");

        mTimeLineContent=new ArrayList<>();
        mTimeLineContent.add("test");
        mTimeLineContent.add("test");
        mTimeLineContent.add("test");
        mTimeLineContent.add("test");
        mTimeLineContent.add("test");
        mTimeLineContent.add("test");
        mTimeLineContent.add("test");
        mTimeLineContent.add("test");


        mList=new ArrayList<>();
        mListViewDay1= (ListView) mLayoutInflater.inflate(R.layout.child_view_in_viewpager,null);
        mListViewDay1.setAdapter(new ItemListViewAdapter(mContext,mTimeLine,mTimeLineContent));
        mListViewDay2= (ListView) mLayoutInflater.inflate(R.layout.child_view_in_viewpager,null);
        mListViewDay2.setAdapter(new ItemListViewAdapter(mContext,mTimeLine,mTimeLineContent));
        mListViewDay3= (ListView) mLayoutInflater.inflate(R.layout.child_view_in_viewpager,null);
        mListViewDay3.setAdapter(new ItemListViewAdapter(mContext,mTimeLine,mTimeLineContent));

        mList.add(mListViewDay1);
        mList.add(mListViewDay2);
        mList.add(mListViewDay3);
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mList.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //return super.instantiateItem(container, position);

            container.addView(mList.get(position));

        return  mList.get(position);
    }


}
