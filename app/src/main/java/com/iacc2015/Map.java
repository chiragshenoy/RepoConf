package com.iacc2015;

import android.app.Activity;
import android.os.Bundle;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;


/**
 * Created by Chirag Shenoy on 11-Jun-15.
 */
public class Map extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageView);
        imageView.setImage(ImageSource.resource(R.drawable.bms_map));
    }
}
