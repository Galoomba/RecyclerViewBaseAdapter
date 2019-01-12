package com.example.baseadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.baseadapter.Views.RecyclerViewView;

import java.util.ArrayList;

/**
 * Created by starhood on 12/01/19.
 */

public class BaseAdapter<T> extends RecyclerView.Adapter<BaseAdapter.ViewHolder>  {

    //Data arrayList
    private ArrayList<T> dataList;
    //the onClick interface for handling RecyclerView item clicks
    private RecyclerViewClickListener<T> delegate;
    // LayoutID for inflating the View
    private int layoutId;


    /**
     * Base Adapter Constructor
     * **/
    public BaseAdapter(ArrayList<T> dataList, RecyclerViewClickListener<T> delegate, int layoutId) {
        this.dataList = dataList;
        this.delegate = delegate;
        this.layoutId = layoutId;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflating the view and parse it to the viewHolder
        RecyclerViewView<T> view = (RecyclerViewView<T>) LayoutInflater.from(parent.getContext()).inflate(layoutId,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        //bind each list item date to the item view
        holder.view.bindView(dataList.get(position));

        //init the onClick method
        //trigger the clicks on the list item
        ((View) holder.view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (delegate != null) {
                    delegate.onClick(dataList.get(position));
                }
            }
        });

        //init the onLongClick method
        //trigger the presses on the list item
        ((View) holder.view).setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (delegate != null) {
                    delegate.onLongClick(dataList.get(position));
                }
                return true;
            }
        });

    }

    @Override
    public int getItemCount() {
         return dataList.size();
    }

    public void insert(T object){
        dataList.add(object);
        notifyDataSetChanged();
    }

    public void insertAt(T object, int index){
        dataList.add(index,object);
        notifyDataSetChanged();
    }

    public void replace(T object, int index)
    {
        dataList.remove(index);
        dataList.add(index,object);
        notifyDataSetChanged();
    }

    public void update(T object, int index){
        replace(object,index);
    }

    public void delete(int index){
        dataList.remove(index);
        notifyDataSetChanged();
    }
    public void deleteAll(){
        dataList.clear();
        notifyDataSetChanged();
    }

    public void changeAllData(ArrayList<T> list){
        dataList.clear();
        dataList.addAll(list);
        notifyDataSetChanged();
    }
    public int getListSize(){
        return dataList.size();
    }

    public  static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerViewView view;
        public ViewHolder(RecyclerViewView itemView) {
            super((View)itemView);
            view=itemView;
        }
    }
}
