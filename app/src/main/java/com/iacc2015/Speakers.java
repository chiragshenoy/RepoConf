package com.iacc2015;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.gitonway.lee.niftymodaldialogeffects.lib.Effectstype;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;


/**
 * Created by Chirag Shenoy on 09-Jun-15.
 */
public class Speakers extends Activity {


    NiftyDialogBuilder dialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speakers);
        dialogBuilder = NiftyDialogBuilder.getInstance(this);

        CardView cv = (CardView) findViewById(R.id.cv);
        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Sri. Vidyashankar")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage(" Sri. Vidyashankar is the President of a premier trade body, India Electronics and Semiconductor Association. In his previous assignments, Vidyashankar has served as Additional Chief Secretary, Department of Commerce & Industries and Principal Secretary, Department of IT, BT and S&T, Government of  Karnataka. He comes in with more than 30 years experience in management and administration of various government offices, autonomous bodies, boards and corporations and is serving on the board of various industry & academia committees, the major ones being AMSI, IIIT – B and CEO of KIADB. He was also part of the core group for KIG2020. He brings in an excellent combination of Leadership, ESDM knowledge, execution skills, industry connects and an all success history that will help widen IES A’s role in the ESDM landscape. Sri. Vidyashankar has received many national and international recognitions, the most recent one being adjudged as World’s Best Mentor by Technology Business Incubators for his efforts in promoting technology and technology based solutions that transformed human lives and societies.")                     //.withMessage(null)  no Msg
                        .withMessageColor("#FFFFFFFF")                              //def  | withMessageColor(int resid)
                        .withDialogColor("#ffffa500")                               //def  | withDialogColor(int resid)
                        .withDuration(700)                                          //def
                        .withEffect(Effectstype.Fadein)                                         //def Effectstype.Slidetop
                        .withButton1Text("OK")                                      //def gone
                        .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
//                        .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });


        CardView cvspeaker1 = (CardView) findViewById(R.id.cvspeaker1);
        cvspeaker1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.Roger Zimmermann")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr. Roger Zimmermann is Director of Media Management Research Lab, Deputy Director with the Interactive and Digital Media Institute at National University of Singapore and co-director of the Centre of Social Media Innovations for Communities, a research institute funded by the National Research Foundation of Singapore. Prior to joining NUS he held the position of Research Area Director with the Integrated Media Systems Center (IMSC) at the University of Southern California (USC).  Dr. Zimmermann is a Senior Member of IEEE and a member of ACM. He has co-authored a book, six patents and more than hundred-eighty conference publications, journal articles and book chapters. He is on the editorial boards of the IEEE Multimedia Communications Technical Committee R-Letter, Springer International Journal of Multimedia Tools and Applications and ACM Transactions on Multimedia journal. Recently he was the general chair of the ACM Multimedia Systems 2014 and IEEE ISM 2015 conferences.").withMessageColor("#FFFFFFFF")                              //def  | withMessageColor(int resid)
                        .withDialogColor("#ffffa500")                               //def  | withDialogColor(int resid)
                        .withDuration(700)                                          //def
                        .withEffect(Effectstype.Fadein)                                         //def Effectstype.Slidetop
                        .withButton1Text("OK")                                      //def gone
                        .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
//                        .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });

        CardView cv2 = (CardView) findViewById(R.id.cvspeaker2);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.Biplab Sikdar")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr. Biplab Sikdar is an academician in the department of Electrical, Computer and Systems Engineering, National University of Singapore. He has to his credit several awards of which Leiv Eiriksson Fellowship and Japan Society for the Promotion of Science Fellowship are noteworthy. His research interests include wireless MAC protocols, transport protocols, network security, queuing theory, green communications and smart grids. He has received grants from National Science Foundation, DARPA, Intel Corporation and WiMAX Forum. Dr. Sikdar is a member of IEEE and ACM.  He has served as an Associate Editor of the IEEE Transactions on Communications from 2007-2012.").withDialogColor("#ffffa500")                               //def  | withDialogColor(int resid)
                        .withDuration(700)                                          //def
                        .withEffect(Effectstype.Fadein)                                         //def Effectstype.Slidetop
                        .withButton1Text("OK")                                      //def gone
                        .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
