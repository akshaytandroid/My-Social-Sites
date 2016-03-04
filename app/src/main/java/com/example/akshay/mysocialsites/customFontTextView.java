package com.example.akshay.mysocialsites;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;




public class customFontTextView extends TextView {

    public customFontTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/MyFont.ttf"));
    }
}
