package com.example.wqt.iccc2016.qpf;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

public class MapsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] mList;
    private ListView mListView;
    private ImageView mWelcomeImage;
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        initView();
        mList=getResources().getStringArray(R.array.map_list);
        mListView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mList));
        mListView.setOnItemClickListener(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.maps_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void initView() {
        mWelcomeImage=(ImageView) findViewById(R.id.maps_head_image);
        mToolbarTitle= (TextView) findViewById(R.id.maps_toolbar_title);
        mListView=(ListView) findViewById(R.id.lv_maps);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i)
        {
            case 0:
                break;
            case 1:
                break;
            case 2:;
                break;
        }
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
