package com.instabug.library.core.plugin;

import android.content.Context;
import com.instabug.library.Instabug;
import i0.j.e.l0.b.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public abstract class Plugin {
    public static final int STATE_BACKGROUND = 0;
    public static final int STATE_FOREGROUND = 1;
    public static final int STATE_PROCESSING_ATTACHMENT = 2;
    public WeakReference<Context> contextWeakReference;
    private int lifeCycleState = -1;
    public int state = 0;

    private boolean canSleep() {
        return this.lifeCycleState == 3;
    }

    private boolean canStart() {
        int i = this.lifeCycleState;
        return i == 1 || i == 5;
    }

    private boolean canStop() {
        int i = this.lifeCycleState;
        return i == 4 || i == 2 || i == 3;
    }

    private boolean canWake() {
        int i = this.lifeCycleState;
        return i == 2 || i == 4;
    }

    public Context getAppContext() {
        return Instabug.getApplicationContext();
    }

    public List<d> getDataDisposalPolicies() {
        return Collections.emptyList();
    }

    public abstract long getLastActivityTime();

    public ArrayList<PluginPromptOption> getPluginOptions(boolean z) {
        return null;
    }

    public ArrayList<PluginPromptOption> getPromptOptions() {
        return null;
    }

    public int getState() {
        return this.state;
    }

    public void init(Context context) {
        this.contextWeakReference = new WeakReference<>(context);
        this.lifeCycleState = 1;
    }

    public void initDefaultPromptOptionAvailabilityState() {
    }

    public void invoke(PluginPromptOption pluginPromptOption) {
    }

    public boolean isAppContextAvailable() {
        WeakReference<Context> weakReference = this.contextWeakReference;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void onLocaleChanged(Locale locale, Locale locale2) {
    }

    public void setState(int i) {
        this.state = i;
    }

    public abstract void sleep();

    public void sleepIfPossible() {
        if (canSleep()) {
            sleep();
            this.lifeCycleState = 4;
        }
    }

    public abstract void start(Context context);

    public void startIfPossible(Context context) {
        if (canStart()) {
            start(context);
            this.lifeCycleState = 2;
        }
    }

    public abstract void stop();

    public void stopIfPossible() {
        if (canStop()) {
            stop();
            this.lifeCycleState = 5;
        }
    }

    public abstract void wake();

    public void wakeIfPossible() {
        if (canWake()) {
            wake();
            this.lifeCycleState = 3;
        }
    }
}
