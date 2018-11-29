package jerad.reyes.com.project_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i =  new Intent(this, myCustomService.class);
        startService(i);
    }
public void process1(View view){
        Intent i = null, chooser = null;
        if(view.getId() == R.id.btn_start){
            i = new Intent(this, menu_page.class);
            startActivity(i);
        } else if (view.getId() == R.id.btn_set){
            i = new Intent(this, settings_page.class);
            startActivity(i);
        }
}
}
