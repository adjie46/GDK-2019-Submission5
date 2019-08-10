package com.adjiekurniawan.myfavoriteapps.activities;

import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.adjiekurniawan.myfavoriteapps.R;
import com.adjiekurniawan.myfavoriteapps.fragments.FragmentMovie;

public class MainActivity extends AppCompatActivity {

    public TextView toolbarTitle, toolbarDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
    }

    private void initToolbar() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.putih));
        }
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initComponent();
    }

    private void initComponent() {
        toolbarTitle = findViewById(R.id.toolbarTitle);
        toolbarDescription = findViewById(R.id.toolbarDescription);
        defaultFragment();
    }

    private void defaultFragment() {
        Fragment defaultfragment = new FragmentMovie();
        launchFragment(defaultfragment);
    }

    private void launchFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content, fragment, null);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
