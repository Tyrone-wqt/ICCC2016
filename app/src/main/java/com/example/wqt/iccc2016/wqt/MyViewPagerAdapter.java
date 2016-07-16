package com.example.wqt.iccc2016.wqt;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 127-72 on 2016\7\5.
 */
public class MyViewPagerAdapter extends PagerAdapter {


    Context mContext;
    List<View> mList;
    RecyclerView mListViewDay1;
    RecyclerView mListViewDay2;
    RecyclerView mListViewDay3;
    List<String> mTimeLine1;
    List<String> mTimeLine2;
    List<String> mTimeLine3;
    List<String> mTimeLineContent;

    Map<String, List<String>> mTimeLineContentMap1;
    Map<String, List<String>> mTimeLineContentMap2;
    Map<String, List<String>> mTimeLineContentMap3;
    LayoutInflater mLayoutInflater;

    public MyViewPagerAdapter(Context mContext) {
        this.mContext = mContext;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //day1 data
        mTimeLine1 = new ArrayList<>();
        mTimeLine1.add("08:00-09:00");
        mTimeLine1.add("09:00-10:30");
        mTimeLine1.add("10:30-11:00");
        mTimeLine1.add("11:00-12:30");
        mTimeLine1.add("12:30-14:00");
        mTimeLine1.add("14:00-15:30");
        mTimeLine1.add("15:30-16:00");
        mTimeLine1.add("16:00-17:30");
        mTimeLine1.add("18:30-21:00");

        mTimeLineContentMap1 = new HashMap<>();
        List<String> mContentAtTime0Day1 = new ArrayList<>();
        mContentAtTime0Day1.add("Conference Registration");
        mTimeLineContentMap1.put(mTimeLine1.get(0), mContentAtTime0Day1);

        List<String> mContentAtTime1Day1 = new ArrayList<>();
        mContentAtTime1Day1.add("E-MIMO Workshop-1" + "\n" + "(Boya Meeting Room)");
        mContentAtTime1Day1.add("WIN Workshop-2" + "\n" + "(Hongda Meeting Room)");
        mContentAtTime1Day1.add("SIN Workshop-3" + "\n" + "(Sentosa Meeting Room)");
        mContentAtTime1Day1.add("Tutorial#2" + "\n" + "(Maesai Reception Hall 1)");
        mContentAtTime1Day1.add("Tutorial#5" + "\n" + "(Maesai Reception Hall 2)");
        mContentAtTime1Day1.add("Tutorial#9" + "\n" + "(Brunei Meeting Room)");
        mTimeLineContentMap1.put(mTimeLine1.get(1), mContentAtTime1Day1);

        List<String> mContentAtTime2Day1 = new ArrayList<>();
        mContentAtTime2Day1.add("Coffee Break");
        mTimeLineContentMap1.put(mTimeLine1.get(2), mContentAtTime2Day1);

        List<String> mContentAtTime3Day1 = new ArrayList<>();
        mContentAtTime3Day1.add("E-MIMO Workshop-1" + "\n" + "(Boya Meeting Room)");
        mContentAtTime3Day1.add("WIN Workshop-2" + "\n" + "(Hongda Meeting Room)");
        mContentAtTime3Day1.add("SIN Workshop-3" + "\n" + "(Sentosa Meeting Room)");
        mContentAtTime3Day1.add("Tutorial#2" + "\n" + "(Maesai Reception Hall 1)");
        mContentAtTime3Day1.add("Tutorial#5" + "\n" + "(Maesai Reception Hall 2)");
        mContentAtTime3Day1.add("Tutorial#9" + "\n" + "(Brunei Meeting Room)");
        mTimeLineContentMap1.put(mTimeLine1.get(3), mContentAtTime3Day1);

        List<String> mContentAtTime4Day1 = new ArrayList<>();
        mContentAtTime4Day1.add("Lunch");
        mTimeLineContentMap1.put(mTimeLine1.get(4), mContentAtTime4Day1);

        List<String> mContentAtTime5Day1 = new ArrayList<>();
        mContentAtTime5Day1.add("Tutorial#3" + "\n" + "(Boya Meeting Room)");
        mContentAtTime5Day1.add("Tutorial#1" + "\n" + "(Hongda Meeting Room)");
        mContentAtTime5Day1.add("Tutorial#6" + "\n" + "(Sentosa Meeting Room)");
        mContentAtTime5Day1.add("Tutorial#4" + "\n" + "(Maesai Reception Hall 1)");
        mContentAtTime5Day1.add("Tutorial#7" + "\n" + "(Maesai Reception Hall 2)");
        mContentAtTime5Day1.add("Tutorial#8" + "\n" + "(Brunei Meeting Room)");
        mTimeLineContentMap1.put(mTimeLine1.get(5), mContentAtTime5Day1);

        List<String> mContentAtTime6Day1 = new ArrayList<>();
        mContentAtTime6Day1.add("Coffee Break");
        mTimeLineContentMap1.put(mTimeLine1.get(6), mContentAtTime6Day1);

        List<String> mContentAtTime7Day1 = new ArrayList<>();
        mContentAtTime7Day1.add("Tutorial#3" + "\n" + "(Boya Meeting Room)");
        mContentAtTime7Day1.add("Tutorial#1" + "\n" + "(Hongda Meeting Room)");
        mContentAtTime7Day1.add("Tutorial#6" + "\n" + "(Sentosa Meeting Room)");
        mContentAtTime7Day1.add("Tutorial#4" + "\n" + "(Maesai Reception Hall 1)");
        mContentAtTime7Day1.add("Tutorial#7" + "\n" + "(Maesai Reception Hall 2)");
        mContentAtTime7Day1.add("Tutorial#8" + "\n" + "(Brunei Meeting Room)");
        mTimeLineContentMap1.put(mTimeLine1.get(7), mContentAtTime7Day1);


        List<String> mContentAtTime8Day1 = new ArrayList<>();
        mContentAtTime8Day1.add("Reception");
        mTimeLineContentMap1.put(mTimeLine1.get(8), mContentAtTime8Day1);
        //********************************************

        //day2 data
        mTimeLine2 = new ArrayList<>();
        mTimeLine2.add("08:00-08:30");
        mTimeLine2.add("08:30-09:00");
        mTimeLine2.add("09:00-10:30");
        mTimeLine2.add("10:30-11:00");
        mTimeLine2.add("11:00-12:30");
        mTimeLine2.add("12:30-14:00");
        mTimeLine2.add("14:00-15:30");
        mTimeLine2.add("15:30-16:00");
        mTimeLine2.add("16:00-17:30");
        mTimeLine2.add("18:30-21:00");


        mTimeLineContentMap2=new HashMap<>();
        List<String> mContentAtTime0Day2 = new ArrayList<>();
        mContentAtTime0Day2.add("Conference Registration");
        mTimeLineContentMap2.put(mTimeLine2.get(0),mContentAtTime0Day2);


        List<String> mContentAtTime1Day2 = new ArrayList<>();
        mContentAtTime1Day2.add("Welcome Opening"+"\n"+"(Wufu Hall)");
        mTimeLineContentMap2.put(mTimeLine2.get(1),mContentAtTime1Day2);

        List<String> mContentAtTime2Day2 = new ArrayList<>();
        mContentAtTime2Day2.add("keynote Speech #1"+"\n"+"(Wufu Hail)");
        mContentAtTime2Day2.add("keynote Speech #2"+"\n"+"(Wufu Hail)");
        mTimeLineContentMap2.put(mTimeLine2.get(2),mContentAtTime2Day2);


        List<String> mContentAtTime3Day2 = new ArrayList<>();
        mContentAtTime3Day2.add("Coffee Break & Poster Session-1");
        mTimeLineContentMap2.put(mTimeLine2.get(3),mContentAtTime3Day2);


        List<String> mContentAtTime4Day2 = new ArrayList<>();
        mContentAtTime4Day2.add("WCS-1"+"\n"+"(Boya Meeting Room)");
        mContentAtTime4Day2.add("CCT-1"+"\n"+"(Hongda Meeting Room)");
        mContentAtTime4Day2.add("SPC-1"+"\n"+"(Maesai Reception Hall 2)");
        mContentAtTime4Day2.add("IAP"+"\n"+"(Brunei Meeting Room)");
        mContentAtTime4Day2.add("Invited-1"+"\n"+"(Sentosa Meeting Room)");
        mContentAtTime4Day2.add("Invited-2"+"\n"+"(International Conference Hall)");
        mTimeLineContentMap2.put(mTimeLine2.get(4),mContentAtTime4Day2);


        List<String> mContentAtTime5Day2 = new ArrayList<>();
        mContentAtTime5Day2.add("Lunch");
        mTimeLineContentMap2.put(mTimeLine2.get(5),mContentAtTime5Day2);


        List<String> mContentAtTime6Day2 = new ArrayList<>();
        mContentAtTime6Day2.add("WCS-2"+"\n"+"(Boya Meeting Room)");
        mContentAtTime6Day2.add("CCT-2"+"\n"+"(Hongda Meeting Room)");
        mContentAtTime6Day2.add("SPC-2"+"\n"+"(Maesai Reception Hall 2)");
        mContentAtTime6Day2.add("NGN-1"+"\n"+"(Brunei Meeting Room)");
        mContentAtTime6Day2.add("Invited-3"+"\n"+"(Sentosa Meeting Room)");
        mContentAtTime6Day2.add("Invited-4"+"\n"+"(International Conference Hall)");
        mContentAtTime6Day2.add("Steering Committee Meeting"+"\n"+"(Maesai Reception Hall 1)");
        mTimeLineContentMap2.put(mTimeLine2.get(6),mContentAtTime6Day2);


        List<String> mContentAtTime7Day2 = new ArrayList<>();
        mContentAtTime7Day2.add("Coffee Break");
        mTimeLineContentMap2.put(mTimeLine2.get(7),mContentAtTime7Day2);


        List<String> mContentAtTime8Day2 = new ArrayList<>();
        mContentAtTime8Day2.add("WCS-3"+"\n"+"(Boya Meeting Room)");
        mContentAtTime8Day2.add("WCS-4"+"\n"+"(Hongda Meeting Room)");
        mContentAtTime8Day2.add("SPC-3"+"\n"+"(Maesai Reception Hall 2)");
        mContentAtTime8Day2.add("NGN-2"+"\n"+"(Brunei Meeting Room)");
        mContentAtTime8Day2.add("NGN-3"+"\n"+"(Sentosa Meeting Room)");
        //mContentAtTime8Day2.add("Invited-4"+"\n"+"(International Conference Hall)");
        mContentAtTime8Day2.add("Steering Committee Meeting"+"\n"+"(Maesai Reception Hall 1)");
        mTimeLineContentMap2.put(mTimeLine2.get(8),mContentAtTime8Day2);


        List<String> mContentAtTime9Day2 = new ArrayList<>();
        mContentAtTime9Day2.add("Banquet");
        mTimeLineContentMap2.put(mTimeLine2.get(9),mContentAtTime9Day2);
        //***********************************8**************

        //day3 data
        mTimeLine3 = new ArrayList<>();
        mTimeLine3.add("08:00-09:00");
        mTimeLine3.add("09:00-10:30");
        mTimeLine3.add("10:30-11:00");
        mTimeLine3.add("11:00-12:30");
        mTimeLine3.add("12:30-14:00");
        mTimeLine3.add("14:00-15:30");
        mTimeLine3.add("15:30-16:00");
        mTimeLine3.add("16:00-17:30");

        mTimeLineContentMap3=new HashMap<>();

        List<String> mContentAtTime0Day3 = new ArrayList<>();
        mContentAtTime0Day3.add("Conference Registration");
        mTimeLineContentMap3.put(mTimeLine3.get(0),mContentAtTime0Day3);

        List<String> mContentAtTime1Day3 = new ArrayList<>();
        mContentAtTime1Day3.add("Keynote Speech #3"+"\n"+"(Wufu Hall)");
        mContentAtTime1Day3.add("Keynote Speech #4"+"\n"+"(Wufu Hall)");
        mTimeLineContentMap3.put(mTimeLine3.get(1),mContentAtTime1Day3);

        List<String> mContentAtTime2Day3 = new ArrayList<>();
        mContentAtTime2Day3.add("Coffee Break & Poster Session-2");
        mTimeLineContentMap3.put(mTimeLine3.get(2),mContentAtTime2Day3);

        List<String> mContentAtTime3Day3 = new ArrayList<>();
        mContentAtTime3Day3.add("WNM-1"+"\n"+"(Boya Meeting Room)");
        mContentAtTime3Day3.add("SPC-4"+"\n"+"(Brunei Meeting Room)");
        mContentAtTime3Day3.add("Invited-5"+"\n"+"(Sentosa Meeting Room)");
        mContentAtTime3Day3.add("SNBD-1"+"\n"+"(Maesai Reception Hall 1)");
        mContentAtTime3Day3.add("PSC-1"+"\n"+"(Maesai Reception Hall 2)");
        mTimeLineContentMap3.put(mTimeLine3.get(3),mContentAtTime3Day3);


        List<String> mContentAtTime4Day3 = new ArrayList<>();
        mContentAtTime4Day3.add("Lunch");
        mTimeLineContentMap3.put(mTimeLine3.get(4),mContentAtTime4Day3);

        List<String> mContentAtTime5Day3 = new ArrayList<>();
        mContentAtTime5Day3.add("WNM-5"+"\n"+"(Boya Meeting Room)");
        mContentAtTime5Day3.add("SPC-5"+"\n"+"(Brunei Meeting Room)");
        mContentAtTime5Day3.add("STC-1"+"\n"+"(Hongda Meeting Room)");
        mContentAtTime5Day3.add("OCSN-1"+"\n"+"(Maesai Reception Hall 1)");
        mContentAtTime5Day3.add("PSC-2"+"\n"+"(Maesai Reception Hall 2)");
        mTimeLineContentMap3.put(mTimeLine3.get(5),mContentAtTime5Day3);


        List<String> mContentAtTime6Day3 = new ArrayList<>();
        mContentAtTime6Day3.add("Coffee Break");
        mTimeLineContentMap3.put(mTimeLine3.get(6),mContentAtTime6Day3);

        List<String> mContentAtTime7Day3 = new ArrayList<>();
        mContentAtTime7Day3.add("WCS-6"+"\n"+"(Boya Meeting Room)");
        mContentAtTime7Day3.add("WCS-7"+"\n"+"(Brunei Meeting Room)");
        mContentAtTime7Day3.add("STC-2"+"\n"+"(Hongda Meeting Room)");
        mContentAtTime7Day3.add("OCSN-2"+"\n"+"(Maesai Reception Hall 1)");
        mTimeLineContentMap3.put(mTimeLine3.get(7),mContentAtTime7Day3);



        mList = new ArrayList<>();
        mListViewDay1 = (RecyclerView) mLayoutInflater.inflate(R.layout.child_view_in_viewpager, null);
        //mListViewDay1.setAdapter(new ItemListViewAdapter(mContext, mTimeLine1, mTimeLineContentMap1));
        mListViewDay2 = (RecyclerView) mLayoutInflater.inflate(R.layout.child_view_in_viewpager, null);
       // mListViewDay2.setAdapter(new ItemListViewAdapter(mContext, mTimeLine2, mTimeLineContentMap2));
        mListViewDay3 = (RecyclerView) mLayoutInflater.inflate(R.layout.child_view_in_viewpager, null);
        //mListViewDay3.setAdapter(new ItemListViewAdapter(mContext, mTimeLine3, mTimeLineContentMap3));

        //mList.add(mListViewDay1);
        //mList.add(mListViewDay2);
        //mList.add(mListViewDay3);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mList.get(position));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //return super.instantiateItem(container, position);

        container.addView(mList.get(position));

        return mList.get(position);
    }


}
