package com.example.testivacc.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.testivacc.R;

public class Doctors extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[],s2[];
    int images[]={R.drawable.download_1,R.drawable.download_2,R.drawable.download_3,R.drawable.download_4,R.drawable.download_5,R.drawable.download_6,R.drawable.download_7,R.drawable.download_8,R.drawable.download_9,R.drawable.download_10};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);
        recyclerView=findViewById(R.id.recyclerview);
        s1=getResources().getStringArray(R.array.DOCTORS);
        s2=getResources().getStringArray(R.array.description);
        RECYCLERADAPTER recycleradapter=new RECYCLERADAPTER(this,s1,s2,images);
        recyclerView.setAdapter(recycleradapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}