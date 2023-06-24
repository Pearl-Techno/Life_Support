package com.pearltechnologies.lifesupport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private CardView cardSymptomsTracking;
    private CardView cardMedsReminder;
    private CardView cardSupportCommunities;
    private CardView cardAppointments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize CardViews
        cardSymptomsTracking = findViewById(R.id.card_symptoms_tracking);
        cardMedsReminder = findViewById(R.id.card_meds_reminder);
        cardSupportCommunities = findViewById(R.id.card_support_communites);
        cardAppointments = findViewById(R.id.card_appointments);

        // Set onClick listeners for CardViews
        cardSymptomsTracking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Symptoms Tracking card
               // Toast.makeText(MainActivity.this, "Symptom Tracking clicked", Toast.LENGTH_SHORT).show();
                // Start a new activity or perform any desired action
                 startActivity(new Intent(MainActivity.this, SymptomsTrackiingActivity.class));
            }
        });

        cardMedsReminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Medication Reminders card
                //Toast.makeText(MainActivity.this, "Medication Reminders clicked", Toast.LENGTH_SHORT).show();
                // Start a new activity or perform any desired action
                startActivity(new Intent(MainActivity.this, MedsReminderActivity.class));
            }
        });

        cardSupportCommunities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Support Communities card
               // Toast.makeText(MainActivity.this, "Support Communities clicked", Toast.LENGTH_SHORT).show();
                // Start a new activity or perform any desired action
                startActivity(new Intent(MainActivity.this, SupportCommunitiesActivity.class));
            }
        });

        cardAppointments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle click event for Appointment Management card
               // Toast.makeText(MainActivity.this, "Appointment Management clicked", Toast.LENGTH_SHORT).show();
                // Start a new activity or perform any desired action
                startActivity(new Intent(MainActivity.this, AppointmentsActivity.class));
            }
        });
    }
}
