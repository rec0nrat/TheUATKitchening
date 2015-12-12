package com.tonikamitv.loginregister;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class SimpleFormFragment{

    // Button click handler for the simple form
    public void reserveTime(View button, LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.simple_form_layout, container, false);

        // Reading input from the EditText Controls
        final EditText startTimeField = (EditText) v.findViewById(R.id.EditTextStartTime);
        String startTime = startTimeField.getText().toString();

        final EditText endTimeField = (EditText) v.findViewById(R.id.EditTextEndtime);
        String endTime = endTimeField.getText().toString();

        final EditText descriptionField = (EditText) v.findViewById(R.id.EditTextDescription);
        String description = descriptionField.getText().toString();

        // Reading input from the Spinner Controls
        final Spinner kitchenItemSpinner = (Spinner) v.findViewById(R.id.SpinnerKitchenItem);
        String kitchenItem = kitchenItemSpinner.getSelectedItem().toString();

        // Reading input from CheckBox Controls
        final CheckBox servingCheckbox = (CheckBox) v.findViewById(R.id.CheckBoxServing);
        boolean bRequiresResponse = servingCheckbox.isChecked();
    }
}