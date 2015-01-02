package ictiee.conference;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chirag on 14-12-2014.
 */
public class ListOfEvents1 extends Fragment {
    String[] l1 = {"Software Defined Radio & Control Systems - Effective Tools for Teaching and Research ", "Innovative Undergraduate Labs for Control, Mechatronics, and Robotics ", "The Freedom Lab-in-a-Box ", "Learning Platform for Better Outcomes ", "PSoCTM 4 BLE Workshop ", "Technology a Generation ahead  ", "Automation of Curriculum Design & Attainment for OBE", "Impartus Lecture Capture", "Teaching Lab Solutions for RF Labs ", "New Project Based Learning "};
    List<String> mList = new ArrayList<String>(Arrays.asList(l1));


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View d1 = inflater.inflate(R.layout.day1, container, false);

        ArrayAdapter mArrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_workshop, R.id.tv_list_item, mList);

        ListView listView = (ListView) d1.findViewById(R.id.lv1);
        listView.setAdapter(mArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(getActivity(), Workshop1.class);
                a.putExtra("pos", position);
                startActivity(a);

            }
        });
        return d1;


    }
}
