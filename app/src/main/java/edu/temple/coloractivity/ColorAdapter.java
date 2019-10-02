package edu.temple.coloractivity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] colors;

    public ColorAdapter(Context context, String[] colors) {
        this.context = context;
        this.colors = colors;
    }

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
        TextView textView;

        if (convertView != null && convertView instanceof TextView)
            textView = (TextView) convertView;
        else
            textView = new TextView(context);

        String colorValue = colors[position];

        textView.setText(colorValue);

        textView.setTextSize(20);

        textView.setPadding(5, 5, 0, 5);

        return textView;
    }
}
