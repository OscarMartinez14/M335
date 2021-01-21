package ch.zli.dogger.data;

import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class ServiceAddDog extends android.app.Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


}
