package ch.zli.dogger.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.SupportMapFragment;

import ch.zli.dogger.R;

public class AddDogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dog);

        Button submit = findViewById(R.id.submit);


        Intent i = new Intent(AddDogActivity.this, MapsActivity.class);

        submit.setOnClickListener(v -> startActivity(i));


    }
}