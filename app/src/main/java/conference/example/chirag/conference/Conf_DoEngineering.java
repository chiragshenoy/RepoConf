package conference.example.chirag.conference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Chirag on 07-11-2014.
 */
public class Conf_DoEngineering extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conf_layout);
        Intent mIntent = getIntent();
        int position = mIntent.getIntExtra("pos", 0);
        TextView title = (TextView) findViewById(R.id.title);
        TextView description = (TextView) findViewById(R.id.description);
        TextView date = (TextView) findViewById(R.id.date);
        TextView time = (TextView) findViewById(R.id.time);
        TextView venue = (TextView) findViewById(R.id.venue);
        if (position == 0) {
            title.setText("Do Engineering");
            date.setText("5th January 2015\nNational Instruments\nWorkshop Code : 05DoE\n");

            time.setText("Time : 9am - 3pm");
            venue.setText("Venue : BSN Hall");
            description.setText("Attend this workshop to learn how to transcend traditional, theoretical approach to research and education by being more experimental, and hands-on in your approach.\nLearn about the tools that can be used by professors, researchers, and students alike for experiential education and learning. Instead of relying on simulations, learn how you can bring real world data from actual engineering systems into your research.\nInstead of relying on textbooks, learn how to use real engineering systems, to teach concepts of engineering to students.\nLearn about the technologies, and the approach that can enable students to develop systems that solve real world problems, for their final year project. In this workshop, DO ENGINEERING!");
        }
        if (position == 1)
            title.setText("The Freedom");
    }
}
