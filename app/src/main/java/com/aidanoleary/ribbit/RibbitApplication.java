package com.aidanoleary.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by aidanoleary on 15/10/2014.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        Parse.initialize(this, "Ehof1zmQPPet52LIAsdJuSmLHunz1Be1Yh5Xkplt", "4wqL1DdivuIptVybxdBsjIKe8vtQnGi5WfeK6mhl");

    }
}
