package com.iacc2015;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by Chirag on 28-12-2014.
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent a = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(a);
                }

            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
