package com.example.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class AirplaneModeChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean isOn = Settings.Global.getInt(
                context.getContentResolver(),
                Settings.Global.AIRPLANE_MODE_ON,
                0
        ) != 0;

        if (isOn) {
            Toast.makeText(context, "Airplane Mode is ON ✈️", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(context, "Airplane Mode is OFF 📶", Toast.LENGTH_SHORT).show();
        }
    }
}

