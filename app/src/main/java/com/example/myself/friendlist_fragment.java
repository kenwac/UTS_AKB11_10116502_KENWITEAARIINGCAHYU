package com.example.myself;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class friendlist_fragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private List<FriendRecyclerViewItem> FriendItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dailyactivity, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView dailyRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        // Set layout manager.
        dailyRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        FriendRecyclerViewDataAdapter FriendDataAdapter = new FriendRecyclerViewDataAdapter(FriendItemList);
        // Set data adapter.
        dailyRecyclerView.setAdapter(FriendDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(FriendItemList == null)
        {
            FriendItemList = new ArrayList<FriendRecyclerViewItem>();
            FriendItemList.add(new FriendRecyclerViewItem("Ester", R.drawable.ester));
            FriendItemList.add(new FriendRecyclerViewItem("Dwi", R.drawable.dwi));
            FriendItemList.add(new FriendRecyclerViewItem("Tresya", R.drawable.tresya));
            FriendItemList.add(new FriendRecyclerViewItem("Dhita", R.drawable.dhita));
            FriendItemList.add(new FriendRecyclerViewItem("Fero", R.drawable.fero));
            FriendItemList.add(new FriendRecyclerViewItem("Agnes", R.drawable.agnes));


        }
    }

}