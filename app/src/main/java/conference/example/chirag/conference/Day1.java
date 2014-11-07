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
public class Day1 extends Fragment {

    String[] l1 = {"asdasd", "asdiadsh", "asdasds", "aasdasd", "asdauhfoas"};
    List<String> mList = new ArrayList<String>(Arrays.asList(l1));


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View d1 = inflater.inflate(R.layout.day1, container, false);
        //  ((TextView) d1.findViewById(R.id.textView)).setText("Day 1 Workshops");

        ArrayAdapter mArrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_conferences, R.id.tv_list_item, mList);

        ListView listView = (ListView) d1.findViewById(R.id.lv1);
        listView.setAdapter(mArrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent a = new Intent(getActivity(), Conf_DoEngineering.class);
                a.putExtra("pos", position);
                startActivity(a);
            }
        });
        return d1;


    }

}
