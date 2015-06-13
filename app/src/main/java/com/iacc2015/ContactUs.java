package com.iacc2015;

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

//        Toolbar toolbar = (Toolbar) findViewById(R.id.c9_toolbar); //Appcompat support for a sexier action bar
//        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);
//        setTitle("Contact Us");
////        mTitle.setText("Contact Us");
//        setSupportActionBar(toolbar);

        LinearLayout main_layout = (LinearLayout) findViewById(R.id.contact_ll);
        main_layout.setOrientation(LinearLayout.VERTICAL);

        Button mailus = (Button) findViewById(R.id.mailus);
        mailus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "rkr.ise@bmsce.ac.in", null));
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


        TextView where0 = (TextView) v0.findViewById(R.id.where);
        where0.setText("Dr.G N Sekhar\n9845184215");
        where0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845184215"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v0);

// General chair
        View v15 = vi.inflate(R.layout.single_layout, null);
        TextView title15 = (TextView) v15.findViewById(R.id.title);
        title15.setText("General Chair,IACC 2015");
        TextView when15 = (TextView) v15.findViewById(R.id.when);
        when15.setText("Dr.Radhika K.R\n98453 87862");
        when15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845387862"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v15);
//

        View v22 = vi.inflate(R.layout.single_layout, null);
        TextView title22 = (TextView) v22.findViewById(R.id.title);
        title22.setText("Steering Chair,IACC 2015");
        TextView when22 = (TextView) v22.findViewById(R.id.when);
        when22.setText("Dr.Gowri Shankar\n9845376068");
        when22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845376068"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v22);


        View v221 = vi.inflate(R.layout.single_layout, null);
        TextView title221 = (TextView) v221.findViewById(R.id.title);
        title221.setText("IEEE Indexing,IACC 2015");
        TextView when221 = (TextView) v221.findViewById(R.id.when);
        when221.setText("Dr.D.N.Sujatha\n9880333446");
        when221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9880333446"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v221);


        View v2211 = vi.inflate(R.layout.single_layout, null);
        TextView title2211 = (TextView) v2211.findViewById(R.id.title);
        title2211.setText("Banquet Dinner");
        TextView when2211 = (TextView) v2211.findViewById(R.id.when);
        when2211.setText("Dr.H.S Guruprasad\n9845516780");
        when2211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845516780"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v2211);

        View v22112 = vi.inflate(R.layout.single_layout, null);
        TextView title22112 = (TextView) v22112.findViewById(R.id.title);
        title22112.setText("Technical Sessions");
        TextView when22112 = (TextView) v22112.findViewById(R.id.when);
        when22112.setText("Dr.M.Indiramma\n9663376002");
        when22112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9663376002"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v22112);

        View v221121 = vi.inflate(R.layout.single_layout, null);
        TextView title221121 = (TextView) v221121.findViewById(R.id.title);
        title221121.setText("Oral Presentation");
        TextView when221121 = (TextView) v221121.findViewById(R.id.when);
        when221121.setText("Dr.V.Umadevi\n8672742909");
        when221121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:8672742909"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v221121);

        View v2211212 = vi.inflate(R.layout.single_layout, null);
        TextView title2211212 = (TextView) v2211212.findViewById(R.id.title);
        title2211212.setText("Payment Receipts");
        TextView when2211212 = (TextView) v2211212.findViewById(R.id.when);
        when2211212.setText("Dr.Vijayakumar\n9535927746");
        when2211212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9535927746"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v2211212);

        View v22112121 = vi.inflate(R.layout.single_layout, null);
        TextView title22112121 = (TextView) v22112121.findViewById(R.id.title);
        title22112121.setText("IEEE Membership and Copyright Forms");
        TextView when22112121 = (TextView) v22112121.findViewById(R.id.when);
        when22112121.setText("Dr.G.R.Prasad\n9880380880");
        when22112121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9880380880"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v22112121);

        View v221121213 = vi.inflate(R.layout.single_layout, null);
        TextView title221121213 = (TextView) v221121213.findViewById(R.id.title);
        title221121213.setText("Registration");
        TextView when221121213 = (TextView) v221121213.findViewById(R.id.when);
        when221121213.setText("Dr.Sheela S.V\n9845308630");
        when221121213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845308630"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v221121213);


        View v2211212134 = vi.inflate(R.layout.single_layout, null);
        TextView title2211212134 = (TextView) v2211212134.findViewById(R.id.title);
        title2211212134.setText("PhD Colloquium");
        TextView when2211212134 = (TextView) v2211212134.findViewById(R.id.when);
        when2211212134.setText("Dr.R.Ashok Kumar\n9845281049");
        when2211212134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845281049"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v2211212134);

        View v22112121345 = vi.inflate(R.layout.single_layout, null);
        TextView title22112121345 = (TextView) v22112121345.findViewById(R.id.title);
        title22112121345.setText("Food");
        TextView when22112121345 = (TextView) v22112121345.findViewById(R.id.when);
        when22112121345.setText("Mr.K.Girish\n9845113317");
        when22112121345.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845113317"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v22112121345);

        View v221121213456 = vi.inflate(R.layout.single_layout, null);
        TextView title221121213456 = (TextView) v221121213456.findViewById(R.id.title);
        title221121213456.setText("Stalls");
        TextView when221121213456 = (TextView) v221121213456.findViewById(R.id.when);
        when221121213456.setText("Dr.P.Jayarekha\n9945459118");
        when221121213456.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9945459118"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v221121213456);

        View v2211212134567 = vi.inflate(R.layout.single_layout, null);
        TextView title2211212134567 = (TextView) v2211212134567.findViewById(R.id.title);
        title2211212134567.setText("UG Workshop:Entrepreneurship and Innovation");
        TextView when2211212134567 = (TextView) v2211212134567.findViewById(R.id.when);
        when2211212134567.setText("Ms.Sreelatha R\n9986177188");
        when2211212134567.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9986177188"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v2211212134567);

        View v22112121345678 = vi.inflate(R.layout.single_layout, null);
        TextView title22112121345678 = (TextView) v22112121345678.findViewById(R.id.title);
        title22112121345678.setText("UG Workshop:Current Trends in Industry ");
        TextView when22112121345678 = (TextView) v22112121345678.findViewById(R.id.when);
        when22112121345678.setText("Ms.Rajeshwari K\n9738475582");
        when22112121345678.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9738475582"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v22112121345678);


        View v221121213456780 = vi.inflate(R.layout.single_layout, null);
        TextView title221121213456780 = (TextView) v221121213456780.findViewById(R.id.title);
        title221121213456780.setText("Event Management");
        TextView when221121213456780 = (TextView) v221121213456780.findViewById(R.id.when);
        when221121213456780.setText("Ms.Indra\n9060886088");
        when221121213456780.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9060886088"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v221121213456780);

        View v2211212134567801 = vi.inflate(R.layout.single_layout, null);
        TextView title2211212134567801 = (TextView) v2211212134567801.findViewById(R.id.title);
        title2211212134567801.setText("Certificates");
        TextView when2211212134567801 = (TextView) v2211212134567801.findViewById(R.id.when);
        when2211212134567801.setText("Ms.Antara\n9538433364");
        when2211212134567801.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9538433364"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v2211212134567801);

        View v22112121345678012 = vi.inflate(R.layout.single_layout, null);
        TextView title22112121345678012 = (TextView) v22112121345678012.findViewById(R.id.title);
        title22112121345678012.setText("Poster Presentation");
        TextView when22112121345678012 = (TextView) v22112121345678012.findViewById(R.id.when);
        when22112121345678012.setText("Ms.Nagarathna N\n7795027134");
        when22112121345678012.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7795027134"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v22112121345678012);


        View v221121213456780123 = vi.inflate(R.layout.single_layout, null);
        TextView title221121213456780123 = (TextView) v221121213456780123.findViewById(R.id.title);
        title221121213456780123.setText("Travel");
        TextView when221121213456780123 = (TextView) v221121213456780123.findViewById(R.id.when);
        when221121213456780123.setText("Ms.Chandrakala G Raju\n9972277066");
        when221121213456780123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9972277066"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v221121213456780123);


        //Accomodation

        View v1 = vi.inflate(R.layout.contact_layout, null);
        TextView title = (TextView) v1.findViewById(R.id.title);
        title.setText("Accomodation Details");
        TextView when = (TextView) v1.findViewById(R.id.when);
        when.setText("Prof.P.Lakshminarayana\n98455 39771");
        when.setTextSize(12);

        when.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9845539771"));
                startActivity(callIntent);
            }
        });
        TextView where = (TextView) v1.findViewById(R.id.where);

        where.setTextSize(12);
        where.setText("Prof. Raghavendra Rao\n99800 16705");
        where.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9980016705"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v1);


        View v2 = vi.inflate(R.layout.contact_layout, null);
        TextView title2 = (TextView) v2.findViewById(R.id.title);
        title2.setText("Accomodation Details ");
        TextView when2 = (TextView) v2.findViewById(R.id.when);
        when2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9886312796"));
                startActivity(callIntent);
            }
        });

        when2.setText("Prof. Ambika D.R\n98863 12796");
        when2.setTextSize(12);

        TextView where2 = (TextView) v2.findViewById(R.id.where);
        where2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9901465709"));
                startActivity(callIntent);
            }
        });
        where2.setTextSize(12);
        where2.setText("Mr. P. Suresh\n99014 65709");

        main_layout.addView(v2);

        //Doctor
        View v11 = vi.inflate(R.layout.single_layout, null);
        TextView title11 = (TextView) v11.findViewById(R.id.title);
        title11.setText("Medical Assistance");
        TextView when11 = (TextView) v11.findViewById(R.id.when);
        when11.setTextColor(0xffff0000);
        when11.setText("Dr.Keshav Prasad\n94485 04122");
        when11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9448504122"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v11);
        //End Doc

        View v113 = vi.inflate(R.layout.single_layout, null);
        TextView title113 = (TextView) v113.findViewById(R.id.title);
        title113.setText("Hospital");
        TextView when113 = (TextView) v113.findViewById(R.id.when);
        when113.setTextColor(0xffff0000);
        when113.setText("B.S Narayan Memorial Hospital\n08026613993");
        when113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:08026613993"));
                startActivity(callIntent);
            }
        });
        main_layout.addView(v113);


        View v3 = vi.inflate(R.layout.contact_layout, null);
        TextView title3 = (TextView) v3.findViewById(R.id.title);
        title3.setText("General Enquiries");
        TextView when3 = (TextView) v3.findViewById(R.id.when);
        when3.setText("Ms.Harshitha\n9620963633");
        when3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9620963633"));
                startActivity(callIntent);
            }
        });


        TextView where3 = (TextView) v3.findViewById(R.id.where);
        where3.setTextSize(11);
        where3.setText("Ms.Rekha\n9731974095");
        where3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9731974095"));
                startActivity(callIntent);
            }
        });

        main_layout.addView(v3);


