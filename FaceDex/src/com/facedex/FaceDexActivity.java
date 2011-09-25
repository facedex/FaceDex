package com.facedex;

import com.facedex.service.MessengerService;
//import com.facedex.service.MessengerService.IncomingHandler;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

//Need the following import to get access to the app resources, since this
//class is in a sub-package.
import com.facedex.R;
/* PROGRAM ENTRY
 * 
 */
public class FaceDexActivity extends Activity {
	@Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.main);
        
        Button cameraButton = (Button)findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// Run camera activity
				Intent myIntent = new Intent(getBaseContext(), CameraActivity.class);
				startActivity(myIntent);
			}
		});
	}
}