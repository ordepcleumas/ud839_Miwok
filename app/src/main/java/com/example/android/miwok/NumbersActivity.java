package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        int index = 0;

        TextView wordView = new TextView(this);//this is NumberActivity context
        wordView.setText(words.get(index));
        rootView.addView(wordView);

        index = index + 1;

        TextView wordView2 = new TextView(this);//this is NumberActivity context
        wordView2.setText(words.get(index));
        rootView.addView(wordView2);
        index = index + 1;

        TextView wordView3 = new TextView(this);//this is NumberActivity context
        wordView3.setText(words.get(index));
        rootView.addView(wordView3);

    }
}
