package conference.example.chirag.conference;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Chirag on 06-11-2014.
 */
public class Day1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View d1 = inflater.inflate(R.layout.day1, container, false);
        ((TextView) d1.findViewById(R.id.textView)).setText("Day 1 Workshops");
        return d1;
    }
}
