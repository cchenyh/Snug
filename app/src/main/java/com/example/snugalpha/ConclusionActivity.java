package com.example.snugalpha;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.snugalpha.Adapter.FragmentAdapter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.List;

public class ConclusionActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclusion);

        initWidgets();
        initViewPager();

//        GraphView graph = (GraphView) findViewById(R.id.graph);
//        DataPoint[] points = new DataPoint[50];
//        for (int i = 0; i < 50; i++) {
//            points[i] = new DataPoint(i,  20*(Math.random()*10+1));
//        }
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(points);
//
//        // set manual X bounds
//        graph.getViewport().setXAxisBoundsManual(true);
//        graph.getViewport().setMinX(0);
//        graph.getViewport().setMaxX(10);
//
//        // enable scrolling
//        graph.getViewport().setScrollable(true);
//
//        series.setTitle("Random Curve");
//
//        graph.addSeries(series);
//
//        graph.getLegendRenderer().setVisible(true);
//        graph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);


    }

    private void initWidgets(){
        mTabLayout = findViewById(R.id.conclusion_tab_layout);
        mViewPager = findViewById(R.id.conclusion_view_pager);
    }

    private void initViewPager(){
        List<String> titles = new ArrayList<>();
        titles.add("登录");
        titles.add("注册");
        for (int i = 0;i<titles.size();i++){
            mTabLayout.addTab(mTabLayout.newTab().setText(titles.get(i)));
        }

        List<Fragment> fragments = new ArrayList<>();

//        fragments.add(new Login());
//        fragments.add(new SignUp());

        FragmentAdapter mFragmentAdapter = new FragmentAdapter(getSupportFragmentManager(),fragments,titles);
        //给ViewPager设置适配器
        mViewPager.setAdapter(mFragmentAdapter);
        //将TabLayout和ViewPager关联
        mTabLayout.setupWithViewPager(mViewPager);
        //给TabLayout设置适配器
        mTabLayout.setTabsFromPagerAdapter(mFragmentAdapter);
    }


}
