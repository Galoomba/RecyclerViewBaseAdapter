package com.example.baseadapter;

/**
 * Created by starhood on 12/01/19.
 */

/**
 * this interface for handling the on item click on the list items
 * **/
public interface RecyclerViewClickListener<T> {
    void onClick(T pos);
    void onLongClick(T pos);
}