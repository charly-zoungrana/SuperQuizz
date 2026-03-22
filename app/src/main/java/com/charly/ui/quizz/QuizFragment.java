package com.charly.ui.quizz;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.charly.databinding.FragmentQuizBinding;

public class QuizFragment extends Fragment {

    private FragmentQuizBinding binding;

    public QuizFragment() {
        // Required empty public constructor
    }

    public static QuizFragment newInstance() {

        return new QuizFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentQuizBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}