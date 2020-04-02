package com.vishnu.darkmodeappv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout layout = findViewById(R.id.bg);
        final TextView text1 = findViewById(R.id.text);
        Switch darkmode = findViewById(R.id.switch2);


        darkmode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    layout.setBackgroundResource(R.color.Dark_bg);
                    text1.setText("This is the dark mode");
                    text1.setTextColor(Color.parseColor("#FFFFFF"));
                }
                else{
                    layout.setBackgroundColor(Color.WHITE);
                    text1.setText("This is the light mode");
                    text1.setTextColor(Color.BLACK);
                }
            }
        });

    }

}
