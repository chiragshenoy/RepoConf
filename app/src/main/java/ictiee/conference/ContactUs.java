package ictiee.conference;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by Chirag on 07-11-2014.
 */
public class ContactUs extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);

        Toolbar toolbar = (Toolbar) findViewById(R.id.c9_toolbar); //Appcompat support for a sexier action bar
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
        mTitle.setText("Contact Us");
        setSupportActionBar(toolbar);

        LinearLayout main_layout = (LinearLayout) findViewById(R.id.contact_ll);
        main_layout.setOrientation(LinearLayout.VERTICAL);

        Button mailus = (Button) findViewById(R.id.mailus);
        mailus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "ictiee2015@bmsce.ac.in", null));
                startActivity(Intent.createChooser(emailIntent, "Send email..."));

            }
        });

        Button reachus = (Button) findViewById(R.id.reachus);
        reachus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 12.9421, 77.5658);
                try {
                    // check if Google Maps is supported on given device
                    String uri = String.format(Locale.ENGLISH, "geo:0,0?q=bmsce bangalore");
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(getApplicationContext(), "Google Maps is not installed.", Toast.LENGTH_SHORT);
                }

            }
        });

        //adding views
        LayoutInflater vi = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Adding Views

        View v0 = vi.inflate(R.layout.contact_layout, null);
        TextView title0 = (TextView) v0.findViewById(R.id.title);
        title0.setText("Prinicpal and Vice Principal");
        TextView when0 = (TextView) v0.findViewById(R.id.when);
        when0.setText("Dr.Mallikharjun Babu\n9886021095");
        when0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9886021095"));
                startActivity(callIntent);
            }
        });


        TextView where0 = (TextView)v0.findViewById(R.id.where);
        where0.setText("Dr.G N Sekar");
        main_layout.addView(v0);


        View v1 = vi.inflate(R.layout.contact_layout, null);
        TextView title = (TextView) v1.findViewById(R.id.title);
        title.setText("Website Updates");
        TextView when = (TextView) v1.findViewById(R.id.when);
        when.setText("Ajay Kumar D, IT\n89512 38944 d.ajay402@gmail.com");
        when.setTextSize(12);

        when.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:8951238944"));
                startActivity(callIntent);
            }
        });
        TextView where = (TextView) v1.findViewById(R.id.where);

        where.setTextSize(12);
        where.setText("Dr Umadevi V, CSE\n87627 42909 umadevi.cse@bmsce.ac.in");
        where.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:8762742909"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v1);


        View v2 = vi.inflate(R.layout.contact_layout, null);
        TextView title2 = (TextView) v2.findViewById(R.id.title);
        title2.setText("Sponsors & Exhibitors ");
        TextView when2 = (TextView) v2.findViewById(R.id.when);
        when2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9880253599"));
                startActivity(callIntent);
            }
        });

        when2.setText("Uma, MCA\n98802 53599 uma.mca@bmsce.ac.in");
        when2.setTextSize(12);

        TextView where2 = (TextView) v2.findViewById(R.id.where);
        where2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9480091278"));
                startActivity(callIntent);
            }
        });
        where2.setTextSize(12);
        where2.setText("Smitha V Shenoy, MBA\n94800 91278 smithavshenoy@gmail.com");
        main_layout.addView(v2);

        View v3 = vi.inflate(R.layout.contact_layout, null);
        TextView title3 = (TextView) v3.findViewById(R.id.title);
        title3.setText("January 5 Workshops ");
        TextView when3 = (TextView) v3.findViewById(R.id.when);
        when3.setText("Vanisree, EEE\n94805 90416");
        when3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9480590416"));
                startActivity(callIntent);
            }
        });


        TextView where3 = (TextView) v3.findViewById(R.id.where);
        where3.setTextSize(11);
        where3.setText("Dr Rajeshwari Hegde,TCE\n90083 55922 workshops.ictiee@bmsce.ac.in");
        where3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9008355922"));
                startActivity(callIntent);
            }
        });

        main_layout.addView(v3);

        View v4 = vi.inflate(R.layout.contact_layout, null);
        TextView title4 = (TextView) v4.findViewById(R.id.title);
        title4.setText("January 6 Workshops");
        TextView when4 = (TextView) v4.findViewById(R.id.when);
        when4.setText("Nethravathi, EEE\n96321 49366");
        when4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9632149366"));
                startActivity(callIntent);
            }
        });

        TextView where4 = (TextView) v4.findViewById(R.id.where);
        where4.setTextSize(11);
        where4.setText("P S Gowra,TCE\n98801 56601 workshops.ictiee@bmsce.ac.in");
        where4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9880156601"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v4);

        View v5 = vi.inflate(R.layout.contact_layout, null);
        TextView title5 = (TextView) v5.findViewById(R.id.title);
        title5.setText("Registration");
        TextView when5 = (TextView) v5.findViewById(R.id.when);
        when5.setTextSize(10);

        when5.setText("Pankaj Choudary\n99724 44422 registration.ictiee@bmsce.ac.in");
        when5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9972444422"));
                startActivity(callIntent);
            }
        });
        TextView where5 = (TextView) v5.findViewById(R.id.where);
        where5.setTextSize(10);

        where5.setText("Kiran Madesh\n73531 42343 registration.ictiee@bmsce.ac.in");
        where5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7353142343"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v5);


        View v6 = vi.inflate(R.layout.contact_layout, null);
        TextView title6 = (TextView) v6.findViewById(R.id.title);
        title6.setText("Certificates");
        TextView when6 = (TextView) v6.findViewById(R.id.when);
        when6.setTextSize(12);

        when6.setText("C Gururaj, TCE\n99860 69831 gururaj.tce@bmsce.ac.in");
        when6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9986069831"));
                startActivity(callIntent);
            }
        });
        TextView where6 = (TextView) v6.findViewById(R.id.where);
        where6.setTextSize(12);
        where6.setText("Prasanna Kumar, TCE\n72597 93487 prasannamk.tce@bmsce.ac.in");
        where6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7259793487"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v6);


        View v8 = vi.inflate(R.layout.contact_layout, null);
        TextView title8 = (TextView) v8.findViewById(R.id.title);
        title8.setText("International Travel");
        TextView when8 = (TextView) v8.findViewById(R.id.when);
        when8.setTextSize(12);

        when8.setText("Manjunath P S\n98801 87656 manjunathps.tce@bmsce.ac.in");
        when8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9880187656"));
                startActivity(callIntent);
            }
        });
        TextView where8 = (TextView) v8.findViewById(R.id.where);
        where8.setTextSize(12);

        where8.setText("Kantha Reddy\n98665 77393 kanthareddy_m@yahoo.com");
        where8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9866577393"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v8);


        View v10 = vi.inflate(R.layout.contact_layout, null);
        TextView title10 = (TextView) v10.findViewById(R.id.title);
        title10.setText("Hospitality ");
        TextView when10 = (TextView) v10.findViewById(R.id.when);
        when10.setTextSize(11);
        when10.setText("Shambavi, ISE\n98867 84959 shambhavibr.ise@bmsce.ac.in");
        when10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9886784959"));
                startActivity(callIntent);
            }
        });
        TextView where10 = (TextView) v10.findViewById(R.id.where);
        where10.setTextSize(10);
        where10.setText("Shubha Muralidhar, MBA\n98459 42067 shubhamuralidhar.mba@bmsce.ac.in");
        where10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845942067"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v10);

        View v11 = vi.inflate(R.layout.contact_layout, null);
        TextView title11 = (TextView) v11.findViewById(R.id.title);
        title11.setText("Student Forum ");
        TextView when11 = (TextView) v11.findViewById(R.id.when);
        when11.setTextSize(8);
        when11.setText("Lalitha S, ECE\n98862 52648 bmsce_speed@bmsce.ac.in lalithas.ece@bmsce.ac.in");
        when11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9886252648"));
                startActivity(callIntent);
            }
        });
        TextView where11 = (TextView) v11.findViewById(R.id.where);
        where11.setTextSize(12);

        where11.setText("Surendra H H\n94498 59023 bmsce_speed@bmsce.ac.in");
        where11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9449859023"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v11);

        View v12 = vi.inflate(R.layout.contact_layout, null);
        TextView title12 = (TextView) v12.findViewById(R.id.title);
        title12.setText("Conference Proceedings, Conference Souvenir");
        TextView when12 = (TextView) v12.findViewById(R.id.when);
        when12.setTextSize(10);
        when12.setText("Dr Samita Maitra, Chemical\n" +
                "Dr H R Bhagyalakshmi, ECE");
        TextView where12 = (TextView) v12.findViewById(R.id.where);
        where12.setTextSize(10);
        where12.setText("Dr Chetan Nayak, Chemical\n" +
                "Dr Murugendrappa, Physics\n" +
                "Dr Meena P, EEE\n" +
                "Dr B Kanmani, TCE");
        main_layout.addView(v12);

        View v13 = vi.inflate(R.layout.contact_layout, null);
        TextView title13 = (TextView) v13.findViewById(R.id.title);
        title13.setText("Main Stage, Exhibit Stalls");
        TextView when13 = (TextView) v13.findViewById(R.id.when);
        when13.setText("Skyline Manjunath\n9980075575");
        when13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9980075575"));
                startActivity(callIntent);
            }
        });
        TextView where13 = (TextView) v13.findViewById(R.id.where);
        where13.setTextSize(12);

        where13.setText("Surendra H H\n94498 59023 bmsce_speed@bmsce.ac.in");
        where13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9449859023"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v13);

        View v14 = vi.inflate(R.layout.contact_layout, null);
        TextView title14 = (TextView) v14.findViewById(R.id.title);
        title14.setText("Audio video equipment");
        TextView when14 = (TextView) v14.findViewById(R.id.when);
        when14.setText("Mr Anil Venkatesh\n95357 11123");
        when14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9535711123"));
                startActivity(callIntent);
            }
        });
        TextView where14 = (TextView) v14.findViewById(R.id.where);
        main_layout.addView(v14);

        View v15 = vi.inflate(R.layout.contact_layout, null);
        TextView title15 = (TextView) v15.findViewById(R.id.title);
        title15.setText("Internet Connectivity");
        TextView when15 = (TextView) v15.findViewById(R.id.when);
        when15.setText("Mr Bhaktavatsala\n98804 32288");
        when15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9880432288"));
                startActivity(callIntent);
            }
        });
        TextView where15 = (TextView) v15.findViewById(R.id.where);
        main_layout.addView(v15);

        View v16 = vi.inflate(R.layout.contact_layout, null);
        TextView title16 = (TextView) v16.findViewById(R.id.title);
        title16.setText("Medical Assistance");
        TextView when16 = (TextView) v16.findViewById(R.id.when);
        when16.setText("Beena Ullala Mat B N, ML\n94489 72072 bnb.ml@bmsce.ac.in");
        when16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9448972072"));
                startActivity(callIntent);
            }
        });
        TextView where16 = (TextView) v16.findViewById(R.id.where);
        where16.setText("Dr.Keshav Prasad\n9448504122");
        where16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9448504122"));
                startActivity(callIntent);
            }
        });

        main_layout.addView(v16);

        View v9 = vi.inflate(R.layout.contact_layout, null);
        TextView title9 = (TextView) v9.findViewById(R.id.title);
        title9.setText("Accommodation, Transport");
        TextView when9 = (TextView) v9.findViewById(R.id.when);
        when9.setText("Ganesh Kumar, MBA\n95919 88151 kumarganesh1986@gmail.com");
        when9.setTextSize(11);


        when9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9591988151"));
                startActivity(callIntent);
            }
        });
        TextView where9 = (TextView) v9.findViewById(R.id.where);
        main_layout.addView(v9);


        View v7 = vi.inflate(R.layout.contact_layout, null);
        TextView title7 = (TextView) v7.findViewById(R.id.title);
        title7.setText("Configuring the Paper Submission Tool (CMT)");
        TextView when7 = (TextView) v7.findViewById(R.id.when);
        when7.setTextSize(12);

        when7.setText("Dr B Kanmani, TCE\n94483 75397 bkanmani.tce@bmsce.ac.in");
        when7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9448375397"));
                startActivity(callIntent);
            }
        });
        TextView where7 = (TextView) v7.findViewById(R.id.where);
        main_layout.addView(v7);
        //

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

            case R.id.workshop:
                Intent wrk = new Intent(getApplicationContext(), WorkshopsNew.class);
                finish();
                startActivity(wrk);
                return true;
        }
        return true;
    }
}
