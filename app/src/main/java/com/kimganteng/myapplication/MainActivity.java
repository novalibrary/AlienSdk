package com.kimganteng.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.aliendroid.alienads.AlienOpenAds;
import com.aliendroid.alienads.AliendroidBanner;
import com.aliendroid.alienads.AliendroidInitialize;
import com.aliendroid.alienads.AliendroidIntertitial;
import com.aliendroid.alienads.AliendroidNative;
import com.aliendroid.alienads.AliendroidReward;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlienOpenAds.LoadOpenAds("");
        RelativeLayout layAds = findViewById(R.id.layAds);
        RelativeLayout layNative = findViewById(R.id.layNative);
        AliendroidNative.SmallNativeAdmob(this,layNative,"STARTAPP","ca-app-pub-3940256099942544/2247696110","123456","1","2","3","4","5");
        AliendroidInitialize.SelectAdsAdmob(this,"STARTAPP","123456789");
        AliendroidIntertitial.LoadIntertitialAdmob(this,"STARTAPP","xxxca-app-pub-3940256099942544/5224354917","736587","1","2","3","4","5");
    }

    public void showreward(View view){
        AliendroidReward.ShowRewardAdmob(MainActivity.this,"","xxxca-app-pub-3940256099942544/5224354917","");
    }
    public void showinter(View view){
        AliendroidIntertitial.ShowIntertitialAdmob(MainActivity.this, "STARTAPP","CA-PUB-DSFJ","123456789",0,"1","2","3","4","5");
    }
}