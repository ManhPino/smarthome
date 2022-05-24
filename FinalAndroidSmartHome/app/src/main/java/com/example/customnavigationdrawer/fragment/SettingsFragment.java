package com.example.customnavigationdrawer.fragment;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.example.customnavigationdrawer.R;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}