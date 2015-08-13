package com.harry;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.d("test", String.valueOf(Utility.isAnagram1("word", "wrdo")));
        Log.d("test", String.valueOf(Utility.firstNonRepeatingCharacter("daxxyananda")));

    }

///
}
