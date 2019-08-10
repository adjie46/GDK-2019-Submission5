package com.adjiekurniawan.sumbission5_dicoding.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.adjiekurniawan.sumbission5_dicoding.R;
import com.adjiekurniawan.sumbission5_dicoding.activities.SettingsActivity;
import com.adjiekurniawan.sumbission5_dicoding.adapters.TabAdapter;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */

public class FragmentFavorite extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_favorite, container, false);
        initView();
        setHasOptionsMenu(true);
        return rootView;
    }

    private void initView(){
        ViewPager viewPager = rootView.findViewById(R.id.viewPager);
        TabLayout tabLayout = rootView.findViewById(R.id.tabLayout);

        TabAdapter adapter = new TabAdapter(getFragmentManager());
        adapter.addFragment(new FragmentTabFavMovie(), "Movie");
        adapter.addFragment(new FragmentTabFavTv(), "Tv");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
        menu.findItem(R.id.action_search).setVisible(false);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.btnSetting) {
            Intent settingIntent = new Intent(getActivity(), SettingsActivity.class);
            startActivity(settingIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
