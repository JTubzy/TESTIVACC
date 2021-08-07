package com.example.testivacc.classes;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;

import static android.content.Context.MODE_PRIVATE;

public class LanguageManager {

    private Context ct;
    private SharedPreferences sharedPreferences;
    public LanguageManager(Context cx){
        ct=cx;
        sharedPreferences=ct.getSharedPreferences("JOE",MODE_PRIVATE);

    }
    public void updateResource(String lang){
        Locale locale=new Locale(lang);
        Locale.setDefault(locale);
        Resources resources= ct.getResources();
        Configuration config= resources. getConfiguration();
        config.locale=locale;
        resources.updateConfiguration(config,resources.getDisplayMetrics());
        setlang(lang);
    }
    public String getlang(){
        return sharedPreferences.getString("JOE","en");
    }
    public void setlang(String code){
      SharedPreferences.Editor editor=sharedPreferences.edit();
      editor.putString("JOE",code);
      editor.commit();
    }







}
