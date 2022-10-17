package com.example.activityandfragmentdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //官网代码
//        val finalHost = NavHostFragment.create(R.navigation.navigation_jetpack)
//        supportFragmentManager.beginTransaction()
//                .replace(R.id.ll_fragment_navigation, finalHost)
//                .setPrimaryNavigationFragment(finalHost)
//                .commit()
    }
    @Override
    public boolean onSupportNavigateUp() {
        Fragment fragment=getSupportFragmentManager().findFragmentById(R.id.my_nav_host_fragment);
        return NavHostFragment.findNavController(fragment).navigateUp();
    }
}







