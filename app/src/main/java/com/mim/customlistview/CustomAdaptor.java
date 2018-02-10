package com.mim.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by mim on 2/10/2018.
 */

public class CustomAdaptor extends BaseAdapter {

    String countrylist[];
    int flag[];
    LayoutInflater inflater;

    public CustomAdaptor(Context context,String[]countrylist,int[]flag)
    {

    this.countrylist=countrylist;
    this.flag=flag;
    inflater=(LayoutInflater.from(context));



    }

    @Override
    public int getCount() {
        return countrylist.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.list_item,viewGroup,false);

        ImageView imageView=(ImageView)view.findViewById(R.id.img_flag);
        TextView name=(TextView)view.findViewById(R.id.txt_name);

        imageView.setImageResource(flag[position]);
        name.setText(countrylist[position]);


        return view;
    }
}
