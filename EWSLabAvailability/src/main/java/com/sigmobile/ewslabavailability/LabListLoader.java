package com.sigmobile.ewslabavailability;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import java.util.List;

public class LabListLoader extends AsyncTaskLoader<List<LabAvailability>> {

    public LabListLoader(Context context) {
        super(context);
    }

    @Override
    public List<LabAvailability> loadInBackground() {
        // load our labs! this means scraping it from the web
        return null;
    }
}
