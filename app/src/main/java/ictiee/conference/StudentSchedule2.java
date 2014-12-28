package ictiee.conference;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Chirag on 14-12-2014.
 */
public class StudentSchedule2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View d1 = inflater.inflate(R.layout.student_schedule_day2, container, false);
        return d1;
    }
}