//        View v3 = vi.inflate(R.layout.contact_layout, null);
//        TextView title3 = (TextView) v3.findViewById(R.id.title);
//        title3.setText("January 5 Workshops ");
//        TextView when3 = (TextView) v3.findViewById(R.id.when);
//        when3.setText("Vanisree, EEE\n94805 90416");
//        when3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9480590416"));
//                startActivity(callIntent);
//            }
//        });
//
//
//        TextView where3 = (TextView) v3.findViewById(R.id.where);
//        where3.setTextSize(11);
//        where3.setText("Dr Rajeshwari Hegde,TCE\n90083 55922 workshops.ictiee@bmsce.ac.in");
//        where3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9008355922"));
//                startActivity(callIntent);
//            }
//        });
//
//        main_layout.addView(v3);
//
//        View v4 = vi.inflate(R.layout.contact_layout, null);
//        TextView title4 = (TextView) v4.findViewById(R.id.title);
//        title4.setText("January 6 Workshops");
//        TextView when4 = (TextView) v4.findViewById(R.id.when);
//        when4.setText("Nethravathi, EEE\n96321 49366");
//        when4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9632149366"));
//                startActivity(callIntent);
//            }
//        });
//
//        TextView where4 = (TextView) v4.findViewById(R.id.where);
//        where4.setTextSize(11);
//        where4.setText("P S Gowra,TCE\n98801 56601 workshops.ictiee@bmsce.ac.in");
//        where4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9880156601"));
//                startActivity(callIntent);
//            }
//        });
//        main_layout.addView(v4);
//
//        View v5 = vi.inflate(R.layout.contact_layout, null);
//        TextView title5 = (TextView) v5.findViewById(R.id.title);
//        title5.setText("Registration");
//        TextView when5 = (TextView) v5.findViewById(R.id.when);
//        when5.setTextSize(10);
//
//        when5.setText("Pankaj Choudary\n99724 44422 registration.ictiee@bmsce.ac.in");
//        when5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9972444422"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where5 = (TextView) v5.findViewById(R.id.where);
//        where5.setTextSize(10);
//
//        where5.setText("Kiran Madesh\n73531 42343 registration.ictiee@bmsce.ac.in");
//        where5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:7353142343"));
//                startActivity(callIntent);
//            }
//        });
//        main_layout.addView(v5);
//
//
//        View v6 = vi.inflate(R.layout.contact_layout, null);
//        TextView title6 = (TextView) v6.findViewById(R.id.title);
//        title6.setText("Certificates");
//        TextView when6 = (TextView) v6.findViewById(R.id.when);
//        when6.setTextSize(12);
//
//        when6.setText("C Gururaj, TCE\n99860 69831 gururaj.tce@bmsce.ac.in");
//        when6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9986069831"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where6 = (TextView) v6.findViewById(R.id.where);
//        where6.setTextSize(12);
//        where6.setText("Prasanna Kumar, TCE\n72597 93487 prasannamk.tce@bmsce.ac.in");
//        where6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:7259793487"));
//                startActivity(callIntent);
//            }
//        });
//        main_layout.addView(v6);
//
//
//        View v8 = vi.inflate(R.layout.contact_layout, null);
//        TextView title8 = (TextView) v8.findViewById(R.id.title);
//        title8.setText("International Travel");
//        TextView when8 = (TextView) v8.findViewById(R.id.when);
//        when8.setTextSize(12);
//
//        when8.setText("Manjunath P S\n98801 87656 manjunathps.tce@bmsce.ac.in");
//        when8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9880187656"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where8 = (TextView) v8.findViewById(R.id.where);
//        where8.setTextSize(12);
//
//        where8.setText("Kantha Reddy\n98665 77393 kanthareddy_m@yahoo.com");
//        where8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9866577393"));
//                startActivity(callIntent);
//            }
//        });
//        main_layout.addView(v8);
//
//
//        View v10 = vi.inflate(R.layout.contact_layout, null);
//        TextView title10 = (TextView) v10.findViewById(R.id.title);
//        title10.setText("Hospitality ");
//        TextView when10 = (TextView) v10.findViewById(R.id.when);
//        when10.setTextSize(11);
//        when10.setText("Shambavi, ISE\n98867 84959 shambhavibr.ise@bmsce.ac.in");
//        when10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9886784959"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where10 = (TextView) v10.findViewById(R.id.where);
//        where10.setTextSize(10);
//        where10.setText("Shubha Muralidhar, MBA\n98459 42067 shubhamuralidhar.mba@bmsce.ac.in");
//        where10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9845942067"));
//                startActivity(callIntent);
//            }
//        });
//        main_layout.addView(v10);
//
//        View v11 = vi.inflate(R.layout.contact_layout, null);
//        TextView title11 = (TextView) v11.findViewById(R.id.title);
//        title11.setText("Student Forum ");
//        TextView when11 = (TextView) v11.findViewById(R.id.when);
//        when11.setTextSize(8);
//        when11.setText("Lalitha S, ECE\n98862 52648 bmsce_speed@bmsce.ac.in lalithas.ece@bmsce.ac.in");
//        when11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9886252648"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where11 = (TextView) v11.findViewById(R.id.where);
//        where11.setTextSize(12);
//
//        where11.setText("Surendra H H\n94498 59023 bmsce_speed@bmsce.ac.in");
//        where11.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9449859023"));
//                startActivity(callIntent);
//            }
//        });
//        main_layout.addView(v11);
//
//        View v12 = vi.inflate(R.layout.contact_layout, null);
//        TextView title12 = (TextView) v12.findViewById(R.id.title);
//        title12.setText("Conference Proceedings, Conference Souvenir");
//        TextView when12 = (TextView) v12.findViewById(R.id.when);
//        when12.setTextSize(10);
//        when12.setText("Dr Samita Maitra, Chemical\n" +
//                "Dr H R Bhagyalakshmi, ECE");
//        TextView where12 = (TextView) v12.findViewById(R.id.where);
//        where12.setTextSize(10);
//        where12.setText("Dr Chetan Nayak, Chemical\n" +
//                "Dr Murugendrappa, Physics\n" +
//                "Dr Meena P, EEE\n" +
//                "Dr B Kanmani, TCE");
//        main_layout.addView(v12);
//
//        View v13 = vi.inflate(R.layout.contact_layout, null);
//        TextView title13 = (TextView) v13.findViewById(R.id.title);
//        title13.setText("Main Stage, Exhibit Stalls");
//        TextView when13 = (TextView) v13.findViewById(R.id.when);
//        when13.setText("Skyline Manjunath\n9980075575");
//        when13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9980075575"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where13 = (TextView) v13.findViewById(R.id.where);
//        where13.setTextSize(12);
//
//        where13.setText("Surendra H H\n94498 59023 bmsce_speed@bmsce.ac.in");
//        where13.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9449859023"));
//                startActivity(callIntent);
//            }
//        });
//        main_layout.addView(v13);
//
//        View v16 = vi.inflate(R.layout.contact_layout, null);
//        TextView title16 = (TextView) v16.findViewById(R.id.title);
//        title16.setBackgroundColor(0xffff0000);
//        title16.setText("Medical Assistance");
//        TextView when16 = (TextView) v16.findViewById(R.id.when);
//        when16.setText("Beena Ullala Mat B N, ML\n94489 72072 bnb.ml@bmsce.ac.in");
//        when16.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9448972072"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where16 = (TextView) v16.findViewById(R.id.where);
//        where16.setText("Dr.Keshav Prasad\n9448504122");
//        where16.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9448504122"));
//                startActivity(callIntent);
//            }
//        });
//
//        main_layout.addView(v16);
//
//        View v14 = vi.inflate(R.layout.single_layout, null);
//        TextView title14 = (TextView) v14.findViewById(R.id.title);
//        title14.setText("Audio video equipment");
//        TextView when14 = (TextView) v14.findViewById(R.id.when);
//        when14.setText("Mr Anil Venkatesh\n95357 11123");
//        when14.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9535711123"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where14 = (TextView) v14.findViewById(R.id.where);
//        main_layout.addView(v14);
//
//
//
//        View v9 = vi.inflate(R.layout.single_layout, null);
//        TextView title9 = (TextView) v9.findViewById(R.id.title);
//        title9.setText("Accommodation, Transport");
//        TextView when9 = (TextView) v9.findViewById(R.id.when);
//        when9.setText("Ganesh Kumar, MBA\n95919 88151 kumarganesh1986@gmail.com");
//        when9.setTextSize(14);
//
//
//        when9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9591988151"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where9 = (TextView) v9.findViewById(R.id.where);
//        main_layout.addView(v9);
//
//
//        View v7 = vi.inflate(R.layout.single_layout, null);
//        TextView title7 = (TextView) v7.findViewById(R.id.title);
//        title7.setText("Configuring the Paper Submission Tool (CMT)");
//        TextView when7 = (TextView) v7.findViewById(R.id.when);
//        when7.setTextSize(14);
//
//        when7.setText("Dr B Kanmani, TCE\n94483 75397 bkanmani.tce@bmsce.ac.in");
//        when7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:9448375397"));
//                startActivity(callIntent);
//            }
//        });
//        TextView where7 = (TextView) v7.findViewById(R.id.where);
//        main_layout.addView(v7);
        //

    }

}
