package com.geniusnine.android.hindijokes.jokes;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.geniusnine.android.hindijokes.R;

/**
 * Created by Dev on 07-02-2017.
 */

public class BollywoodjokesViewPagerAdapter extends PagerAdapter {
    Context context;
    String[] rank;
    String[] list;


    LayoutInflater inflater;

    public BollywoodjokesViewPagerAdapter(Context context, String[] list) {
        this.context = context;
        this.list = list;


    }

    @Override
    public int getCount() {
        return list.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        // Declare Variables
        TextView txtrank;
        TextView listtextview;
        TextView txtpopulation;
        ImageView imgflag;

        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.boysjokestext, container, false);
        listtextview = (TextView) itemView.findViewById(R.id.view);
        listtextview.setText(list[position]);
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((RelativeLayout) object);

    }



}
