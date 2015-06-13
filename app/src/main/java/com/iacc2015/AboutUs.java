package com.iacc2015;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


/**
 * Created by Chirag on 05-11-2014.
 */
public class AboutUs extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        Toolbar toolbar = (Toolbar) findViewById(R.id.c9_toolbar); //Appcompat support for a sexier action bar

//        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
//        toolbar.setTitle("");
//        mTitle.setText("About Us");
        TextView tv = (TextView) findViewById(R.id.tv);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        tv.setTypeface(tf);

//        setSupportActionBar(toolbar);
        TextView content1 = (TextView) findViewById(R.id.content1);
        content1.setText("IEEE IACC-2015 will be held at B.M.S. College of Engineering, Bangalore, India on June 12-13, 2015. The scope of the conference is the analysis, design, implementation, deployment and evaluation of advanced topics of computing. It aims to provide a high profile, leading edge forum for researchers, engineers, standard developers and students to showcase their latest research activities, techniques and experiences in the areas of computing.");
//        content1.setText(Html.fromHtml(
//                "<b>text3:</b>  Text with a " +
//                        "<a href=\"http://www.google.com\">link</a> " +
//                        "created in the Java source code using HTML."));

        TextView content2 = (TextView) findViewById(R.id.content2);
        content2.setText("The conference comprises of invited speeches, workshops, exhibits and oral presentations on features of advanced computing. It will be a prodigious gathering of industry and academia to display major achievements in the world of computing. Researchers present the state-of-the-art expansions and technical elucidations in the areas of high performance computing, advances in communication networks, advance algorithms, artificial intelligence, image processing, data management and social network analysis.");
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
                finish();
                startActivity(phone);
                return true;
            case R.id.now:
                Intent now = new Intent(getApplicationContext(), CurrentEvents.class);
                finish();
                startActivity(now);
                return true;
            case R.id.sch:
                Intent sch = new Intent(getApplicationContext(), Schedule.class);
                finish();
                startActivity(sch);
                return true;
            case R.id.student:
                Intent stu = new Intent(getApplicationContext(), Temp.class);
                finish();
                startActivity(stu);
                return true;
            case R.id.workshop:
                Intent wrk = new Intent(getApplicationContext(), WorkshopsNew.class);
                finish();
                startActivity(wrk);
                return true;
        }
        return true;
    }

}
