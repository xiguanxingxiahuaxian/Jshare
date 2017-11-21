package com.jpush.maw.jshare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mob.MobSDK;
import com.mob.commons.SHARESDK;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void share(View view) {
        MobSDK.init(getApplicationContext(),"227d8bdda0ced","1f1f7fde1ae6d4a264c754c41c639fa1");
        OnekeyShare onekeyShare =new OnekeyShare();
        onekeyShare.setTitle("测试分享");
        onekeyShare.setText("测试分享文本");
        onekeyShare.setTitleUrl("http://mob.com");
        onekeyShare.setImageUrl("http://f1.sharesdk.cn/imgs/2014/02/26/owWpLZo_638x960.jpg");
        onekeyShare.show(this);
    }
}
