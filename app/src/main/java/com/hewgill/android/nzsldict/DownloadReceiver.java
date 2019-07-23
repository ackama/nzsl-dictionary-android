package com.hewgill.android.nzsldict;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class DownloadReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (DownloadManager.ACTION_NOTIFICATION_CLICKED.equals(action)) {
            Intent startIntent = new Intent(context, FavouritesActivity.class);
            startIntent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            context.startActivity(startIntent);
            return;
        }

        if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)) {
            Toast.makeText(context, "Download completed?", Toast.LENGTH_SHORT).show();

        }
    }
}