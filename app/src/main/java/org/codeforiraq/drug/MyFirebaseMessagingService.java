package org.codeforiraq.drug;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override

        public void onNewToken(String token) {
            Log.e("mmy", "Refreshed token: " + token);


        }
    }


