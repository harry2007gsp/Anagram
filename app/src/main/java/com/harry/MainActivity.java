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
//        Log.d("test", String.valueOf(Utility.firstNonRepeatingCharacter("daxxyananda")));
//        Log.d("test", String.valueOf(Utility.reverseString("hi how are you?")));
//        Log.d("test", String.valueOf(Utility.stringContainsOnlyNumbers("884832j4823")));
//        Log.d("test", String.valueOf(Utility.otherCharacters("hello 234 so325$@@@#%^")));
        Log.d("test", String.valueOf(Utility.allDuplicateCharactersInString("error")));
    }

///
}
