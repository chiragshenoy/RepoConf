package conference.example.chirag.conference;

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
 * Created by Chirag on 06-11-2014.
 */
public class ListOfEvents2 extends Fragment {

    String[] l1 = {"Attributes of Global Engineer", "Governance and Leadership", "Engineering Projects in Community Service ", "Problem Based Learning", "Outcome Based Education ", "Effective Teaching\n" +
            "and Learning ", "Industry Academia\n" +
            "Partnerships ", "Integrating Innovative\n" +
            "Entrepreneurship with\n" +
            "Engineering Education ", "Engineering Education for\n" +
            "Sustainable\n" +
            "Development"};
    List<String> mList = new ArrayList<String>(Arrays.asList(l1));


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View d2 = inflater.inflate(R.layout.day2, container, false);

        ArrayAdapter mArrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_workshop, R.id.tv_list_item, mList);

        ListView listView = (ListView) d2.findViewById(R.id.lv2);
        listView.setAdapter(mArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(getActivity(), Workshop2.class);
                a.putExtra("pos", position);
                startActivity(a);

            }
        });
        return d2;


    }

}
