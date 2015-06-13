package com.iacc2015;

/**
 * Created by Chirag Shenoy on 6/8/2015.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;


public class SuperAwesomeCardFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    private int position;

    public static SuperAwesomeCardFragment newInstance(int position) {
        SuperAwesomeCardFragment f = new SuperAwesomeCardFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        position = getArguments().getInt(ARG_POSITION);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        FrameLayout fl = new FrameLayout(getActivity());
        fl.setLayoutParams(params);

        final int margin = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, getResources()
                .getDisplayMetrics());

        TextView v = new TextView(getActivity());
        params.setMargins(margin, margin, margin, margin);
        v.setLayoutParams(params);
        v.setLayoutParams(params);
        v.setGravity(Gravity.CENTER);
        v.setBackgroundResource(R.drawable.background_card);

        if (position == 0) {
            v.setText("The event is an opportunity for doctoral students to network with proficient researchers and peers, receive constructive comments and learn from each other’s practices. Panel discussions would help exchange ideas and ask questions about research as an endeavor and career. Established researchers from both academia and industry will give testimonials as part of the event, describing their experiences. The focus is to provide a platform for research scholars to share their exciting research about advance computing. The PhD student registrants for camera ready paper are previleged to attend this workshop.\n" +
                    "\n" + "\n" +
                    "Contact:\n" +
                    "\n" +
                    "Dr. R. Ashok Kumar, ashokkumar.ise@bmsce.ac.in\n" +
                    "Dr. Shambhavi B.R, shambhavibr.ise@bmsce.ac.in\n\n12th and 13th , 2.30 - 5.30pm\nLocation - MESH HALL");
        }

        if (position == 1) {
            v.setText("A hands-on session will be provided to implement a twitter like product. The students can create account, edit messages, share and follow other users as well as any existing content. Using the application, students can create groups and share private content with a good privacy mechanism. The registrants for camera ready paper/poster presentation/participants/delegates are previleged to attend this workshop.\n" +
                    "\n" +
                    "Contact:\n" +
                    "\n" +
                    "Dr. Kayarvizhy.N, kayarvizhyn.cse@bmsce.ac.in\n" +
                    "Prof. Sowmya K.S, sowmyaks.ise@bmsce.ac.in\n\n" +
                    "12th and 13th , 2.30 - 5.30pm\n Location - Sir. M.V. Hall");
        }

        if (position == 2) {
            v.setText("The workshop on Advanced Java Programming will be conducted by Java Platform Team, Oracle India Development Center, Bangalore. The registrants for camera ready paper/poster presentation/participants/delegates are previleged to attend this workshop.\n" +
                    "\n" +
                    "Contact:\n" +
                    "\n" +
                    "Prof. Rajeshwari K, rajeshwarik.ise@bmsce.ac.in\n\n" +
                    "12th and 13th , 2.30 - 5.30pm\nLocation - B.S. Narayan Hall");
        }

        if (position == 3) {
            v.setText("The focus of the workshop is to encourage novel ideas for entrepreneurship. There will also be a discussion forum on development of incubation center. The registrants for camera ready paper/poster presentation/participants/delegates are previleged to attend this workshop.\n" +
                    "\n" +
                    "Contact:\n" +
                    "\n" +
                    "Prof. Shubha Rao, shubha.ise@bmsce.ac.in\n" +
                    "Prof. Sheetal V.A, sheetal.cse@bmsce.ac.in\n" +
                    "Prof. Sreelatha R, sree.ise@bmsce.ac.in\n" +
                    "Prof. Namratha M, namratham.cse@bmsce.ac.in\n" +
                    "Prof. Saritha A.N, saritha.cse@bmsce.ac.ins\n\n" +
                    "12th and 13th , 2.30 - 5.30pm\nLocation - BMS Auditorium");
        }
        fl.addView(v);
        return fl;
    }

}