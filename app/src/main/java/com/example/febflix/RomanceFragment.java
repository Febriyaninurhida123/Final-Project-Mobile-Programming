package com.example.febflix;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class RomanceFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_romance, container, false);

        // Button for item 1
        Button playButton1 = view.findViewById(R.id.playButton1);
        playButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchVideo("ourbelovedsummer"); // Replace "baymax" with the actual video resource name
            }
        });

        // Button for item 2
        Button playButton2 = view.findViewById(R.id.playButton2);
        playButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchVideo("tw"); // Replace "minions" with the actual video resource name
            }
        });

        // Button for item 3
        Button playButton3 = view.findViewById(R.id.playButton3);
        playButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchVideo("startup"); // Replace "spongebob" with the actual video resource name
            }
        });

        // Add similar code for additional items if needed

        return view;
    }

    // Method to launch video playback
    private void launchVideo(String videoResourceName) {
        Class<?> playerClass = null;
        switch (videoResourceName) {
            case "ourbelovedsummer":
                playerClass = PlayerOurBeloved.class;
                break;
            case "tw":
                playerClass = PlayerTw.class;
                break;
            case "startup":
                playerClass = PlayerStartup.class;
                break;
            // Add cases for additional videos if needed
        }

        if (playerClass != null) {
            Intent intent = new Intent(getActivity(), playerClass);
            intent.putExtra("videoResourceName", videoResourceName);
            startActivity(intent);
        }
    }
}
