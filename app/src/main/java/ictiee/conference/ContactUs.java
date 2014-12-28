package ictiee.conference;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

/**
 * Created by Chirag on 07-11-2014.
 */
public class ContactUs extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);
        Button callus = (Button) findViewById(R.id.callus);

        callus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:7406618744"));
                startActivity(callIntent);
            }
        });

        Button mailus = (Button) findViewById(R.id.mailus);
        mailus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "ictiee2015@bmsce.ac.in", null));
                startActivity(Intent.createChooser(emailIntent, "Send email..."));

            }
        });

        Button reachus = (Button) findViewById(R.id.reachus);
        reachus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 12.9421, 77.5658);

                String uri = String.format(Locale.ENGLISH, "geo:0,0?q=bmsce bangalore");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });
    }
}
