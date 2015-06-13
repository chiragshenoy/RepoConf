package com.iacc2015;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;


import com.gc.materialdesign.views.ButtonRectangle;
import com.gitonway.lee.niftymodaldialogeffects.lib.NiftyDialogBuilder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;


/**
 * Created by Chirag Shenoy on 11-Jun-15.
 */
public class NewPaperP extends Activity {

    String[] d1s1 = {"1570077647", "1570078337", "1570078627", "1570079411", "1570098009", "1570101943", "1570103031", "1570103697", "1570104093"};

    String[] d1s2 = {"1570104103", "1570104517", "1570104919", "1570105513", "1570105603", "1570106315", "1570106677", "1570107121", "1570107339", "1570107521", "1570107913", "1570107951"};

    String[] d1s3 = {"1570110271", "1570108335", "14", "17", "18", "1570079413", "1570078803", "1570077681", "1570079219", "1570079491", "1570105347", "1570079471"};

    String[] d1s4 = {"1570079839", "1570081275", "1570085767", "1570086257", "1570087309", "1570088301", "1570093219", "1570095803", "1570095921", "1570109983", "1570101083"};

    String[] d1s5 = {"1570101879", "1570102481", "1570102491", "1570102823", "1570103323", "1570103401", "1570103527", "1570105477", "1570103727", "1570103741", "1570104129", "1570104141"};

    String[] d1s6 = {"1570104173", "1570104175", "1570104255", "1570104461", "1570104741", "1570105319", "1570108135", "1570105581", "1570105583", "1570108417", "1570108595"};

    String[] d1s7 = {"27", "1570109381", "1570108647", "1570102743", "1570102793", "1570102811", "1570103711", "1570104393", "1570104983", "1570105381", "1570106905", "1570109837"};

    String[] d1s8 = {"1570085851", "1570102413", "1570104063", "1570104087", "1570105373", "1570110267", "1570077779", "1570078819", "1570079023", "1570079047", "1570079371"};

    String[] d1s9 = {"1570091575", "1570097587", "1570099081", "1570099251", "1570101593", "1570079399", "1570101719", "1570102803", "1570104443", "1570104925", "1570105481", "1570106327"};

    String[] d1s10 = {"1570106867", "1570106919", "1570108195", "1570108593", "1570108629", "1570108839", "5", "6", "1570109527", "1570109543", "1570103881", "1570108743"};

    String[] d1s11 = {"1570105883", "1570102467", "1570105551", "1570109073", "1570103723", "1570107859"};

//Day 2

    String d2s1[] = {"1570109125", "1570109315", "1570109809", "1570109333", "1570109361", "1570109429", "1570109603", "1570109993", "1570110257", "34"};

    String d2s2[] = {"1570106677", "1570107339", "1570109457", "1570108651", "1570108771", "1570109693", "1570109733", "1570109319", "1570109815", "1570109833", "1570109871", "1570109941", "1570109755"};

    String d2s3[] = {"1570109089", "1570110185", "1570109189", "1570108133", "1570110391", "28", "1570109389", "1570106609", "1570106877", "1570108369", "1570096135"};

    String d2s4[] = {"1570106883", "1570107847", "1570108103", "1570108293", "1570108363", "1570105589", "1570108421", "1570105585", "1570108599", "1570108637", "1570108735", "1570108791"};

    String d2s5[] = {"1570108841",
            "1570108879",
            "1570109007",
            "1570109097",
            "1570109143",
            "1570109153",
            "1570109157",
            "1570109197",
            "1570109211",
            "1570109285",
            "1570109293"};

    String d2s6[] = {"1570109347",
            "1570109379",
            "1570109423",
            "1570109481",
            "1570109505",
            "1570109509",
            "1570109563",
            "1570109701",
            "1570109707",
            "1570109745",
            "1570109749",
            "1570109883"};


    String d2s7[] = {"1570102811",
            "1570109891",
            "1570099779",
            "1570100563",
            "24",
            "23",
            "30",
            "52",
            "53",
            "2",
            "1570095049",
            "1570109945"};

    String d2s8[] = {"1570108859",
            "1570108911",
            "1570108917",
            "1570108993",
            "1570109129",
            "1570109141",
            "1570109195",
            "1570109219",
            "1570109297",
            "1570109353",
            "1570109441",
            "1570109475"};

    String d2s9[] = {"1570109523",
            "1570109747",
            "1570109839",
            "1570109877",
            "1570109989",
            "8",
            "1570107225",
            "1570108871",
            "1570109357",
            "1570109519",
            "1570104163"};

    String d2s10[] = {"39",
            "1570107469",
            "1570108087",
            "1570108985",
            "1570109227",
            "1570109393",
            "1570109415",
            "1570109469",
            "1570109623",
            "1570109641",
            "1570109793",
            "1570106885"};

