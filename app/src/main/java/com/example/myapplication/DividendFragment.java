package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentDividendBinding;

public class DividendFragment extends Fragment {

    private FragmentDividendBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentDividendBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment);
            }
        });

        binding.grouphd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "grouphd");
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment, bundle);
            }
        });
        binding.group237462.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "group237462");
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment, bundle);
            }
        });
        binding.image237502.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "image237502");
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment, bundle);
            }
        });
        binding.image237463.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "image237463");
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment, bundle);
            }
        });
        binding.image237461.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "image237461");
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment, bundle);
            }
        });
        binding.imageNc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "imageNc");
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment, bundle);
            }
        });
        binding.imageKakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "imageKakao");
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment, bundle);
            }
        });
        binding.imageNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "imageNaver");
                NavHostFragment.findNavController(DividendFragment.this)
                        .navigate(R.id.action_DividendFragment_to_FirstFragment, bundle);
            }
        });

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}