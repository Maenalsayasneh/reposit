package com.instabug.library.util.threading;

import android.os.Handler;
import android.os.HandlerThread;

public class HandlerThreadProvider {
    public static void run(String str, Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(runnable);
    }
}
