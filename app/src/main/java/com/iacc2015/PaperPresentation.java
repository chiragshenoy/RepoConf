package com.iacc2015;

import android.content.Intent;
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
public class PaperPresentation extends ActionBarActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pp_page);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Aller.ttf");
        toolbar = (Toolbar) findViewById(R.id.toolbar); //Appcompat support for a sexier action bar
        setSupportActionBar(toolbar);


        Button s1 = (Button) findViewById(R.id.s1);
        s1.setTypeface(tf);
        s1.setText("Session 1");
        s1.setOnClickListener(this);

        Button s2 = (Button) findViewById(R.id.s2);
        s2.setTypeface(tf);
        s2.setText("Session 2");
        s2.setOnClickListener(this);

        Button s3 = (Button) findViewById(R.id.s3);
        s3.setTypeface(tf);
        s3.setText("Session 3");
        s3.setOnClickListener(this);

        Button s4 = (Button) findViewById(R.id.s4);
        s4.setTypeface(tf);
        s4.setText("Session 4");

        s4.setOnClickListener(this);

        Button s5 = (Button) findViewById(R.id.s5);
        s5.setTypeface(tf);
        s5.setText("Session 5");

        s5.setOnClickListener(this);

        Button s6 = (Button) findViewById(R.id.s6);
        s6.setTypeface(tf);
        s6.setText("Session 6");

        s6.setOnClickListener(this);

        Button s7 = (Button) findViewById(R.id.s7);
        s7.setTypeface(tf);
        s7.setText("Session 7");

        s7.setOnClickListener(this);

        Button s8 = (Button) findViewById(R.id.s8);
        s8.setTypeface(tf);
        s8.setText("Session 8");

        s8.setOnClickListener(this);

        Button s9 = (Button) findViewById(R.id.s9);
        s9.setTypeface(tf);
        s9.setText("Session 9");

        s9.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.s1:
                Intent a = new Intent(getApplicationContext(), PPPage.class);
                a.putExtra("pos", 1);
                startActivity(a);
                break;
            case R.id.s2:
                Intent b = new Intent(getApplicationContext(), PPPage.class);
                b.putExtra("pos", 2);
                startActivity(b);
                break;
            case R.id.s3:
                Intent f = new Intent(getApplicationContext(), PPPage.class);
                f.putExtra("pos", 3);
                startActivity(f);
                break;
            case R.id.s4:
                Intent d = new Intent(getApplicationContext(), PPPage.class);
                d.putExtra("pos", 4);

                startActivity(d);
                break;
            case R.id.s5:
                Intent c = new Intent(getApplicationContext(), PPPage.class);
                c.putExtra("pos", 5);

                startActivity(c);
                break;
            case R.id.s6:
                Intent z = new Intent(getApplicationContext(), PPPage.class);
                z.putExtra("pos", 6);
                startActivity(z);
                break;
            case R.id.s7:
                Intent zs = new Intent(getApplicationContext(), PPPage.class);
                zs.putExtra("pos", 7);

                startActivity(zs);
                break;
            case R.id.s8:
                Intent zasd = new Intent(getApplicationContext(), PPPage.class);
                zasd.putExtra("pos", 8);
                startActivity(zasd);
                break;
            case R.id.s9:
                Intent zfas = new Intent(getApplicationContext(), PPPage.class);
                zfas.putExtra("pos", 9);
                startActivity(zfas);
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
                Intent home = new Intent(getApplicationContext(), MainActivity.class);
                finish();
                startActivity(home);
                return true;
            case R.id.phone:
                Intent phone = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(phone);
                return true;
            case R.id.now:
                Intent now = new Intent(getApplicationContext(), CurrentEvents.class);
                startActivity(now);
                return true;
            case R.id.sch:
                Intent sch = new Intent(getApplicationContext(), Schedule.class);
                startActivity(sch);
                return true;
            case R.id.student:
                Intent stu = new Intent(getApplicationContext(), Temp.class);
                startActivity(stu);
                return true;
            case R.id.workshop:
                Intent wrk = new Intent(getApplicationContext(), WorkshopsNew.class);
                startActivity(wrk);
                return true;
        }
        return true;
    }

}
