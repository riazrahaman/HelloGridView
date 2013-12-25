package com.riaz.gridview;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.util.Log;

/**
 * Created by riazrahaman on 24/12/13.
 */
public class ImageAdapter extends BaseAdapter{
    private Context mContext;

    private Integer[] mThumbIds = {R.drawable.sample_7,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_2, R.drawable.sample_3,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_0, R.drawable.sample_1,
            R.drawable.sample_4, R.drawable.sample_5,
            R.drawable.sample_6, R.drawable.sample_7,
            R.drawable.sample_2, R.drawable.sample_3,
    };

    public ImageAdapter(Context C){
        mContext = C;
    }

    public int getCount(){
        return mThumbIds.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView;
        Log.e("RIAZ", "position is" + position);
        if(convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(90,90));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//            imageView.setPadding(8,8,8,8);
        }
        else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

}
