package com.example.windows10timt.handmadewatch.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.windows10timt.handmadewatch.R;
import com.example.windows10timt.handmadewatch.fragment.CategoryFragment;
import com.example.windows10timt.handmadewatch.fragment.ConnectWithUsFragment;
import com.example.windows10timt.handmadewatch.fragment.ConntactUsFragment;
import com.example.windows10timt.handmadewatch.fragment.FavoriteFragment;
import com.example.windows10timt.handmadewatch.fragment.FragmentController;
import com.example.windows10timt.handmadewatch.fragment.HomeFragment;
import com.example.windows10timt.handmadewatch.fragment.MyShoppingCartFragment;
import com.example.windows10timt.handmadewatch.fragment.ProfileFragment;
import com.example.windows10timt.handmadewatch.fragment.SettingFragment;
import com.example.windows10timt.handmadewatch.model.SimpleClass;
import com.example.windows10timt.handmadewatch.sevice.APIService;
import com.example.windows10timt.handmadewatch.sevice.ApiUtil;
import com.example.windows10timt.handmadewatch.sevice.RetrofitClient;
import com.example.windows10timt.handmadewatch.utils.Const;
import com.example.windows10timt.handmadewatch.utils.Libs_System;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    @BindView(R.id.imgBack)
    ImageView imgBack;
    @BindView(R.id.txtToolbarTitle)
    TextView txtToolbarTitle;
    @BindView(R.id.imgChat)
    ImageView imgChat;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fram_container)
    FrameLayout framContainer;
    @BindView(R.id.nav_view)
    NavigationView navView;
    @BindView(R.id.drawlayout)
    DrawerLayout drawlayout;
   private APIService apiService;


    private String token;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawlayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawlayout.addDrawerListener(toggle);
        toggle.syncState();
        token = Libs_System.getStringData(MainActivity.this, Const.TOKEN);
        Menu menu = navView.getMenu();
        if (!Libs_System.getStringData(MainActivity.this, Const.TOKEN).equals("")) {
            menu.findItem(R.id.nav_profile).setVisible(true);
            menu.findItem(R.id.nav_cart).setVisible(true);
            menu.findItem(R.id.nav_favorites).setVisible(true);
            menu.findItem(R.id.nav_productOnSale).setVisible(true);
            menu.findItem(R.id.nav_contactUs).setVisible(true);
            menu.findItem(R.id.nav_signOut).setVisible(true);
        }
        apiService= ApiUtil.getAPIService();
        navView.setNavigationItemSelectedListener(this);
        View header = navView.getHeaderView(0);
        Button buttonLogin = header.findViewById(R.id.bt_login);
        buttonLogin.setOnClickListener(this);
        if (Libs_System.getStringData(MainActivity.this, Const.IS_FRIST_INSTALL).equals("")) {

          apiService.sendTokenFristInstall(token,"android").enqueue(new Callback<SimpleClass>() {
              @Override
              public void onResponse(Call<SimpleClass> call, Response<SimpleClass> response) {
                  Libs_System.insertStringData(MainActivity.this,Const.IS_FRIST_INSTALL,"installed");
              }

              @Override
              public void onFailure(Call<SimpleClass> call, Throwable t) {

              }
          });

        }


    }

    @Override
    public void onBackPressed() {
        if (drawlayout.isDrawerOpen(GravityCompat.START)) {
            drawlayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Menu menu = navView.getMenu();

        txtToolbarTitle.setText(menu.findItem(id).getTitle());
        switch (item.getItemId()) {
            case R.id.nav_home:
                FragmentController.replaceFragment(this, new HomeFragment(), R.id.fram_container);
                break;
            case R.id.nav_profile:
                FragmentController.replaceFragment(this, new ProfileFragment(), R.id.fram_container);
                break;
            case R.id.nav_cart:
                FragmentController.replaceFragment(this, new MyShoppingCartFragment(), R.id.fram_container);
                break;
            case R.id.nav_category:
                FragmentController.replaceFragment(this, new CategoryFragment(), R.id.fram_container);
                break;
            case R.id.nav_favorites:
                FragmentController.replaceFragment(this, new FavoriteFragment(), R.id.fram_container);
                break;
            case R.id.nav_setting:
                FragmentController.replaceFragment(this, new SettingFragment(), R.id.fram_container);
                break;
            case R.id.nav_contactUs:
                FragmentController.replaceFragment(this, new ConntactUsFragment(), R.id.fram_container);
                break;
            case R.id.nav_connectWithUs:
                FragmentController.replaceFragment(this, new ConnectWithUsFragment(), R.id.fram_container);
                break;
        }
        drawlayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private boolean checkLogin(final Context context) {
        if (Libs_System.getStringData(context, Const.TOKEN).equals("")) {
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
