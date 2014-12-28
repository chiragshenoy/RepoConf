package ictiee.conference;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Chirag on 15-12-2014.
 */
public class CurrentEvents extends ActionBarActivity {
    Boolean event_going_on = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_events);

        Toolbar toolbar = (Toolbar) findViewById(R.id.c9_toolbar); //Appcompat support for a sexier action bar
        setSupportActionBar(toolbar);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd HH:mm:ss");
        String current_time = df.format(c.getTime());
        LinearLayout main_layout = (LinearLayout) findViewById(R.id.main_ll);
        main_layout.setOrientation(LinearLayout.VERTICAL);

        String s = "29 09:00:00";
        String g = "29 16:00:00";

        if (current_time.compareTo(s) > 0 && current_time.compareTo(g) < 0) {
            Toast.makeText(this, "Events going on", Toast.LENGTH_LONG).show();
            event_going_on = true;
            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Software Defined Radio & Control Systems - Effective Tools for Teaching and Research ");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("9am - 4pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("TCE Department");
            main_layout.addView(v1);

            View v2 = vi.inflate(R.layout.event_layout, null);
            TextView title2 = (TextView) v2.findViewById(R.id.title);
            title2.setText("Innovative Undergraduate Labs for Control, Mechatronics, and Robotics ");
            TextView when2 = (TextView) v2.findViewById(R.id.when);
            when2.setText("9am - 4pm");
            TextView where2 = (TextView) v2.findViewById(R.id.where);
            where2.setText("EEE Department");
            main_layout.addView(v2);

            View v3 = vi.inflate(R.layout.event_layout, null);
            TextView title3 = (TextView) v3.findViewById(R.id.title);
            title3.setText("Workshop by Dassault ");
            TextView when3 = (TextView) v3.findViewById(R.id.when);
            when3.setText("9am - 4pm");
            TextView where3 = (TextView) v3.findViewById(R.id.where);
            where3.setText("Mechanical Department");
            main_layout.addView(v3);

            View v4 = vi.inflate(R.layout.event_layout, null);
            TextView title4 = (TextView) v4.findViewById(R.id.title);
            title4.setText("The Freedom Lab-in-a-Box");
            TextView when4 = (TextView) v4.findViewById(R.id.when);
            when4.setText("9am - 4pm");
            TextView where4 = (TextView) v4.findViewById(R.id.where);
            where4.setText("ECE Department");
            main_layout.addView(v4);

            View v5 = vi.inflate(R.layout.event_layout, null);
            TextView title5 = (TextView) v5.findViewById(R.id.title);
            title5.setText("Learning Platform for Better Outcomes");
            TextView when5 = (TextView) v5.findViewById(R.id.when);
            when5.setText("9am - 4pm");
            TextView where5 = (TextView) v5.findViewById(R.id.where);
            where5.setText("ISE Department");
            main_layout.addView(v5);


            View v6 = vi.inflate(R.layout.event_layout, null);
            TextView title6 = (TextView) v6.findViewById(R.id.title);
            title6.setText("PSoCTM 4 BLE Workshop");
            TextView when6 = (TextView) v6.findViewById(R.id.when);
            when6.setText("9am - 4pm");
            TextView where6 = (TextView) v6.findViewById(R.id.where);
            where6.setText("ECE Department");
            main_layout.addView(v6);

            View v7 = vi.inflate(R.layout.event_layout, null);
            TextView title7 = (TextView) v7.findViewById(R.id.title);
            title7.setText("Technology a Generation ahead");
            TextView when7 = (TextView) v7.findViewById(R.id.when);
            when7.setText("9am - 4pm");
            TextView where7 = (TextView) v7.findViewById(R.id.where);
            where7.setText("EEE Department");
            main_layout.addView(v7);

            View v8 = vi.inflate(R.layout.event_layout, null);
            TextView title8 = (TextView) v8.findViewById(R.id.title);
            title8.setText("Automation of Curriculum Design & Attainment for OBE ");
            TextView when8 = (TextView) v8.findViewById(R.id.when);
            when8.setText("9am - 4pm");
            TextView where8 = (TextView) v8.findViewById(R.id.where);
            where8.setText("CSE Department");
            main_layout.addView(v8);


            View v9 = vi.inflate(R.layout.event_layout, null);
            TextView title9 = (TextView) v9.findViewById(R.id.title);
            title9.setText("Impartus Lecture Capture ");
            TextView when9 = (TextView) v9.findViewById(R.id.when);
            when9.setText("9am - 4pm");
            TextView where9 = (TextView) v9.findViewById(R.id.where);
            where9.setText("CSE Department");
            main_layout.addView(v9);

            View v10 = vi.inflate(R.layout.event_layout, null);
            TextView title10 = (TextView) v10.findViewById(R.id.title);
            title10.setText("Teaching Lab Solutions for RF Labs ");
            TextView when10 = (TextView) v10.findViewById(R.id.when);
            when10.setText("9am - 4pm");
            TextView where10 = (TextView) v10.findViewById(R.id.where);
            where10.setText("TCE Department");
            main_layout.addView(v10);

            View v11 = vi.inflate(R.layout.event_layout, null);
            TextView title11 = (TextView) v11.findViewById(R.id.title);
            title11.setText("New Project Based Learning  ");
            TextView when11 = (TextView) v11.findViewById(R.id.when);
            when11.setText("9am - 4pm");
            TextView where11 = (TextView) v11.findViewById(R.id.where);
            where11.setText("CSE Department");
            main_layout.addView(v11);

        }
        ///

        //Breakfast
        if (current_time.compareTo("29 07:30:00") > 0 && current_time.compareTo("28 20:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Breakfast");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("07:30 - 08:00");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        ///
        //Transportation
        if (current_time.compareTo("29 08:00:00") > 0 && current_time.compareTo("29 08:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Trasnportation");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("08.00 - 08.30");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Community Service
        if (current_time.compareTo("29 08:30:00") > 0 && current_time.compareTo("29 10:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Community Service");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("08.30 - 10.30");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Transport
        if (current_time.compareTo("29 10:30:00") > 0 && current_time.compareTo("29 11:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Trasnportation");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("8.30 - 10.30");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //break
        if (current_time.compareTo("29 11:00:00") > 0 && current_time.compareTo("29 11:30:00") < 0) {
            Toast.makeText(this, "Events going on", Toast.LENGTH_LONG).show();
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Break");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("11.00 - 11.30");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Proto
        if (current_time.compareTo("29 11:30:00") > 0 && current_time.compareTo("29 13:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Prototyping while " +
                    "Knowledge Gaining for " +
                    "development of AP");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("11.30 - 01.30");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Case of no event going on
        if (!event_going_on)
            setContentView(R.layout.blank);

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
                startActivity(home);
                return true;
            case R.id.phone:
                Intent phone = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(phone);
                return true;
            case R.id.now:
                return true;
        }
        return true;
    }

}