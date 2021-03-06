package gr.compassbook.snorechat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import gr.compassbook.snorechat.aboutUs.About;
import gr.compassbook.snorechat.user.login.Login;
import gr.compassbook.snorechat.user.menu.UserMenu;
import gr.compassbook.snorechat.user.register.Register;

public class Main extends AppCompatActivity {

    private SharedPreferences userData;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Check if User is already Logged In...
    @Override
    protected void onStart() {
        super.onStart();
        userData = getSharedPreferences("userDetails", 0);

        if (userData.getBoolean("loggedIn", false)) {
            startActivity(new Intent(this,UserMenu.class));
        }

    }

    @Override
    public void onBackPressed() {
        
    }

    //Show Login Activity
    public void showLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    //Show About Activity
    public void showAbout(View view) {
        Intent aboutIntent  = new Intent(this,About.class);
        startActivity(aboutIntent);
    }
    //Show Register Activity
    public void showRegister(View view) {
        Intent intentRegister = new Intent(this, Register.class);
        startActivity(intentRegister);
    }
}
