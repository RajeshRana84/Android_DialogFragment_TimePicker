package com.example.rajeshrana.dialogfragment_datetimepopup;

import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

/**
 * Created by rajesh.rana on 25-05-2017.
 */

public class PopUpFragment extends DialogFragment implements View.OnClickListener {

    View view;
    TimePicker timePicker;
    Button btnPop;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.pop_up , container,false);

        timePicker = (TimePicker) view.findViewById(R.id.timePicker);
        btnPop = (Button)view.findViewById(R.id.btnPop);

        // fires the onClick method below
        btnPop.setOnClickListener(this);

        return view;


    }

    @Override
    public void onClick(View v) {
            this.dismiss();

        String timeOn = timePicker.getHour() + ":" + timePicker.getMinute();

        // Call Main activity method to pass data as the Main Activity is already up.
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.setTime(timeOn);



    }
}
