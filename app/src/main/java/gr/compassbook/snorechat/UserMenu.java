package gr.compassbook.snorechat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class UserMenu extends AppCompatActivity {

    UserLocalStore userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_menu);
    }

    //Log User out
    public void logUserOut(View view) {
        userData = new UserLocalStore(this);
        userData.setUserLoggedIn(false);
        userData.clearUserData();
        Toast.makeText(UserMenu.this, "Logout Successful", Toast.LENGTH_LONG).show();
        startActivity(new Intent(this, Main.class));

    }
}
