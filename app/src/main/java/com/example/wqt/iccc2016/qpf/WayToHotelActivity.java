package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class WayToHotelActivity extends AppCompatActivity {

    private TextView mToolbarTitle;
    private TextView mAirportTitle;
    private TextView mAirportContent;
    private TextView mEastRailwayTitle;
    private TextView mEastRailwayContent;
    private TextView mRailwayTitle;
    private TextView mRailwayContent;
    private ImageView mAirportImage;
    private ImageView mEastRailwayImage;
    private ImageView mRailwayImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_way_to_hotel);
        initView();

        Toolbar toolbar = (Toolbar) findViewById(R.id.way_to_hotel_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    private void initView() {
        mToolbarTitle= (TextView) findViewById(R.id.way_to_hotel_toolbar_title);
        mAirportTitle=(TextView) findViewById(R.id.tv_way_from_airport_title);
        mAirportContent=(TextView) findViewById(R.id.tv_way_from_airport_content);
        mEastRailwayTitle=(TextView) findViewById(R.id.tv_way_from_east_railway_title);
        mEastRailwayContent=(TextView) findViewById(R.id.tv_way_from_east_railway_content);
        mRailwayTitle=(TextView) findViewById(R.id.tv_way_from_railway_title);
        mRailwayContent=(TextView) findViewById(R.id.tv_way_from_railway_content);
        mAirportImage=(ImageView) findViewById(R.id.iv_way_from_airport);
        mEastRailwayImage=(ImageView) findViewById(R.id.iv_way_from_east_railway);
        mRailwayImage=(ImageView) findViewById(R.id.iv_way_from_railway);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case android.R.id.home:
                this.finish();
                break;
            default:
                return true;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState)
    {
        //super.onPostCreate(savedInstanceState, persistentState);
        if(!isChild()){
            onTitleChanged(getTitle(),getTitleColor());
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color)
    {
        super.onTitleChanged(title, color);
        if(mToolbarTitle!=null){
            mToolbarTitle.setText(title);
        }
    }
}
