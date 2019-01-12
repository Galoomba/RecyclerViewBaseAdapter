package com.example.baseadapter.Views;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;

/**
 * Created by starhood on 12/01/19.
 */

public abstract class RecyclerViewConstraintView<T> extends ConstraintLayout implements RecyclerViewView<T> {
    public RecyclerViewConstraintView(Context context) {
        super(context);
    }

    public RecyclerViewConstraintView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewConstraintView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

}
