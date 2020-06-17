package com.example.android.eatsydney;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class SliderAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link SliderAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public SliderAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new BreakfastFragment();
        } else if (position == 1) {
            return new LunchFragment();
        } else if (position == 2) {
            return new DinnerFragment();
        } else {
            return new SnacksFragment();

        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.breakfast_category);
        } else if (position == 1) {
            return mContext.getString(R.string.lunch_category);
        } else if (position == 2) {
            return mContext.getString(R.string.dinner_category);
        } else {
            return mContext.getString(R.string.snacks_category);
        }
    }

}
