package com.homeng.view.datepicker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

import com.homeng.view.R;

import java.util.Calendar;

public class DatePickPopupWindow extends PopupWindow {

    public DatePickPopupWindow(View contentView, int width, int height, boolean focusable) {
        super(contentView, width, height);
        setContentView(contentView);
        setWidth(width);
        setHeight(height);
        setFocusable(focusable);
    }

    public DatePickPopupWindow(@NonNull Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.date_picker_defualt, null);
    }

    private void initDatePicket(){
        Calendar selectedDate = Calendar.getInstance();

        //控制时间范围(如果不设置范围，则使用默认时间1900-2100年，此段代码可注释)
        //因为系统Calendar的月份是从0-11的,所以如果是调用Calendar的set方法来设置时间,月份的范围也要是从0-11
        Calendar startDate = Calendar.getInstance();
        startDate.set(2013, 0, 23);

        Calendar endDate = Calendar.getInstance();
        endDate.set(2019, 11, 28);
    }


}