//                        .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });

        CardView cv3 = (CardView) findViewById(R.id.cvspeaker3);
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.Seeram Ramakrishna")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr. Seeram Ramakrishna is Director, Center for Nanofibers and Nanotechnology and Vice-President (Research Strategy) at National University of Singapore. He is the founding Co-Director of NUS Nanoscience & Nanotechnology Initiative. Prof. Seeram chairs the governing board of Solar Energy Research Institute of Singapore and Clean Energy Program Office, National Research Foundation. He serves on the boards of Institution of Engineers Singapore, Energy Studies Institute, Ministry of Foreign Affairs and Ministry of Trade and Industry, Temasek Polytechnic, Ministry of Education and DSO National Laboratories, Ministry of Defence. He is a member of NUS President’s taskforce on Global Asia Institute. He is known globally for his pioneering work on electrospinning of nanofibers. According to the ISI Web of Knowledge, he is ranked 69th in the world in Materials Science by Essential Science Indicators. He is a Fellow of major professional societies in Singapore, UK and USA. He is a recipient of Changjiang Professorship of China, ASEAN Outstanding Engineering Award, NUS Outstanding Researcher Award, Lee Kuan Yew Fellowship and Cambridge Nehru Scholarship. He is a Fellow of ASEAN Academy of Engineering and Technology, ASEAN, and Royal Academy of Engineering, UK.").withDuration(700)                                          //def
                        .withEffect(Effectstype.Fadein)                                         //def Effectstype.Slidetop
                        .withButton1Text("OK")                                      //def gone
                        .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
//                        .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });


        CardView cv4 = (CardView) findViewById(R.id.cvspeaker4);
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Mr. Vikas Mathur")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Mr. Vikas Mathur is a senior technology and business professional with over two decades of experience in the enterprise software industry managing large, multi-site product engineering functions at major technology vendors like IBM, Oracle and HP (Tandem). Prior to co-founding RightCloudz, he built the Cloud Lab at IBM Singapore to create advanced, first-of-a-kind cloud solutions for large enterprise customers in several industries. He is an expert in Cloud solutioning and design and has been a regular speaker at several conferences in the ASEAN region. His other areas of specialization include Grid computing, Data center and Service management, Remote team management, Product porting, support and maintenance. ").withEffect(Effectstype.Fadein)                                         //def Effectstype.Slidetop
                        .withButton1Text("OK")                                      //def gone
                        .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
//                        .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });

        CardView cv5 = (CardView) findViewById(R.id.cvspeaker5);
        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.B.V.R. Chowdari")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage(" Dr. B.V.R. Chowdari is the Executive Director, NUS - India Research Initiatives at National University of Singapore. He has a vast professional experience of over 44 years. His research focus on the areas of Material Science and Electrolyte Materials. He has published more than 260 research papers and edited 18 books. He is the founder of Asian Society for Solid State Ionics in Singapore in 1986. He has extended his service as Honorary Advisor, Government of Andhra Pradesh, India. He is also the visiting Professor at Shanghai Institute of Ceramics - Chinese Academy of Sciences, China. He has taken up several roles including  Presidentship of the International Union for Materials Research Societies and Materials Research Society of Singapore.").withButton1Text("OK")                                      //def gone
                        .isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
