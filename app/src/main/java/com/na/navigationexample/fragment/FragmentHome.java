package com.na.navigationexample.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.na.navigationexample.R;
import com.na.navigationexample.adapter.MyAdapter;
import com.na.navigationexample.model.Hero;

import java.util.ArrayList;

public class FragmentHome extends Fragment {
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rec_home);
        setData();

    }

    private void setData() {
        ArrayList<Hero> heroList = new ArrayList<>();
        heroList.add(new Hero("Tony Stark","Iron Man","Armor"));
        heroList.add(new Hero("Bruce Banner","Hulk","Gama Rays"));
        heroList.add(new Hero("Steve Rogers","Captain-America","Syrum"));
        heroList.add(new Hero("Thor Ordinson","Thor","Thunder"));
        heroList.add(new Hero("Natasha","Black Widow","Assassin"));
        heroList.add(new Hero("Carol Danvers","Captain-Marvel","Super Human"));
        heroList.add(new Hero("Logan","X-Man","Wolverine"));
        heroList.add(new Hero("Scott Lang","Ant-Man","Ant"));
        heroList.add(new Hero("Peter Parker","Spider-Man","Spider Sense"));
        heroList.add(new Hero("Clint Borton","Hawkeye","Arrow and bow"));
        heroList.add(new Hero("Bruce Wayne","Bat-Man","Bat-Armor"));
        drawRecycler(heroList);
    }

    private void drawRecycler(ArrayList<Hero> heroList) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyAdapter(heroList));
    }
}
