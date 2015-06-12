package com.ymsoftlabs.btjoystick;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by yus on 6/12/2015.
 */
public class OptionsActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.layout.preferences);
    }

}
