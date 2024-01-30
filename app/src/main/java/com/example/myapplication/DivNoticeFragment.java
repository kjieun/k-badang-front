package com.example.myapplication;

import static com.example.myapplication.Utils.getAssetJsonData;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentDivnoticeBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DivNoticeFragment extends Fragment {

    private FragmentDivnoticeBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentDivnoticeBinding.inflate(inflater, container, false);


        String data = getAssetJsonData(getActivity(), "NoticeList.json");
        Type type = new TypeToken<List<DataModel2>>(){}.getType();

        List<DataModel2> properties = new Gson().fromJson(data, type);
        Log.i("kbadang", "properties : " + properties.toString());

        List<DataModel2> dataModel2List = properties;
        ConstraintLayout constraintLayout = binding.constraintLayout;
        for(int i=0; i<dataModel2List.size(); i++){
            if(i==0) {
                binding.divnoticelayout.setVisibility(View.VISIBLE);
                binding.noticeid.setText(dataModel2List.get(i).getId());
                binding.textView6.setText(dataModel2List.get(i).getStock_name());
                binding.textView7.setText(dataModel2List.get(i).getPayment_period());
            }else {
                binding.divnoticelayout2.setVisibility(View.VISIBLE);
                binding.noticeid2.setText(dataModel2List.get(i).getId());
                binding.textView8.setText(dataModel2List.get(i).getStock_name());
                binding.textView9.setText(dataModel2List.get(i).getPayment_period());
            }
        }


        binding.divnoticelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", dataModel2List.get(0).getId());
                NavHostFragment.findNavController(DivNoticeFragment.this)
                        .navigate(R.id.action_DivNoticeFragment_to_NoticeFormFragment, bundle);
            }
        });
        binding.divnoticelayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("id", dataModel2List.get(1).getId());
                NavHostFragment.findNavController(DivNoticeFragment.this)
                        .navigate(R.id.action_DivNoticeFragment_to_NoticeFormFragment, bundle);
            }
        });
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(DivNoticeFragment.this)
                        .navigate(R.id.action_DivNoticeFragment_to_FirstFragment);
            }
        });

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