//                        .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });

        CardView cv6 = (CardView) findViewById(R.id.cvspeaker6);
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.Hari Krishna Garg")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr. Hari Krishna Garg, an academician at National University of Singapore, has obtained his MBA from Syracuse University and PhD from Concordia University. He has taken up several leadership positions including Group head, Senior faculty member and Co-chair Accreditation committee. He is the Founder of PurpleACE Pte Ltd and Fatte Telecom Pte Ltd in Singapore. His research areas are Mobile/wireless Communication Systems, Digital Watermarking, Multi-media Communications and Value-added Services. He has received  the 1983 FA Gerard Prize for the best graduating student in the Faculty of Engineering and Computer Science, Concordia University, Canada, United Nations Industrial Development Organization Expert and Teaching Excellence Awards in the Faculty of Engineering.").isCancelableOnTouchOutside(true)                           //def    | isCancelable(true)
//                        .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });

        CardView cv7 = (CardView) findViewById(R.id.cvspeaker7);
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.Raja Datta")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr. Raja Datta is professor at Electronics & Electrical Communication Engineering, IIT Kharagpur since 2007. He research interests are Computer Communication and Networks, Wireless Sensor Networks, Optical WDM Networks, Mobile Ad Hoc Networks, Distributed Systems and Inter Planetary Networks. He is the author of Handbook on Securing Cyber-Physical Critical Infrastructure. His on-going consultancy project is Implementation of Campus Network for Haldia Dock Complex. He has taken up several sponsored projects including Teachers Empowerment, Student Empowerment & Integration of Tools for Improvement and Protocol Development for Interplanetary Delay Tolerant Networks.")
//                        .setCustomView(R.layout.custom_view, v.getContext())         //.setCustomView(View or ResId,context)
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });

        CardView cv8 = (CardView) findViewById(R.id.cvspeaker8);
        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.Y V S Lakshmi")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr. Y V S Lakshmi is heading the IPR and Marketing DIvision at Centre for Development of Telematics. She has her Doctorate degree from Indian Institute of Science and obtained higher education in Patent laws. She is Coordinator for IEEE  Women in Engineering, Bangalore Section. She has taken up lead role in conducting activities to facilitate global recruitment and retention of women in technical disciplines. Her involvement in promoting professional career growth for women engineers and scientists is noteworthy. She has been a mentor for young women in junior and high schools. ")
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });

        CardView cv9 = (CardView) findViewById(R.id.cvspeaker9);
        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Ms. Vishakha Vaidya")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Ms. Vishakha Vaidya, a computer scientist at Adobe and PGPEM student at IIM Bangalore, is a programmer, ideator and learner, at heart. She loves technology and considers programing as a stress buster. She completed her masters in computer science from Pune University and has an overall experience of 16 years. She has worked on various technologies from desktop applications to middleware. She’s worked on development of products like Lotus Wordpro, Lotus 123, IBM Directory Integrator and currently works in the core engineering team of Dreamweaver. Her role involves suggesting and implementing feature ideas and new workflows. Her ideas have been accepted as patents, papers, sneak peeks to new technologies etc. at various technical summits in Adobe. Out of her personal interest, she likes to engage with the user community. She is currently pursuing an executive MBA from IIM Bangalore.  Other than being a technologist, she is a professional, nature and wildlife photographer and loves to see the world through her camera lens.").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });


        CardView cv10 = (CardView) findViewById(R.id.cvspeaker10);
        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Mr.Sudipto Shankar")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Mr.Sudipto Shankar is Associate Vice President and Principal Technology Architect with Infosys Platforms Unit. He is responsible for the development of Infosys Information Platform , an open source based big data and analytics platform developed by Infosys. As part of his current role he is also responsible for driving innovation in the space of bigdata and analytics using open source technologies like Hadoop , Spark , R with some of the enterprise customers. Prior to joining Infosys , he was with SAP Labs as Chief Development Architect of Strategic Projects Group. He had been responsible for HANA based application optimization with the customers leveraging in-memory set based programming paradigm. In the past he has played multiple roles as Architect, Lead in SAP ERP implementations for customers.").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });


        CardView cv11 = (CardView) findViewById(R.id.cvspeaker11);
        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Ms.Vidya Sridharan")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Ms.Vidya Sridharan, is a seasoned software industry professional with two decades of experience. She is presently running her own enterprise providing advisory to venture capitalists and business leaders on business technology.  Prior to this, she was Director and Head Architect at Unilever and served as member of the architecture board. Earlier Vidya worked for long stints at Oracle, McAfee and Intuit technologies across a range of domains within Enterprise Computing, Information security and Cloud technologies. Vidya is also an angel investor within Oracle Venture Group. Vidya is an alumnus of BMSCE - she did her engineering degree in computer science and subsequently did her MBA and advance management programme from NTU Singapore and UC Berkeley, California.").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

        CardView cv12 = (CardView) findViewById(R.id.cvspeaker12);
        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Prof.Om Vikas")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Prof. Om Vikas was Formerly Director, Indian Institute of Information Technology & Management, Gwalior. He began his career as System Engineer at Tata Consultancy Services and became Senior Director in the Department of Information Technology, Ministry of Communications & IT (Govt of India) where he served as head of Human Centered Computing Division and Computer Manpower Development Division. As Counsellor (Science & Technology) in Indian Embassy, Tokyo, Japan he had many firsts to his credit towards promoting India-Japan cooperation between India and Japan. He nurtured the Technology development for Indian Languages program over two decades and contributed. many firsts in promotion of Indian Language Technology. He represented India in UNESCO on Experts Committee on Multilingualism in Cyberspace. He was founder editor of the Language Technology Quarterly. Prof. Om Vikas is Fellow / Member of various Professional Societies, namely, IEEE (USA) Russian Academy of Informatization of Education, Institute of Electronics & Telecom Engineers, Indian Society for Technical Education, Institution of Engineers, IEEE Engineering Management Society, and Computer Society of India. He is Secretary of Centre of Excellence of Interdisciplinary Mathematics of the International Forum of Interdisciplinary Mathematics.").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

        CardView cv13 = (CardView) findViewById(R.id.cvspeaker13);
        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.R.Dattakumar")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr.R.Dattakumar is currently serving as Special officer at VTU e-Learning Centre, Mysore. He has his earlier experience as Senior Manager, Mission10X. As an initiative from Mission 10X, he has taken a key role in conducting faculty empowerment workshops. His sessions on activity based learning have motivated hundreds of teachers across Karnataka to transform their teaching techniques. He is responsible for several initiatives at VTU, of which innovative workshops on research methodologies for doctoral students is significant. ").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

        CardView cv14 = (CardView) findViewById(R.id.cvspeaker14);
        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Mr. Ravikiran Annaswamy")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Mr. Ravikiran Annaswamy is Founder and CEO of the newly launched Consulting and Startup mentoring platform - Innohabit Venture Labs. He works with young entrepreneurs helping them to get started and achieve market success. He is also the Co-founder and Investor at Teritree Technologies - a Personalized Email marketing technology venture. He dedicates his time to startup ecosystem as Advisor, Mentor and Angel investor. He has over 20 years of business experience as Entrepreneur and at Nokia Siemens Networks and Siemens AG. He is an engaged Professional volunteer, currently the Chairman for IEEE Bangalore section and Industry Relations for IEEE - Asia Pacific. He is a thought leader and speaker at various prestigious international business conferences. He has done his MBA from Indian Institute of Management, Bangalore and has graduated from UVCE Bangalore. He has been recognized for his work by several awards: Siemens Director’s award for Innovation, Customer management and Project Execution, IEEE Bangalore - Best volunteer award, Runner up at AIMA’s National Contest for Young Managers and Asia finalist at Global Social Venture Competition conducted by Berkley Haas school of business.").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

        CardView cv15 = (CardView) findViewById(R.id.cvspeaker15);
        cv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr. Annappa")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr. Annappa is heading the department of Computer Science and Engineering at National Institute of Technology, Surathkal. His areas of interest include Distributed Computing Systems, Cloud Computing Process, Mining Social Network Analysis and Big Data Analytics. He secured his PhD from NITK and has total work experience of 16 years. He is the author of the book titled \"Absolute C++”, published by Pearson Education Limited. He is currently guiding seven doctoral students and has made significant contribution to the research community. ").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

        CardView cv16 = (CardView) findViewById(R.id.cvspeaker17);
        cv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr. Rajanikanth")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage("Dr. Rajanikanth, an academician, has vast experience in the field of engineering education. He has served as Principal and Advisor at M.S. Ramaiah Institute of Technology, Bangalore. He has presided over several boards of Computer Science and Engineering across colleges in VTU. He is currently a Consultant and key resource person for the formulation and practice of outcome based education in many colleges. ").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

        CardView cv18 = (CardView) findViewById(R.id.cvspeaker18);
        cv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr.Atal Chaudhuri")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                        .withMessage(" Dr. Atal Chaudhuri is Professor in the Department of Computer Science and Engineering, Jadavpur University. He has over 100 publications at both National and International level. Eight scholars have been awarded PhD degree under his guidance, one is going to submit his dissertation for possible award of PhD degree and nine more are working with him. His current field of interest is Mobile ad-hoc network and Information security. Moreover his interest and expertise in microprocessor and microcontroller based instrumentation is well established in various industries. He was an active member of the technical committee for conducting and counselling State Level Joint Entrance Examination for admission to Engineering and Medical Courses. He has developed software for parallel counselling which was successfully used for last four consecutive years. He has served as an Expert for AICTE, NAAC, UGC and NBA team for accreditation of various institutions for last 12 years. He is also an expert for Public Service Commission. He is a well known person for delivering technical and popular lectures in his state as well as other states in India and abroad. He is the life member of both Computer Society of India and Institute of Engineers, also the Vice chairman of Computer Division of Institute of Engineers.").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

        CardView cv19 = (CardView) findViewById(R.id.cvspeaker19);
        cv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Mr. Mohan Kumar C.M")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                                //.withMessage(" Dr. Atal Chaudhuri is Professor in the Department of Computer Science and Engineering, Jadavpur University. He has over 100 publications at both National and International level. Eight scholars have been awarded PhD degree under his guidance, one is going to submit his dissertation for possible award of PhD degree and nine more are working with him. His current field of interest is Mobile ad-hoc network and Information security. Moreover his interest and expertise in microprocessor and microcontroller based instrumentation is well established in various industries. He was an active member of the technical committee for conducting and counselling State Level Joint Entrance Examination for admission to Engineering and Medical Courses. He has developed software for parallel counselling which was successfully used for last four consecutive years. He has served as an Expert for AICTE, NAAC, UGC and NBA team for accreditation of various institutions for last 12 years. He is also an expert for Public Service Commission. He is a well known person for delivering technical and popular lectures in his state as well as other states in India and abroad. He is the life member of both Computer Society of India and Institute of Engineers, also the Vice chairman of Computer Division of Institute of Engineers.")
                        .withMessage("Mr. Mohan Kumar C.M. is working as Senior Manager-Systems at Vellore Institute of Technology University. He handles the infrastructure and IT related service at VIT. He is the responsible for the concept and development of Data Centre in the campus. Mr. Mohan ensures timely up gradations & state-of-art facilities to receive and maintain the reputation of excellence.")
                        .setButton1Click(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                dialogBuilder.dismiss();
                            }
                        }).show();
            }
        });

        CardView cv20 = (CardView) findViewById(R.id.cvspeaker20);
        cv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr. P Suresh")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                                //.withMessage(" Dr. Atal Chaudhuri is Professor in the Department of Computer Science and Engineering, Jadavpur University. He has over 100 publications at both National and International level. Eight scholars have been awarded PhD degree under his guidance, one is going to submit his dissertation for possible award of PhD degree and nine more are working with him. His current field of interest is Mobile ad-hoc network and Information security. Moreover his interest and expertise in microprocessor and microcontroller based instrumentation is well established in various industries. He was an active member of the technical committee for conducting and counselling State Level Joint Entrance Examination for admission to Engineering and Medical Courses. He has developed software for parallel counselling which was successfully used for last four consecutive years. He has served as an Expert for AICTE, NAAC, UGC and NBA team for accreditation of various institutions for last 12 years. He is also an expert for Public Service Commission. He is a well known person for delivering technical and popular lectures in his state as well as other states in India and abroad. He is the life member of both Computer Society of India and Institute of Engineers, also the Vice chairman of Computer Division of Institute of Engineers.")
                        .withMessage("Dr. P Suresh is associated with E-commerce Labs, Infosys for more than eight years. He has anchored all research collaborations between Infosys and premier academic institutes of India. He has obtained PhD from IIT, Kanpur and ME from IISc, Bangalore. His research interests are in Computer architecture, Compiler optimization, Computer networks, Distributed systems, Game Theory & Mechanism design, performance analysis, Formal language & automata theory. He has over 30 publications in various journals and refereed conferences. Besides research he has great interest in teaching and networking with people from all sections of the society.  He has taught students at IIT for various courses. He has worked as consultant with Mentor Graphics, AMD, Cadence, Karnataka Police, Port Trust of India, KSRTC and NIC. He has served/serving as Board of advisors, Board of Studies at IIT Indore, NITW, VTU, VIT and few other autonomous institutes. ").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

        CardView cv21 = (CardView) findViewById(R.id.cvspeaker21);
        cv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogBuilder
                        .withTitle("Dr. Senthilvel")                                  //.withTitle(null)  no title
                        .withTitleColor("#FFFFFF")                                  //def
                        .withDividerColor("#11000000")                              //def
                                //.withMessage(" Dr. Atal Chaudhuri is Professor in the Department of Computer Science and Engineering, Jadavpur University. He has over 100 publications at both National and International level. Eight scholars have been awarded PhD degree under his guidance, one is going to submit his dissertation for possible award of PhD degree and nine more are working with him. His current field of interest is Mobile ad-hoc network and Information security. Moreover his interest and expertise in microprocessor and microcontroller based instrumentation is well established in various industries. He was an active member of the technical committee for conducting and counselling State Level Joint Entrance Examination for admission to Engineering and Medical Courses. He has developed software for parallel counselling which was successfully used for last four consecutive years. He has served as an Expert for AICTE, NAAC, UGC and NBA team for accreditation of various institutions for last 12 years. He is also an expert for Public Service Commission. He is a well known person for delivering technical and popular lectures in his state as well as other states in India and abroad. He is the life member of both Computer Society of India and Institute of Engineers, also the Vice chairman of Computer Division of Institute of Engineers.")
                        .withMessage("Dr. Senthilvel is professionally qualified in Healthcare (HC) & Life sciences (LS) domain with over 20 years of professional experience in MNC Healthcare & IT organizations as SME, Principal Industry Consultant and Solution Architect. He specializes in various areas like various Social & eHealth initiatives, Healthcare IT solutions, Scientific computing and Clinical Data analytics projects for Lifestyle diseases (like Diabetes & Coronary Heart Diseases). Senthil is currently with IBM India Software Labs, Bangalore as Healthcare & Life Sciences SME and IBM Watson Health Industry solutions consultant. He holds a diploma and degree in Pharmaceutical sciences from Coimbatore Medical College & The Tamilnadu Dr. MGR Medical University, Chennai and Masters & PhD in Bioprocess technology from ICT (formerly UDCT), Mumbai. Dr. Senthilvel handles University Relations and Shared University Research programs for Healthcare & Life Sciences domain in the country.").setButton1Click(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialogBuilder.dismiss();
                    }
                }).show();
            }
        });

    }
}
