package io.dcloud.simple;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.hhmedic.android.sdk.HHDoctor;
import com.hhmedic.android.sdk.config.HHSDKOptions;

import io.dcloud.application.DCloudApplication;

public class Application extends DCloudApplication {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = this;

        HHSDKOptions options = new HHSDKOptions("3000");
        options.dev = true;
        HHDoctor.init(getApplicationContext(), options);


        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {
                MyActivityManager.getInstance().setCurrentActivity(activity);
            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}
