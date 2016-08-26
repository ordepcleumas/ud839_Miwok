package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("One");

        //Word w = new Word("one","lutti");
        //words.add(w);

        words.add(new Word("one", "lutti", R.drawable.number_one));
        words.add(new Word("Two", "lutti", R.drawable.number_two));
        words.add(new Word("Three", "otiiko", R.drawable.number_three));
        words.add(new Word("Four", "tolookosu", R.drawable.number_four));
        words.add(new Word("Five", "oyyisa", R.drawable.number_five));
        words.add(new Word("Six", "massokka", R.drawable.number_six));
        words.add(new Word("Seven", "temmokka", R.drawable.number_seven));
        words.add(new Word("Eight", "kawinta", R.drawable.number_eight));
        words.add(new Word("Nine", "wo´e", R.drawable.number_nine));
        words.add(new Word("Ten", "na´aacha", R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter =
                new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);
    }
}
