package com.zb.app.pandatv.acts;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.zb.app.pandatv.R;
import com.zb.app.pandatv.acts.fragment.home.HomeFra;
import com.zb.app.pandatv.utils.L;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.main_frame) FrameLayout frameLayout;
    @BindView(R.id.main_bottom_navigation_bar) BottomNavigationBar naviBar;

    private Fragment[] fragments = new Fragment[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupNavigationBar();
        setNaviBarListener();

    }


    private void setupNavigationBar() {
        naviBar.setMode(BottomNavigationBar.MODE_FIXED);
        naviBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        naviBar.addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "Books"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "Books"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "Books"))
                .addItem(new BottomNavigationItem(R.mipmap.ic_launcher, "Books"))
                .setFirstSelectedPosition(0)
                .initialise();

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if(null == fragments[0]) {
            fragments[0] = HomeFra.newInstance(0);
        }
        if(!fragments[0].isAdded()) {
            ft.add(R.id.main_frame, fragments[0]);
        }
        ft.show(fragments[0]);
        ft.commitAllowingStateLoss();
    }


    private void setNaviBarListener() {
        BottomNavigationBar.OnTabSelectedListener tabListener = new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                if(fragments[position] == null) {
                    switch (position) {
                        case 0:
                            fragments[position] = HomeFra.newInstance(position);
                            break;
                        case 1:
                            fragments[position] = HomeFra.newInstance(position);
                            break;
                        case 2:
                            fragments[position] = HomeFra.newInstance(position);
                            break;
                        case 3:
                            fragments[position] = HomeFra.newInstance(position);
                            break;
                    }
                }
                if(!fragments[position].isAdded()) {
                    ft.add(R.id.main_frame, fragments[position]);
                }
                ft.show(fragments[position]);
                ft.commitAllowingStateLoss();
                L.e("show-" + position);
            }

            @Override
            public void onTabUnselected(int position) {
                if(position < 4 && fragments[position] != null) {
                    FragmentTransaction ft =  getSupportFragmentManager().beginTransaction();
                    ft.hide(fragments[position]);
                    ft.commitAllowingStateLoss();
                    L.e("hide-" + position);
                }
            }
            @Override
            public void onTabReselected(int position) {
            }
        };
        naviBar.setTabSelectedListener(tabListener);
    }
}
