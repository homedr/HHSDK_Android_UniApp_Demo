package io.dcloud.simple;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.hhmedic.android.sdk.HHDoctor;
import com.hhmedic.android.sdk.listener.HHLoginListener;

import io.dcloud.common.DHInterface.IWebview;
import io.dcloud.common.DHInterface.StandardFeature;
import org.json.JSONArray;


public class PGPlugintest extends StandardFeature
{

    public void onStart(Context pContext, Bundle pSavedInstanceState, String[] pRuntimeArgs) {

    }

    public void PluginTestFunction(IWebview pWebview, JSONArray array)
    {
        String CallBackID = array.optString(0);
        String CallMethod = array.optString(1);
        String UserToken = array.optString(2);

        Log.d("HH","CallMethod:" + CallMethod);
        Log.d("HH","UserToken:" + UserToken);

        switch (CallMethod) {

            case "goHome" :

                HHDoctor.login(Application.mContext, UserToken, new HHLoginListener() {
                    @Override
                    public void onSuccess() {
                        Log.d("HH","登录成功");
                        HHDoctor.message(MyActivityManager.getInstance().getCurrentActivity());
                    }

                    @Override
                    public void onError(String tips) {
                        Log.d("HH","登录失败");
                    }
                });

                break;

            default:
                break;
        }



    }




}