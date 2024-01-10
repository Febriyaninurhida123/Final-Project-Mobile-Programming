package com.example.febflix;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class ThrillerFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thriller, container, false);

        // Button for item 1
        Button playButton1 = view.findViewById(R.id.playButton1);
        playButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchVideo("thelies"); // Replace "baymax" with the actual video resource name
            }
        });

        // Button for item 2
        Button playButton2 = view.findViewById(R.id.playButton2);
        playButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchVideo("girlfrom"); // Replace "minions" with the actual video resource name
            }
        });

        // Button for item 3
        Button playButton3 = view.findViewById(R.id.playButton3);
        playButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchVideo("aod"); // Replace "spongebob" with the actual video resource name
            }
        });

        // Add similar code for additional items if needed

        return view;
    }

    // Method to launch video playback
    private void launchVideo(String videoResourceName) {
        Class<?> playerClass = null;
        switch (videoResourceName) {
            case "thelies":
                playerClass = PlayerTheLies.class;
                break;
            case "girlfrom":
                playerClass = PlayerGirlFrom.class;
                break;
            case "aod":
                playerClass = PlayerAllOff.class;
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
