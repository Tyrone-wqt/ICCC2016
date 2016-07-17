package com.example.wqt.iccc2016.wqt;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class PatronActivity extends AppCompatActivity {

    TextView mToolbarTitle;
    TextView mTextHuaweiWeb;
    String mHuaweiWebLink="<strong>Website</strong>: <a href=\"http://www.huawei.com/en\">www.huawei.com</a>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patron);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbarTitle = (TextView) findViewById(R.id.patron_toolbar_title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mTextHuaweiWeb= (TextView) findViewById(R.id.huawei_web);
        mTextHuaweiWeb.setText(Html.fromHtml(mHuaweiWebLink,null,null));
        //RecyclerView view=new RecyclerView(this);

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
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
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


}
