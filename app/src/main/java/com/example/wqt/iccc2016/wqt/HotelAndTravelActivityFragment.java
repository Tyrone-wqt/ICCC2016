package com.example.wqt.iccc2016.wqt;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.wqt.iccc2016.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class HotelAndTravelActivityFragment extends Fragment implements View.OnClickListener{

    View mRootView;
    TextView mTitle1Text;
    TextView mTitle2Text;
    TextView mTitle3Text;

    RelativeLayout mLayout1;
    RelativeLayout mLayout2;
    RelativeLayout mLayout3;

    ImageView mImage1;
    ImageView mImage2;
    ImageView mImage3;
    boolean isImage1Open = false;
    boolean isImage2Open = false;
    boolean isImage3Open = false;

    MTagHandler mMTagHandler;
    MImageGetter mMImageGetter;
    Handler mHandler;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMTagHandler = new MTagHandler();
        mMImageGetter = new MImageGetter(getActivity(), 84);
        mHandler = new Handler() {
            public void handleMessage(Message msg) {
                int what = msg.what;
                if (what == 200) {
                    MessageSpan ms = (MessageSpan) msg.obj;
                    Object[] spans = (Object[]) ms.getObj();

                    for (Object span : spans) {
                        if (span instanceof ImageSpan) {
                            Intent intent = new Intent(getActivity(), ShowPicActivity.class);
                            Bundle bundle = new Bundle();

                            bundle.putString("picUrl", ((ImageSpan) span).getSource());
                            intent.putExtras(bundle);

                            startActivity(intent);

                        }
                    }
                }
            }

            ;
        };
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_hotel_and_travel, null);

        mTitle1Text = (TextView) mRootView.findViewById(R.id.title1_textview);
        mTitle2Text = (TextView) mRootView.findViewById(R.id.title2_textview);
        mTitle3Text = (TextView) mRootView.findViewById(R.id.title3_textview);


        mLayout1 = (RelativeLayout) mRootView.findViewById(R.id.title1_layout);
        mLayout1.setOnClickListener(this);
        mLayout2 = (RelativeLayout) mRootView.findViewById(R.id.title2_layout);
        mLayout2.setOnClickListener(this);
        mLayout3 = (RelativeLayout) mRootView.findViewById(R.id.title3_layout);
        mLayout3.setOnClickListener(this);


        mImage1 = (ImageView) mRootView.findViewById(R.id.title1_image_open_close);
        //mImage1.setOnClickListener(this);
        mImage2 = (ImageView) mRootView.findViewById(R.id.title2_image_open_close);
        //mImage2.setOnClickListener(this);
        mImage3 = (ImageView) mRootView.findViewById(R.id.title3_image_open_close);
        //mImage3.setOnClickListener(this);
        return mRootView;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //***********************************
        String text1 =
                "<p style=\"text-align: justify\">The Wang-Jiang Hotel (望江宾馆) is the headquarter hotel for IEEE ICCC 2016 conference with overflow accommodation.  Wang-Jiang Hotel is a five-star hotel in Chengdu next to the second ring road of the city.</p>\n" +
                        "<p>Address：Sha-He-Pu street, No. 42, Jinjiang District, Chengdu, Sichuan, P. R. China<br />\n" +
                        "Special Hotel Rates (Include tax):</p>\n" +
                        "<ul>\n" +
                        "<li>Deluxe Twin: 600 RMB/day</li>\n" +
                        "<li>Deluxe King Room: 600 RMB/day</li>\n" +
                        "<li>Standard Room: 500 RMB/day</li>\n" +
                        "</ul>\n" +
                        "<p>TO RESERVE YOUR HOTEL ROOM Please call 028-66009945 or Send Email to: &#50;&#x37;&#52;&#x35;&#52;&#x31;&#49;&#x38;&#48;&#x40;q&#x71;.&#x63;o&#x6d;</p>";
        mTitle1Text.setText(Html.fromHtml(text1, null, mMTagHandler));
        //************************************
        String text2 = "<p><strong>Hotel Address</strong>: Wangjiang Hotel, No.42, Xiashahepu Street, Chengdu, Sichuan, China<br />\n" +
                "<strong>Tel</strong>: +86-28-84790000<br />\n" +
                "<strong>Fax</strong>: +86-28-84791688<br />\n" +
                "<strong>Website</strong>: <a href=\"http://www.wangjianghotel.com/en/reservation.html\">www.wangjianghotel.com</a></p>\n" +
                "<p>Wangjiang Hotel Chengdu is an urban forest five-star hotel in Chengdu, combining South Asian charming landscape and Western Sichuan folk culture. Located in the east part of Chengdu, close to the eastern financial center and the East Train Station and national AAAA scenic spot—Sansheng Flower Town, this hotel has a convenient position, 6 km to the Downtown Tianfu Square, 4 km to the Train Station, 9 km to the North train station 16 km to the Airport.</p>\n" +
                "<p>Covering an area of 200 mu, gathering thousands of flowers and serving as the paradise for trees and birds, and featured by pavilions, streams and villas, it is an ideal place combining natural landscape with cultural attraction. Well decorated, elegantly impressed, it is a wonderful place for travel, meetings and business activities.<br />\n" +
                "<p><img src=\"images/hotelinfob01.jpg\" alt=\"#01\" width=\"100%\" /></p>\n" +
                "<p><img src=\"images/hotelinfob03.jpg\" alt=\"#02\" width=\"100%\" /></p>";
        mTitle2Text.setText(Html.fromHtml(text2, mMImageGetter, mMTagHandler));
        mTitle2Text.setMovementMethod(LinkMovementMethodExt.getInstance(mHandler, ImageSpan.class));
        //**********************************
        String text3="<h5>Getting to the hotel from Shuangliu Airport</h5>\n" +
                "<p><em>Taxi</em>: Fares of taxi are around CNY70 (USD 11.00) each way, and rental cars can be booked online.<br />\n" +
                "<em>Public Transport</em>: Take Airport Bus Line 2 from Shuangliu International Airport stop to Tianfu Square stop. Then take Take metro line 2 to Dongda Road stop and walk around 800m to the hotel.<br />\n" +
                "<p><img src=\"images/crop_1.png\" alt=\"crop_1\" width=\"1024\" height=\"588\"  </p>\n" +
                "<h5>Getting to the hotel from Chengdu East Railway Station</h5>\n" +
                "<p><em>Taxi</em>: Fares of taxi are around CNY20 (USD 3.00) each way, and rental cars can be booked online.<br />\n" +
                "<em>Public Transport</em>: Take metro line 2 to Dongda Road stop and walk around 800m to the hotel.<br />\n" +
                "<p><img src=\"images/crop_2.png\" </p>";
        mTitle3Text.setText(Html.fromHtml(text3,mMImageGetter,mMTagHandler));
        mTitle3Text.setMovementMethod(LinkMovementMethodExt.getInstance(mHandler,ImageSpan.class));

    }

    @Override
    public void onClick(View v) {
        int itemId = v.getId();
        switch (itemId) {
            case R.id.title1_layout:
                if (!isImage1Open) {
                    mRootView.findViewById(R.id.title1_cardview).setVisibility(View.VISIBLE);
                    mImage1.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);

                } else {
                    mRootView.findViewById(R.id.title1_cardview).setVisibility(View.GONE);
                    mImage1.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
                isImage1Open = !isImage1Open;
                break;
            case R.id.title2_layout:
                if (!isImage2Open) {
                    mRootView.findViewById(R.id.title2_cardview).setVisibility(View.VISIBLE);
                    mImage2.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                } else {
                    mRootView.findViewById(R.id.title2_cardview).setVisibility(View.GONE);
                    mImage2.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
                isImage2Open = !isImage2Open;
                break;
            case R.id.title3_layout:
                if (!isImage3Open) {
                    mRootView.findViewById(R.id.title3_cardview).setVisibility(View.VISIBLE);
                    mImage3.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);

                } else {
                    mRootView.findViewById(R.id.title3_cardview).setVisibility(View.GONE);
                    mImage3.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                }
                isImage3Open = !isImage3Open;
                break;
        }
    }
}