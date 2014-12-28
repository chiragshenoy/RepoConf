package conference.example.chirag.conference;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Chirag on 15-12-2014.
 */
public class CurrentEvents extends Activity {


    TextView tv_current_event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_events);
        tv_current_event = (TextView) findViewById(R.id.events);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("dd HH:mm:ss");
        String current_time = df.format(c.getTime());

        String s = "15 02:21:00";
        String g = "15 02:27:00";
        if (current_time.compareTo(s) > 0 && current_time.compareTo(g) < 0) {
            Toast.makeText(this, "Event going on", Toast.LENGTH_LONG).show();
            tv_current_event.setText("Event going on ");

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
                startActivity(home);
                return true;
            case R.id.phone:
                Intent phone = new Intent(getApplicationContext(), ContactUs.class);
                startActivity(phone);
                return true;
            case R.id.now:
                return true;
        }
        return true;
    }

}