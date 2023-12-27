package com.superai.app;

import android.util.Log;
import io.flutter.app.FlutterApplication;
import com.umeng.commonsdk.UMConfigure;

public class MyApp extends FlutterApplication {
	@Override
	public void onCreate() {
		super.onCreate();
		Log.i("UMENG", "--->>> FlutterApplication: onCreate enter");
		UMConfigure.setLogEnabled(true);
		UMConfigure.preInit(this,"UmengCommonSdk","Umeng");

	}
}
