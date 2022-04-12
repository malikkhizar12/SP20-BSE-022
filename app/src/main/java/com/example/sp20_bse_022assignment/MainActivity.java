package com.example.sp20_bse_022assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
private FragmentManager fragmentManager;
private FragmentTransaction fragmentTransaction;
private ActionFragment actionFragment;
private MessageFragment messageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        actionFragment=actionFragment.newInstance();
        messageFragment=messageFragment.newInstance();
        fragmentTransaction.replace(R.id.container,actionFragment);
        fragmentTransaction.replace(R.id.frameLayout,messageFragment);
    }
}