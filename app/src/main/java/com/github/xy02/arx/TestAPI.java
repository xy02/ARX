package com.github.xy02.arx;

import android.content.Context;

import com.github.xy02.arxlib.API;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * Created by xy on 18-4-24.
 */

public class TestAPI implements API {
    public String data;

    @Override
    public Observable<Object> invoke(Context context) {
        return Observable
                .interval(1, TimeUnit.SECONDS)
                .map(aLong -> aLong + ":" + data);
    }
}
