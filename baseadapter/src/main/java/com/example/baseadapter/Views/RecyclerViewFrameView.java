package com.example.baseadapter.Views;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by starhood on 12/01/19.
 */

public abstract class RecyclerViewFrameView<T> extends FrameLayout implements RecyclerViewView<T>   {
    public RecyclerViewFrameView(@NonNull Context context) {
        super(context);
    }

    public RecyclerViewFrameView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewFrameView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public RecyclerViewFrameView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }
}
