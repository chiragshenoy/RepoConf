package conference.example.chirag.conference;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chirag on 06-11-2014.
 */
public class Day2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View d2 = inflater.inflate(R.layout.day2, container, false);
       // ((TextView) d2.findViewById(R.id.textView)).setText("Day 2 Workshops");
        return d2;
    }
}
