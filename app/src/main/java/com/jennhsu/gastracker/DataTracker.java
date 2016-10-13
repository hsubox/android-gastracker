package com.jennhsu.gastracker;
import java.util.*;

public class DataTracker {

    public static ArrayList<DataTracker> a_list = new ArrayList<DataTracker>();

    double odometerReading;
    double gasAdded;
    double gasPrice;

    public DataTracker(double odometerReading, double gasAdded, double gasPrice) {
        this.odometerReading = odometerReading;
        this.gasAdded = gasAdded;
        this.gasPrice = gasPrice;
    }
}
