package com.example.wqt.iccc2016.qpf;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> b0004de39cbaf6c06bcfe93e9f775d7d6fdfa085
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
<<<<<<< HEAD
import android.widget.AdapterView;
=======
>>>>>>> b0004de39cbaf6c06bcfe93e9f775d7d6fdfa085
import android.widget.ListView;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

import java.util.ArrayList;
import java.util.List;

public class TechnicalProgramCommitteeActivity extends AppCompatActivity {

    private ListView mListView;
<<<<<<< HEAD
    private List<Committee> mList = new ArrayList<Committee>();
=======
    private List<Committee> mList=new ArrayList<Committee>();
>>>>>>> b0004de39cbaf6c06bcfe93e9f775d7d6fdfa085
    private TextView mToolbarTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_program_committee);
        initView();
        Toolbar toolbar = (Toolbar) findViewById(R.id.technical_program_committee_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initTPCCommittee();
        mListView.setAdapter(new CommitteeAdapter(TechnicalProgramCommitteeActivity.this, R.layout.item_committee, mList));
<<<<<<< HEAD
        mListView.setOnItemClickListener(myOnItemClickListener);
    }

    private void initTPCCommittee() {
        Committee supeng_leng = new Committee(R.drawable.supeng_leng, "Supeng Leng", "China");
        mList.add(supeng_leng);
        Committee yan_zhang = new Committee(R.drawable.yan_zhang, "Yan Zhang", "Norway");
        mList.add(yan_zhang);
        Committee nei_kato = new Committee(R.drawable.nei_kato, "Nei Kato", "Japan");
        mList.add(nei_kato);
        Committee guang_shi = new Committee(R.drawable.guang_shi, "Guang Shi", "China");
=======
    }

    private void initTPCCommittee() {
        Committee supeng_leng=new Committee(R.drawable.anonymous_icon,"Supeng Leng","China");
        mList.add(supeng_leng);
        Committee yan_zhang=new Committee(R.drawable.anonymous_icon,"Yan Zhang","Norway");
        mList.add(yan_zhang);
        Committee nei_kato=new Committee(R.drawable.anonymous_icon,"Nei Kato","Japan");
        mList.add(nei_kato);
        Committee guang_shi=new Committee(R.drawable.anonymous_icon,"Guang Shi","China");
>>>>>>> b0004de39cbaf6c06bcfe93e9f775d7d6fdfa085
        mList.add(guang_shi);
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.lv_technical_program_committee);
        mToolbarTitle = (TextView) findViewById(R.id.technical_program_committee_toolbar_title);

    }
<<<<<<< HEAD

    AdapterView.OnItemClickListener myOnItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            switch (i) {
                case 0:
                    Intent i0 = new Intent(TechnicalProgramCommitteeActivity.this, CommitteeDetailsActivity.class);
                    i0.putExtra("committee_name", "supeng_leng");
                    startActivity(i0);
                    break;
                case 1:
                    Intent i1 = new Intent(TechnicalProgramCommitteeActivity.this, CommitteeDetailsActivity.class);
                    i1.putExtra("committee_name", "yan_zhang");
                    startActivity(i1);
                    break;
                case 2:
                    Intent i2 = new Intent(TechnicalProgramCommitteeActivity.this, CommitteeDetailsActivity.class);
                    i2.putExtra("committee_name", "nei_kato");
                    startActivity(i2);
                    break;
                case 3:
                    Intent i3 = new Intent(TechnicalProgramCommitteeActivity.this, CommitteeDetailsActivity.class);
                    i3.putExtra("committee_name", "guang_shi");
                    startActivity(i3);
                    break;
            }
        }
    };

=======
>>>>>>> b0004de39cbaf6c06bcfe93e9f775d7d6fdfa085
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
