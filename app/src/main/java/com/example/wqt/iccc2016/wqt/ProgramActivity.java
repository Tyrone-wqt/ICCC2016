package com.example.wqt.iccc2016.wqt;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;
import com.example.wqt.iccc2016.wqt.Radio.SegmentedRadioGroup;

public class ProgramActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    SegmentedRadioGroup mRadioGroup;
    RadioButton mRadioButtonLeft;
    RadioButton mRadioButtonMiddle;
    RadioButton mRadioButtonRight;
    ViewPager mViewPager;
    TextView mToolbarTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbarTitle= (TextView) findViewById(R.id.program_toolbar_title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mRadioGroup= (SegmentedRadioGroup) findViewById(R.id.segment_text);
        mRadioGroup.setOnCheckedChangeListener(this);
        mRadioButtonLeft= (RadioButton) findViewById(R.id.radio_button_left);
        //mRadioButtonLeft.setOnClickListener(this);
        mRadioButtonMiddle= (RadioButton) findViewById(R.id.radio_button_middle);
        mRadioButtonRight= (RadioButton) findViewById(R.id.radio_button_right);

        //mRadioButtonLeft.isChecked();
        mViewPager= (ViewPager) findViewById(R.id.program_view_pager);
        mViewPager.setCurrentItem(0);
        mViewPager.setOnPageChangeListener(this);
        MyViewPagerAdapter myViewPagerAdapter=new MyViewPagerAdapter(this);
        mViewPager.setAdapter(myViewPagerAdapter);

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        //super.onPostCreate(savedInstanceState, persistentState);
        if(!isChild()){
            onTitleChanged(getTitle(),getTitleColor());
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if(mToolbarTitle!=null){
            mToolbarTitle.setText(title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.show_pic, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
            default:
                return true;
            
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position){
            case 0:

                //mRadioGroup.check(R.id.radio_button_left);
                mRadioButtonLeft.setChecked(true);
                break;
            case 1:

                //mRadioGroup.check(R.id.radio_button_middle);
                mRadioButtonMiddle.setChecked(true);
                break;
            case 2:

                //mRadioGroup.check(R.id.radio_button_right);
                mRadioButtonRight.setChecked(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onClick(View v) {
//        int viewId=v.getId();
//        switch (viewId){
//            case R.id.radio_button_left:
//                mViewPager.setCurrentItem(0,true);
//                break;
//            case R.id.radio_button_middle:
//                mViewPager.setCurrentItem(1,true);
//                break;
//            case R.id.radio_button_right:
//                mViewPager.setCurrentItem(2,true);
//                break;
//        }
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.radio_button_left:
                mViewPager.setCurrentItem(0,true);
                //group.check(R.id.radio_button_left);
                break;
            case R.id.radio_button_middle:
                mViewPager.setCurrentItem(1,true);
                //group.check(R.id.radio_button_middle);
                break;
            case R.id.radio_button_right:
                mViewPager.setCurrentItem(2,true);
                //group.check(R.id.radio_button_right);
                break;
        }
    }
}
