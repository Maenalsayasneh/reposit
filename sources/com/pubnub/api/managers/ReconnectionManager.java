package com.pubnub.api.managers;

import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.callbacks.ReconnectionCallback;
import com.pubnub.api.enums.PNReconnectionPolicy;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.PNTimeResult;
import i0.d.a.a.a;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import s0.c.b;
import s0.c.c;

public class ReconnectionManager {
    private static final int LINEAR_INTERVAL = 3;
    private static final int MAX_EXPONENTIAL_BACKOFF = 32;
    private static final int MILLISECONDS = 1000;
    private static final int MIN_EXPONENTIAL_BACKOFF = 1;
    /* access modifiers changed from: private */
    public static final b log = c.e(ReconnectionManager.class);
    /* access modifiers changed from: private */
    public ReconnectionCallback callback;
    private int exponentialMultiplier = 1;
    private int failedCalls = 0;
    private int maxConnectionRetries;
    private PNReconnectionPolicy pnReconnectionPolicy;
    private PubNub pubnub;
    private Timer timer;

    public ReconnectionManager(PubNub pubNub) {
        this.pubnub = pubNub;
        this.pnReconnectionPolicy = pubNub.getConfiguration().getReconnectionPolicy();
        this.maxConnectionRetries = pubNub.getConfiguration().getMaximumReconnectionRetries();
    }

    /* access modifiers changed from: private */
    public void callTime() {
        this.pubnub.time().async(new PNCallback<PNTimeResult>() {
            public void onResponse(PNTimeResult pNTimeResult, PNStatus pNStatus) {
                if (!pNStatus.isError()) {
                    ReconnectionManager.this.stopHeartbeatTimer();
                    ReconnectionManager.this.callback.onReconnection();
                    return;
                }
                b access$300 = ReconnectionManager.log;
                StringBuilder P0 = a.P0("callTime() at: ");
                P0.append(Calendar.getInstance().getTime().toString());
                access$300.debug(P0.toString());
                ReconnectionManager.this.registerHeartbeatTimer();
            }
        });
    }

    private boolean isReconnectionPolicyUndefined() {
        PNReconnectionPolicy pNReconnectionPolicy = this.pnReconnectionPolicy;
        if (pNReconnectionPolicy != null && pNReconnectionPolicy != PNReconnectionPolicy.NONE) {
            return false;
        }
        log.c("reconnection policy is disabled, please handle reconnection manually.");
        return true;
    }

    /* access modifiers changed from: private */
    public void registerHeartbeatTimer() {
        stopHeartbeatTimer();
        if (!isReconnectionPolicyUndefined()) {
            int i = this.maxConnectionRetries;
            if (i == -1 || this.failedCalls < i) {
                Timer timer2 = new Timer("Reconnection Manager timer", true);
                this.timer = timer2;
                timer2.schedule(new TimerTask() {
                    public void run() {
                        ReconnectionManager.this.callTime();
                    }
                }, (long) (getNextInterval() * 1000));
                return;
            }
            this.callback.onMaxReconnectionExhaustion();
        }
    }

    /* access modifiers changed from: private */
    public void stopHeartbeatTimer() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
            this.timer = null;
        }
    }

    public int getNextInterval() {
        int i = 1;
        this.failedCalls++;
        if (this.pnReconnectionPolicy == PNReconnectionPolicy.EXPONENTIAL) {
            int i2 = this.exponentialMultiplier + 1;
            this.exponentialMultiplier = i2;
            int pow = (int) (Math.pow(2.0d, (double) i2) - 1.0d);
            if (pow > 32) {
                this.exponentialMultiplier = 1;
                b bVar = log;
                StringBuilder P0 = a.P0("timerInterval > MAXEXPONENTIALBACKOFF at: ");
                P0.append(Calendar.getInstance().getTime().toString());
                bVar.debug(P0.toString());
            } else if (pow >= 1) {
                i = pow;
            }
            b bVar2 = log;
            StringBuilder Q0 = a.Q0("timerInterval = ", i, " at: ");
            Q0.append(Calendar.getInstance().getTime().toString());
            bVar2.debug(Q0.toString());
        } else {
            i = 3;
        }
        if (this.pnReconnectionPolicy == PNReconnectionPolicy.LINEAR) {
            return 3;
        }
        return i;
    }

    public void setReconnectionListener(ReconnectionCallback reconnectionCallback) {
        this.callback = reconnectionCallback;
    }

    public void startPolling() {
        if (!isReconnectionPolicyUndefined()) {
            this.exponentialMultiplier = 1;
            this.failedCalls = 0;
            registerHeartbeatTimer();
        }
    }
}
