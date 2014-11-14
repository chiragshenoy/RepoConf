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
public class Workshop1 extends Activity {

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
            title.setText("Do Engineering");
            date.setText("5th January 2015\nNational Instruments\nWorkshop Code : 05DoE\n");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : BSN Hall");
            description.setText("Attend this workshop to learn how to transcend traditional, theoretical approach to research and education by being more experimental, and hands-on in your approach.\nLearn about the tools that can be used by professors, researchers, and students alike for experiential education and learning. Instead of relying on simulations, learn how you can bring real world data from actual engineering systems into your research.\nInstead of relying on textbooks, learn how to use real engineering systems, to teach concepts of engineering to students.\nLearn about the technologies, and the approach that can enable students to develop systems that solve real world problems, for their final year project. In this workshop, DO ENGINEERING!\n ");

            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/Do_Engineering_by_National_Instruments.pdf\">Click here for more details on Do Engineering</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 2


        //Position 3


        //Position 4


        //Position 5


        //Position 6


        //Position 7
        if (position == 7) {
            title.setText("The Freedom Lab-in-a-Box");
            date.setText("5th January 2015\nARM University Program\nWorkshop Code : 05ARM\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : Lib Audi");
            description.setText("The objective of this workshop is to showcase the teaching materials in the Lab-in-a-Box as those with a Difference-made by and for academics using the technique of concept based teacing\nOutcome- Teaching or Learning based on concepts -key to out of box thinking with innovation");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/Worshop_Announcement_ARM.pdf\">Click here for more details on The Freedom Lab-in-a-Box</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 8


        //Position 9
        if (position == 9) {
            title.setText("Technology a Generation ahead ");
            date.setText("5th January 2015\nCoreel\nWorkshop Code : 05CRL\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : Lib Audi");
            description.setText("This workshop introduces you to the latest trends in embedded system development that was made easy.\n" +
                    "The morning session will focus on Xilinx Zynq architecture which includes dual core ARM cortex A9 hard core inside. The\n" +
                    "integration of software development kit of Vivado with chipscope derives maximum benefits from Zynq partial reconfiguration of Xilinx Vivado makes bitstream reconfiguration made easy.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/Coreel.pdf\">Click here for more details on Technology a Generation ahead</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 10
        if (position == 10) {
            title.setText("Technology a Generation ahead ");
            date.setText("5th January 2015\nIonIdea Inc\nWorkshop Code : 05CDA\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : Lib Audi");
            description.setText("Keeping this underpinning principle of accountability in education system in mind, IonIdea Inc., presents IonCUDOS, an innovative software platform that enables planning and design of curriculum through structured mapping of outcomes at all levels to attain the desired educational objectives.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://www.ioncudos.com/\">Click here for more details on iocCUDOS</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }

}

