package com.example.wqt.iccc2016.wqt;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class PatronActivity extends AppCompatActivity {

    TextView mToolbarTitle;
    //TextView mPatron1;
    //TextView mPatron2;
    //TextView mPatron3;
    //TextView mPatron4;
    //TextView mPatron5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patron);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbarTitle = (TextView) findViewById(R.id.patron_toolbar_title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        //mPatron1 = (TextView) findViewById(R.id.patron_icon1);
        //mPatron2 = (TextView) findViewById(R.id.patron_icon2);
        //mPatron3 = (TextView) findViewById(R.id.patron_icon3);
        //mPatron4 = (TextView) findViewById(R.id.patron_icon4);
        //mPatron5 = (TextView) findViewById(R.id.patron_icon5);

        //Typeface mTypeface = Typeface.createFromAsset(getAssets(), "iconfont/iconfont.ttf");
        //mPatron2.setTypeface(mTypeface);
        //mPatron1.setTypeface(mTypeface);
        //mPatron3.setTypeface(mTypeface);
        //mPatron4.setTypeface(mTypeface);
        //mPatron5.setTypeface(mTypeface);

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
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if (mToolbarTitle != null) {
            mToolbarTitle.setText(title);
        }
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        //super.onPostCreate(savedInstanceState, persistentState);
        if (!isChild()) {
            onTitleChanged(getTitle(), getTitleColor());
        }
    }

}
