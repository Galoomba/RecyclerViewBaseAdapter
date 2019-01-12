package com.example.starhood.recyclerviewbaseadapter.Views;

/**
 * Created by starhood on 12/01/19.
 */


import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.baseadapter.Views.RecyclerViewCardView;
import com.example.baseadapter.Views.RecyclerViewConstraintView;
import com.example.starhood.recyclerviewbaseadapter.POJO.Pets;
import com.example.starhood.recyclerviewbaseadapter.R;
import com.squareup.picasso.Picasso;

/**
 * Extending one of the baseAdapter Views for the list Item
 * **/
public class ListItemLayout extends RecyclerViewConstraintView<Pets> {

    private TextView petType,petName;
    private Button menuBtn;
    private ImageView petImg;

    public ListItemLayout(Context context) {
        super(context);
    }

    public ListItemLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListItemLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        petImg= findViewById(R.id.pet_image);
        petName=findViewById(R.id.pet_name);
        petType=findViewById(R.id.pet_type);
        menuBtn=findViewById(R.id.menu_btn);
    }

    @Override
    public void bindView(Pets item) {

        petName.setText(item.getPetName());
        petType.setText(item.getPetType());
        menuBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"test",Toast.LENGTH_SHORT).show();
            }
        });
        Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(petImg);

    }
}
