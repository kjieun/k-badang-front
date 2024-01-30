package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentAlertBinding;

public class AlertFragment extends Fragment {
    private FragmentAlertBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = com.example.myapplication.databinding.FragmentAlertBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(AlertFragment.this)
                        .navigate(R.id.action_AlertFragment_to_FirstFragment);
            }
        });

        // 알람에서 배당 통지서 선택 시
        binding.dividendBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(AlertFragment.this)
                        .navigate(R.id.action_AlertFragment_to_DivNoticeFragment);
            }
        });

        // 알람에서 뉴스 선택 시
        binding.newslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "A005930");
                NavHostFragment.findNavController(AlertFragment.this)
                        .navigate(R.id.action_AlertFragment_to_SecondFragment, bundle);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
