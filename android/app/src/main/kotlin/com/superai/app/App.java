package com.superai.app;
import io.flutter.app.FlutterApplication;
import android.util.Log;
import com.umeng.commonsdk.UMConfigure;

public class App extends FlutterApplication{
  @Override
  public void onCreate() {
    Log.i("UMENG", "--->>> FlutterApp: onCreate enter");
    UMConfigure.setLogEnabled(true);
    UMConfigure.preInit(this,"6582573c95b14f599d038492","Umeng");
  }
}