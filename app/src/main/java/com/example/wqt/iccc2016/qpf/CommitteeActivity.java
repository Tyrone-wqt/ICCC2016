package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.List;

public class CommitteeActivity extends AppCompatActivity
{

    private ListView mListView;
    private List<Committee> mList=new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_committee);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.committee_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initCommittee();
        mListView.setAdapter(new CommitteeAdapter(CommitteeActivity.this,R.layout.item_committee,mList));
    }

    private void initCommittee() {
        Committee shaoqian_li=new Committee(R.drawable.anonymous_icon,"Shaoqian Li","UESTC");
        mList.add(shaoqian_li);
        Committee xingsheng_zhang=new Committee(R.drawable.anonymous_icon,"Xingsheng Zhang","CIC");
        mList.add(xingsheng_zhang);
        Committee wei_zhang=new Committee(R.drawable.anonymous_icon,"Wei Zhang","Australia");
        mList.add(wei_zhang);
        Committee meixia_tao=new Committee(R.drawable.anonymous_icon,"Meixia Tao","China");
        mList.add(meixia_tao);
        Committee hongfang_yu=new Committee(R.drawable.anonymous_icon,"Hongfang Yu","China");
        mList.add(hongfang_yu);
        Committee kun_yang=new Committee(R.drawable.anonymous_icon,"Kun Yang","UK");
        mList.add(kun_yang);
        Committee shui_yu=new Committee(R.drawable.anonymous_icon,"Shui Yu","Australia");
        mList.add(shui_yu);
        Committee kun_wang=new Committee(R.drawable.anonymous_icon,"Kun Wang","China");
        mList.add(kun_wang);

        //待完善

    }


    private void initView()
    {
        mListView= (ListView) findViewById(R.id.lv_committee);
        mToolbarTitle= (TextView) findViewById(R.id.committee_toolbar_title);
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
