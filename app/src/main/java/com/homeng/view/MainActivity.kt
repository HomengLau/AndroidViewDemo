package com.homeng.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View

import butterknife.ButterKnife
import butterknife.OnClick
import com.homeng.view.inteface.Constants

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this@MainActivity)

    }

    @OnClick(R.id.datepicker_show)
    fun onClick(view: View){
        var intent = Intent(this,ShowResultActivity:: class.java)
        when(view.id){
            R.id.datepicker_show-> intent.putExtra("viewType",Constants.DATEPICK)

        }
        startActivity(intent)

    }
}
