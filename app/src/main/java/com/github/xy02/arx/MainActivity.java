package com.github.xy02.arx;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.github.xy02.arxlib.ARxClient;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARxClient client = new ARxClient(this, "com.github.xy02.arx", "action.TEST_SERVICE");
        client.callARxService("com.github.xy02.arx.TestAPI", new TestRequest("some data"), String.class)
                .subscribe(it -> Log.d("test", "receive:" + it), it -> Log.e("test3", it.getMessage()));
    }

    class TestRequest {

        public String data;

        private TestRequest(String data) {
            this.data = data;
        }
    }


}
