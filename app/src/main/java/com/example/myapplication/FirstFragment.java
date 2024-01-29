package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentFirstBinding;

import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NetworkClient retrofit_client = new NetworkClient();
        Call<DataModel1> call;

        call = retrofit_client.getApiService().test_api_get("5");
        call.enqueue(new Callback<DataModel1>(){
            @Override
            public void onResponse(Call<DataModel1> call, Response<DataModel1> response) {
                DataModel1 result = response.body();
                String str;
                str= result.getUserId() +"\n"+
                        result.getID()+"\n"+
                        result.getTitle()+"\n"+
                        result.getBody();
                Log.d("kbadang", "userId: " + result.getUserId());
                Log.d("kbadang", "id : " + result.getID());
                Log.d("kbadang", "title : " + result.getTitle());
                Log.d("kbadang", "body : " + result.getBody());
            }

            @Override
            public void onFailure(Call<DataModel1> call, Throwable t) {

            }

        });

        binding.alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_AlertFragment);
            }
        });

        binding.stockButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        binding.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.imageButtonClick.setVisibility(View.VISIBLE);
                binding.imageButton2.setVisibility(View.VISIBLE);
                binding.imageButton.setVisibility(View.INVISIBLE);
                binding.imageButton2Click.setVisibility(View.INVISIBLE);

                binding.userstockLayout.setVisibility(View.VISIBLE);
                binding.addstockLayout.setVisibility(View.INVISIBLE);
            }
        });

        binding.imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.imageButton2Click.setVisibility(View.VISIBLE);
                binding.imageButton.setVisibility(View.VISIBLE);
                binding.imageButton2.setVisibility(View.INVISIBLE);
                binding.imageButtonClick.setVisibility(View.INVISIBLE);

                binding.userstockLayout.setVisibility(View.INVISIBLE);
                binding.addstockLayout.setVisibility(View.VISIBLE);

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}