    String d2s11[] = {"1570109413",
            "1570109687",
            "1570108589",
            "1570105717",
            "1570108873",
            "1570109087",
            "51",
            "1570109321",
            "1570109595"};


//    String[] total = {"1570077647", "1570078337", "1570078627", "1570079411", "1570098009", "1570101943", "1570103031", "1570103697", "1570104093", "1570104103", "1570104517", "1570104919", "1570105513", "1570105603", "1570106315", "1570106677", "1570107121", "1570107339", "1570107521", "1570107913", "1570107951","1570110271", "1570108335", "14", "17", "18", "1570079413", "1570078803", "1570077681", "1570079219", "1570079491", "1570105347", "1570079471","1570079839", "1570081275", "1570085767", "1570086257", "1570087309", "1570088301", "1570093219", "1570095803", "1570095921", "1570109983", "1570101083",};

    String[] total = {"1570104103", "1570104517", "1570104919", "1570105513", "1570105603", "1570106315", "1570106677", "1570107121", "1570107339", "1570107521", "1570107913", "1570107951",
            "1570110271", "1570108335", "14", "17", "18", "1570079413", "1570078803", "1570077681", "1570079219", "1570079491", "1570105347", "1570079471",
            "1570079839", "1570081275", "1570085767", "1570086257", "1570087309", "1570088301", "1570093219", "1570095803", "1570095921", "1570109983", "1570101083",
            "1570101879", "1570102481", "1570102491", "1570102823", "1570103323", "1570103401", "1570103527", "1570105477", "1570103727", "1570103741", "1570104129", "1570104141",
            "1570104173", "1570104175", "1570104255", "1570104461", "1570104741", "1570105319", "1570108135", "1570105581", "1570105583", "1570108417", "1570108595",
            "27", "1570109381", "1570108647", "1570102743", "1570102793", "1570102811", "1570103711", "1570104393", "1570104983", "1570105381", "1570106905", "1570109837",
            "1570085851", "1570102413", "1570104063", "1570104087", "1570105373", "1570110267", "1570077779", "1570078819", "1570079023", "1570079047", "1570079371",
            "1570091575", "1570097587", "1570099081", "1570099251", "1570101593", "1570079399", "1570101719", "1570102803", "1570104443", "1570104925", "1570105481", "1570106327",
            "1570106867", "1570106919", "1570108195", "1570108593", "1570108629", "1570108839", " 5", " 6", "1570109527", "1570109543", "1570103881", "1570108743",
            "1570105883", "1570102467", "1570105551", "1570109073", "1570103723", "1570107859", "1570109125", "1570109315", "1570109809", "1570109333", "1570109361", "1570109429", "1570109603", "1570109993", "1570110257", "34",
            "1570106677", "1570107339", "1570109457", "1570108651", "1570108771", "1570109693", "1570109733", "1570109319", "1570109815", "1570109833", "1570109871", "1570109941", "1570109755",
            "1570109089", "1570110185", "1570109189", "1570108133", "1570110391", "28", "1570109389", "1570106609", "1570106877", "1570108369", "1570096135",
            "1570106883", "1570107847", "1570108103", "1570108293", "1570108363", "1570105589", "1570108421", "1570105585", "1570108599", "1570108637", "1570108735", "1570108791", "1570108841", "1570108879", "1570109007", "1570109097", "1570109143",
            "1570109153",
            "1570109157",
            "1570109197",
            "1570109211",
            "1570109285",
            "1570109293",
            "1570109347",
            "1570109379",
            "1570109423",
            "1570109481",
            "1570109505",
            "1570109509",
            "1570109563",
            "1570109701",
            "1570109707",
            "1570109745",
            "1570109749",
            "1570109883",
            "1570102811",
            "1570109891",
            "1570099779",
            "1570100563",
            "24",
            "23",
            "30",
            "52",
            "53",
            "2",
            "1570095049",
            "1570109945",
            "1570108859",
            "1570108911",
            "1570108917",
            "1570108993",
            "1570109129",
            "1570109141",
            "1570109195",
            "1570109219",
            "1570109297",
            "1570109353",
            "1570109441",
            "1570109475",
            "1570109523",
            "1570109747",
            "1570109839",
            "1570109877",
            "1570109989",
            "8",
            "1570107225",
            "1570108871",
            "1570109357",
            "1570109519",
            "1570104163",
            "39",
            "1570107469",
            "1570108087",
            "1570108985",
            "1570109227",
            "1570109393",
            "1570109415",
            "1570109469",
            "1570109623",
            "1570109641",
            "1570109793",
            "1570106885",
            "1570109413",
            "1570109687",
            "1570108589",
            "1570105717",
            "1570108873",
            "1570109087",
            "51",
            "1570109321",
            "1570109595"};

