package com.example.testivacc.classes;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Langua extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        LanguageManager lang=new LanguageManager(this);
        lang.updateResource(lang.getlang());
    }
}
