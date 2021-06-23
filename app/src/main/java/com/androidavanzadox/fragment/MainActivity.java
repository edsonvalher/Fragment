package com.androidavanzadox.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    boolean mododia = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedor, new ModoDiaFragment())
                .commit();

        setContentView(R.layout.activity_main);
    }

    public void cambio(View view) {
        Fragment f = null;
        if(mododia){
            f = new ModoNocheFragment();
        }else{
            f = new ModoDiaFragment();
        }
        mododia = !mododia;
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor,f)
                .commit();
    }
}