package conference.example.chirag.conference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Pushed from laptop
//Now pushed from desktop
//Yaay this works!
//Push from desktop with added xml
public class MainActivity extends Activity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/myfont.ttf");
        Button b1 = (Button) findViewById(R.id.b1);
        // b1.setTypeface(tf);
        // b1.setText("About Us");
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(this);
        Button contactus = (Button) findViewById(R.id.contactus);
        contactus.setOnClickListener(this);
        Button schedule = (Button) findViewById(R.id.b4);
        schedule.setOnClickListener(this);
        Button studentScheule =(Button) findViewById(R.id.b3);
        studentScheule.setOnClickListener(this);

        Button currentEvent = (Button) findViewById(R.id.current_event);
        currentEvent.setOnClickListener(this);

    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b1:
                Intent a = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(a);
                break;
            case R.id.b2:
                Intent b = new Intent(getApplicationContext(), WorkshopsNew.class);
                startActivity(b);
                break;
            case R.id.b3:
                Intent f = new Intent(getApplicationContext(), Temp.class);
                startActivity(f);
                break;
            case R.id.b4:
                Intent d = new Intent(getApplicationContext(), Schedule.class);
                startActivity(d);
                break;
            case R.id.contactus:
                Intent c = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(c);
                break;
            case R.id.current_event:
                Intent z = new Intent(getApplicationContext(), CurrentEvents.class);
                startActivity(z);
                break;

        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
//    public static class PlaceholderFragment extends Fragment {
//
//        public PlaceholderFragment() {
//        }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
//            return rootView;
//        }
//    }
}
