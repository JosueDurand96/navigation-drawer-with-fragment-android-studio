package com.example.myapplication.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class InboxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_inbox, container, false);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Inbox");

        Button buttonChangeText = (Button) view.findViewById(R.id.buttonFragmentInbox);

        final TextView textViewInboxFragment = (TextView) view.findViewById(R.id.textViewInboxFragment);

        buttonChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textViewInboxFragment.setText("This is the Inbox Fragment");
                textViewInboxFragment.setTextColor(getResources().getColor(R.color.md_yellow_800));

            }
        });

        return view;
    }
}