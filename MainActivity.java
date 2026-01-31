package com.example.userinterface_pkk;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hbb20.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    CountryCodePicker codePicker;
    Button show_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // hookers
        codePicker=findViewById(R.id.country_code);
        show_code=findViewById(R.id.show_code);

        // set OnClickListener to the button
        show_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // getting the country code
                String country_code=codePicker.getSelectedCountryCode();

                // getting the country name
                String country_name=codePicker.getSelectedCountryName();

                // getting the country name code
                String country_namecode=codePicker.getSelectedCountryNameCode();

                // Toast to show to information based on the selection
                Toast.makeText(MainActivity.this, "Country Name:-"+country_name+" Country Name Code:-"+country_namecode+" Country Code:-"+country_code, Toast.LENGTH_SHORT).show();

            }
        });
    }

}