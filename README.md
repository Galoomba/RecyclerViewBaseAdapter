# RecyclerViewBaseAdapter
[![](https://jitpack.io/v/Galoomba/RecyclerViewBaseAdapter.svg)](https://jitpack.io/#Galoomba/RecyclerViewBaseAdapter)

Base RecyclerView Adapter for easier and faster implementation of recyclerview, 
Implement your RecyclerView in less than 5 min with a full customized adapter that fit all your basic needs
Just start with designing your list item and let the magic happened 

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Galoomba:RecyclerViewBaseAdapter:0.1.0'
	}

# How to use!
* Make your Data module Class
* Extend one of the Custom Views and design your list item 
* Attach the Adapter to the recyclerView

### First implement your module class
``` java
public class Pets {
    private String petType;
    private String petName;
    private String imgURl;

    public Pets(String petType, String petName, String imgURl) {
        this.petType = petType;
        this.petName = petName;
        this.imgURl = imgURl;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
    
   ...
   
}
```

### Second extend one of the custom view provided by the lib 
`RecyclerViewCardView`  `RecyclerViewConstraintView`  `RecyclerViewFrameView`  `RecyclerViewLinearView`  `RecyclerViewRelativeView`

After extending the view design it as you please  
```XML
<?xml version="1.0" encoding="utf-8"?>
<com.example.starhood.recyclerviewbaseadapter.Views.ListItemLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_margin="4dp"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">

    <TextView
        android:id="@+id/pet-type"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="8dp"
        android:textColor="@android:color/black"
        android:textSize="24sp"
        app:layout_constraintStart_toEndOf="@+id/pet-image"
        app:layout_constraintTop_toTopOf="parent"
        />

  `...`

</com.example.starhood.recyclerviewbaseadapter.Views.ListItemLayout>
```
Then initialize your views on the `onFinishInflate()` Methode
```Java
  @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        petImg= findViewById(R.id.pet_image);
        petName=findViewById(R.id.pet_name);
        petType=findViewById(R.id.pet_type);
        menuBtn=findViewById(R.id.menu_btn);
    }
```

And bind the Data to the view on the `bindView()` Methode 
```Java
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
```
### finally initialize your RecyclerView and attach the Adapter to it
```JAVA
 BaseAdapter<Pets> mAdapter = new BaseAdapter<>(pets, new RecyclerViewClickListener<Pets>() {
            @Override
            public void onClick(Pets pos) {
                Toast.makeText(getApplicationContext(),pos.getPetType(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(Pets pos) {
                Toast.makeText(getApplicationContext(),pos.getPetType(),Toast.LENGTH_SHORT).show();

            }
        }, R.layout.list_item);

        // Attach the adapter to the recyclerView
        recyclerView.setAdapter(mAdapter);
```
There is a completed Example in the repo for feather explanation 

## Adapter Methodes 
`insert`
`insertAt`
`replace`
`update`
`delete`
`deleteAll`
`changeAllData`
`getListSize`
