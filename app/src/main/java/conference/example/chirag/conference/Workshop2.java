package conference.example.chirag.conference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by Chirag on 07-11-2014.
 */
public class Workshop2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workshop_layout);
        Intent mIntent = getIntent();
        int position = mIntent.getIntExtra("pos", 0);
        TextView title = (TextView) findViewById(R.id.title);
        TextView description = (TextView) findViewById(R.id.description);
        TextView date = (TextView) findViewById(R.id.date);
        TextView time = (TextView) findViewById(R.id.time);
        TextView venue = (TextView) findViewById(R.id.venue);
        TextView htmllink = (TextView) findViewById(R.id.htmllink);

        //Position 1
        if (position == 0) {
            title.setText("Outcome Based Education ");
            date.setTextSize(17);
            date.setText("6th January 2015\nDr. Raman Unnikrishnan,Dr. Michael K.J. Milligan, Dr Ashok Shettar,Dr K Mallikharjuna Babu, \nWorkshop Code :06FNOBE\n");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : BSN Hall");
            description.setText("India has recently become a Full Member of the Washington Accord. This means there needs to be a radical change in the process of engineering education and its accreditation. Emphasis will have to be on Outcomes Based Education. The challenge is to generate better understanding of outcomes based approaches within engineering colleges as well as to generate a qualified pool of evaluators according to outcomes based education.\n" +
                    "This workshop will provide a forum for participants to understand the ABET process in the USAas well as to learn about how Indian engineering colleges can become practitioners of outcomes based education as relevant to Indian conditions.\n" +
                    "The Executive Director of ABET (Dr. Milligan)and the Mentor to NBA for the Washington Accord process (Dr. Unnikrishnan) will be leading the sessions.\n" +
                    "Theworkshop will include few examples of implementation of OBE in India.\n ");

            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/OBE.pdf\">Click here for more details on Outcome Based Education</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 2


        //Position 3


        //Position 4


        //Position 5


        //Position 6


        //Position 7


        //Position 8


    }

}

