package com.sigmobile.ewslabavailability;

public class LabAvailability {

    int mCapacity;
    int mUsed;
    String mName;

    public LabAvailability(int capacity, int used, String name) {
        mCapacity = capacity;
        mUsed = used;
        mName = name;
    }

    public int getCapacity() {
        return mCapacity;
    }

    public int getUsed() {
        return mUsed;
    }

    public String getName() {
        return mName;
    }
}
