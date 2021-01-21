package ch.zli.dogger.model;

import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServiceMap extends android.app.Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}