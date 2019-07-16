package com.dambana.andelachallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView track;
    private TextView name;
    private TextView country;
    private TextView email;
    private TextView phone;
    private ProfileManager p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("My Profile");
        setContentView(R.layout.activity_profile);

        createProfile();

    }

    private void createProfile() {
        p = new ProfileManager();
        name = findViewById(R.id.tvtName);
        track =  findViewById(R.id.tvtTrack);
        country = findViewById(R.id.tvtCountry);
        email = findViewById(R.id.tvtEmail);
        phone = findViewById(R.id.tvtPhone);
        name.setText(p.getName());
        track.setText("TRACK: "+p.getTrack());
        country.setText("COUNTRY: "+p.getCountry());
        email.setText("EMAIL: "+p.getEmail());
        phone.setText("PHONE: "+p.getPhone());
    }
}
