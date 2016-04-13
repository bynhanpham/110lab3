package com.example.bypham.myapplication.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.bypham.myapplication.MainActivity;
import com.example.bypham.myapplication.R;

/**
 * Created by bypham on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){
        mainActivity = getActivity();
//lasdfadf
    TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}
