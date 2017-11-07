package com.muzic.ramky.muzic;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by ramky on 07-11-2017.
 */

class MainAdapter extends PagerAdapter {
    public MainAdapter(FragmentManager supportFragmentManager, int tabCount) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
