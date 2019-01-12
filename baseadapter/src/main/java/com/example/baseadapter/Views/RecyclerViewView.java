package com.example.baseadapter.Views;

/**
 * Created by starhood on 12/01/19.
 */

/**
 * BaseView Interface with a abstract method which bind the views with the data
 * received form the adapter
 * **/
public interface  RecyclerViewView<T> {
    void bindView(T item);
}
