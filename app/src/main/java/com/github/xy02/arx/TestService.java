package com.github.xy02.arx;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.github.xy02.arxlib.ARxBinder;

/**
 * Created by xy on 18-4-24.
 */

public class TestService extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return new ARxBinder(this);
    }

}
