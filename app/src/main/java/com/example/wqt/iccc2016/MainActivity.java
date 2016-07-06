package com.example.wqt.iccc2016;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.wqt.iccc2016.wqt.HotelAndTravelActivity;
import com.example.wqt.iccc2016.wqt.MyGridViewAdapter;
import com.example.wqt.iccc2016.wqt.PatronActivity;
import com.example.wqt.iccc2016.wqt.ProgramActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GridView mGridView;

    int[] mGridViewImageIds = new int[]{R.string.icon_font_welcome, R.string.icon_font_program, R.string.icon_font_map, R.string.icon_font_patrons, R.string.icon_font_commitee, R.string.icon_font_hotel_and_travel, R.string.icon_font_message, R.string.icon_font_version_update};

    String[] mGridViewTextStrings = new String[]{"Welcome", "Program", "Map", "Patrons", "Commitee", "Hotel/Travel", "Messages", "Version Update"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGridView = (GridView) findViewById(R.id.main_gridView);
        MyGridViewAdapter mAdapter = new MyGridViewAdapter(this, mGridViewImageIds, mGridViewTextStrings);
        mGridView.setAdapter(mAdapter);
        mGridView.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i) {
            //设置点击事件 intent跳转
            case 0:
                break;
            case 1:
                Intent intentForProgram = new Intent(this, ProgramActivity.class);
                startActivity(intentForProgram);
                break;
            case 2:
                break;
            case 3:
                Intent intentForPatron =new Intent(this, PatronActivity.class);
                startActivity(intentForPatron);
                break;
            case 4:
                break;
            case 5:
                Intent intentForHotelAndTravel = new Intent(this, HotelAndTravelActivity.class);
                startActivity(intentForHotelAndTravel);
                break;
            case 6:
                break;
            case 7:
                break;
        }
    }
}
