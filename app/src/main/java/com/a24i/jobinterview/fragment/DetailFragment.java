package com.a24i.jobinterview.fragment;

import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.a24i.jobinterview.R;
import com.a24i.jobinterview.databinding.FragmentDetailBinding;
import com.a24i.jobinterview.viewmodel.DetailFragmentViewModel;

public class DetailFragment extends BaseFragment {

    DetailFragmentViewModel mViewModel;
    FragmentDetailBinding mBinding;

    public DetailFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DetailFragmentViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mBinding = FragmentDetailBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }
}
