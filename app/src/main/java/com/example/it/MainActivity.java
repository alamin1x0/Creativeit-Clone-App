package com.example.it;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.it.Nav.ABOUT;
import com.example.it.Nav.CONTACT;
import com.example.it.Nav.EVENT;
import com.example.it.Nav.FAQ;
import com.example.it.Nav.NOTICES;
import com.example.it.Nav.REGISTRATION;
import com.example.it.Nav.ROUTINES;
import com.example.it.Nav.SEMINAR;
import com.example.it.ui.course.CourseFragment;
import com.example.it.ui.home.HomeFragment;
import com.example.it.ui.map.MapFragment;
import com.example.it.ui.time.TimeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toobarId);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

       //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON);


       getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();


        drawerLayout = findViewById(R.id.drawerlayout);
        navigationView = findViewById(R.id.nav);

        bottomNavigationView = findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment selected_fragment = null;

                switch (item.getItemId()){
                    case R.id.navigation_home:
                        selected_fragment = new HomeFragment();
                        break;

                    case R.id.navigation_cource:
                        selected_fragment = new CourseFragment();
                        break;

                    case R.id.navigation_time:
                        selected_fragment = new TimeFragment();
                        break;

                    case R.id.navigation_map:
                        selected_fragment = new MapFragment();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container,selected_fragment).commit();

                return true;
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.aboutus:
                        startActivity(new Intent(MainActivity.this, ABOUT.class));
                        break;

                    case R.id.seminar:
                        startActivity(new Intent(MainActivity.this, SEMINAR.class));
                        break;

                    case R.id.routines:
                        startActivity(new Intent(MainActivity.this, ROUTINES.class));
                        break;

                    case R.id.registration:
                        startActivity(new Intent(MainActivity.this, REGISTRATION.class));
                        break;
                    case R.id.faq:
                        startActivity(new Intent(MainActivity.this, FAQ.class));
                        break;

                    case R.id.contact:
                        startActivity(new Intent(MainActivity.this, CONTACT.class));
                        break;

                    case R.id.event:
                        startActivity(new Intent(MainActivity.this, EVENT.class));
                        break;


                }
                return true;
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.open, R.string.close);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.red));
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

//        switch (item.getItemId()) {
//            case R.id.logout:
//                Toasty.success(getApplicationContext(), "Logout", Toasty.LENGTH_SHORT).show();
//                break;
//        }

        return super.onOptionsItemSelected(item);
    }


}