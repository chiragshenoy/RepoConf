package ictiee.conference;

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

        setSupportActionBar(toolbar);
        TextView content1 = (TextView) findViewById(R.id.content1);
        content1.setText("In a world driven by innovations in engineering for promoting prosperity of mankind, " +
                "augmenting human resource capital through quality engineering education is vital.\r\n\nThe vision of the second " +
                "International Conference on Transformations in Engineering Education is to bring engineering educators from across " +
                "the world to share best practices for preparing engineering graduates who will be leaders in addressing global " +
                "challenges.");
//        content1.setText(Html.fromHtml(
//                "<b>text3:</b>  Text with a " +
//                        "<a href=\"http://www.google.com\">link</a> " +
//                        "created in the Java source code using HTML."));

        TextView content2 = (TextView) findViewById(R.id.content2);
        content2.setText("The conference is Co-Organized by IUCEE (Indo-US Collaboration for Engineering Education http://iucee.com/) " +
                "and BMS College of Engineering (BMSCE,www.bmsce.ac.in ) Bangalore from January 5 to 8, 2015.\r\n\nThe conference program " +
                "includes Paper Presentations, Keynote Addresses, Plenary Sessions and Panel Discussions.\r\n\nThe Pre-conference activities " +
                "include a Student Forum (January 5 to 7) and Faculty Training/Workshops (January 7).\r\n \r\nThe Collaborators for the conference " +
                "are:" +
                "\r\n\n1.Institute of Electrical and Electronics Engineers (IEEE, www.ieee.org)\r\n\n2.International Federation of Engineering Education " +
                "Societies (IFEES, www.ifees.net ),\r\n\n3.American Society for Engineering Education (ASEE, www.asee.org )\r\n\n4.Global Engineering Deans " +
                "Council (GEDC, www.gedcouncil.org).\n\n\n");
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
