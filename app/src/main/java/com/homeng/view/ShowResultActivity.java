package com.homeng.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;


public class ShowResultActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_view);
        String viewType = getIntent().getStringExtra("viewType");
        showView(viewType);
    }

    private void showView(String viewType) {
        switch (viewType){

        }
    }
}
