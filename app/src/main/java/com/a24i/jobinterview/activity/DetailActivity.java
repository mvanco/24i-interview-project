package com.a24i.jobinterview.activity;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.a24i.jobinterview.R;
import com.a24i.jobinterview.databinding.ActivityDetailBinding;
import com.a24i.jobinterview.viewmodel.DetailActivityViewModel;

public class DetailActivity extends BaseActivity {

    DetailActivityViewModel mViewModel;
    ActivityDetailBinding mBinding;  // So far only for future extensibility.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        mViewModel = ViewModelProviders.of(this).get(DetailActivityViewModel.class);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
