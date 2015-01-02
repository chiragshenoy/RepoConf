package ictiee.conference;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
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

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        title.setTypeface(tf);


        //Position 0
        if (position == 0) {
            title.setText("Software Defined Radio & Control Systems - Effective Tools for Teaching and Research ");
            date.setText("5th January 2015\nNational Instruments\n");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue :TCE Department");
            description.setText("This workshop exposes tools from National Instruments that can be used as\n" +
                    " effective teaching tools for hands-on learning and in-class demos\n" +
                    " research platforms that enable you to quickly bring your research idea to reality (proof of concept)\n" +
                    "The workshop will feature live demonstrations, interactions and hands-on activities specifically related to the fields of Signals & Systems, Software Defined Radio and Control Systems");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/Worshop_Announcement_ARM.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 1
        if (position == 1) {
            title.setText("Innovative Undergraduate Labs for Control, Mechatronics, and Robotics ");
            date.setText("5th January 2015\nQuanser\n");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue :EEE Department");
            description.setText("For over 25 years, Quanser has been the innovation leader in education and\n" +
                    "research platforms for control systems. Over 2500 universities worldwide\n" +
                    "have adopted Quanser solutions for their unmatched quality and precision.\n" +
                    "Quanser is Your First Choice for\n" +
                    "Control Education and Research\n" +
                    "NEW QUBE™-Servo: Designed for the undergrad lab. Quanser quality at an affordable price.\n" +
                    "Car Suspension Quadrotor UAV Flight Control Fluid Levels Electromagnetism\n" +
                    "• Comprehensive teaching solutions complete with ABET-aligned courseware\n" +
                    "• AITCE curriculum guideline alignment for mechatronics and automotive system design\n" +
                    "engineering education\n" +
                    "• Extensive range of open-architecture, research-grade motion platforms for controller validation\n" +
                    "• Unique lab solutions for mechatronic design, robotics, haptics, and unmanned vehicles\n" +
                    "• Turnkey solutions including plants, DAQ, realtime control software, peripherals, and courseware");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ICTIEE%20Conference%20Ad.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 3
//        if (position == 2) {
//            title.setText("Workshop by Dassault");
//            date.setText("5th January 2015\nDassault Systems\n");
//
//            time.setText("Time : 9am - 4pm");
//            venue.setText("Venue :Mechanical Department");
//            description.setText("");
//            htmllink.setText(
//                    Html.fromHtml(
//                            "<a href=\"http://www.3ds.com\">Click here for more details</a> "));
//            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
//        }

        //Position 4
        if (position == 2) {
            title.setText("The Freedom Lab-in-a-Box");
            date.setText("5th January 2015\nARM University Program\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : ECE Department");
            description.setText("The objective of this workshop is to showcase the teaching materials in the Lab-in-a-Box as those with a Difference-made by and for academics using the technique of concept based teacing\nOutcome- Teaching or Learning based on concepts -key to out of box thinking with innovation");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/Worshop_Announcement_ARM.pdf\">Click here for more details on The Freedom Lab-in-a-Box</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 5
        if (position == 3) {
            title.setText("Learning Platform for Better Outcomes ");
            date.setText("5th January 2015\nInpods\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue :ISE Department");
            description.setText("InPods Inc is a company based out of Bellevue in the US with its India office in Pune and Hyderabad.InPods offers a Learning Enhancement Solution with multiple features to make learning more interesting,interactive,intuitive and instructional to facilitate learning improvement and performance enhancement.InPods is a cloud based environment with focus on social learning and easy to use analytics to enhance speed and quality of learning .An application that helps faculty use their time more productively");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/WorkShop_Inpods_Final.JPG\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 6
        if (position == 4) {
            title.setText("PSoCTM 4 BLE Workshop ");
            date.setText("5th January 2015\nCypress Semiconductors\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue :ECE Department");
            description.setText("Learn all about the latest Cypress PSoC 4 with Bluetooth Low Energy (BLE) technology. PSoC is a family of mixed signal (analog, digital, and embedded MCU), programmable devices – now with a BLE radio added to the mix! PSoC is truly the world’s first Programmable System-On-Chip (more info @ www.cypress.com )\n" +
                    " Leave with the knowledge of PSoC Architecture and PSoC Creator Software and learn how you can get a free Development Kit.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/workshopcypress.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 7
        if (position == 5) {
            title.setText("Technology a Generation ahead ");
            date.setText("5th January 2015\nCoreel\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : EEE Department");
            description.setText("This workshop introduces you to the latest trends in embedded system development that was made easy.\n" +
                    "The morning session will focus on Xilinx Zynq architecture which includes dual core ARM cortex A9 hard core inside. The\n" +
                    "integration of software development kit of Vivado with chipscope derives maximum benefits from Zynq partial reconfiguration of Xilinx Vivado makes bitstream reconfiguration made easy.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/Coreel.pdf\">Click here for more details on Technology a Generation ahead</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 8
        if (position == 6) {
            title.setText("Automation of Curriculum Design & Attainment for OBE ");
            date.setText("5th January 2015\nIonIdea Inc.");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue :CSE Department");
            description.setText("After India signed Washington Accord,it is a need of every Engineering Education Institute to put a system in place,which is based on best practices and can automate end to end workflow of Curriculum Design involving ket stakeholders and help integrating Delivery and Assessment at all Outcome Levels. This workshop helps to demonstrate the automation of end to end Curriculum Design process through IonCUDOS!");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/IonCUDOS%20Workshop.jpg\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 9
        if (position == 7) {
            title.setText("Impartus Lecture Capture ");
            date.setText("5th January 2015\nImpartus\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : ISE Department");
            description.setText("Session will be divided into 2 parts. In the first part (60 Minutes), we will introduce you to Impartus\n" +
                    "Lecture Capture. We are doing simple things in an exciting way. The recorded videos are not just raw\n" +
                    "videos; they are enabled with numeroustools, making them interactive and engaging:The recording,\n" +
                    "audio-video quality enhancement, content security anddistribution; all are carried out in a completely\n" +
                    "automated fashion without anymanual intervention or change in the teaching methodology.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/Workshop_Flyer_Impartus.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 10
        if (position == 8) {
            title.setText("Teaching Lab Solutions for RF Labs ");
            date.setText("5th January 2015\nKeysight\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : TCE Department");
            description.setText("");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://www.keysight.com/main/home.jspx?cc=IN&lc=eng\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 11
        if (position == 9) {
            title.setText("New Project Based Learning ");
            date.setText("5th January 2015\nMathWorks\n");
            time.setText("Time : 9am - 4pm");
            venue.setText("Venue :CSE Department");
            description.setText("");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://in.mathworks.com/?nocookie=true\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

    }

}

