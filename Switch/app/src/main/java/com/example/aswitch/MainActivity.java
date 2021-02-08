package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.ChipGroup;

public class MainActivity extends AppCompatActivity {
    //internet na thakay wifi er symbol download na korte paray default image use kora hoice

    private Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aSwitch = findViewById(R.id.switchId);

        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(aSwitch.isChecked()) {//it also can be writen as if(isChecked()){...}
                    Toast.makeText(MainActivity.this, "On", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Off", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}