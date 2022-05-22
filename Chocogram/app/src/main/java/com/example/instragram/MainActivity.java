package com.example.instragram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.instragram.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Bienvenida());

        binding.BottomNavigationView.setOnItemSelectedListener(item -> {

            switch(item.getItemId()){
                case R.id.Buscar:
                    replaceFragment(new Buscar());
                    break;

                case R.id.Inicio:
                    replaceFragment(new inicio());
                    break;

                case R.id.Reels:
                    replaceFragment(new Reels());
                    break;

                case R.id.Tienda:
                    replaceFragment(new Tienda());
                    break;
                case R.id.Perfil:
                    replaceFragment(new Perfil());
                    break;


            }

            return true;
        });
    }


private void replaceFragment(Fragment fragment){

    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.replace(R.id.fragmentContainerView,fragment);
    fragmentTransaction.commit();

}

}