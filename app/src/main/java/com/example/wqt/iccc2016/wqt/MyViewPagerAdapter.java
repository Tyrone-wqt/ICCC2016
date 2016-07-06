package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 127-72 on 2016/7/5.
 */
public class MyViewPagerAdapter extends PagerAdapter{


    Context mContext;
    List<View> mList;

    LayoutInflater mLayoutInflater;
    public MyViewPagerAdapter(Context mContext){
        this.mContext=mContext;
        mLayoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mList=new ArrayList<>();
        mList.add(mLayoutInflater.inflate(R.layout.item__layout_view_pager,null));
        mList.add(mLayoutInflater.inflate(R.layout.item__layout_view_pager,null));
        mList.add(mLayoutInflater.inflate(R.layout.item__layout_view_pager,null));

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
