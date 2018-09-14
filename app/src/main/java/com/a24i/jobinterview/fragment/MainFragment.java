package com.a24i.jobinterview.fragment;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a24i.jobinterview.R;
import com.a24i.jobinterview.databinding.FragmentMainBinding;
import com.a24i.jobinterview.viewmodel.MainFragmentViewModel;

public class MainFragment extends BaseFragment {

    MainFragmentViewModel mViewModel;
    FragmentMainBinding mBinding;

    public MainFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainFragmentViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding =  FragmentMainBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
