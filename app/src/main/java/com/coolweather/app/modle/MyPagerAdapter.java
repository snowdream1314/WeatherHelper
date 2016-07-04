package com.coolweather.app.modle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.coolweather.app.R;
import com.coolweather.app.activity.ManageCityActivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyPagerAdapter extends PagerAdapter {
	
	private Button switch_city;
	private Button refersh;
	private TextView cityNameText,tempNow;
	private ArrayList<View> views;
	private List<String> datas = new ArrayList<String>();
	private Activity activity;
	
	public MyPagerAdapter(ArrayList<View> views,List<String> datas) {
		this.views = views;
		this.datas = datas;
	}
	@Override
	public int getCount() {
		if (views != null) {
			return views.size();
		}
		return 0;
	}
	//滑动切换时销毁当前组件
	@Override
	public void destroyItem(ViewGroup arg0, int position, Object object) {
		((ViewPager) arg0).removeView(views.get(position));
	}
	//滑动时生成的组件
	@Override
	public Object instantiateItem(ViewGroup arg0, int position) {
		((ViewPager) arg0).addView(views.get(position),0);
		cityNameText = (TextView) views.get(position).findViewById(R.id.city_name);
		cityNameText.setText(datas.get(0));
		return views.get(position);
	}
	
	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}
	
	@Override
	public int getItemPosition(Object object) {
		return PagerAdapter.POSITION_NONE;
	}
	
}
