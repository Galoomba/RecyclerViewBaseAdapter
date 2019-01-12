package com.example.baseadapter.Views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by starhood on 12/01/19.
 */

public abstract class RecyclerViewLinearView<T> extends LinearLayout implements RecyclerViewView<T> {
    public RecyclerViewLinearView(Context context) {
        super(context);
    }

    public RecyclerViewLinearView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewLinearView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RecyclerViewLinearView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

}
