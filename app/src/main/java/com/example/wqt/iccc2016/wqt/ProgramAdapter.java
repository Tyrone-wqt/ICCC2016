package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 127-72 on 2016/7/16.
 */
public class ProgramAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static int viewTypeTimeLine = 1;
    public static int viewTypeSession = 2;

    Context mContext;
    List<String> mTimeLineList;
    Map<String, List<String>> mProgramSessionMap;
    Map<Integer, Integer> mPositionMap;
    List<Integer> mTimeLineIndexList;
    //List<Integer> mTimeLineIndexReverseList;
    LayoutInflater mLayoutInflater;
    int mSessionNum ;
    public ProgramAdapter(Context mContext, List<String> mTimeLineList, Map<String, List<String>> mProgramSessionMap) {
        this.mContext = mContext;
        mLayoutInflater = LayoutInflater.from(this.mContext);
        this.mProgramSessionMap = mProgramSessionMap;
        this.mTimeLineList = mTimeLineList;
        List<String> mSessionList;
        String mTimeListText;
        mPositionMap = new HashMap<>();
        mTimeLineIndexList = new ArrayList<>();
        //mTimeLineIndexReverseList=new ArrayList<>();
        mSessionNum = 0;
        for (int i = 0; i < mTimeLineList.size(); i++) {
            mTimeLineIndexList.add(mSessionNum);
            mPositionMap.put(mSessionNum, i);
            mTimeListText = mTimeLineList.get(i);
            mSessionList = mProgramSessionMap.get(mTimeListText);
            mSessionNum = mSessionNum + mSessionList.size() + 1;
        }
        mSessionNum--;
    }

    @Override
    public int getItemViewType(int position) {
        //return super.getItemViewType(position);
        //return mPositionMap.get(position);
        if (mTimeLineIndexList.contains(position))
            return viewTypeTimeLine;
        else return viewTypeSession;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder=null;
        if (viewType == viewTypeTimeLine) {
            viewHolder = new ProgramTimeLineHolder(mLayoutInflater.inflate(R.layout.item_program_recycler_timeline, null));
        } else if (viewType == viewTypeSession) {
           viewHolder = new ProgramSessionItemHolder(mLayoutInflater.inflate(R.layout.item_program_recycler_session, null));
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof ProgramTimeLineHolder){
            int mTimeLineIndex=mTimeLineIndexList.get(position);
            ((ProgramTimeLineHolder) holder).mTextTimeLine.setText(mTimeLineList.get(mTimeLineIndex));
        }else if(holder instanceof ProgramSessionItemHolder){
            //Set<Integer> mKeySet =mPositionMap.keySet();
            int index=1;
            int rest=1;
            for(int i=0;i<mTimeLineIndexList.size();i++){
                if(mTimeLineIndexList.get(i)>position){
                    index=i-1;
                    rest=position-mTimeLineIndexList.get(i-1);
                    break;
                }
            }
            ((ProgramSessionItemHolder) holder).mTextSessionItem.setText(mProgramSessionMap.get(mTimeLineList.get(index)).get(rest-1));
            //mProgramSessionMap.get(index);
        }
    }

    @Override
    public int getItemCount() {
        return mSessionNum;
    }

    public class ProgramTimeLineHolder extends RecyclerView.ViewHolder {
        public TextView mTextTimeLine;

        public ProgramTimeLineHolder(View itemView) {
            super(itemView);
            mTextTimeLine= (TextView) itemView.findViewById(R.id.program_text_timeline);
        }
    }

    public class ProgramSessionItemHolder extends RecyclerView.ViewHolder {
        public TextView mTextSessionItem;

        public ProgramSessionItemHolder(View itemView) {
            super(itemView);
            mTextSessionItem= (TextView) itemView.findViewById(R.id.program_text_session);
        }
    }


}
