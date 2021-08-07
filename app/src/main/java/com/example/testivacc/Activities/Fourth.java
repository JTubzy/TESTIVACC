package com.example.testivacc.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.testivacc.R;

import com.google.android.material.navigation.NavigationView;

import java.util.Locale;

public class Fourth extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadlocale();
        setContentView(R.layout.activity_fourth);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        drawer = findViewById(R.id.drawer_layout);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_doctors:
                Intent intent=new Intent(Fourth.this,Doctors.class);
                startActivity(intent);

                break;

            case R.id.nav_profile:
                Intent inte=new Intent(Fourth.this,Profile.class);
                startActivity(inte);

                break;
            case R.id.nav_help:
                Intent in=new Intent(Fourth.this,About.class);
                startActivity(in);
                break;
            case R.id.nav_logout:
                Intent x=new Intent(Fourth.this,Login.class);
                startActivity(x);
                break;
            case R.id.nav_lang:
                showChangeLanguageDialog();
//                Intent i=new Intent(Fourth.this,Language.class);
//                startActivity(i);
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


        private void showChangeLanguageDialog() {
            ActionBar actionBar=getSupportActionBar();
            actionBar.setTitle(getResources().getString(R.string.app_name));
            final String[] listitems={"English","Swahili","French"};
            AlertDialog.Builder mBuilder =new AlertDialog.Builder(Fourth.this);
            mBuilder.setTitle("Choose Language");
            mBuilder.setSingleChoiceItems(listitems, -1, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {

                    if (i == 0) {
                        setLocale("fr");
                        recreate();
                    } else if (i == 1) {
                        setLocale("en");
                        recreate();
                    } else  {
                        setLocale("sw");
                        recreate();
                    }
                    dialog.dismiss();
                }
            });
            AlertDialog mdialog=mBuilder.create();
            mdialog.show();
        }

        private void setLocale(String lang) {
            Locale locale=new Locale(lang);
            Locale.setDefault(locale);
            Configuration config= new Configuration();
            config.locale=locale;
            getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
            SharedPreferences.Editor editor=getSharedPreferences("JOE",MODE_PRIVATE).edit();
            editor.putString("My_lang",lang);
            editor.apply();
        }
        public void loadlocale(){
            SharedPreferences pref= getSharedPreferences("JOE", Activity.MODE_PRIVATE);
            String language=pref.getString("My_lang","");
            setLocale(language);
        }
    }

