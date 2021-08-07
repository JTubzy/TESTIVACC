//package com.example.testivacc.Activities;
//
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.content.DialogInterface;
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.content.res.Configuration;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//import com.example.testivacc.R;
//import com.example.testivacc.classes.Langua;
//import com.example.testivacc.classes.LanguageManager;
//
//import java.util.Locale;
//
//public class Language extends Langua {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setContentView(R.layout.activity_language);
//        ActionBar actionBar=getSupportActionBar();
//        actionBar.setTitle(getResources().getString(R.string.app_name));
//        LanguageManager lang=new LanguageManager(this);
//        Button English=findViewById(R.id.btnEng);
//        Button French=findViewById(R.id.btnFre);
//        English.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//            showChangeLanguageDialog();
//            }
//        });
//
//        French.setOnClickListener(v -> {
//            lang.updateResource("fr");
//            recreate();
//            Intent intent=new Intent(this,Login.class);
//            startActivity(intent);
////            @Override
////            public void onClick(View v) {
////                showChangeLanguageDialog();
//
//        });
//
//    }
//    private void showChangeLanguageDialog() {
//        final String[] listitems={"French","English"};
//        AlertDialog.Builder mBuilder =new AlertDialog.Builder(Language.this);
//        mBuilder.setTitle("Choose Language");
//        mBuilder.setSingleChoiceItems(listitems, -1, new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int i) {
//
//                if(i==0){
//                    setLocale("fr");
//                    recreate();
//                }
//                else if(i==1){
//                    setLocale("en");
//                    recreate();
//                }
//            }
//        });
//        AlertDialog mdialog=mBuilder.create();
//        mdialog.show();
//    }
//
//    private void setLocale(String lang) {
//        Locale locale=new Locale(lang);
//        Locale.setDefault(locale);
//        Configuration config= new Configuration();
//        config.locale=locale;
//        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
//        SharedPreferences.Editor editor=getSharedPreferences("JOE",MODE_PRIVATE).edit();
//        editor.putString("My_lang",lang);
//        editor.apply();
//    }
//
//    public void loadlocale(){
//        SharedPreferences pref= getSharedPreferences("JOE",Activity.MODE_PRIVATE);
//        String language=pref.getString("My_lang","");
//        setLocale(language);
//    }}
