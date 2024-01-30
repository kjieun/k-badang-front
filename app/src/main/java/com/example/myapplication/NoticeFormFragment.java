package com.example.myapplication;

import static com.example.myapplication.Utils.getAssetJsonData;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.FragmentNoticeformBinding;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class NoticeFormFragment extends Fragment {

    private FragmentNoticeformBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentNoticeformBinding.inflate(inflater, container, false);

        String data = getAssetJsonData(getActivity(), "Notice.json");
        Type type = new TypeToken<DataModel1>(){}.getType();

        DataModel1 properties = new Gson().fromJson(data, type);
        Log.i("kbadang", "properties : " + properties.toString());

        binding.textView7.setText("'"+ properties.getStock_name() +"'의 '60'기 배당 내역을 아래와 같이 배정하오니 수령하시기 바랍니다.");
        binding.noticeDivDate.setText(properties.getBase_date());
        binding.userNumber.setText(properties.getMember_num());
        if(properties.getStock_type().equals("COMMON")){
            //binding.firstnotice2.setText(properties.getShort_holding());
            binding.fitStartnotice3.setText(properties.getCash_rate());
            binding.fitStartnotice4.setText(properties.getStock_rate());
            binding.fitStartnotice5.setText(properties.getShort_holding());
            binding.fitStartnotice6.setText(properties.getCash_price());
            binding.fitStartnotice7.setText(properties.getStock_price());
        }
        binding.secondnotice1.setText(properties.getPledged_share());
        binding.secondnotice2.setText(properties.getStock_date());
        binding.secondnotice3.setText(properties.getIncome_tax());
        binding.secondnotice4.setText(properties.getResident_tax());

        binding.textView23.setText(properties.getFirst_paydate());
        binding.textView29.setText(properties.getSecond_paydate());
        binding.placeText.setText(properties.getPlace());

        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NoticeFormFragment.this)
                        .navigate(R.id.action_NoticeFormFragment_to_DivNoticeFragment);
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
