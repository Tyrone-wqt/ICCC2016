package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.List;

public class MemberActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Committee> mList = new ArrayList<Committee>();
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.member_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initMember();
        mListView.setAdapter(new CommitteeAdapter(MemberActivity.this, R.layout.item_committee, mList));
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.lv_member);
        mToolbarTitle = (TextView) findViewById(R.id.member_toolbar_title);
    }

    private void initMember() {
        Committee shiny_abraham=new Committee(R.drawable.anonymous_icon,"Shiny Abraham","Seattle University");
        mList.add(shiny_abraham);
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
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        //super.onPostCreate(savedInstanceState, persistentState);
        if (!isChild()) {
            onTitleChanged(getTitle(), getTitleColor());
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if (mToolbarTitle != null) {
            mToolbarTitle.setText(title);
        }
    }
}
