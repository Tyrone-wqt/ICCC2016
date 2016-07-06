package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class WelcomeActivity extends AppCompatActivity
{

    private TextView mWelcomeTitle;
    private TextView mWelcomeContent;
    private TextView mWelcomeEnd;
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.welcome_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    private void initView()
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.program_toolbar);
        mToolbarTitle= (TextView) findViewById(R.id.welcome_toolbar_title);
        mWelcomeTitle= (TextView) findViewById(R.id.tv_welcome_title);
        mWelcomeContent= (TextView) findViewById(R.id.tv_welcome_content);
        mWelcomeEnd= (TextView) findViewById(R.id.tv_welcome_end);
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
