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

    public FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);

        NetworkClient retrofit_client = new NetworkClient();
        Call<DataModel3> call;
        String id = "A005930";
        call = retrofit_client.getApiService().test_2(id, "badang");
        call.enqueue(new Callback<DataModel3>() {
            @Override
            public void onResponse(Call<DataModel3> call, Response<DataModel3> response) {
                DataModel3 result = response.body();
                binding.stock1DivTextView.setText(result.getDividendYieldRatio());
            }

            @Override
            public void onFailure(Call<DataModel3> call, Throwable t) {
            }

        });

        id = "A034730";
        call = retrofit_client.getApiService().test_2(id, "badang");
        call.enqueue(new Callback<DataModel3>() {
            @Override
            public void onResponse(Call<DataModel3> call, Response<DataModel3> response) {
                DataModel3 result = response.body();
                binding.stock2DivTextView.setText(result.getDividendYieldRatio());
            }

            @Override
            public void onFailure(Call<DataModel3> call, Throwable t) {
            }

        });
        id = "A035420";
        call = retrofit_client.getApiService().test_2(id, "badang");
        call.enqueue(new Callback<DataModel3>() {
            @Override
            public void onResponse(Call<DataModel3> call, Response<DataModel3> response) {
                DataModel3 result = response.body();
                binding.addstockStock1DivTextView.setText(result.getDividendYieldRatio());
            }

            @Override
            public void onFailure(Call<DataModel3> call, Throwable t) {
            }

        });
        id = "A267250";
        call = retrofit_client.getApiService().test_2(id, "badang");
        call.enqueue(new Callback<DataModel3>() {
            @Override
            public void onResponse(Call<DataModel3> call, Response<DataModel3> response) {
                DataModel3 result = response.body();
                binding.addstockStock3DivTextView.setText(result.getDividendYieldRatio());
            }

            @Override
            public void onFailure(Call<DataModel3> call, Throwable t) {
            }

        });
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.alertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_AlertFragment);
            }
        });

        binding.stockButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "A005930");
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
            }
        });
        binding.stockButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "A034730");
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
            }
        });
        binding.addstockStockButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "A035420");
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
            }
        });
        binding.addstockStockButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "A035720");
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
            }
        });
        binding.addstockStockButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", "A267250");
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
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

                try {
                    if (getArguments().getString("id").equals("grouphd")) {
                        binding.addstockStockboxLayout3.setVisibility(View.VISIBLE);
                        binding.addstockStockText3.setText("현대차");

                    } else if (getArguments().getString("id").equals("group237462")) {
                        binding.addstockStockboxLayout3.setVisibility(View.VISIBLE);
                        binding.addstockStockText3.setText("SK");
                    } else if (getArguments().getString("id").equals("image237502")) {
                        binding.addstockStockboxLayout3.setVisibility(View.VISIBLE);
                        binding.addstockStockText3.setText("HD현대");
                    } else if (getArguments().getString("id").equals("image237463")) {
                        binding.addstockStockboxLayout3.setVisibility(View.VISIBLE);
                        binding.addstockStockText3.setText("LG");
                    } else if (getArguments().getString("id").equals("image237461")) {
                        binding.addstockStockboxLayout3.setVisibility(View.VISIBLE);
                        binding.addstockStockText3.setText("S-OIL");
                    } else if (getArguments().getString("id").equals("imageNc")) {
                        binding.addstockStockboxLayout3.setVisibility(View.VISIBLE);
                        binding.addstockStockText3.setText("NC");
                    }

                } catch (Exception e) {

                }

            }
        });

        binding.addstockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this).navigate(R.id.action_FirstFragment_to_DividendFragment);

            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}