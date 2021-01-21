package ch.zli.dogger.ui;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import com.google.android.gms.maps.SupportMapFragment;

import ch.zli.dogger.R;

public class AddDogActivity extends AppCompatActivity {


    // source: https://developer.android.com/guide/topics/sensors/sensors_position
    private SensorManager sensorManager;
    private Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dog);

        // source: https://developer.android.com/guide/topics/sensors/sensors_position
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR);

        Button submit = findViewById(R.id.submit);


        Intent i = new Intent(AddDogActivity.this, MapsActivity.class);

        submit.setOnClickListener(v -> {
            startActivity(i);
            addNotification();
        });
    }


    // source: https://developer.android.com/guide/topics/ui/notifiers/notifications
    private void addNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.icon)
                .setContentTitle("You've created a Dog!");

        Intent notificationIntent = new Intent(this, MapsActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this,0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);


        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}
