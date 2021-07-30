/*
 * StudentClassroomFragment Created by Samiur Prapon
 * Last modified  7/30/21, 6:23 PM
 * Copyright (c) 2021. All rights reserved.
 *
 */

package life.nsu.aether.views.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import life.nsu.aether.R;


public class StudentClassroomFragment extends Fragment {

    static StudentClassroomFragment fragment = null;

    public static StudentClassroomFragment newInstance() {
        if (fragment == null) {
            synchronized (StudentClassroomFragment.class) {
                if (fragment == null) {
                    return new StudentClassroomFragment();
                }
            }
        }

        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_student_classroom, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

    }
}