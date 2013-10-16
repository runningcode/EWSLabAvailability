package com.sigmobile.ewslabavailability;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class LabAdapter extends ArrayAdapter<LabAvailability> {

    public LabAdapter(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LabAvailability labAvailability = getItem(position);
        // inflate our view and fill it with the details about the lab
        return super.getView(position, convertView, parent);
    }

    public void setData(List<LabAvailability> labAvailabilities) {
        if (labAvailabilities != null) {
            clear();
            for (LabAvailability labAvailability : labAvailabilities) {
                add(labAvailability);
            }
        }
    }
}
