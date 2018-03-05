package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;



// DONE (1) Create a class called ReminderTasks
public class ReminderTasks {

    public static String ACTION_INCREMENT_WATER_COUNT = "increment-water-count";
// DONE (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT
// DONE (6) Create a public static void method called executeTask
    public static void executeTask(Context context, String action) {
        if (ACTION_INCREMENT_WATER_COUNT.equals(action)) {
            incrementWaterCount(context);
        }
    }
    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);

    }
}