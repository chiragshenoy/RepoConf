package com.iacc2015;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import com.gc.materialdesign.views.ButtonRectangle;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButtonRectangle b1 = (ButtonRectangle) findViewById(R.id.b1);
        b1.setOnClickListener(this);

        ButtonRectangle b2 = (ButtonRectangle) findViewById(R.id.b2);
        b2.setOnClickListener(this);

        ButtonRectangle contactus = (ButtonRectangle) findViewById(R.id.contact_us);
        contactus.setOnClickListener(this);

        ButtonRectangle schedule = (ButtonRectangle) findViewById(R.id.b4);
        schedule.setOnClickListener(this);

        ButtonRectangle currentEvent = (ButtonRectangle) findViewById(R.id.current_event);
        currentEvent.setOnClickListener(this);

        ButtonRectangle pp = (ButtonRectangle) findViewById(R.id.speakers);
        pp.setOnClickListener(this);

        ButtonRectangle feedback = (ButtonRectangle) findViewById(R.id.feedback);
        feedback.setOnClickListener(this);

        ButtonRectangle map = (ButtonRectangle) findViewById(R.id.map);
        map.setOnClickListener(this);

        ButtonRectangle paperp = (ButtonRectangle) findViewById(R.id.paperp);
        paperp.setOnClickListener(this);


    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b1:
                Intent a = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(a);
                break;
            case R.id.b2:
                Intent b = new Intent(getApplicationContext(), NewWorkshop.class);
                startActivity(b);
                break;
            case R.id.b3:
                Intent f = new Intent(getApplicationContext(), Temp.class);
                startActivity(f);
                break;
            case R.id.b4:
                Intent d = new Intent(getApplicationContext(), Schedule.class);
                startActivity(d);
                break;
            case R.id.contact_us:
                Intent c = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(c);
                break;
            case R.id.current_event:
                Intent z = new Intent(getApplicationContext(), CurrentEvents.class);
                startActivity(z);
                break;
            case R.id.speakers:
                Intent zz = new Intent(getApplicationContext(), Speakers.class);
                startActivity(zz);
                break;
            case R.id.feedback:
                if (isNetworkAvailable()) {
                    Intent zza = new Intent(getApplicationContext(), Feedback.class);
                    startActivity(zza);
                } else
                    Toast.makeText(getApplicationContext(), "Not connected to the Internet", Toast.LENGTH_SHORT).show();
                break;
            case R.id.map:
                Intent zzaf = new Intent(getApplicationContext(), Map.class);
                startActivity(zzaf);
                break;
            case R.id.paperp:
                Intent zzafa = new Intent(getApplicationContext(), NewPaperP.class);
                startActivity(zzafa);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        switch (id) {
//            case R.id.home:
//                return true;
//            case R.id.phone:
//                Intent phone = new Intent(getApplicationContext(), ContactUs.class);
//                startActivity(phone);
//                return true;
//            case R.id.now:
//                Intent now = new Intent(getApplicationContext(), CurrentEvents.class);
//                startActivity(now);
//                return true;
//            case R.id.sch:
//                Intent sch = new Intent(getApplicationContext(), Schedule.class);
//                startActivity(sch);
//                return true;
//            case R.id.student:
//                Intent stu = new Intent(getApplicationContext(), Temp.class);
//                startActivity(stu);
//                return true;
//            case R.id.workshop:
//                Intent wrk = new Intent(getApplicationContext(), WorkshopsNew.class);
//                startActivity(wrk);
//                return true;
//        }
//        return true;
//    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
    }
}
