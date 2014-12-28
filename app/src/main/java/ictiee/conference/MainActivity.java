package ictiee.conference;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

//Pushed from laptop
//Now pushed from desktop
//Yaay this works!
//Push from desktop with added xml
public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Aller.ttf");
        toolbar = (Toolbar) findViewById(R.id.toolbar); //Appcompat support for a sexier action bar
        setSupportActionBar(toolbar);


        Button b1 = (Button) findViewById(R.id.b1);
        b1.setTypeface(tf);
        b1.setOnClickListener(this);

        Button b2 = (Button) findViewById(R.id.b2);
        b2.setTypeface(tf);
        b2.setOnClickListener(this);

//        Button contactus = (Button) findViewById(R.id.contactus);
//        contactus.setOnClickListener(this);
//        contactus.setTypeface(tf);

        Button schedule = (Button) findViewById(R.id.b4);
        schedule.setOnClickListener(this);
        schedule.setTypeface(tf);

        Button studentScheule = (Button) findViewById(R.id.b3);
        studentScheule.setOnClickListener(this);
        studentScheule.setTypeface(tf);

        Button currentEvent = (Button) findViewById(R.id.current_event);
        currentEvent.setOnClickListener(this);
        currentEvent.setTypeface(tf);

        ObjectAnimator colorAnim = ObjectAnimator.ofInt(currentEvent, "textColor", Color.RED, Color.TRANSPARENT);
        colorAnim.setDuration(1000);
        colorAnim.setEvaluator(new ArgbEvaluator());
        colorAnim.setRepeatCount(ValueAnimator.INFINITE);
        colorAnim.setRepeatMode(ValueAnimator.REVERSE);
        colorAnim.start();


    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b1:
                Intent a = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(a);
                break;
            case R.id.b2:
                Intent b = new Intent(getApplicationContext(), WorkshopsNew.class);
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
//            case R.id.contactus:
//                Intent c = new Intent(getApplicationContext(), ContactUs.class);
//                startActivity(c);
//                break;
            case R.id.current_event:
                Intent z = new Intent(getApplicationContext(), CurrentEvents.class);
                startActivity(z);
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.home:
                return true;
            case R.id.phone:
                Intent phone = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(phone);
                return true;
            case R.id.now:
                Intent now = new Intent(getApplicationContext(), CurrentEvents.class);
                startActivity(now);
                return true;
        }
        return true;
    }
}
