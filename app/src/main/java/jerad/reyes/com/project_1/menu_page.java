package jerad.reyes.com.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class menu_page extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_page);
        Intent i = new Intent(this, myCustomService.class );
        startService(i);
    }
    public void process2 (View view){
        Intent i = null;
        if(view.getId() == R.id.btn_homee){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
    public void process4 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_plant) {
            i = new Intent(this, planting.class);
            startActivity(i);
        }
    }
    public void process5 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_water) {
            i = new Intent(this, watering.class);
            startActivity(i);
        }
    }
    public void process6 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_fert) {
            i = new Intent(this, fertilizing.class);
            startActivity(i);
        }
    }
    public void process7 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_har) {
            i = new Intent(this, harvest.class);
            startActivity(i);
        }
    }
    public void process8 (View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_care) {
            i = new Intent(this, care.class);
            startActivity(i);
        }
    }
}
