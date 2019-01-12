package com.example.baseadapter.Views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;


public abstract class RecyclerViewCardView<T> extends CardView implements RecyclerViewView<T>  {
    public RecyclerViewCardView(@NonNull Context context) {
        super(context);
    }

    public RecyclerViewCardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RecyclerViewCardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
    }


}