    String id;
    NiftyDialogBuilder dialogBuilder;

    AutoCompleteTextView actv;
    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paperp);
        dialogBuilder = NiftyDialogBuilder.getInstance(this);


// instantiate it within the onCreate method
        mProgressDialog = new ProgressDialog(NewPaperP.this);
        mProgressDialog.setMessage("Downloading....");
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        mProgressDialog.setCancelable(true);
        final DownloadTask downloadTask = new DownloadTask(NewPaperP.this);

// execute this when the downloader must be fired

        ButtonRectangle paperp1 = (ButtonRectangle) findViewById(R.id.download);
        paperp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isNetworkAvailable())
                    downloadTask.execute("http://bmsceutsav.com/iacc");
                else
                    Toast.makeText(getApplicationContext(), "Not connected to the Internet", Toast.LENGTH_SHORT).show();
            }
        });
        mProgressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                downloadTask.cancel(true);
            }
        });


        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, total);
        //Getting the instance of AutoCompleteTextView
        actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        actv.setThreshold(3);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);

        ButtonRectangle paperp = (ButtonRectangle) findViewById(R.id.search);
        paperp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = actv.getText().toString();

                if (Arrays.asList(d1s1).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 4001\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s2).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 4002\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s3).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 4003\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s4).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 400v\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s5).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 4005\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s6).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5001\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s7).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5002\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s8).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5003\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s9).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5004\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s10).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5005\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d1s11).contains(id)) {
                    dialogBuilder
                            .withTitle("12th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- First Floor\nFaculty Development Center\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                }


                //Day 2
                else if (Arrays.asList(d2s1).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 4001\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s2).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 4002\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s3).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 4003\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s4).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 400v\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s5).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. ISE 4005\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s6).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5001\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s7).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5002\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s8).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5003\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s9).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5004\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s10).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- Fourth Floor\nRoom No. CSE 5005\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else if (Arrays.asList(d2s11).contains(id)) {
                    dialogBuilder
                            .withTitle("13th June")                                  //.withTitle(null)  no title
                            .withTitleColor("#FFFFFF")                                  //def
                            .withDividerColor("#11000000")                              //def
                            .withMessage("Venue: PG Block- First Floor\nFaculty Development Center\n2:30pm to 5:30pm")
                            .setButton1Click(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    dialogBuilder.dismiss();
                                }
                            }).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Invalid paper ID", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private class DownloadTask extends AsyncTask<String, Integer, String> {

        private Context context;
        private PowerManager.WakeLock mWakeLock;

        public DownloadTask(Context context) {
            this.context = context;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // take CPU lock to prevent CPU from going off if the user
            // presses the power button during download
            PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
            mWakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK,
                    getClass().getName());
            mWakeLock.acquire();
            mProgressDialog.show();
        }

        @Override
        protected void onProgressUpdate(Integer... progress) {
            super.onProgressUpdate(progress);
            // if we get here, length is known, now set indeterminate to false
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.setMax(100);
            mProgressDialog.setProgress(progress[0]);
        }

        @Override
        protected void onPostExecute(String result) {
            mWakeLock.release();
            mProgressDialog.dismiss();
            if (result != null)
                Toast.makeText(context, "Download error: " + result, Toast.LENGTH_LONG).show();
            else
                Toast.makeText(context, "File downloaded to SD Card", Toast.LENGTH_SHORT).show();
            finish();
        }


        @Override
        protected String doInBackground(String... sUrl) {
            InputStream input = null;
            OutputStream output = null;
            HttpURLConnection connection = null;
            try {
                URL url = new URL(sUrl[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                // expect HTTP 200 OK, so we don't mistakenly save error report
                // instead of the file
                if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    return "Server returned HTTP " + connection.getResponseCode()
                            + " " + connection.getResponseMessage();
                }

                // this will be useful to display download percentage
                // might be -1: server did not report the length
                int fileLength = connection.getContentLength();

                // download the file
                input = connection.getInputStream();
                output = new FileOutputStream("/sdcard/paperpresentation.pdf");

                byte data[] = new byte[4096];
                long total = 0;
                int count;
                while ((count = input.read(data)) != -1) {
                    // allow canceling with back button
                    if (isCancelled()) {
                        input.close();
                        return null;
                    }
                    total += count;
                    // publishing the progress....
                    if (fileLength > 0) // only if total length is known
                        publishProgress((int) (total * 100 / fileLength));
                    output.write(data, 0, count);
                }
            } catch (Exception e) {
                return e.toString();
            } finally {
                try {
                    if (output != null)
                        output.close();
                    if (input != null)
                        input.close();
                } catch (IOException ignored) {
                }

                if (connection != null)
                    connection.disconnect();
            }
            return null;
        }
    }

    private boolean isNetworkAvailable() {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
