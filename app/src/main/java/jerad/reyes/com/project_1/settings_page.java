package jerad.reyes.com.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.mahfa.dnswitch.DayNightSwitch;
import com.mahfa.dnswitch.DayNightSwitchListener;

public class settings_page extends AppCompatActivity {

    DayNightSwitch dayNightSwitch;
    View background_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_page);
        Intent i = new Intent(this, myCustomService.class);
        startService(i);

        dayNightSwitch = (DayNightSwitch) findViewById(R.id.dayNight);
        background_view = findViewById(R.id.background_view);

        dayNightSwitch.setDuration(450);
        dayNightSwitch.setListener(new DayNightSwitchListener() {
            @Override
            public void onSwitch(boolean isNight) {

                if(isNight){
                    Toast.makeText(settings_page.this,"Night mode selected", Toast.LENGTH_SHORT).show();
                    background_view.setAlpha(1f);
                }
                else{
                    Toast.makeText(settings_page.this,"Day mode selected", Toast.LENGTH_SHORT).show();
                    background_view.setAlpha(0f);
                }
            }
        });
    }

    public void process3(View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_homee) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
    public void process9 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_ver) {
            i = new Intent(this, ver_num.class);
            startActivity(i);
        }
    }
    public void process10 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_upd) {
            i = new Intent(this, ver_num.class);
            startActivity(i);
        }
    }
}
