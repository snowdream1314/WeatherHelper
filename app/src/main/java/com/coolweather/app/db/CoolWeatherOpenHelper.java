package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

	//Province表建表语句
	public static final String CREATE_PROVINCE = "create table Province ("
			+ "id integer primary key autoincrement, "
			+ "province_name text, "
			+ "province_code text)";

	//City建表语句
	public static final String CREATE_CITY = "create table City ("
			+ "id integer primary key autoincrement, "
			+ "city_name text, "
			+ "city_pyname text,"
			+ "city_code text, "
			+ "city_num text, "
			+ "province_id integer)";

	//Country建表语句
	public static final String CREATE_COUNTRY = "create table Country ("
			+ "id integer primary key autoincrement, "
			+ "country_name text, "
			+ "country_pyname text,"
			+ "country_code text, "
			+ "city_id integer)";

	//ChoosedCountry建表语句
	public static final String CREATE_CHOOSEDCOUNTRY = "create table ChoosedCountry ("
			+ "id integer primary key autoincrement, "
			+ "choosedcountry_name text, "
			+ "choosedcountry_code text, "
			+ "choosedcountry_tempLow text, "
			+ "choosedcountry_tempHigh text, "
			+ "choosedcountry_weather text, "
			+ "choosedcountry_imageID integer)";

	public CoolWeatherOpenHelper(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);//创建Province表
		db.execSQL(CREATE_CITY);//创建City表
		db.execSQL(CREATE_COUNTRY);//创建Country表
		db.execSQL(CREATE_CHOOSEDCOUNTRY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

}
