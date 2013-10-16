package com.sigmobile.ewslabavailability;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;

import java.util.List;

public class AvailabilityListFragment extends ListFragment implements LoaderManager.LoaderCallbacks<List<LabAvailability>>{

    LabAdapter mAdapter;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setEmptyText("No labs");
        setListShown(false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
        setHasOptionsMenu(true);

        mAdapter = new LabAdapter(getActivity(), android.R.layout.simple_list_item_2);
        setListAdapter(mAdapter);
    }

    @Override
    public Loader<List<LabAvailability>> onCreateLoader(int i, Bundle bundle) {
        return new LabListLoader(getActivity());
    }

    @Override
    public void onLoadFinished(Loader<List<LabAvailability>> listLoader, List<LabAvailability> labAvailabilities) {
        mAdapter.setData(labAvailabilities);
    }

    @Override
    public void onLoaderReset(Loader<List<LabAvailability>> listLoader) {

    }
}
