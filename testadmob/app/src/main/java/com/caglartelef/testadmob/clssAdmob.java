package com.caglartelef.testadmob;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

/**
 * Created by CAGLARTELEF on 18.01.2018.
 */

public class clssAdmob {

    private static final String reklamID = "ca-app-pub-8534982204109799/4457062481";

    public static InterstitialAd getInstance(Context context) {
        InterstitialAd mInterstitialAd = new InterstitialAd(context);
        mInterstitialAd.setAdUnitId(reklamID);
        return mInterstitialAd;
    }

    public static AdRequest getAdRequest() {
        return new AdRequest.Builder()
                .addTestDevice("*******")/*Add test device id*/
                .build();
    }

}
