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

public class Gallery_Fragment extends Fragment {
    private List<GaleryRecyclerViewItem> GalleryItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        initializeDailyItemList();

        // Create the recyclerview.
        RecyclerView GalleryRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        // Create the grid layout manager with 2 columns.
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        // Set layout manager.
        GalleryRecyclerView.setLayoutManager(gridLayoutManager);

        // Create car recycler view data adapter with car item list.
        GaleryRecyclerViewDataAdapter GaleryDataAdapter = new GaleryRecyclerViewDataAdapter(GalleryItemList);
        // Set data adapter.
        GalleryRecyclerView.setAdapter(GaleryDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(GalleryItemList == null)
        {
            GalleryItemList = new ArrayList<GaleryRecyclerViewItem>();
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken1));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken2));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken3));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken4));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken5));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken6));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken7));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken8));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken9));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken10));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken11));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.ken12));

        }
    }

}