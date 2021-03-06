package deeplife.gcme.com.deeplife.Disciples;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import deeplife.gcme.com.deeplife.News.News;
import deeplife.gcme.com.deeplife.News.NewsListAdapter;
import deeplife.gcme.com.deeplife.R;

/**
 * Created by bengeos on 12/6/16.
 */

public class DisciplesFragment extends Fragment {

    private static RecyclerView myRecyclerView;
    private static RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static Context myContext;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.disciples_fragment_page,container,false);
        myRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        myRecyclerView.setLayoutManager(mLayoutManager);
        myContext = getActivity();
        ArrayList<Disciple> items = new ArrayList<Disciple>();
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        items.add(new Disciple());
        mAdapter = new DiscipleListAdapter(items,getContext());
        myRecyclerView.setAdapter(mAdapter);
        return view;
    }
}
