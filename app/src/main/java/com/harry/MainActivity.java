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
        Log.d("test", String.valueOf(isAnagram1("word", "wrdo")));
    }

    public boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] chars = first.toCharArray();
        for (char c : chars) {
            int index = second.indexOf(c);
            if (index != -1) {
                second = second.substring(0, index) + second.substring(index + 1, second.length());
            }else {
                return false;
            }
        }
        return second.isEmpty();
    }

    public boolean isAnagram1(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char[] chars = first.toCharArray();
        StringBuilder sb = new StringBuilder(second);
        for (char c : chars) {
            int index = sb.indexOf(""+c);
            if (index != -1) {
                sb.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sb.length()==0?true:false;
    }

}
