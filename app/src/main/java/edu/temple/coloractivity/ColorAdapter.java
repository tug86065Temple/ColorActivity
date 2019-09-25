package edu.temple.coloractivity;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ColorAdapter extends BaseAdapter {

    CharSequence colors[] = {"RED", "CYAN", "MAGENTA", "PINK", "GRAY"};

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        return null;
    }
}
