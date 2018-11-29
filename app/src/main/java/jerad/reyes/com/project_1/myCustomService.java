package jerad.reyes.com.project_1;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class myCustomService extends IntentService{
    public myCustomService(){
        super("myCustomService");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent){
        Log.d("Service","MyCustomService is running at the background.");
    }
}
