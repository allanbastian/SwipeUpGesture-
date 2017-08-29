package com.adgvit.allan.homepage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Allan on 29-08-2017.
 */

public class LearnGesture extends GestureDetector.SimpleOnGestureListener {

    //SimpleGestureListener is the listener for what type of swipe we want

    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
        if(event2.getX() > event1.getX()) {
            //left to right swipe
        }
        else if(event2.getX() < event1.getX()) {
            //right to left swipe
        }
        else if(event2.getX() == event1.getX()) {
            if(event2.getY() > event1.getY()) {
                //down to up swipe (What we want)
                //declare intent to go to scanner here
            }
        }
        return true;
    }
}
