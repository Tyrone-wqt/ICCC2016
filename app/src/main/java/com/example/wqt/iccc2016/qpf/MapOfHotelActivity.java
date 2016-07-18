package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class MapOfHotelActivity extends AppCompatActivity {

    private TextView mToolbarTitle;
    private TextView mTitle;
    private ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_of_hotel);
        initView();
<<<<<<< HEAD
<<<<<<< HEAD
        mImage.setImageResource(R.drawable.hotel_map);
=======
>>>>>>> b0004de39cbaf6c06bcfe93e9f775d7d6fdfa085
=======
>>>>>>> b0004de39cbaf6c06bcfe93e9f775d7d6fdfa085
        Toolbar toolbar = (Toolbar) findViewById(R.id.map_of_hotel_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    private void initView() {
        mToolbarTitle= (TextView) findViewById(R.id.map_of_hotel_toolbar_title);
        mTitle=(TextView) findViewById(R.id.tv_map_of_hotel_title);
        mImage=(ImageView) findViewById(R.id.iv_map_of_hotel);
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
