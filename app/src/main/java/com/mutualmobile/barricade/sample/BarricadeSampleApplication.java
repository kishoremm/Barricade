package com.mutualmobile.barricade.sample;

import android.app.Application;
import com.com.mutualmobile.barricade.BarricadeConfig;
import com.mutualmobile.barricade.Barricade;
import com.mutualmobile.barricade.utils.AndroidAssetFileManager;

public class BarricadeSampleApplication extends Application {
  @Override public void onCreate() {
    super.onCreate();
    Barricade.init(BarricadeConfig.getInstance(), new AndroidAssetFileManager(this));
  }
}