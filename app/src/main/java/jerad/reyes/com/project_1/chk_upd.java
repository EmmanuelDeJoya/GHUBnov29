package jerad.reyes.com.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class chk_upd extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chk_upd);
        Intent i = new Intent(this, myCustomService.class);
        startService(i);
    }

    public void btn_upd(View view) {
        Intent i = null;
        if (view.getId() == R.id.btn_set) {
            i = new Intent(this, settings_page.class);
            startActivity(i);
        }
    }
}
