package jerad.reyes.com.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class fertilizing extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fertilizing);
        Intent i = new Intent( this, myCustomService.class);
        startService(i);
    }

    public void fertile_option(View view){
        Intent i = null;
        if (view.getId() == R.id.btn_start){
            i = new Intent(this, menu_page.class);
            startActivity(i);

        }

    }
}
