package com.example.inclassassignments.InClass03;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.inclassassignments.InClass02.Profile;
import com.example.inclassassignments.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InClass03Display#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InClass03Display extends Fragment {
    ImageView avatar;
    TextView email;
    TextView name;
    TextView OS;
    TextView mood;
    ImageView moodImage;
    String displayOS;
    String displayMood;
    String emailVal;
    String nameVal;
    int moodVal;
    int avatarId;


    public InClass03Display() {
        // Required empty public constructor
    }

    public static InClass03Display newInstance() {
        return new InClass03Display();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_in_class03_display_activity, container, false);
        avatar = rootView.findViewById(R.id.imageViewFragmentDisplayAvatar);
        email = rootView.findViewById(R.id.textViewFragmentEmail);
        name = rootView.findViewById(R.id.textViewFragmentName);
        OS = rootView.findViewById(R.id.textViewFragmentDispayOS);
        mood = rootView.findViewById(R.id.textViewFragmentDisplayMood);
        moodImage = rootView.findViewById(R.id.imageViewFragmentDisplayMood);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        name.setText(nameVal);
        email.setText(emailVal);
        switch (avatarId) {
            case 1: avatar.setImageResource(R.drawable.avatar_f_1);
                break;
            case 2: avatar.setImageResource(R.drawable.avatar_f_2);
                break;
            case 3: avatar.setImageResource(R.drawable.avatar_f_3);
                break;
            case 4: avatar.setImageResource(R.drawable.avatar_m_1);
                break;
            case 5: avatar.setImageResource(R.drawable.avatar_m_2);
                break;
            case 6: avatar.setImageResource(R.drawable.avatar_m_3);
                break;
        }
        OS.setText(displayOS);
        mood.setText(displayMood);
        switch (moodVal) {
            case 0: moodImage.setImageResource(R.drawable.angry);
                break;
            case 1: moodImage.setImageResource(R.drawable.sad);
                break;
            case 2: moodImage.setImageResource(R.drawable.happy);
                break;
            case 3: moodImage.setImageResource(R.drawable.awesome);
                break;
        }
    }

    public void updateValues(Profile profile) {
        displayOS = "I use " + profile.operatingSystem;
        displayMood = "I am " + profile.getMood();
        emailVal = profile.email;
        nameVal = profile.name;
        avatarId = profile.avatarId;
        moodVal = profile.mood;
    }
}