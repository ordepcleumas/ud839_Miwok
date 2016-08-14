package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Samuel Pedro on 14/08/2016.
 */
public class NumbersClickListener implements View.OnClickListener {
    /**
     * 1. Define an event listener (and the custom behavior for when the event happens)
     */

    /**
     * @param view
     */
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();
    }
}
