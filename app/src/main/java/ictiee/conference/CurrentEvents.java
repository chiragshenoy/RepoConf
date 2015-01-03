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
        SimpleDateFormat df = new SimpleDateFormat("dd:MM HH:mm:ss");
        String current_time = df.format(c.getTime());
        LinearLayout main_layout = (LinearLayout) findViewById(R.id.main_ll);
        main_layout.setOrientation(LinearLayout.VERTICAL);

        //Jan 4th
        if (current_time.compareTo("04:01 09:00:00") > 0 && current_time.compareTo("04:01 20:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Indian Student Forum ISF 2014 Day 1");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("9:00 am - 8:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Breakfast
        if (current_time.compareTo("04:01 07:30:00") > 0 && current_time.compareTo("04:01 08:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Breakfast");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("07:30 am - 08:00 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Transportation
        if (current_time.compareTo("04:01 08:00:00") > 0 && current_time.compareTo("04:01 08:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Trasnportation");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("8am - 8.30am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        if (current_time.compareTo("04:01 08:30:00") > 0 && current_time.compareTo("04:01 09:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Introduction");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("8.30am - 9.00am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Overall
        if (current_time.compareTo("04:01 09:00:00") > 0 && current_time.compareTo("04:01 10:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Overall Theme Exploration +\n" +
                    "Track Theme Exploration");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("9am - 10am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //KeyNote
        if (current_time.compareTo("04:01 10:00:00") > 0 && current_time.compareTo("04:01 11:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Keynote Speaker");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("10am - 11am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        // breaking
        if (current_time.compareTo("04:01 11:00:00") > 0 && current_time.compareTo("04:01 11:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Break");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("11 am - 11.30 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        // breaking
        if (current_time.compareTo("04:01 11:30:00") > 0 && current_time.compareTo("04:01 12:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Breaking into Track sessions");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("11.30 am - 12.00 noon");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //reviewing
        if (current_time.compareTo("04:01 12:00:00") > 0 && current_time.compareTo("04:01 13:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Review of Action Plans " +
                    "from the workshops");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("12.00 noon - 1.30pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Lunch
        if (current_time.compareTo("04:01 13:00:00") > 0 && current_time.compareTo("04:01 13:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Lunch");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("1pm - 1:30pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //brain storm
        if (current_time.compareTo("04:01 14:00:00") > 0 && current_time.compareTo("04:01 15:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Brainstorming Session");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("2pm - 3:30pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        // breaking
        if (current_time.compareTo("04:01 15:30:00") > 0 && current_time.compareTo("04:01 16:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Break");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("3.30 pm - 4 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Identify
        if (current_time.compareTo("04:01 16:00:00") > 0 && current_time.compareTo("04:01 17:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Identifying Resources for " +
                    "Action Plan Stage 2");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("4pm - 5:30pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Cultural Evening
        if (current_time.compareTo("04:01 18:30:00") > 0 && current_time.compareTo("04:01 20:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Cultural Program");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("6.30pm - 8:00pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Dinner
        if (current_time.compareTo("04:01 20:00:00") > 0 && current_time.compareTo("04:01 21:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Dinner");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("8pm - 9pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }
//End of Jan 4th


        //Day 1 Workshops
        //Jan 5th
        String s = "05:01 09:00:00";
        String g = "05:01 16:00:00";

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

//            View v3 = vi.inflate(R.layout.event_layout, null);
//            TextView title3 = (TextView) v3.findViewById(R.id.title);
//            title3.setText("Workshop by Dassault ");
//            TextView when3 = (TextView) v3.findViewById(R.id.when);
//            when3.setText("9am - 4pm");
//            TextView where3 = (TextView) v3.findViewById(R.id.where);
//            where3.setText("Mechanical Department");
//            main_layout.addView(v3);

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
            where9.setText("ISE Department");
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
        if (current_time.compareTo("05:01 07:30:00") > 0 && current_time.compareTo("05:01 08:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Breakfast");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("07:30 am - 08:00 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        ///
        //Transportation
        if (current_time.compareTo("05:01 08:00:00") > 0 && current_time.compareTo("05:01 08:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Trasnportation");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("8am - 8.30am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Community Service
        if (current_time.compareTo("05:01 08:30:00") > 0 && current_time.compareTo("05:01 10:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Community Service");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("8.30am - 10.30am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Transport
        if (current_time.compareTo("05:01 10:30:00") > 0 && current_time.compareTo("05:01 11:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Trasnportation");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("10.30 am -11.00 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //break
        if (current_time.compareTo("05:01 11:00:00") > 0 && current_time.compareTo("05:01 11:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Break");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("11.00 am - 11.30 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Proto
        if (current_time.compareTo("05:01 11:30:00") > 0 && current_time.compareTo("05:01 13:30:00") < 0) {
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
            when.setText("11.30 pm - 01.30 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

//Lunch
        if (current_time.compareTo("05:01 13:00:00") > 0 && current_time.compareTo("05:01 13:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Lunch");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("1.00 pm - 1:30 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Reviewing
        if (current_time.compareTo("05:01 14:00:00") > 0 && current_time.compareTo("05:01 15:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Reviewing of Information " +
                    "Gathered into the Tracks");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("2.00 pm - 3:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Refined
        if (current_time.compareTo("05:01 15:30:00") > 0 && current_time.compareTo("05:01 16:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Refined Brainstorming " +
                    "for Detailing");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("3.30 pm - 4:30 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        if (current_time.compareTo("05:01 16:30:00") > 0 && current_time.compareTo("05:01 17:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Break");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("4.30 pm - 5:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Criti
        if (current_time.compareTo("05:01 17:00:00") > 0 && current_time.compareTo("05:01 18:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Critique Stage");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("5.00 pm - 6:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Feedback
        if (current_time.compareTo("05:01 18:00:00") > 0 && current_time.compareTo("05:01 19:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Feedback Incorporation " +
                    "and Creation of " +
                    "Final Presentations");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("6.00 pm - 7:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Dinner
        if (current_time.compareTo("05:01 20:00:00") > 0 && current_time.compareTo("05:01 21:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Dinner");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("8.00 pm - 9:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Workshops Day 2
        //Jan 6
        String q = "06:01 09:00:00";
        String w = "06:01 16:00:00";

        if (current_time.compareTo(q) > 0 && current_time.compareTo(w) < 0) {
            event_going_on = true;

            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views


            View v94 = vi.inflate(R.layout.event_layout, null);
            TextView title94 = (TextView) v94.findViewById(R.id.title);
            title94.setText("Outcome Based Education ");
            TextView when94 = (TextView) v94.findViewById(R.id.when);
            when94.setText("9am - 4pm");
            TextView where94 = (TextView) v94.findViewById(R.id.where);
            where94.setText("BMS Auditorium");
            main_layout.addView(v94);

            View v95 = vi.inflate(R.layout.event_layout, null);
            TextView title95 = (TextView) v95.findViewById(R.id.title);
            title95.setText("Effective Teaching " +
                    "and Learning");
            TextView when95 = (TextView) v95.findViewById(R.id.when);
            when95.setText("9am - 4pm");
            TextView where95 = (TextView) v95.findViewById(R.id.where);
            where95.setText("Sir MV Hall");
            main_layout.addView(v95);

            View v96 = vi.inflate(R.layout.event_layout, null);
            TextView title96 = (TextView) v96.findViewById(R.id.title);
            title96.setText("Industry Academia " +
                    "Partnerships");
            TextView when96 = (TextView) v96.findViewById(R.id.when);
            when96.setText("9am - 4pm");
            TextView where96 = (TextView) v96.findViewById(R.id.where);
            where96.setText("Multi Purpose Hall");
            main_layout.addView(v96);

            View v97 = vi.inflate(R.layout.event_layout, null);
            TextView title97 = (TextView) v97.findViewById(R.id.title);
            title97.setTextSize(12);
            title97.setText("Integrating Innovative " +
                    "Entrepreneurship with " +
                    "Engineering Education");
            TextView when97 = (TextView) v97.findViewById(R.id.when);
            when97.setText("9am - 4pm");
            TextView where97 = (TextView) v97.findViewById(R.id.where);
            where97.setText("FD Center (MCA)");
            main_layout.addView(v97);

            View v98 = vi.inflate(R.layout.event_layout, null);
            TextView title98 = (TextView) v98.findViewById(R.id.title);
            title98.setTextSize(12);
            title98.setText("Engineering Education for " +
                    "Sustainable " +
                    "Development");
            TextView when98 = (TextView) v98.findViewById(R.id.when);
            when98.setText("9am - 4pm");
            TextView where98 = (TextView) v98.findViewById(R.id.where);
            where98.setText("BSN Hall (PG Block)");
            main_layout.addView(v98);

            View v99 = vi.inflate(R.layout.event_layout, null);
            TextView title99 = (TextView) v99.findViewById(R.id.title);
            title99.setTextSize(12);
            title99.setText("ICTIEE 2015 Conference Registration");
            TextView when99 = (TextView) v99.findViewById(R.id.when);
            when99.setText("9am - 4pm");
            TextView where99 = (TextView) v99.findViewById(R.id.where);
            where99.setText("");
            main_layout.addView(v99);


            View v991 = vi.inflate(R.layout.event_layout, null);
            TextView title991 = (TextView) v991.findViewById(R.id.title);
            title991.setTextSize(12);
            title991.setText("Indian Student Forum ISF 2014 Day 3");
            TextView when991 = (TextView) v991.findViewById(R.id.when);
            when991.setText("9am - 4pm");
            TextView where991 = (TextView) v991.findViewById(R.id.where);
            where991.setText("");
            main_layout.addView(v991);
        }
        //End of Workshops Day 2

        //Prob based learning
        if (current_time.compareTo("06:01 13:00:00") > 0 && current_time.compareTo("06:01 16:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View v93 = vi.inflate(R.layout.event_layout, null);
            TextView title93 = (TextView) v93.findViewById(R.id.title);
            title93.setText("Problem Based Learning ");
            TextView when93 = (TextView) v93.findViewById(R.id.when);
            when93.setText("1pm - 4pm");
            TextView where93 = (TextView) v93.findViewById(R.id.where);
            where93.setText("ME Seminar Hall");
            main_layout.addView(v93);
        }

        //Arrtibutes
        if (current_time.compareTo("06:01 09:00:00") > 0 && current_time.compareTo("06:01 12:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View v90 = vi.inflate(R.layout.event_layout, null);
            TextView title90 = (TextView) v90.findViewById(R.id.title);
            title90.setText("Attributes Of Global Engineering");
            TextView when90 = (TextView) v90.findViewById(R.id.when);
            when90.setText("9am - 12 noon");
            TextView where90 = (TextView) v90.findViewById(R.id.where);
            where90.setText("Board Room");
            main_layout.addView(v90);
        }

        //Governance
        if (current_time.compareTo("06:01 13:00:00") > 0 && current_time.compareTo("06:01 16:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View v91 = vi.inflate(R.layout.event_layout, null);
            TextView title91 = (TextView) v91.findViewById(R.id.title);
            title91.setText("Governance and " +
                    "Leadership");
            TextView when91 = (TextView) v91.findViewById(R.id.when);
            when91.setText("1pm - 4pm");
            TextView where91 = (TextView) v91.findViewById(R.id.where);
            where91.setText("Board Room");
            main_layout.addView(v91);
        }


        //

        if (current_time.compareTo("06:01 09:00:00") > 0 && current_time.compareTo("06:01 12:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v92 = vi.inflate(R.layout.event_layout, null);
            TextView title92 = (TextView) v92.findViewById(R.id.title);
            title92.setText("Engineering Projects in Community Service ");
            TextView when92 = (TextView) v92.findViewById(R.id.when);
            when92.setText("9am - 12 noon");
            TextView where92 = (TextView) v92.findViewById(R.id.where);
            where92.setText("ME Seminar Hall");
            main_layout.addView(v92);

        }
        //Adding Day 2 Events

        //High Tea
        if (current_time.compareTo("06:01 15:00:00") > 0 && current_time.compareTo("06:01 17:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Focus on Exhibits (High Tea)");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("3pm - 5pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Conf Inaug
        if (current_time.compareTo("06:01 17:00:00") > 0 && current_time.compareTo("06:01 18:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Conference Inaugural Ceremony");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("5pm - 6pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //KeyNote Address
        if (current_time.compareTo("06:01 18:00:00") > 0 && current_time.compareTo("06:01 18:45:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Key Note Addresses");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("6pm - 6.45pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        if (current_time.compareTo("06:01 17:00:00") > 0 && current_time.compareTo("06:01 20:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("ICTIEE Opening Session");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("5 pm - 8 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        if (current_time.compareTo("06:01 13:00:00") > 0 && current_time.compareTo("06:01 13:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Lunch");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("1 pm - 1.30 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        if (current_time.compareTo("06:01 09:30:00") > 0 && current_time.compareTo("06:01 11:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Presentation and Election " +
                    "of Action Plan Winners for Each Track");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("9.30 am - 11.00 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        if (current_time.compareTo("06:01 11:30:00") > 0 && current_time.compareTo("06:01 13:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Presentation and Election " +
                    "of Best Action Plan " +
                    "Overall Winner");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("11.30 am - 1.30 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        if (current_time.compareTo("06:01 14:00:00") > 0 && current_time.compareTo("06:01 15:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Poster Session");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("2.00 am - 3.30 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Student valedictory
        if (current_time.compareTo("06:01 18:45:00") > 0 && current_time.compareTo("06:01 19:15:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Student Forum Valedictory");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("06.45 pm - 07.15 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Cultural Program
        if (current_time.compareTo("06:01 19:15:00") > 0 && current_time.compareTo("06:01 20:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Cultural Program");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("7:15 pm - 8:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Dinner
        if (current_time.compareTo("06:01 20:00:00") > 0 && current_time.compareTo("06:01 21:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Conference Welcoming Dinner");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("8 pm to 9 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //jan 7th
        //paper pres
        if (current_time.compareTo("07:01 09:00:00") > 0 && current_time.compareTo("07:01 10:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Paper Presentations in 9 Parallel Tracks");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("9am - 10am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //plenary session
        if (current_time.compareTo("07:01 10:45:00:00") > 0 && current_time.compareTo("07:01 12:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Plenary Session 1 \n" +
                    "Teaching and Learning I");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("10:45 am - 12:00 noon");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //plenary session
        if (current_time.compareTo("07:01 12:00:00:00") > 0 && current_time.compareTo("07:01 13:15:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Plenary Session 2 \n" +
                    "Outcomes Based Education");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("12:00 noon - 1:15 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //Lunch
        if (current_time.compareTo("07:01 13:15:00:00") > 0 && current_time.compareTo("07:01 14:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Lunch");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("1:15 noon - 2:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //plen 3
        if (current_time.compareTo("07:01 14:00:00:00") > 0 && current_time.compareTo("07:01 15:15:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Plenary Session 3 \n" +
                    "Industry Academy Partnerships");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("2:00 pm - 3:15 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //plen 3
        if (current_time.compareTo("07:01 15:15:00:00") > 0 && current_time.compareTo("07:01 16:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Plenary Session 4\n" +
                    "Innovation, Entrepreneurship and Sustainability");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("3:15 pm - 4:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //paper pres
        if (current_time.compareTo("07:01 16:15:00:00") > 0 && current_time.compareTo("07:01 17:45:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Paper Presentations in 9 Parallel Tracks");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("4:15 pm to 5:45 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        if (current_time.compareTo("07:01 17:45:00:00") > 0 && current_time.compareTo("07:01 18:45:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Poster Presentation Session 1");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("5:45 pm - 6:45 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Day 4
        //Jan 8
        if (current_time.compareTo("08:01 09:00:00") > 0 && current_time.compareTo("08:01 10:30:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Paper Presentations in 9 Parallel Tracks");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("9:00 am - 10:30 am");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }


        //plenary session5
        if (current_time.compareTo("08:01 10:45:00:00") > 0 && current_time.compareTo("08:01 12:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Plenary Session 5 \n" +
                    "Teaching and Learning II");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("10:45 am - 12:00 noon");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //p6
        //plenary session
        if (current_time.compareTo("08:01 12:00:00:00") > 0 && current_time.compareTo("08:01 13:15:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Plenary Session 6 \n" +
                    "Governance and Leadership");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("12:00 noon - 1:15 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Lunch
        if (current_time.compareTo("08:01 13:15:00:00") > 0 && current_time.compareTo("08:01 14:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Lunch");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("1:15 - 2:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //plen 7
        if (current_time.compareTo("08:01 14:00:00:00") > 0 && current_time.compareTo("08:01 15:15:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Plenary Session 7\n" +
                    "Attributes of a Global Engineer");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("2:00 pm - 3:15 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //plen 8
        if (current_time.compareTo("08:01 15:15:00:00") > 0 && current_time.compareTo("08:01 16:00:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Plenary Session 8 \n" +
                    "IUCEE Ecosystem for Engineering Education");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("3:15 pm - 4:00 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //poster
        if (current_time.compareTo("08:01 16:15:00:00") > 0 && current_time.compareTo("08:01 17:15:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Poster Presentations Session 2");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("4:15 pm - 5:15 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //key note address
        if (current_time.compareTo("08:01 17:15:00:00") > 0 && current_time.compareTo("08:01 17:45:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Key Note Addresses");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("5:15 pm - 5:45 pm");
            TextView where = (TextView) v1.findViewById(R.id.where);
            where.setText("");
            main_layout.addView(v1);
        }

        //Valedictory Function
        if (current_time.compareTo("08:01 17:45:00:00") > 0 && current_time.compareTo("08:01 18:15:00") < 0) {
            event_going_on = true;

            //
            LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Adding Views

            View v1 = vi.inflate(R.layout.event_layout, null);
            TextView title = (TextView) v1.findViewById(R.id.title);
            title.setText("Valedictory Ceremony");
            TextView when = (TextView) v1.findViewById(R.id.when);
            when.setText("5:45 pm - 6:15 pm");
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
                finish();
                startActivity(home);
                return true;
            case R.id.phone:
                Intent phone = new Intent(getApplicationContext(), ContactUs.class);
                finish();
                startActivity(phone);
                return true;
            case R.id.now:
                return true;
            case R.id.sch:
                Intent sch = new Intent(getApplicationContext(), Schedule.class);
                finish();
                startActivity(sch);
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