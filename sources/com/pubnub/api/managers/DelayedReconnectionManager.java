package com.pubnub.api.managers;

import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.ReconnectionCallback;
import com.pubnub.api.enums.PNReconnectionPolicy;
import java.util.Timer;
import java.util.TimerTask;
import s0.c.b;
import s0.c.c;

public class DelayedReconnectionManager {
    private static final int DELAY_SECONDS = 3;
    private static final int MILLISECONDS = 1000;
    private static final b log = c.e(DelayedReconnectionManager.class);
    private ReconnectionCallback callback;
    private final PNReconnectionPolicy pnReconnectionPolicy;
    private PubNub pubnub;
    private Timer timer;

    public DelayedReconnectionManager(PubNub pubNub) {
        this.pubnub = pubNub;
        this.pnReconnectionPolicy = pubNub.getConfiguration().getReconnectionPolicy();
    }

    /* access modifiers changed from: private */
    public void callTime() {
        stop();
        this.callback.onReconnection();
    }

    private boolean isReconnectionPolicyUndefined() {
        PNReconnectionPolicy pNReconnectionPolicy = this.pnReconnectionPolicy;
        if (pNReconnectionPolicy != null && pNReconnectionPolicy != PNReconnectionPolicy.NONE) {
            return false;
        }
        log.c("reconnection policy is disabled, please handle reconnection manually.");
        return true;
    }

    public void scheduleDelayedReconnection() {
        stop();
        if (!isReconnectionPolicyUndefined()) {
            Timer timer2 = new Timer("Delayed Reconnection Manager timer", true);
            this.timer = timer2;
            timer2.schedule(new TimerTask() {
                public void run() {
                    DelayedReconnectionManager.this.callTime();
                }
            }, 3000);
        }
    }

    public void setReconnectionListener(ReconnectionCallback reconnectionCallback) {
        this.callback = reconnectionCallback;
    }

    public void stop() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
            this.timer = null;
        }
    }
}
