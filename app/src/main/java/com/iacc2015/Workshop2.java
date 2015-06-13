package com.iacc2015;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


/**
 * Created by Chirag on 07-11-2014.
 */
public class Workshop2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workshop_layout);
        Intent mIntent = getIntent();
        Toolbar toolbar = (Toolbar) findViewById(R.id.c9_toolbar); //Appcompat support for a sexier action bar
        setSupportActionBar(toolbar);
        int position = mIntent.getIntExtra("pos", 0);
        TextView title = (TextView) findViewById(R.id.title);
        TextView description = (TextView) findViewById(R.id.description);
        TextView date = (TextView) findViewById(R.id.date);
        TextView time = (TextView) findViewById(R.id.time);
        TextView venue = (TextView) findViewById(R.id.venue);
        TextView htmllink = (TextView) findViewById(R.id.htmllink);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Aaargh.ttf");
        title.setTypeface(tf);

        //Position 1
        if (position == 0) {
            title.setText("Attributes of Global " +
                    "Engineer ");
            date.setTextSize(17);
            date.setText("6th January 2015\nDr. Hans J. Hoyer, Secretary General, GEDC; Executive Secretary. IFEES\n" +
                    "Dr. Seeram Ramakrishna, NUS, Singapore\n");

            time.setText("Time : 9am - 12 noon");
            venue.setText("Venue :Board Room");
            description.setText("This interactive workshop will describe the stakeholder-driven process to identify and define attributes of a global engineer; present a summary of key findings-to-date; discuss how attribute outcomes can be used to enhance engineering education globally; and highlight the recommendations and implications for a variety of stakeholders. ");

            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/GAE.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 2
        if (position == 1) {
            title.setText("Governance and " +
                    "Leadership");
            date.setTextSize(12);
            date.setText("6th January 2015\nDr. Hans J. Hoyer, Secretary General, GEDC; Executive Secretary. IFEES\n" +
                    "Dr. Seeram Ramakrishna, NUS, Singapore\n" +
                    "Dr. S.K. Ramesh, Dean, Cal State U Northridge;IEEE Rep\n" +
                    "ABET Board of Directors\n" +
                    "Dr. B.B. Ahuja, Dy. Director, COEP, Pune");

            time.setText("Time : 1pm - 4pm");
            venue.setText("Venue :Board Room");
            description.setText("With the rapid expansion of capacity of engineering education, there is a critical lack of guidance to the institutions to understand good practices and analyze the gaps in their present system of governance. Some of the issues include\n" +
                    " Lack of strategic approach to institutional development and management\n" +
                    " Lack of institutional guidelines for governance\n" +
                    " Need for clarity of roles particularly Board members and executive leadership\n" +
                    " Development of leadership at Board level and executive leadership level; by recruiting credible independent members\n" +
                    " Clarity and proper design of institutional processes.\n" +
                    "This workshop will explore these and other issues with the active participation of audience.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/GAL.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 3
        if (position == 2) {
            title.setText("Engineering Projects in Community Service ");
            date.setTextSize(12);
            date.setText("6th January 2015\nDr William Oakes,\nDirector of EPICS, Purdue University");

            time.setText("Time : 9am - 12noon");
            venue.setText("Venue : ME Seminar Hall");
            description.setText("To prepare students to be leaders in today’s global economy, students need guided experiences and the opportunity to reflect and process those experiences so that they develop the knowledge and skills needed for the 21st century. Such experiences can come from within our own communities. Community-based design projects offer the kind of learning environment for students to apply engineering skills while they develop solutions to meet compelling needs of the underserved.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/EPICS.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 4
        if (position == 3) {
            title.setText("Problem Based Learning ");
            date.setTextSize(12);
            date.setText("6th January 2015\nDr. Anette Kolmos,\n" +
                    "Professor , \n" +
                    "Problem Based Learning and Engineering Education,\n" +
                    "Aalborg University\n" +
                    "Dr. Khairiyah Mohd-Yusof, Director, Centre of Engineering\n" +
                    "Education, Universiti Teknologi Malaysia");

            time.setText("Time : 1pm - 4pm");
            venue.setText("Venue : ME Seminar Hall");
            description.setText("Thinking skills, be it creative thinking, critical thinking, analytical thinking, problem solving and design thinking, are necessary for engineers to face open-ended problems, to innovate and to invent new products. Developing these skills are challenging given the higher complex cognitive processes involved. It is even more challenging to develop among students who have mostly faced closed-ended structured problems in traditional classes.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/PBL.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 5
        if (position == 4) {
            title.setText("Outcome Based Education ");
            date.setTextSize(12);
            date.setText("6th January 2015\nDr. Raman Unnikrishnan, Dean, Cal State University,\n" +
                    "Fullerton, USA, Washington Accord Mentor for NBA\n" +
                    "Dr. Michael K.J. Milligan, Executive Director, ABET\n" +
                    "Dr Ashok Shettar, Principal, BVBCE, Hubli\n" +
                    "Dr K Mallikharjuna Babu, Principal, BMSCE, Bangalore");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue :BMS Auditorium");
            description.setText("This workshop will provide a forum for participants to understand the ABET process in the USA as well as to learn about how Indian engineering colleges can become practitioners of outcomes based education as relevant to Indian conditions. The Executive Director of ABET (Dr. Milligan) and the Mentor to NBA for the Washington Accord process (Dr. Unnikrishnan) will be leading sessions. The workshop will include few examples of implementation of OBE in India.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/OBE.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 6
        if (position == 5) {
            title.setText("Effective Teaching " +
                    "and Learning ");
            date.setTextSize(10);
            date.setText("6th January 2015\nDr. Neeraj Buch, Chair, Michigan State University, USA\n" +
                    "Dr. Stephanie Farrell, Rowan University, VP, ASEE\n" +
                    "Dr. Veena Kumar, Professor,School of Communication, University of Maryland University College, USA\n" +
                    "Dr. C. Nataraj, Chair, Villanova University, USA\n" +
                    "Dr Subramanian Rajan, Arizona State University, USA\n" +
                    "Dr. Susan Kemnitzer, National Science Foundation, USA\n" +
                    "Dr Vinod Lohani, Virginia Tech University, USA");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : Sir MV Hall");
            description.setText("One of the many challenges faced by the present day educator is recognizing the changed learning\n" +
                    "needs of a 21st century student also known as the Millennial Learner, Digital Learner, NextG Learner\n" +
                    "etc. Subject of extensive research, the 21st century learner is found to be more independent,\n" +
                    "technology savvy and application oriented. He likes to do research, collaborate and is known to have\n" +
                    "a short attention span. He learns best in an open environment and expects the faculty to be more\n" +
                    "transparent and accessible. In this session, we will examine how we, the faculty, can re-design\n" +
                    "course delivery that can not only meet the changed learning and motivational needs of this learner\n" +
                    "but can also be easily incorporated in the framework of a typical engineering classroom in India.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/EffectiveTeachingandLearning.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 7
        if (position == 6) {
            title.setText("Industry Academia " +
                    "Partnerships ");
            date.setTextSize(12);
            date.setText("6th January 2015\nProf. Lueny Morell, NEU\n" +
                    "Dr. Guru Subramanyam, U of Dayton\n" +
                    "Industry-Institute-Partnership: Examples by Platinum\n" +
                    "Sponsors");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : Multi Purpose Hall");
            description.setText("Industry-institution partnerships in India often stop at a superficial level without any significant benefit to both the parties. There is a need to evolve deeper engagement. Wide variety of partnerships is possible as shown below, but a natural progression of relationship from interaction to structural partnership is necessary.\n" +
                    "In this workshop these issues will be analyzed using specific examples by US experts and Industry leaders, and through interactions with participants");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/IAP.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        //Position 8
        if (position == 7) {
            title.setText("Integrating Innovative " +
                    "Entrepreneurship with " +
                    "Engineering Education");
            date.setTextSize(12);
            date.setText("6th January 2015\nDr Ashok Ranade, Director, IITAC (Indian Institutes of\n" +
                    "Technology, Alumni Canada)\n" +
                    "Dr S. Jimmy Gandhi, Assistant Professor, Department of\n" +
                    "Manufacturing Systems Engineering & Management,\n" +
                    "Director, Ernie Schaffer Center for Innovation & \n" +
                    "Entrepreneurship, California State University, Northridge\n" +
                    "Dr. Pradeep Waychal,Director,NMIMS University MH");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : FD Center (MCA)");
            description.setText("Background:\n" +
                    "Lately, there is increased recognition of the importance of teaching and facilitating entrepreneurship development in engineering colleges. Majority of Indian Engineering Colleges, therefore, are exploring how Entrepreneurship education can be integrated in their existing curriculum. This workshop will present, the framework for teaching entrepreneurship, new pedagogies required for entrepreneurship education. the experiences of teaching entrepreneurship in 4 year bachelor degree course and the global best practices.\n" +
                    "Target audience:\n" +
                    "The workshop is intended for Teachers and administrators in Indian Engineering Colleges, especially those who are in the process of introducing Entrepreneurship education in 4 year engineering degree curriculum.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/EEE.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }

        //Position 9
        if (position == 8) {
            title.setText("Engineering Education for " +
                    "Sustainable " +
                    "Development");
            date.setTextSize(12);
            date.setText("6th January 2015\nDr. Leena Srivastava, Vice Chancellor at TERI University\n" +
                    "Dr. Rama Ramakrishna, Arizona State University");

            time.setText("Time : 9am - 4pm");
            venue.setText("Venue : BSN Hall (PG Block)");
            description.setText("Background:\n" +
                    "Lately, there is increased recognition of the importance of teaching and facilitating entrepreneurship development in engineering colleges. Majority of Indian Engineering Colleges, therefore, are exploring how Entrepreneurship education can be integrated in their existing curriculum. This workshop will present, the framework for teaching entrepreneurship, new pedagogies required for entrepreneurship education. the experiences of teaching entrepreneurship in 4 year bachelor degree course and the global best practices.\n" +
                    "Target audience:\n" +
                    "The workshop is intended for Teachers and administrators in Indian Engineering Colleges, especially those who are in the process of introducing Entrepreneurship education in 4 year engineering degree curriculum.");
            htmllink.setText(
                    Html.fromHtml(
                            "<a href=\"http://ictiee.org/content/ws/ESD.pdf\">Click here for more details</a> "));
            htmllink.setMovementMethod(LinkMovementMethod.getInstance());
        }


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
