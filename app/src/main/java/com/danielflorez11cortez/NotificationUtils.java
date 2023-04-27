package com.danielflorez11cortez;

import android.content.Context;
import android.widget.Toast;

public class NotificationUtils {

    public static void showNotification(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
