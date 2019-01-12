package com.example.baseadapter.Views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by starhood on 11/01/19.
 */

public abstract class RecyclerViewRelativeView<T> extends RelativeLayout implements RecyclerViewView<T> {
    public RecyclerViewRelativeView(Context context) {
        super(context);
    }

    public RecyclerViewRelativeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewRelativeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RecyclerViewRelativeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }
}
