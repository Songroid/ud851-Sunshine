package com.example.android.sunshine.sync;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyAlarmReceiver extends BroadcastReceiver {

    public static final int REQUEST_CODE = 12;

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, SunshineSyncWearableService.class));
    }
}
