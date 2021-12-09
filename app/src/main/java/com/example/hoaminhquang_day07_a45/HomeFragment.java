package com.example.hoaminhquang_day07_a45;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hoaminhquang_day07_a45.databinding.HomeFragmentBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    HomeFragmentBinding binding;

//    RecyclerView rvList;
//    List<ContactDemo> contactDemoList;
//    ContactDemo contact01,contact02,contact03;
//    ContactRecyclerviewAdapter recyclerviewAdapter;

    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.home_fragment,container,false);

//        rvList = binding.rvContact;
//        contactDemoList = new ArrayList<>();
//
//        contact01 = new ContactDemo("Ribeye Steak",12);
//        contact01 = new ContactDemo("Ribeye Steak",12);
//        contact01 = new ContactDemo("Ribeye Steak",12);
//
//        contactDemoList.add(contact01);
//        contactDemoList.add(contact02);
//        contactDemoList.add(contact03);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false);
//        recyclerviewAdapter = new ContactRecyclerviewAdapter(contactDemoList);
//
//        rvList.setAdapter(recyclerviewAdapter);
//        rvList.setLayoutManager(layoutManager);
        binding.btnIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return binding.getRoot();
    }
}
