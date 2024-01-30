package com.example.myapplication;

import static com.example.myapplication.Utils.getAssetJsonData;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentSecondBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);


        NetworkClient retrofit_client = new NetworkClient();
        Call<DataModel3> call;
        String id = getArguments().getString("id").toString();
        call = retrofit_client.getApiService().test_2(id, "badang");
        call.enqueue(new Callback<DataModel3>() {
            @Override
            public void onResponse(Call<DataModel3> call, Response<DataModel3> response) {
                DataModel3 result = response.body();
                binding.textView2.setText(result.getName());
                binding.totalAmt.setText(result.getDividendCash() + " 원");

                List<Integer> monthlist = result.getMonths();
                List<DataModel4> dividendlist = result.getDividendHistories();
                if (!monthlist.isEmpty() && !dividendlist.isEmpty()){
                    int j = 0;
                    for(int i=0; i<dividendlist.size(); i++){
                        if(monthlist.get(i) == 1){
                            binding.month1text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 2){
                            binding.month2text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 3){
                            binding.month3text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 4){
                            binding.month4text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 5){
                            binding.month5text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 6){
                            binding.month6text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 7){
                            binding.month7text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 8){
                            binding.month8text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 9){
                            binding.month9text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 10){
                            binding.month10text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 11){
                            binding.month11text.setText(dividendlist.get(i).getCashKrw());
                        } else if(monthlist.get(i) == 12){
                            binding.month12text.setText(dividendlist.get(i).getCashKrw());
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<DataModel3> call, Throwable t) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_DivNoticeFragment);
            }

        });
        /*String data = getAssetJsonData(getActivity(), "A005930.json");
        Type type = new TypeToken<DataModel3>(){}.getType();

        DataModel3 properties = new Gson().fromJson(data, type);
        binding.textView2.setText(properties.getName());
        binding.totalAmt.setText(properties.getAnnualCashKrw());
*/
        return binding.getRoot();

    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.divbuttonview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_DivNoticeFragment);
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}