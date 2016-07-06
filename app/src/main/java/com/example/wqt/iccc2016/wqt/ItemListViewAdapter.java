package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.List;

/**
 * Created by 127-72 on 2016/7/6.
 */
public class ItemListViewAdapter extends BaseAdapter{
    Context mContext;
    LayoutInflater mLayoutInflater;
    List<String> mTimeLine;
    List<String> mTimeLineContent;

    public ItemListViewAdapter(Context mContext,List<String> mTimeLine,List<String> mTimeLineContent){
        this.mContext=mContext;
        mLayoutInflater= (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.mTimeLine=mTimeLine;
        this.mTimeLineContent=mTimeLineContent;
    }
    @Override
    public int getCount() {
        return mTimeLine.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        if(convertView==null){
            itemView=mLayoutInflater.inflate(R.layout.item_list_program_activity,null);
        }else{
            itemView=convertView;
        }
        ((TextView)itemView.findViewById(R.id.text_time_line)).setText(mTimeLine.get(position));
        ((TextView)itemView.findViewById(R.id.text_time_line_content)).setText(mTimeLineContent.get(position));
        return itemView;
    }
}
