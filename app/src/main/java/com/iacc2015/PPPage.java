package com.iacc2015;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


/**
 * Created by Chirag on 04-01-2015.
 */
public class PPPage extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pp_layout);
        Intent mIntent = getIntent();

        Toolbar toolbar = (Toolbar) findViewById(R.id.c9_toolbar); //Appcompat support for a sexier action bar
        setSupportActionBar(toolbar);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Aller.ttf");
        Typeface t2 = Typeface.createFromAsset(getAssets(), "fonts/qs.otf");

        TextView title1 = (TextView) findViewById(R.id.title1);
        title1.setTextSize(18);
        title1.setTypeface(tf);

        TextView description1 = (TextView) findViewById(R.id.description1);
        description1.setTypeface(t2);
        description1.setTextSize(13);


        TextView title2 = (TextView) findViewById(R.id.title2);
        title2.setTextSize(18);
        title2.setTypeface(tf);

        TextView description2 = (TextView) findViewById(R.id.description2);
        description2.setTypeface(t2);
        description2.setTextSize(13);

        TextView title3 = (TextView) findViewById(R.id.title3);
        title3.setTextSize(18);
        title3.setTypeface(tf);

        TextView description3 = (TextView) findViewById(R.id.description3);
        description3.setTextSize(13);
        description3.setTypeface(t2);

        int position = mIntent.getIntExtra("pos", 0);

        //Position 1
        if (position == 1) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : BSN Block V Floor (Room No. 5002)");
            title1.setText("Session 1\nSession Code: [S107 FNT1]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs: Dr. D. Seshachalam, HOD-ECE, BMSCE;<br>Dr. K. Mallikharjuna Babu, Principal, BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>006 A Flipped Classroom Approach to Teaching Engineering Mechanics Courses<br></font>M. Sirigiri and S. D. Rajan<br><br>";
            text = text + "<font color = 'yellow'>007 QTiME - Fostering Dimensional Learning in 21 Century<br></font>Bala Ajjampur and Krishna V. Prasad<br><br>";
            text = text + "<font color = 'yellow'>033 Reward Feedback and Success for Inspiring Creative Minds: An Inspirational Model<br></font>Hari Mohan Pandey<br><br>";
            text = text + "<font color = 'yellow'>043 Project Based Teaching Methodology for Embedded Engineering Education<br></font>M. Rajendra Prasad and D. Krishna Reddy<br><br>";
            text = text + "<font color = 'yellow'>049 An Effective Tool For The Attainment of Course Outcome’s and Programme Outcome’s<br></font>R. Vijaya Prakash<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 1\nSession Code: [S107 ANT1]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Dr. S. K. Ramesh, Cal State University Northridge;<br>Dr. S. Sreenatha Reddy, Principal, Guru Nanak Institutions<br>Dr. B. V. Ravishankar, Dean(I Year), BMSCE<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>097 Outcome Based Education - Design Delivery and Assessment of Product Design and Development Course at Undergraduate\n" +
                    "Engineering Program<br></font>Martnad T. Telsang<br><br>";
            text1 = text1 + "<font color = 'yellow'>099 Categorized Laboratory Course Content Towards Better Attainment of Program Outcome - Better Attainment of PO by\n" +
                    "Categorization<br></font>Savitha S. Desai, Basavaraj S. Hungund, Laxmikant R. Patil and Shrinivas D. Desai<br><br>";
            text1 = text1 + "<font color = 'yellow'>107 Measurement of Programme Outcome-h through Course Seminar<br></font>Vinayak Kulkarni and Sanjay Kulkarni<br><br>";
            text1 = text1 + "<font color = 'yellow'>118 Attainment of Program Outcome ‘3b’ of ABET through Laboratory Experiment for the Undergraduate Program<br></font>G. Jangali Satish, Anand R. Lakkundi, V. N. Gaitonde, S. B. Burli and H. K. Madhusudhana<br><br>";
            text1 = text1 + "<font color = 'yellow'>152 Engineering Practices Lab: A Multidisciplinary Laboratory Course<br></font>Sanjeev. M. Kavale<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);


            title3.setText("Session 1\nSession Code:[S108 FNT1]\nJanuary 8th, 9:00 am — 10:30 am");

            String text2 = "<font color='cyan'>Chairs:Dr. Pradeep Waychal, Director, NMIMS Univesrity, MH;<br>Dr. Samita Maitra, HOD-Chemical, BMSCE<br><br></font>";

            text2 = text2 + "<font color = 'yellow'>\n" +
                    "072 A Competency Based Maturity Model for OBE<br></font>Uma Garimella<br><br>";
            text2 = text2 + "<font color = 'yellow'>\n" +
                    "276 Some Initiatives in EIM Course for Outcome Based Education<br></font>T. Anushalalitha<br><br>";
            text2 = text2 + "<font color = 'yellow'>265 Outcome-Based Education Model for Computer Science Education<br></font>Srividya Bansal, Ajay Bansal and Odesma Dalrymple<br><br>";
            text2 = text2 + "<font color = 'yellow'>268 Implementation of OBE Approach for Computer Algorithms Course and It’s Outcome<br></font>Pragati Sawant<br><br>";
            text2 = text2 + "<font color = 'yellow'>269 Establishing Program Educational Objectives<br></font>R. Shivakumar, H. S. Usha, Chetan A. Nayak, K. Sainath and Samita Maitra<br><br>";

            description3.setText(Html.fromHtml(text2), TextView.BufferType.SPANNABLE);

        }

        //Position 2
        if (position == 2) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : BSN Block V Floor (Room No. 5003)");
            title1.setText("Session 2\nSession Code: [S207 FNT1]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs: Dr. Claire Komivos, Professor, San Jose University, USA;<br>Dr. P. Meena, Assoc. Professor, BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>058 A Review on Requisite Generic Attributes for Engineering Graduates<br></font>S. Meenakshi, Seemita Mohanty and Amiya Kumar Rath<br><br>";
            text = text + "<font color = 'yellow'>073 Shift Towards Student-Centered Learning in Engineering Physics Lab - A Case Study<br></font>M. V. Murugendrappa and T. Renuka<br><br>";
            text = text + "<font color = 'yellow'>087 Collaboration Between Industry and Engineering Education<br></font>Ravi Mathey, Akarapu Swarna Reddy and Muthyala Vijaya Shanthi<br><br>";
            text = text + "<font color = 'yellow'>089 A Novel Approach Towards Outcome Based Engineering Education for Continuous Quality Improvement: A Case Study<br></font>A. R. Jakhale and A. C. Attar<br><br>";
            text = text + "<font color = 'yellow'>165 Outcome Based Education: An Empirical Approach<br></font>M. R. Anala, R. Hemavathy and G. Shobha<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 2\nSession Code:[S207 ANT1]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Dr. M. Madhusoodanan Nair, Principal, KG Reddy College of Engineering & Technology, India;<br>Dr. D. N. Sujatha, HOD-MCA, BMSCE<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>\n" +
                    "173 Structured Approach of Designing Data Structure and Algorithms Laboratory Experiments<br></font>Moula Husain, Somashekhar Patil, B. Indira, S. M. Meena and D. G. Narayan<br><br>";
            text1 = text1 + "<font color = 'yellow'>\n" +
                    "211 Project-Based Learning in Digital Image Processing Course<br></font>D. R. Ambika<br><br>";
            text1 = text1 + "<font color = 'yellow'>213 Defining Learning Outcomes of Co-curricular Activities - Integrating Desired Commonalities<br></font>Richa Mishra and K. Kotecha<br><br>";
            text1 = text1 + "<font color = 'yellow'>223 Defining the Performance Indicators: A Framework for Program Outcomes’ Attainment<br></font>B. B. Kotturshettar<br><br>";
            text1 = text1 + "<font color = 'yellow'>229 Assessment and Attainment of Course Outcomes and Program Outcomes<br></font>Mukund V. Kavade<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);


            title3.setText("Session 2\nSession Code:[S208 FNT1]\nJanuary 8th, 9:00 am — 10:30 am");

            String text2 = "<font color='cyan'>Chairs:Dr. Krishna Athreya, Iowa University;<br>Dr. M. V. Murugendrappa, Professor, BMSCE<br><br></font>";

            text2 = text2 + "<font color = 'yellow'>\n" +
                    "270 Leveraging the Assesment Methods for Outcome Based Education<br></font>B. Shreenivas, H. R. Archana, C. Gururaj and K. Ambika<br><br>";
            text2 = text2 + "<font color = 'yellow'>\n" +
                    "242 Continuous Improvements in Teaching-Learning-Process in Outcomes Based Education<br></font>B. Kanmani and K. Mallikharjuna Babu<br><br>";
            text2 = text2 + "<font color = 'yellow'>279 A Case Study : Improved Learning Through Course Assessment<br></font>H. R. Bhagyalakshmi, D. Seshachalam and D. Ajay Kumar<br><br>";
            text2 = text2 + "<font color = 'yellow'>281 Outcome Based Education: Strategies and Tools for Indian Scenario - Co-Operative Learning<br></font>N. V. Sreekanth, C. C. Arjun and K. Guruprasad<br><br>";
            text2 = text2 + "<font color = 'yellow'>287 Role of Industry to Improve Outcome Based Education in Engineering<br></font>Syed Akram, S. Selvakumar, J. J. Lohith, B. R. Shambhavi and M. Indiramma<br><br>";

            description3.setText(Html.fromHtml(text2), TextView.BufferType.SPANNABLE);


        }


        if (position == 3) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : BSN Block V Floor (Room No. 5004)");
            title1.setText("Session 3\nSession Code: [S307 FNT2]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs: Dr. Raman Unnikrishnan, Dean, Cal. State Fullerton University, USA, Washington Accord Mentor\n" +
                    "for NBA;<br>Dr.P. Martin Jebaraj, Director (R&D), BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>027 Power Education Revolution - A Journey Towards a Smarter Future Power Sector<br></font>Khoisnam Steela, Bharat Shing Rajpurohit and S. N. Singh<br><br>";
            text = text + "<font color = 'yellow'>042 Project and Problem Based Learning for Circuits, Systems, VLSI and Digital Signal Processing Courses<br></font>Ravi P. Ramachandran, Kevin D. Dahm, Linda M. Head and John L. Schmalzel<br><br>";
            text = text + "<font color = 'yellow'>045 Curriculum Design for Industry Relevant and Interdisciplinary Postgraduate Programmes in Engineering and Technology<br></font>V. Thanikachalam<br><br>";
            text = text + "<font color = 'yellow'>059 A Traditional Novel Approach for Skill Enhancement of Teaching - Learning Process in Engineering Education<br></font>Srinivas Aluvala and Soumya Pothupogu<br><br>";
            text = text + "<font color = 'yellow'>154 Attaining ComputerNetwork Course Outcomes Through Activities and Statistical Analysis of Simulation Results Using SPSS\n" +
                    "Tool<br></font>M. Vijayalakshmi, G. Shantala, G. N. Jayalaxmi and Padmashree D. Desai<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 3\nSession Code:[S307 ANT2]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Prof. V. Mahesh, Professor, S R Engineering College, India;<br>Dr. A. Satyanandini, HOD-MBA, BMSCE<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>\n" +
                    "121 Augmented Reality as Teaching Aid:Making Chemistry Interactive<br></font>Neha Tuli and Archana Mantri<br><br>";
            text1 = text1 + "<font color = 'yellow'>\n" +
                    "123 Effective Teaching of Course on 8051 Microcontrollers through Course Project<br></font>Aruna S. Nayak, G. g. Vishwanath and F. M. Umadevi<br><br>";
            text1 = text1 + "<font color = 'yellow'>124 Engineering Design: A Sophomore Course for Undergraduates in Electrical Sciences<br></font>E. Sanjay, A. Sachin, M. Uma, A. B. Raju, N. Iyer, S. Ajit, S. Raghu, S. Huddar, G. Arun, B. B. Kotturshettar, B. L. Desai and\n" +
                    "Ashok Shettar<br><br>";
            text1 = text1 + "<font color = 'yellow'>129 Model for Integrating EntrepreneurialMindset Education and Experiences in Engineering Students<br></font>Devdas Shetty<br><br>";
            text1 = text1 + "<font color = 'yellow'>135 A Virtual Industry Platform for Course Projects in Automotive Electronics: A Case Study<br></font>P. C. Nissimagoudar, Venkatesh R. Mane, Nalini C. Iyer, S. Ramakrishna, M. R. Kiran, K. M. Uma, A. B. Raju, Anisha W. Joseph,\n" +
                    "K. Hemanthraj, B. L. Desai and Ashok Shettar<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);


            title3.setText("Session 2\nSession Code:[S308 FNT2]\nJanuary 8th, 9:00 am — 10:30 am");

            String text2 = "<font color='cyan'>Chairs:Prof. Vinod Lohani, Professor, Virginia Tech. University, USA;<br>Dr. Vinod C. Aralimatti, COE, BMSCE<br><br></font>";

            text2 = text2 + "<font color = 'yellow'>\n" +
                    "166 Adopting Open-Ended Exercise and Self-Study Modes to Implement Contextual Learning Approach to Enhance Engineering\n" +
                    "Knowledge/Skills<br></font>Gururaj Fattepur, B. B. Kotturshettar and B. S. Kakol<br><br>";
            text2 = text2 + "<font color = 'yellow'>\n" +
                    "183 Faculty Development for Educating Engineers of 21 Century<br></font>Hemlata Vivek Gaikwad<br><br>";
            text2 = text2 + "<font color = 'yellow'>282 Effective Teaching of Power System Analysis Course Using PSCAD<br></font>S. Nethravathi and R. S. Geetha<br><br>";
            text2 = text2 + "<font color = 'yellow'>222 A Structured Approach to Teaching and Learning Hydraulics & Pneumatics<br></font>Vinod Kumar V. Meti and Arun C. Giriyapur<br><br>";
            text2 = text2 + "<font color = 'yellow'>239 Enhancement of Multidisciplinary PDR Course<br></font>Shivashankar Huddar, Prashant Achari, Sanjay Eligar, Uma Mudenagudi, Nalini Iyer, A. B. Raju, Arun Giriyapur, B. B. Kotturshettar,\n" +
                    "Nitin Kulkarni and Ashok Shettar<br><br>";

            description3.setText(Html.fromHtml(text2), TextView.BufferType.SPANNABLE);


        }


        //pos 4
        if (position == 4) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : BSN Block V Floor (Room No. 5005)");
            title1.setText("Session 4\nSession Code: [S407 FNT2]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs:Dr. C. Nataraj, Chair, Villanova University, USA;\n" +
                    "Dr. Veeranna, Director, Guru Nanak Institutions, India;<br>Dr. K. R. Suresh, Professor, BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>065 Product Dissection: A Method for Hands on Engineering Education<br></font>Aditya Bhatnagar<br><br>";
            text = text + "<font color = 'yellow'>093 Essentials of Curriculum Design and Implementation - An Overview<br></font>Kota Chandra Bhushana Rao<br><br>";
            text = text + "<font color = 'yellow'>104 Inquiry-Based Laboratory for Teaching Students Design-of-Experiments<br></font>Claire F. Komives<br><br>";
            text = text + "<font color = 'yellow'>105 Integrated Learning Framework Towards Attaining Focused Outcomes<br></font>P. G. Sunitha Hiremath and Shankar Setty<br><br>";
            text = text + "<font color = 'yellow'>114 Experiential Learning in Metrology and Quality Engineering Course<br></font>N. Vijayakumar, V. N. Gaitonde, A. R. Lakkundi, H. K. Madhusudhana and G. Jangali Satish<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 4\nSession Code:[S407 ANT2]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Dr. M. T. Telsang, Dean (Academic), Rajarambapu Institute of Technology, India;<br>Dr. H. N. Suma, HOD-ML, BMSCE<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>\n" +
                    "137 An Institute Interaction with EMC Corporation for Enhanced Learning of Storage Area Network Course<br></font>Indira Bidari, Suvarna G. Kanakaraddi, Nirmala S. Patil and Somashekar S. Patil<br><br>";
            text1 = text1 + "<font color = 'yellow'>\n" +
                    "140 Mind Mapping: An Useful Technique for Effective Learning in Large Classroom<br></font>B. Shraddha, S. Raghavendra, P. Nikita, Nalini Iyer and S. Ajit<br><br>";
            text1 = text1 + "<font color = 'yellow'>156 Enhanced Learning of Thermal Engineering Courses through Structured Enquiry and Problem Based Approach<br></font>N. R. Banapurmath, P. P. Revankar, R. S. Hosmath and M. B.Gorawar<br><br>";
            text1 = text1 + "<font color = 'yellow'>143 Innovative Teaching Approach: To Transfer Focus from Teachers to Learners<br></font>Vilabha S. Patil and Tejaskumar S. Kamble<br><br>";
            text1 = text1 + "<font color = 'yellow'>144 Enquiry Based Approach for Enhanced Learning in DBA Laboratory: A Case Study<br></font>Praveen M. Dhulavvagol, Uday Kulkarni, S. M. Meena and M. N. Prashant<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);


            title3.setText("Session 4\nSession Code:[S408 FNT2]\nJanuary 8th, 9:00 am — 10:30 am");

            String text2 = "<font color='cyan'>Chairs:Dr. Seeram Ramakrishna, Professor, NUS, Singapore;\n" +
                    "Dr. K. Narasimha Rao, HOD-IT, BMSCE;<br>Dr. H. S. Guruprasad, HOD-CSE, BMSCE<br><br></font>";

            text2 = text2 + "<font color = 'yellow'>\n" +
                    "264 An Outcome Based Curriculum Design in Engineering - Case Study Approach<br></font>Veena N. Hegde and K. Narasimha Rao<br><br>";
            text2 = text2 + "<font color = 'yellow'>\n" +
                    "266 A Perspective of Experiential Learning Approach Followed in Dhirajlal Gandhi College of Technology<br></font>S. Sridevi, M. Sumathi and V. J. Vishnuprasad<br><br>";
            text2 = text2 + "<font color = 'yellow'>191 Increasing the Understanding of Engineering Education for Freshmen - Pedagogical Innovation in the form of Induction\n" +
                    "Program<br></font>Rohit Kandakatla and Soujanya Reddy<br><br>";
            text2 = text2 + "<font color = 'yellow'>148 A Low Cost Open Source Hardware Tool for Integrated Learning Experience in Laboratories<br></font>A. B. Raju, Anupama Itagi, Sachin Angadi, V. Sushma and Ashok Shettar<br><br>";
            text2 = text2 + "<font color = 'yellow'>251 Blended Learning, an Integrated Learning Solution in Undergraduate Engineering Education: A Case Study<br></font>B. R. Shambhavi and K. Mallikharjuna Babu<br><br>";

            description3.setText(Html.fromHtml(text2), TextView.BufferType.SPANNABLE);


        }

        //pos 5
        if (position == 5) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : BSN Block V Floor (Room No. 5006)");
            title1.setText("Session 5\nSession Code: [S507 FNT3]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs:Dr.Gopal Nadkarni, Director, University of Akron, USA;\n" +
                    "<br>Dr. B. S. Chandrashekar, Deputy-COE, BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>023 Faculty Involvement for Creating Awareness About Social Responsibility<br></font>S. S. Patil and J. S. Awati<br><br>";
            text = text + "<font color = 'yellow'>219 Social Learning in Engineering Education<br></font>S. Anusha and N. Swetha Reddy<br><br>";
            text = text + "<font color = 'yellow'>275 An Approach to Improve Employability Skills: eBridge<br></font>Laxmi Devambatla and Divya Nalla<br><br>";
            text = text + "<font color = 'yellow'>002 International Education Outreach: A Report on the SAE BajaWorkshops in India<br></font>Mohan D. Rao, Dale Wilson and Satish Mahajan<br><br>";
            text = text + "<font color = 'yellow'>210 Effective ICT Tools for Course Management<br></font>D. Ajay Kumar and V. Umadevi<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 5\nSession Code:[S507 ANT2]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Dr V. R. Naik, HOD-ME, DKTE Society’s Textile & Engineering Institute, India;<br>Dr. Gowrishankar, HOD-IS, BMSCE<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>\n" +
                    "147 Curriculum Design: An Experience in Principles of Complier Design Course<br></font>C. Sujatha and K. G. Karibasappa<br><br>";
            text1 = text1 + "<font color = 'yellow'>\n" +
                    "149 Tutorial: A Case Study on Integrated Learning<br></font>B. Shraddha, S. Raghavendra, P. Nikita, Nalini Iyer and S. Ajit<br><br>";
            text1 = text1 + "<font color = 'yellow'>142 Prototype Implementation: An Effective Learning Method in Process Automation<br></font>M. Kaushik, Preeti Pillai and Nalini C. Iyer<br><br>";
            text1 = text1 + "<font color = 'yellow'>160 IT Student’s Placement: Powered by Innovative Practices, Effective Assessment and Evaluation Methods for Improving\n" +
                    "Programming, Project Making and Professional Skills<br></font>Rajesh Dontham, Manoj A. Patil and Sandeep A. Thorat<br><br>";
            text1 = text1 + "<font color = 'yellow'>161 Designing and Teaching of Language Independent Object Oriented Programming Course<br></font>Moula Husain, Mallikarjun S. Akki, Meena S. Maralappanavar and D. G. Narayan<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);


            title3.setText("Session 5\nSession Code:[S508 FNTX]\nJanuary 8th, 9:00 am — 10:30 am");

            String text2 = "<font color='cyan'>Chairs:Dr. Guru Subramanyam, Chair, University of Dayton, USA;\n" +
                    "Dr. Ravishankar Deekshit, Dean (Academic), BMSCE<br><br></font>";

            text2 = text2 + "<font color = 'yellow'>\n" +
                    "232 Adaption of Learner Centric Methods in Engineering Education<br></font>Deepali Maste, Shrikant Kallurkar and P. N. Nemade<br><br>";
            text2 = text2 + "<font color = 'yellow'>\n" +
                    "244 FreeEDA-An Effective Open Source Software for Teaching Engineering Design Course in Electrical Sciences<br></font>Sachin Angadi, Anupama Itagi, V. Sushma, Kiran R. Patil and A. B. Raju<br><br>";
            text2 = text2 + "<font color = 'yellow'>" +
                    "263 Design Fixation: A comparison Between Native and Foreign Domains<br></font>V. Mahesh, P. V. Raja Shekar, P. Pramod Kumar, M. Kantha Reddy and Vishvaksena Ravichandran<br><br>";
            text2 = text2 + "<font color = 'yellow'>280 Impact of Novel Enhanced Learning on Results for Courses on Control Systems and Biostatistics in Medical Electronics\n" +
                    "Programme<br></font>Appaji M. Abhishek and H. N. Suma<br><br>";
            text2 = text2 + "<font color = 'yellow'>283 Industry Partnership - An Upshot Report<br></font>P. Meena, Ravishankar Deekshit, Jinendra Gugaliya and Venkateswaran Narayanan<br><br>";

            description3.setText(Html.fromHtml(text2), TextView.BufferType.SPANNABLE);


        }

        //Position 6
        if (position == 6) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : Venue : BSN Block VI Floor (ME-PG-01)");
            title1.setText("Session 6\nSession Code: [S607 FNT6]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs: Dr. Vijay Srinivas, Syracuse University, USA;<br>Dr. L. Ravi Kumar, Professor, BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>015 Ascertaining the Factors Influencing Students’ Performance for Engineering Pedagogy<br></font>Sandeep Singh Rawat, S. Sreenatha Reddy, Devi Prasad Mishra and Salma Sultana<br><br>";
            text = text + "<font color = 'yellow'>019 Analysis of Teaching Computer Programming in Indian Context<br></font>P. Chenna Reddy<br><br>";
            text = text + "<font color = 'yellow'>020 Impact of Engineering Faculty Participation in Decision Making and Commitment on Organizational Citizenship Behaviour<br></font>S. Pavan Kumar and Vijai N. Giri<br><br>";
            text = text + "<font color = 'yellow'>022 Undergraduate Students’ Research: A Case Study of Their Experiences and Perceptions in an Autonomous Institution<br></font>P. Srinivasa Pai, B. R. Shrinivasa Rao, Niranjan N. Chiplunkar and K. Subrahmanya Bhat<br><br>";
            text = text + "<font color = 'yellow'>057 An Anaylsis of Assessment Bias Influenced by Presentation and Writing Technique in Undergraduate Engineering Examination<br></font>Dipali D. Awasekar and Shashikant A. Halkude<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 6\nSession Code:[S607 ANT6]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Dr. Anette Kolmos, Professor, Aalborg University, Denmark;<br>Dr. Ravi Prakash Ramachandran, Professor, Rowan University, USA<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>\n" +
                    "034 Classroom Learning Model - Know Your Learner<br></font>Bipin Bihari Jayasingh<br><br>";
            text1 = text1 + "<font color = 'yellow'>\n" +
                    "066 An Active Learning strategy Think-Pair-Share to Teach Engineering Cources<br></font>S. A. Halkude and Sunita M. Dol<br><br>";
            text1 = text1 + "<font color = 'yellow'>162 An Experience of Introducing a Research Experience for Undergraduates (REU) Course<br></font>Ashok Shettar and Uma Mudenagudi<br><br>";
            text1 = text1 + "<font color = 'yellow'>169 Personality Mapping of Entry Level Engineering Students for Assessment of Engineering Competencies<br></font>Dhananjay G. Thombare and Manzoorahamad M. Mirza<br><br>";
            text1 = text1 + "<font color = 'yellow'>256 Integrating Research Experience in Project Based Learning<br></font>Jyoti Bali and Arunkumar Giriyapur<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);


            title3.setText("Session 6\nSession Code:[S608 FNTX]\nJanuary 8th, 9:00 am — 10:30 am");

            String text2 = "<font color='cyan'>Chairs:Dr. Khairiyah Mohd Yusof, Director, UTM, Malaysia;<br>Dr. S. Nagendra, Dean (MBA), BMSCE<br><br></font>";

            text2 = text2 + "<font color = 'yellow'>\n" +
                    "267 An Ontological Approach Towards the Next Generation Engineer - What It Means to Become and Be an Engineer<br></font>Avneet Hira<br><br>";
            text2 = text2 + "<font color = 'yellow'>\n" +
                    "288 Curricular Influence and Perceptions of Engineering Graduates on Socio Ethical Issues Related to Biotechnology<br></font>Savithri Bhat and M. Rajyalakshmi<br><br>";
            text2 = text2 + "<font color = 'yellow'>252 Prakalp-A Joint Venture of BVBCET and Sankalp Semiconductors Private Limited to Enhance Teaching-learning in Engineering\n" +
                    "Education<br></font>Sujata S. Kotabagi, K. M. Uma, B. L. Desai, Ashok Shettar, Sumit Bhat, Vivek Pawar and P. S. Bhat<br><br>";
            text2 = text2 + "<font color = 'yellow'>253 Role of Consultancy in Engineering Education<br></font>V. Nalina and P. Jayarekha<br><br>";
            text2 = text2 + "<font color = 'yellow'>286 QEEE Spoken English Bridge Course for the Enhancement of Communication Skills in Engineering Graduates<br></font>B. N. Vanishree and B. R. Shambhavi<br><br>";

            description3.setText(Html.fromHtml(text2), TextView.BufferType.SPANNABLE);


        }


        //Position 7
        if (position == 7) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : Venue : BSN Block VI Floor (ME-PG-02)");
            title1.setText("Session 7\nSession Code: [S707 FNT7]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs: Dr. Devdas Shetty, Dean, University of the district of Columbia - 1851, USA;<br>Dr. S. Jayanthi, HOD-Mathematics, BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>053 Formative Assessment Through Computer Mediation – Enriching Student Engagement<br></font>Richa Mishra and K. Kotecha<br><br>";
            text = text + "<font color = 'yellow'>091 Simulation Based Teaching of Power Electronics<br></font>P. V. V. Rama Rao, G. Durga Prasad and Jagateswar Patra<br><br>";
            text = text + "<font color = 'yellow'>083 Flipped Classroom for Developing Higher Order Thinking Skills<br></font>Avinash G. Kharat, Avinash M. Badadhe, Ravi S. Joshi, Seema S. Jejurikar and Nandkumar P. Dharmadhikari<br><br>";
            text = text + "<font color = 'yellow'>277 Exploring Social Learning ThroughWiki in Addition to Face to Face Interaction<br></font>K. Devaraj<br><br>";
            text = text + "<font color = 'yellow'>201 Usage of Alternate Assessment Tool for Enhanced Understanding of Product Design and Development Course at BMSCE<br></font>Madhav Murthy<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 7\nSession Code:[S707 ANT8]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Prof. Prakash Tewari, Dean (Academic Affairs), B V B College of Engineering & Technology, India;<br>Dr.K. Guruprasad, HOD-ME, BMSCE<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>\n" +
                    "146 An Effective Industry Institute Engagement for Curriculum Design and Delivery: A Success Story<br></font>Ashok Shettar, B. L. Desai, Nalini C. Iyer, K. M. Uma, A. B. Raju, C. D. Kerur, P. C. Nissimagoudar, Venkatesh Mane, S. Ramakrishna,\n" +
                    "M. R. Kiran, Sanjay Eligar, Anil Badiger and Anisha Joseph<br><br>";
            text1 = text1 + "<font color = 'yellow'>\n" +
                    "176 Industry-Institute Interaction : An Important Step Towards Empowering Skills of Engineering Students<br></font>Anilkumar Nandi, Jyoti Bali, M. Kuashik and Suhas Shirol<br><br>";
            text1 = text1 + "<font color = 'yellow'>184 Academia-Industry Collaboration to Improve the Quality of Teaching-Learning Process<br></font>M. Dakshayini and P. Jayarekha<br><br>";
            text1 = text1 + "<font color = 'yellow'>220 Augmented Reality as a Tool for Teaching a Course on Elements of Engineering Drawing<br></font>Madhav Murthy, K. Mallikharjuna Babu, P. Martin Jebaraj, L. Ravi Maddinapudi, Vamsidhar Sunkari and Dwarampudi Veera Reddy<br><br>";
            text1 = text1 + "<font color = 'yellow'>241 Project Based Learning: An Industry Perspective<br></font>Hemachandra Bhat, J. Sujatha, K. S. R. Mohan and Geetha Prakash<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);

        }

        //Position 8
        if (position == 8) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : Venue : BSN Block VI Floor (EE-PG-01)");
            title1.setText("Session 8\nSession Code: [S807 FNT8]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs:Dr. Mohan Rao, Professor, Tennessee Technological University, USA;<br>Dr. Y. Chandrashekara Reddy, HOD-Chemistry, BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>009 Expectations of Industry from Technical Graduates: Implications for Curriculum and Instructional Processes<br></font>P. K. Tulsi and M. P. Poonia<br><br>";
            text = text + "<font color = 'yellow'>012 Industry Innovations for Enhanced Employability: A Case Study of Academic Industry Interaction<br></font>H. S. Saini and S. S. Rawat<br><br>";
            text = text + "<font color = 'yellow'>047 Photovoltaics in India-Thrust on Research and Education<br></font>N. Ramchander, Tulasi Ram Das and T. S. Surendra<br><br>";
            text = text + "<font color = 'yellow'>080 Defining Paradigms for Effective Industry Institute Collaboration<br></font>Ameet Chavan and Bhujanga Rao Sanapala<br><br>";
            text = text + "<font color = 'yellow'>101 How to Train an Engineer – A Proposed Model<br></font>J. Deepa<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 8\nSession Code:[S807 ANTX]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Dr. Y. P. Obulesu, Professor, K L University, India;<br>Dr. G. N. Sekhar, Vice Principal, BMSCE<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>\n" +
                    "051 The Role of Tutorials in Engineering Design Course<br></font>Nagaraj Ekabote and Krishnaraja G. Kodancha<br><br>";
            text1 = text1 + "<font color = 'yellow'>\n" +
                    "079 Parallel Learning Reinforcement - A Case Study<br></font>S. Jayanthi, G. N. Shekar and T. Renuka<br><br>";
            text1 = text1 + "<font color = 'yellow'>086 Student Performance Using Blooms Cognition Levels : A Case Study<br></font>H. R. Bhagyalakshmi and D. Seshachalam<br><br>";
            text1 = text1 + "<font color = 'yellow'>090 Management of Cognitive Abilities and Functional Skills Among Junior College Teachers – A Study<br></font>Seema S. Desai<br><br>";
            text1 = text1 + "<font color = 'yellow'>095 Indian Technical Education Service (ITES) and Its Organization Structure - A Proposal to Improve Quality of Engineering\n" +
                    "Education<br></font>V. G. Renumol, R. Gopeekrishnan and G. Krishnakumar<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);


            title3.setText("Session 8\nSession Code:[S808 FNT9]\nJanuary 8th, 9:00 am — 10:30 am");

            String text2 = "<font color='cyan'>Chairs:Dr. Sandeep Sancheti, President, Manipal University, Jaipur, India;<br>Dr. M. Rajyalakshmi, HOD-BT, BMSCE<br><br></font>";

            text2 = text2 + "<font color = 'yellow'>\n" +
                    "116 Entrepreneurship and Innovation: A Study on Factors Affecting Engineering Graduates towards Entrepreneurship and\n" +
                    "Innovation<br></font>G. Satheesh Raju, N. Suman Kumar and N. Ch. Ramgopal<br><br>";
            text2 = text2 + "<font color = 'yellow'>\n" +
                    "163 Innovation Management Process in Young Academic Institutes<br></font>Archana Mantri and Sachin Ahuja<br><br>";
            text2 = text2 + "<font color = 'yellow'>215 Accelerating Technology Commercialization: University of Akron (Ohio) using the NSF I-Corps Model<br></font>Gopal Nadkarni, Elyse Ball and Daniel Hampu<br><br>";
            text2 = text2 + "<font color = 'yellow'>175 Analysis of Divergent Thinking in Indian Engineering Students<br></font>V. Mahesh, P. V. Raja Shekar and P. Pramod Kumar<br><br>";
            text2 = text2 + "<font color = 'yellow'>208 Integrating Mini Project Based Learning Approach in Teaching-Learning Process<br></font>M. C. Padma and V. Sridhar<br><br>";

            description3.setText(Html.fromHtml(text2), TextView.BufferType.SPANNABLE);


        }


        //Position 9
        if (position == 9) {
            TextView place = (TextView) findViewById(R.id.place);
            place.setText("Venue : Venue :BSN Block VI Floor (EE-PG-02)");
            title1.setText("Session 9\nSession Code: [S907 FNTX]\nJanuary 7th, 9 am - 10.30 am");

            //Chair
            String text = "<font color='cyan'>Chairs: Dr. Subra Ganesan, Professor, Oakland University, USA;<br>Dr. T. S. Pranesh, HOD-Physics, BMSCE<br><br></font>";

            text = text + "<font color = 'yellow'>024 Employability Skills - Student Self Assessment of Strong and Weak Areas<br></font>Remadevi O.T and V. Ravi Kumar<br><br>";
            text = text + "<font color = 'yellow'>031 Practical Approach to Handle Large Classes: A Case Study for Keeping Sessions Live<br></font>Sachin S. Patil, Khyamling A. Parane and Shivananda R. Poojara<br><br>";
            text = text + "<font color = 'yellow'>050 Global Convergence to Improve the Internal Quality Assurance for Post Graduate Engineering Programmes<br></font>Vedhathiri Thanikachalam<br><br>";
            text = text + "<font color = 'yellow'>236 Transforming Engineering Education Exploiting Inveterate Symbiosis Between Science and Spirituality<br></font>S. K. Jha<br><br>";
            text = text + "<font color = 'yellow'>250 Flipped Classroom: An Efficient Pedagogical Tool to Teach a Course for Final Year Computer Science and Engineering\n" +
                    "Graduate Students<br></font>Padmashree Desai and M. Vijayalakshmi<br><br>";


            description1.setText(Html.fromHtml(text), TextView.BufferType.SPANNABLE);

            //
            title2.setText("Session 9\nSession Code:[S907 ANTX]\nJanuary 7th, 4:15pm — 5:45pm");

            String text1 = "<font color='cyan'>Chairs:Dr. Gopalakrishna Joshi, Professor, B V B College of Engineering & Technology, India;<br>Dr. S. Muralidhar, HOD-Civil, BMSCE<br><br></font>";

            text1 = text1 + "<font color = 'yellow'>\n" +
                    "103 Empowering Engineering Education: From Classroom to Corporate<br></font>" +
                    "Shina Pahuja and Meenu Khurana<br><br>";
            text1 = text1 + "<font color = 'yellow'>\n" +
                    "109 Engineering Education: Challenges, Threats and Opportunities<br></font>P. Venugopal Reddy<br><br>";
            text1 = text1 + "<font color = 'yellow'>117 Emphasis on the Cognitive Framework in Teaching - Learning process in Engineering Education: An Empirical Overview<br></font>K. N. Raja Rao, N. S. Narahari and C. Bindu Ashwini<br><br>";
            text1 = text1 + "<font color = 'yellow'>139 Performance Excellence Model for Engineering Education: An Enabler for Sustaining Quality<br></font>M. PalaniNatha Raja and A. M. Abirami<br><br>";
            text1 = text1 + "<font color = 'yellow'>174 SITAC : Social IT Awareness Campaign - A Case Study of Computer Awareness Campaign in Primary and Secondary Schools<br></font>Nikhil D. Boob, Prem S. Potabatti and Anil Surve<br><br>";

            description2.setText(Html.fromHtml(text1), TextView.BufferType.SPANNABLE);

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