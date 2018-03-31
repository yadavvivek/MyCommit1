package com.hfda.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    private static final String ACTION_CUSTOM_BROADCAST = "com.hfda.powerreceiver.ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {

        String intentAction = intent.getAction();

        String toastMessage = null;

        switch (intentAction) {

            case Intent.ACTION_POWER_CONNECTED:

                toastMessage = "Power connected of Vivek's Phone!";
                break;

            case  Intent.ACTION_POWER_DISCONNECTED:

                toastMessage = "Power disconnected of Vivek's Phone!";
                break;

            case ACTION_CUSTOM_BROADCAST:
                toastMessage = context.getString(R.string.custom_broadcast_toast);

        }
        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }
}
