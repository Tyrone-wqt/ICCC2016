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
<<<<<<< HEAD
        Committee shiny_abraham = new Committee(R.drawable.anonymous_icon, "Shiny Abraham", "Seattle University");
        mList.add(shiny_abraham);
        Committee muhammad = new Committee(R.drawable.anonymous_icon, "Muhammad Alam", "Instituto de Telecomunicacões");
        mList.add(muhammad);
        Committee takuya = new Committee(R.drawable.anonymous_icon, "Takuya Asaka", "Tokyo Metropolitan University");
        mList.add(takuya);
        Committee bo_bai = new Committee(R.drawable.anonymous_icon, "Bo Bai", "Tsinghua University");
        mList.add(bo_bai);
        Committee suzhi_bi = new Committee(R.drawable.anonymous_icon, "Suzhi Bi", "Shenzhen University");
        mList.add(suzhi_bi);
        Committee yunlong_cai = new Committee(R.drawable.anonymous_icon, "Yunlong Cai", "Zhejiang University");
        mList.add(yunlong_cai);
        Committee bin_cao = new Committee(R.drawable.anonymous_icon, "Bin Cao", "University of Electronic Science and Technology of China");
        mList.add(bin_cao);
        Committee lei_cao = new Committee(R.drawable.anonymous_icon, "Lei Cao", "The University of Mississippi");
        mList.add(lei_cao);
        Committee yang_cao = new Committee(R.drawable.anonymous_icon, "Yang Cao", "Huazhong University of Science and Technology");
        mList.add(yang_cao);
        Committee rong_chai = new Committee(R.drawable.anonymous_icon, "Rong Chai", "Chongqing University of Posts and Telecommunications");
        mList.add(rong_chai);
        Committee periklis = new Committee(R.drawable.anonymous_icon, "Periklis Chatzimisios", "Alexander TEI of Thessaloniki");
        mList.add(periklis);
        Committee chen_chen = new Committee(R.drawable.anonymous_icon, "Chen Chen", "Nanyang Technological University");
        mList.add(chen_chen);
        Committee jianxin_chen = new Committee(R.drawable.anonymous_icon, "Jianxin Chen", "Nanjing University of Posts and Telecommunications");
        mList.add(jianxin_chen);
        Committee zheng_chen = new Committee(R.drawable.anonymous_icon, "Zheng Chen", "CentraleSupélec - CNRS - Université Paris Sud");
        mList.add(zheng_chen);
        Committee zhengchuan_chen = new Committee(R.drawable.anonymous_icon, "Zhengchuan Chen", "SUTD");
        mList.add(zhengchuan_chen);
        Committee wenchi_cheng = new Committee(R.drawable.anonymous_icon, "Wenchi Cheng", "Xidian University");
        mList.add(wenchi_cheng);
        Committee noel = new Committee(R.drawable.anonymous_icon, "Noel Crespi", "Institut Mines-Télécom, Télécom SudParis");
        mList.add(noel);
        Committee yidong_cui = new Committee(R.drawable.anonymous_icon, "Yidong Cui", "Beijing University of Posts and Telecommunications");
        mList.add(yidong_cui);
        Committee yan_danfeng = new Committee(R.drawable.anonymous_icon, "Yan Danfeng", "Beijing University of Posts and Telecommunications");
        mList.add(yan_danfeng);
        Committee lei_deng = new Committee(R.drawable.anonymous_icon, "Lei Deng", "Huazhong University of Science and Technology");
        mList.add(lei_deng);
        Committee guoru_ding = new Committee(R.drawable.anonymous_icon, "Guoru Ding", "Southeast University");
        mList.add(guoru_ding);
        Committee ping_dong = new Committee(R.drawable.anonymous_icon, "Ping Dong", "Beijing Jiaotong University");
        mList.add(ping_dong);
        Committee yi_dong = new Committee(R.drawable.anonymous_icon, "Yi Dong", " Shanghai Jiao Tong University");
        mList.add(yi_dong);
        Committee yunquan_dong = new Committee(R.drawable.anonymous_icon, "Yunquan Dong", "Seoul National University");
        mList.add(yunquan_dong);
        Committee qinghe_du = new Committee(R.drawable.anonymous_icon, "Qinghe Du", "Xi'an Jiaotong University");
        mList.add(qinghe_du);
        Committee qiang_duan = new Committee(R.drawable.anonymous_icon, "Qiang Duan", "The Pennsylvania State University");
        mList.add(qiang_duan);
        Committee daquan_feng = new Committee(R.drawable.anonymous_icon, "Daquan Feng", "Singapore University of Technology and Design");
        mList.add(daquan_feng);
        Committee wei_feng = new Committee(R.drawable.anonymous_icon, "Wei Feng", "Tsinghua University");
        mList.add(wei_feng);
        Committee vasilis = new Committee(R.drawable.anonymous_icon, "Vasilis Friderikos", "King's College London");
        mList.add(vasilis);
        Committee xiao_fu = new Committee(R.drawable.anonymous_icon, "Xiao Fu", "Nanjing University");
        mList.add(xiao_fu);
        Committee xiaoying_gan = new Committee(R.drawable.anonymous_icon, "Xiaoying Gan", " Shanghai Jiao Tong University");
        mList.add(xiaoying_gan);
        Committee jie_dong = new Committee(R.drawable.anonymous_icon, "Jie Gong", "Sun Yat-sen University");
        mList.add(jie_dong);
        Committee xiaowen_gong = new Committee(R.drawable.anonymous_icon, "Xiaowen Gong", "Ohio State University");
        mList.add(xiaowen_gong);
        Committee francesco = new Committee(R.drawable.anonymous_icon, "Francesco Gringoli", "University of Brescia");
        mList.add(francesco);
        Committee guan_gui = new Committee(R.drawable.anonymous_icon, "Guan Gui", "Nanjing University of Posts and Telecommunications");
        mList.add(guan_gui);
        Committee chongtao_guo = new Committee(R.drawable.anonymous_icon, "Chongtao Guo", "Shenzhen University");
        mList.add(chongtao_guo);
        Committee shengqian_han = new Committee(R.drawable.anonymous_icon, "Shengqian Han", "Beihang University");
        mList.add(shengqian_han);
        Committee weijia_han = new Committee(R.drawable.anonymous_icon, "Weijia Han", "Xidian University");
        mList.add(weijia_han);
        Committee gerhard = new Committee(R.drawable.anonymous_icon, "Gerhard Hancke", "City University of Hong Kong");
        mList.add(gerhard);
        Committee biao_he = new Committee(R.drawable.anonymous_icon, "Biao He", "Hong Kong University of Science and Technology");
        mList.add(biao_he);
        Committee yejun_he = new Committee(R.drawable.anonymous_icon, "Yejun He", "Shenzhen University");
        mList.add(yejun_he);
        Committee xiaojun_hei = new Committee(R.drawable.anonymous_icon, "Xiaojun Hei", "Huazhong University of Science and Technology");
        mList.add(xiaojun_hei);
        Committee xuemin_hong = new Committee(R.drawable.anonymous_icon, "Xuemin Hong", "Xiamen University");
        mList.add(xuemin_hong);
        Committee ronghui_hou = new Committee(R.drawable.anonymous_icon, "Ronghui Hou", " Xidian University");
        mList.add(ronghui_hou);
        Committee chuan_huang = new Committee(R.drawable.anonymous_icon, "Chuan Huang", "University of Electronic Science and Technology of China");
        mList.add(chuan_huang);
        Committee hao_huang = new Committee(R.drawable.anonymous_icon, "Hao Huang", "University of Southern California");
        mList.add(hao_huang);
        Committee shanguo_huang = new Committee(R.drawable.anonymous_icon, "Shanguo Huang", "Beijing University of Posts and Telecommunications");
        mList.add(shanguo_huang);
        Committee xiaoxia_huang = new Committee(R.drawable.anonymous_icon, "Xiaoxia Huang", "Shenzhen Institutes of Advanced Technology, Chinese Academy of Sciences");
        mList.add(xiaoxia_huang);
        Committee kenji = new Committee(R.drawable.anonymous_icon, "Kenji Ishida", " Hiroshima City University");
        mList.add(kenji);
        Committee chunxiao_jiang = new Committee(R.drawable.anonymous_icon, "Chunxiao Jiang", " Tsinghua University, Beijing");
        mList.add(chunxiao_jiang);
        Committee ning_jiang = new Committee(R.drawable.anonymous_icon, "Ning Jiang", "University of Electronic Science & Technology of China");
        mList.add(ning_jiang);
        Committee yuming_jiang = new Committee(R.drawable.anonymous_icon, "Yuming Jiang", "Norwegian University of Science and Technology (NTNU)");
        mList.add(yuming_jiang);
        Committee lei_jiao = new Committee(R.drawable.anonymous_icon, "Lei Jiao", " University of Agder");
        mList.add(lei_jiao);
        Committee wanguo_jiao = new Committee(R.drawable.anonymous_icon, "Wanguo Jiao", " Xidian University");
        mList.add(wanguo_jiao);
        Committee farah = new Committee(R.drawable.anonymous_icon, "Farah Kandah", " University of Tennessee at Chattanooga");
        mList.add(farah);
        Committee donghyun = new Committee(R.drawable.anonymous_icon, "Donghyun Kim", "Kennesaw State University");
        mList.add(donghyun);
        Committee aki = new Committee(R.drawable.anonymous_icon, "Aki Kobayashi", " Kogakuin University");
        mList.add(aki);
        Committee jong_hyouk = new Committee(R.drawable.anonymous_icon, "Jong-Hyouk Lee", "Sangmyung University");
        mList.add(jong_hyouk);
        Committee jiandong_li = new Committee(R.drawable.anonymous_icon, "Jiandong Li", " Xidian University");
        mList.add(jiandong_li);
        Committee ming_li = new Committee(R.drawable.anonymous_icon, "Ming Li", " University of Nevada, Reno");
        mList.add(ming_li);
        Committee qiang_li = new Committee(R.drawable.anonymous_icon, "Qiang Li", "University of Electronic Science and Technology of China");
        mList.add(qiang_li);
        Committee qiang_li1 = new Committee(R.drawable.anonymous_icon, "Qiang Li", " Huazhong University of Science and Technology");
        mList.add(qiang_li1);
        Committee wentai_li = new Committee(R.drawable.anonymous_icon, "Wen-Tai Li", " National Sun Yat-sen University");
        mList.add(wentai_li);
        Committee yihan_li = new Committee(R.drawable.anonymous_icon, "Yihan Li", " Auburn University");
        mList.add(yihan_li);
        Committee yong_li = new Committee(R.drawable.anonymous_icon, "Yong Li", " Tsinghua University");
        mList.add(yong_li);
        Committee youming_li = new Committee(R.drawable.anonymous_icon, "Youming Li", " Ningbo University");
        mList.add(youming_li);
        Committee yuzhou_li = new Committee(R.drawable.anonymous_icon, "Yuzhou Li", " Huazhong University of Science and Technology");
        mList.add(yuzhou_li);
        Committee shuang_liang = new Committee(R.drawable.anonymous_icon, "Shuang Liang", " Temple University");
        mList.add(shuang_liang);
        Committee kai_lin = new Committee(R.drawable.anonymous_icon, "Kai Lin", " Dalian University of Technology");
        mList.add(kai_lin);
        Committee pinhsun = new Committee(R.drawable.anonymous_icon, "Pin-Hsun Lin", " TU Dresden");
        mList.add(pinhsun);
        Committee shijun_lin = new Committee(R.drawable.anonymous_icon, "Shijun Lin", " Xiamen University");
        mList.add(shijun_lin);
        Committee chenxi_liu = new Committee(R.drawable.anonymous_icon, "Chenxi Liu", " University of New South Wales");
        mList.add(chenxi_liu);
        Committee hang_liu = new Committee(R.drawable.anonymous_icon, "Hang Liu", " The Catholic University of America");
        mList.add(hang_liu);
        Committee juan_liu = new Committee(R.drawable.anonymous_icon, "Juan Liu", " HKUST");
        mList.add(juan_liu);
        Committee lingjia_liu = new Committee(R.drawable.anonymous_icon, "Lingjia Liu", " University of Kansas");
        mList.add(lingjia_liu);
        Committee shuiyin_liu = new Committee(R.drawable.anonymous_icon, "Shuiyin Liu", "Monash University");
        mList.add(shuiyin_liu);
        Committee tingting_liu = new Committee(R.drawable.anonymous_icon, "Tingting Liu", " Beihang University");
        mList.add(tingting_liu);
        Committee beatriz = new Committee(R.drawable.anonymous_icon, "Beatriz Lorenzo", " University of Vigo");
        mList.add(beatriz);
        Committee rongxing_lu = new Committee(R.drawable.anonymous_icon, "Rongxing Lu", " Nanyang Technological University");
        mList.add(rongxing_lu);
        Committee chunbo_luo = new Committee(R.drawable.anonymous_icon, "Chunbo Luo", " University of Exeter");
        mList.add(chunbo_luo);
        Committee xiao_ma = new Committee(R.drawable.anonymous_icon, "Xiao Ma", " Shaanxi Normal University");
        mList.add(xiao_ma);
        Committee leandros = new Committee(R.drawable.anonymous_icon, "Leandros Maglaras", " De Montfort University");
        mList.add(leandros);
        Committee dapeng_man = new Committee(R.drawable.anonymous_icon, "Dapeng Man", " Harbin Engineering University");
        mList.add(dapeng_man);
        Committee yuyi_mao = new Committee(R.drawable.anonymous_icon, "Yuyi Mao", " Hong Kong University of Science and Technology");
        mList.add(yuyi_mao);
        Committee bertrand = new Committee(R.drawable.anonymous_icon, "Bertrand Mathieu", " Orange Labs");
        mList.add(bertrand);
        Committee amjad = new Committee(R.drawable.anonymous_icon, "Amjad Mehmood", " Kohat Univerisity of Science & Technology Kohat");
        mList.add(amjad);
        Committee lotfi = new Committee(R.drawable.anonymous_icon, "Lotfi Mhamdi", " University of Leeds");
        mList.add(lotfi);
        Committee mithun = new Committee(R.drawable.anonymous_icon, "Mithun Mukherjee", " Guangdong Provincial Key Lab of Petrochemical Equipment Fault Diagnosis");
        mList.add(mithun);
        Committee jianwei_niu = new Committee(R.drawable.anonymous_icon, "Jianwei Niu", " Beihang University");
        mList.add(jianwei_niu);
        Committee chenhao_qi = new Committee(R.drawable.anonymous_icon, "Chenhao Qi", " Southeast University");
        mList.add(chenhao_qi);
        Committee qiqi = new Committee(R.drawable.anonymous_icon, "Qi Qi", " Beijing University of Posts and Telecommunications");
        mList.add(qiqi);
        Committee liping_qian = new Committee(R.drawable.anonymous_icon, "Liping Qian", " Zhejiang University of Technology");
        mList.add(liping_qian);
        Committee mahshid = new Committee(R.drawable.anonymous_icon, "Mahshid Rahnamay Naeini", "Texas Tech University");
        mList.add(mahshid);
        Committee danda = new Committee(R.drawable.anonymous_icon, "Danda Rawat", " Georgia Southern University");
        mList.add(danda);
        Committee neetesh = new Committee(R.drawable.anonymous_icon, "Neetesh Saxena", " Georgia Institute of Technology");
        mList.add(neetesh);
        Committee nadir = new Committee(R.drawable.anonymous_icon, "Nadir Shah", " COMSATS Institute of Information Technology");
        mList.add(nadir);
        Committee changyang_she = new Committee(R.drawable.anonymous_icon, "Changyang She", " Beihang University");
        mList.add(changyang_she);
        Committee xiufang_shi = new Committee(R.drawable.anonymous_icon, "Xiufang Shi", "Zhejiang University");
        mList.add(xiufang_shi);
        Committee yuanming_shi = new Committee(R.drawable.anonymous_icon, "Yuanming Shi", " ShanghaiTech University");
        mList.add(yuanming_shi);
        Committee byonghyo = new Committee(R.drawable.anonymous_icon, "Byonghyo Shim", " Seoul National University");
        mList.add(byonghyo);
        Committee tao_shu = new Committee(R.drawable.anonymous_icon, "Tao Shu", " Oakland University");
        mList.add(tao_shu);
        Committee hongguang_sun = new Committee(R.drawable.anonymous_icon, "Hongguang Sun", " Xidian University");
        mList.add(hongguang_sun);
        Committee jianhua_tang = new Committee(R.drawable.anonymous_icon, "Jianhua Tang", " Singapore University of Technology and Design");
        mList.add(jianhua_tang);
        Committee ming_tang = new Committee(R.drawable.anonymous_icon, "Ming Tang", "Huahzong University of Science and Technology");
        mList.add(ming_tang);
        Committee xiaohua_tian = new Committee(R.drawable.anonymous_icon, "Xiaohua Tian", " Shanghai Jiao Tong University");
        mList.add(xiaohua_tian);
        Committee yafei_tian = new Committee(R.drawable.anonymous_icon, "Yafei Tian", " Beihang University");
        mList.add(yafei_tian);
        Committee krzysztof = new Committee(R.drawable.anonymous_icon, "Krzysztof Walkowiak", " Wroclaw University of Technology");
        mList.add(krzysztof);
        Committee bin_wang = new Committee(R.drawable.anonymous_icon, "Bin Wang", " Wright State University");
        mList.add(bin_wang);
        Committee gongpu_wang = new Committee(R.drawable.anonymous_icon, "Gongpu Wang", "Beijing Jiaotong University");
        mList.add(gongpu_wang);
        Committee jian_wang = new Committee(R.drawable.anonymous_icon, "Jian Wang", "University of Southern California");
        mList.add(jian_wang);
        Committee jingyu_wang = new Committee(R.drawable.anonymous_icon, "Jingyu Wang", " Beijing University of Posts and Telecommunications");
        mList.add(jingyu_wang);
        Committee jue_wang = new Committee(R.drawable.anonymous_icon, "Jue Wang", " SUTD");
        mList.add(jue_wang);
        Committee li_wang = new Committee(R.drawable.anonymous_icon, "Li Wang", " Beijing University of Posts and Telecommunications");
        mList.add(li_wang);
        Committee liang_wang = new Committee(R.drawable.anonymous_icon, "Liang Wang", " Shaanxi Normal University");
        mList.add(liang_wang);
        Committee lifeng_wang = new Committee(R.drawable.anonymous_icon, "Lifeng Wang", "University College London");
        mList.add(lifeng_wang);
        Committee shangguang_wang = new Committee(R.drawable.anonymous_icon, "Shangguang Wang", " Beijing University of Posts and Telecommunications");
        mList.add(shangguang_wang);
        Committee wei_wang = new Committee(R.drawable.anonymous_icon, "Wei Wang", " Zhejiang University");
        mList.add(wei_wang);
        Committee xiaojun_wang = new Committee(R.drawable.anonymous_icon, "Xiaojun Wang", "Dublin City University");
        mList.add(xiaojun_wang);
        Committee xinheng_wang = new Committee(R.drawable.anonymous_icon, "Xinheng Wang", " University of the West of Scotland");
        mList.add(xinheng_wang);
        Committee xudong_wang = new Committee(R.drawable.anonymous_icon, "Xudong Wang", " Shanghai Jiao Tong University");
        mList.add(xudong_wang);
        Committee yu_wang = new Committee(R.drawable.anonymous_icon, "Yu Wang", " Nanjing University of Aeronautics and Astronautics");
        mList.add(yu_wang);
        Committee zhiliang_wang = new Committee(R.drawable.anonymous_icon, "Zhiliang Wang", "Tsinghua University");
        mList.add(zhiliang_wang);
        Committee feng_wen = new Committee(R.drawable.anonymous_icon, "Feng Wen", " University of Electronic Science and Technology of China");
        mList.add(feng_wen);
        Committee di_wu = new Committee(R.drawable.anonymous_icon, "Di Wu", " Sun Yat-Sen University");
        mList.add(di_wu);
        Committee jiyan_wu = new Committee(R.drawable.anonymous_icon, "Jiyan Wu", " Singapore University of Technology and Design");
        mList.add(jiyan_wu);
        Committee longfei_wu = new Committee(R.drawable.anonymous_icon, "Longfei Wu", "Temple University");
        mList.add(longfei_wu);
        Committee nan_wu = new Committee(R.drawable.anonymous_icon, "Nan Wu", " Beijing Institute of Technology");
        mList.add(nan_wu);
        Committee qiang_wu = new Committee(R.drawable.anonymous_icon, "Qiang Wu", " Juniper Networks");
        mList.add(qiang_wu);
        Committee qingqing_wu = new Committee(R.drawable.anonymous_icon, "Qingqing Wu", " Shanghai Jiao Tong University");
        mList.add(qingqing_wu);
        Committee shaoen_wu = new Committee(R.drawable.anonymous_icon, "Shaoen Wu", " Ball State University");
        mList.add(shaoen_wu);
        Committee yik_chung = new Committee(R.drawable.anonymous_icon, "Yik-Chung Wu", " The University of Hong Kong");
        mList.add(yik_chung);
        Committee yuan_wu = new Committee(R.drawable.anonymous_icon, "Yuan Wu", " Zhejiang University of Technology");
        mList.add(yuan_wu);
        Committee yulei_wu = new Committee(R.drawable.anonymous_icon, "Yulei Wu", " University of Exeter");
        mList.add(yulei_wu);
        Committee zhiqiang_wu = new Committee(R.drawable.anonymous_icon, "Zhiqiang Wu", " Wright State University");
        mList.add(zhiqiang_wu);
        Committee yue_xiao = new Committee(R.drawable.anonymous_icon, "Yue Xiao", " University of Electronic Science and Technology of China");
        mList.add(yue_xiao);
        Committee zhenyu_xiao = new Committee(R.drawable.anonymous_icon, "Zhenyu Xiao", " Beihang University");
        mList.add(zhenyu_xiao);
        //********************************
        Committee ge_xiaohu = new Committee(R.drawable.anonymous_icon, "Ge Xiaohu", "Huazhong University of Science & Technology");
        mList.add(ge_xiaohu);
        Committee xiangjun_xin = new Committee(R.drawable.anonymous_icon, "Xiangjun Xin", "Beijing University of Posts and Telecommunications");
        mList.add(xiangjun_xin);
        Committee dongliang_xie = new Committee(R.drawable.anonymous_icon, "Dongliang Xie", "State University of New York at Stony Brook");
        mList.add(dongliang_xie);
        Committee chengwen_xing = new Committee(R.drawable.anonymous_icon, "Chengwen Xing", "Beijing Institute of Technology Chao Xu, Xidian University");
        mList.add(chengwen_xing);
        Committee jie_xu = new Committee(R.drawable.anonymous_icon, "Jie Xu", "Singapore University of Technology and Design");
        mList.add(jie_xu);
        Committee chao_xu = new Committee(R.drawable.anonymous_icon, "Chao Xu", "Xidian University");
        mList.add(chao_xu);
        Committee kun_xu = new Committee(R.drawable.anonymous_icon, "Kun Xu", "Beijing University of Posts and Telecommunications");
        mList.add(kun_xu);
        Committee wei_xu = new Committee(R.drawable.anonymous_icon, "Wei Xu", "Southeast University");
        mList.add(wei_xu);
        Committee xiaodong_xu = new Committee(R.drawable.anonymous_icon, "Xiaodong Xu", "Beijing University of Posts and Telecommunications");
        mList.add(xiaodong_xu);
        Committee zhikai_xu = new Committee(R.drawable.anonymous_icon, "Zhikai Xu", "Harbin Institute of Technology");
        mList.add(zhikai_xu);
        Committee lianshen_yan = new Committee(R.drawable.anonymous_icon, "Lianshan Yan,", "Southwest Jiaotong University");
        mList.add(lianshen_yan);
        Committee shi_yan = new Committee(R.drawable.anonymous_icon, "Shi Yan", "Beijing University of Posts and Telecommunications");
        mList.add(shi_yan);
        Committee shihao_yan = new Committee(R.drawable.anonymous_icon, "Shihao Yan", "The Australian National University");
        mList.add(shihao_yan);
        Committee howard_yang = new Committee(R.drawable.anonymous_icon, "Howard Yang", "Singapore University of Technology and Design");
        mList.add(howard_yang);
        Committee qi_yang = new Committee(R.drawable.anonymous_icon, "Qi Yang", "FiberHome");
        mList.add(qi_yang);
        Committee weiwei_yang = new Committee(R.drawable.anonymous_icon, "Weiwei Yang", "Institute of Communications Engineering, PLAUST");
        mList.add(weiwei_yang);
        Committee qizhong_yao = new Committee(R.drawable.anonymous_icon, "Qizhong Yao", "Zhejiang University");
        mList.add(qizhong_yao);
        Committee lin_ye = new Committee(R.drawable.anonymous_icon, "Lin Ye", "Harbin Institute of Technology");
        mList.add(lin_ye);
        Committee tong_ye = new Committee(R.drawable.anonymous_icon, "Tong Ye", "Shanghai JiaoTong University");
        mList.add(tong_ye);
        Committee tomoki_yoshihisa = new Committee(R.drawable.anonymous_icon, "Tomoki Yoshihisa", "Osaka University");
        mList.add(tomoki_yoshihisa);
        Committee guanding_yu = new Committee(R.drawable.anonymous_icon, "Guanding Yu", "Zhejiang University");
        mList.add(guanding_yu);
        Committee ke_yu = new Committee(R.drawable.anonymous_icon, "Ke Yu", "Beijing University of Posts and Telecommunications, Beijing");
        mList.add(ke_yu);
        Committee zhenming_yu = new Committee(R.drawable.anonymous_icon, "Zhenming Yu", "Tsinghua University ");
        mList.add(zhenming_yu);
        Committee xiaojun_yuan = new Committee(R.drawable.anonymous_icon, "Xiaojun Yuan", "ShanghaiTech University");
        mList.add(xiaojun_yuan);
        Committee chau_yuen = new Committee(R.drawable.anonymous_icon, "Chau Yuen", "Singapore University of Technology and Design");
        mList.add(chau_yuen);
        Committee yong_zeng = new Committee(R.drawable.anonymous_icon, "Yong Zeng", "National University of Singapore");
        mList.add(yong_zeng);
        Committee jing_zhang = new Committee(R.drawable.anonymous_icon, "Jing Zhang", "University of Electronic Science and Technology of China");
        mList.add(jing_zhang);
        Committee lijia_zhang = new Committee(R.drawable.anonymous_icon, "Lijia Zhang", "Beijing University of Posts and Telecommunications");
        mList.add(lijia_zhang);
        Committee minming_zhang = new Committee(R.drawable.anonymous_icon, "Minming Zhang", "Huazhong University of Science and Technology");
        mList.add(minming_zhang);
        Committee qi_zhang = new Committee(R.drawable.anonymous_icon, "Qi Zhang", "SUTD");
        mList.add(qi_zhang);
        Committee ruonan_zhang = new Committee(R.drawable.anonymous_icon, "Ruonan Zhang", "Northwestern Polytechnical University");
        mList.add(ruonan_zhang);
        Committee shangjian_zhang = new Committee(R.drawable.anonymous_icon, "ShangJian Zhang", "University of Electronic Science and Technology of China");
        mList.add(shangjian_zhang);
        Committee shun_zhang = new Committee(R.drawable.anonymous_icon, "Shun Zhang", "Xidian University");
        mList.add(shun_zhang);
        Committee wei_zhang = new Committee(R.drawable.anonymous_icon, "Wei Zhang", "The University of New South Wales");
        mList.add(wei_zhang);
        Committee wei_zhang1 = new Committee(R.drawable.anonymous_icon, "Wei Zhang", "University of Electronic Science and Technology of China");
        mList.add(wei_zhang1);
        Committee wuxiong_zhang = new Committee(R.drawable.anonymous_icon, "Wuxiong Zhang", "Shanghai Research Center for Wireless Communications");
        mList.add(wuxiong_zhang);
        Committee junhui_zhao = new Committee(R.drawable.anonymous_icon, "Junhui Zhao", "Beijing Jiaotong University");
        mList.add(junhui_zhao);
        Committee mingxiong_zhao = new Committee(R.drawable.anonymous_icon, "Mingxiong Zhao", "South China University of Technology");
        mList.add(mingxiong_zhao);
        Committee caijun_zhong = new Committee(R.drawable.anonymous_icon, "Caijun Zhong", "Zhejiang University");
        mList.add(caijun_zhong);
        Committee yi_zhong = new Committee(R.drawable.anonymous_icon, "Yi Zhong", "University of Science and Technology of China");
        mList.add(yi_zhong);
        Committee heng_zhou = new Committee(R.drawable.anonymous_icon, "Heng Zhou", "University of Electronic Science and Technology of China");
        mList.add(heng_zhou);
        Committee liang_zhou = new Committee(R.drawable.anonymous_icon, "Liang Zhou", " Nanjing University of Posts and Telecommunications");
        mList.add(liang_zhou);
        Committee xiaotian_zhou = new Committee(R.drawable.anonymous_icon, "Xiaotian Zhou", "Shandong University Lina Zhu, Xidian University");
        mList.add(xiaotian_zhou);
        Committee xiaoyan_zhu = new Committee(R.drawable.anonymous_icon, "Xiaoyan Zhu", "Xidian University");
        mList.add(xiaoyan_zhu);
        Committee lina_zhu = new Committee(R.drawable.anonymous_icon, "Lina Zhu", "Xidian University");
        mList.add(lina_zhu);
        Committee xihua_zou = new Committee(R.drawable.anonymous_icon, "Xihua Zou", "Southwest Jiaotong University");
        mList.add(xihua_zou);
=======
        Committee shiny_abraham=new Committee(R.drawable.anonymous_icon,"Shiny Abraham","Seattle University");
        mList.add(shiny_abraham);
>>>>>>> b0004de39cbaf6c06bcfe93e9f775d7d6fdfa085
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
