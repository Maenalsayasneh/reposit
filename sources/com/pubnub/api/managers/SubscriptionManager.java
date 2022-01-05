package com.pubnub.api.managers;

import com.pubnub.api.PubNub;
import com.pubnub.api.builder.dto.ChangeTemporaryUnavailableOperation;
import com.pubnub.api.builder.dto.PresenceOperation;
import com.pubnub.api.builder.dto.PubSubOperation;
import com.pubnub.api.builder.dto.StateOperation;
import com.pubnub.api.builder.dto.SubscribeOperation;
import com.pubnub.api.builder.dto.TimetokenAndRegionOperation;
import com.pubnub.api.builder.dto.UnsubscribeOperation;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.callbacks.ReconnectionCallback;
import com.pubnub.api.endpoints.presence.Heartbeat;
import com.pubnub.api.endpoints.presence.Leave;
import com.pubnub.api.endpoints.pubsub.Subscribe;
import com.pubnub.api.enums.PNHeartbeatNotificationOptions;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.managers.StateManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.server.SubscribeEnvelope;
import com.pubnub.api.models.server.SubscribeMessage;
import com.pubnub.api.workers.SubscribeMessageWorker;
import i0.m.a.b.a;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingQueue;
import s0.c.b;
import s0.c.c;

public class SubscriptionManager {
    private static final int HEARTBEAT_INTERVAL_MULTIPLIER = 1000;
    private static final int TWO_SECONDS = 2000;
    private static final b log = c.e(SubscriptionManager.class);
    private volatile boolean connected;
    private Thread consumerThread;
    private final DelayedReconnectionManager delayedReconnectionManager;
    private final DuplicationManager duplicationManager;
    private Heartbeat heartbeatCall;
    private volatile boolean httpRequestPending = false;
    /* access modifiers changed from: private */
    public final ListenerManager listenerManager;
    private final LinkedBlockingQueue<SubscribeMessage> messageQueue;
    public PubNub pubnub;
    private final ReconnectionManager reconnectionManager;
    private final RetrofitManager retrofitManager;
    private Subscribe subscribeCall;
    public final StateManager subscriptionState;
    private final TelemetryManager telemetryManager;
    private Timer temporaryUnavailableChannelsDelayer;
    private Timer timer;
    private final TokenManager tokenManager;

    /* renamed from: com.pubnub.api.managers.SubscriptionManager$7  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$com$pubnub$api$enums$PNStatusCategory;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.pubnub.api.enums.PNStatusCategory.values()
                r0 = 20
                int[] r0 = new int[r0]
                $SwitchMap$com$pubnub$api$enums$PNStatusCategory = r0
                com.pubnub.api.enums.PNStatusCategory r1 = com.pubnub.api.enums.PNStatusCategory.PNTimeoutCategory     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNStatusCategory     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pubnub.api.enums.PNStatusCategory r1 = com.pubnub.api.enums.PNStatusCategory.PNUnexpectedDisconnectCategory     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNStatusCategory     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pubnub.api.enums.PNStatusCategory r1 = com.pubnub.api.enums.PNStatusCategory.PNBadRequestCategory     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNStatusCategory     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.pubnub.api.enums.PNStatusCategory r1 = com.pubnub.api.enums.PNStatusCategory.PNURITooLongCategory     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$pubnub$api$enums$PNStatusCategory     // Catch:{ NoSuchFieldError -> 0x003e }
                com.pubnub.api.enums.PNStatusCategory r1 = com.pubnub.api.enums.PNStatusCategory.PNAccessDeniedCategory     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pubnub.api.managers.SubscriptionManager.AnonymousClass7.<clinit>():void");
        }
    }

    public SubscriptionManager(PubNub pubNub, RetrofitManager retrofitManager2, TelemetryManager telemetryManager2, StateManager stateManager, final ListenerManager listenerManager2, ReconnectionManager reconnectionManager2, DelayedReconnectionManager delayedReconnectionManager2, DuplicationManager duplicationManager2, TokenManager tokenManager2) {
        this.pubnub = pubNub;
        this.telemetryManager = telemetryManager2;
        LinkedBlockingQueue<SubscribeMessage> linkedBlockingQueue = new LinkedBlockingQueue<>();
        this.messageQueue = linkedBlockingQueue;
        this.subscriptionState = stateManager;
        this.listenerManager = listenerManager2;
        this.reconnectionManager = reconnectionManager2;
        this.delayedReconnectionManager = delayedReconnectionManager2;
        this.retrofitManager = retrofitManager2;
        this.duplicationManager = duplicationManager2;
        this.tokenManager = tokenManager2;
        AnonymousClass1 r3 = new ReconnectionCallback() {
            public void onMaxReconnectionExhaustion() {
                StateManager.SubscriptionStateData subscriptionStateData = SubscriptionManager.this.subscriptionState.subscriptionStateData(Boolean.TRUE);
                listenerManager2.announce(PNStatus.builder().error(false).category(PNStatusCategory.PNReconnectionAttemptsExhaustedCategory).affectedChannels(subscriptionStateData.getChannels()).affectedChannelGroups(subscriptionStateData.getChannelGroups()).build());
                SubscriptionManager.this.disconnect();
            }

            public void onReconnection() {
                SubscriptionManager.this.reconnect(PubSubOperation.NO_OP);
                StateManager.SubscriptionStateData subscriptionStateData = SubscriptionManager.this.subscriptionState.subscriptionStateData(Boolean.TRUE);
                listenerManager2.announce(PNStatus.builder().error(false).affectedChannels(subscriptionStateData.getChannels()).affectedChannelGroups(subscriptionStateData.getChannelGroups()).category(PNStatusCategory.PNReconnectedCategory).build());
            }
        };
        delayedReconnectionManager2.setReconnectionListener(r3);
        reconnectionManager2.setReconnectionListener(r3);
        if (this.pubnub.getConfiguration().isStartSubscriberThread()) {
            Thread thread = new Thread(new SubscribeMessageWorker(this.pubnub, listenerManager2, linkedBlockingQueue, duplicationManager2));
            this.consumerThread = thread;
            thread.setName("Subscription Manager Consumer Thread");
            this.consumerThread.setDaemon(true);
            this.consumerThread.start();
        }
    }

    private synchronized void cancelDelayedLoopIterationForTemporaryUnavailableChannels() {
        Timer timer2 = this.temporaryUnavailableChannelsDelayer;
        if (timer2 != null) {
            timer2.cancel();
            this.temporaryUnavailableChannelsDelayer = null;
        }
    }

    private PNStatus.PNStatusBuilder createPublicStatus(PNStatus pNStatus) {
        return PNStatus.builder().statusCode(pNStatus.getStatusCode()).authKey(pNStatus.getAuthKey()).operation(pNStatus.getOperation()).affectedChannels(pNStatus.getAffectedChannels()).affectedChannelGroups(pNStatus.getAffectedChannelGroups()).clientRequest(pNStatus.getClientRequest()).origin(pNStatus.getOrigin()).tlsEnabled(pNStatus.isTlsEnabled());
    }

    private void handleError(PNStatus pNStatus, PubSubOperation... pubSubOperationArr) {
        int ordinal = pNStatus.getCategory().ordinal();
        if (ordinal == 2) {
            this.listenerManager.announce(pNStatus);
            List<String> affectedChannels = pNStatus.getAffectedChannels();
            List<String> affectedChannelGroups = pNStatus.getAffectedChannelGroups();
            ChangeTemporaryUnavailableOperation.ChangeTemporaryUnavailableOperationBuilder builder = ChangeTemporaryUnavailableOperation.builder();
            if (affectedChannels != null || affectedChannelGroups != null) {
                if (affectedChannels != null) {
                    for (String unavailableChannel : affectedChannels) {
                        builder.unavailableChannel(unavailableChannel);
                    }
                }
                if (affectedChannelGroups != null) {
                    for (String unavailableChannelGroup : affectedChannelGroups) {
                        builder.unavailableChannelGroup(unavailableChannelGroup);
                    }
                }
                startSubscribeLoop(builder.build());
            }
        } else if (ordinal == 3) {
            startSubscribeLoop(pubSubOperationArr);
        } else if (ordinal == 8) {
            disconnect();
            this.listenerManager.announce(pNStatus);
            this.reconnectionManager.startPolling();
        } else if (ordinal == 10 || ordinal == 11) {
            disconnect();
            this.listenerManager.announce(pNStatus);
        } else {
            this.listenerManager.announce(pNStatus);
            this.delayedReconnectionManager.scheduleDelayedReconnection();
        }
    }

    /* access modifiers changed from: private */
    public synchronized void performHeartbeatLoop(PubSubOperation pubSubOperation) {
        Heartbeat heartbeat = this.heartbeatCall;
        Map<String, Object> map = null;
        if (heartbeat != null) {
            heartbeat.silentCancel();
            this.heartbeatCall = null;
        }
        this.subscriptionState.handleOperation(pubSubOperation);
        StateManager.HeartbeatStateData heartbeatStateData = this.subscriptionState.heartbeatStateData();
        List<String> heartbeatChannels = heartbeatStateData.getHeartbeatChannels();
        List<String> heartbeatChannelGroups = heartbeatStateData.getHeartbeatChannelGroups();
        if (!heartbeatChannels.isEmpty() || !heartbeatChannelGroups.isEmpty()) {
            if (!heartbeatStateData.getStatePayload().isEmpty()) {
                map = heartbeatStateData.getStatePayload();
            }
            Heartbeat state = new Heartbeat(this.pubnub, this.telemetryManager, this.retrofitManager, this.tokenManager).channels(heartbeatChannels).channelGroups(heartbeatChannelGroups).state(map);
            this.heartbeatCall = state;
            state.async(new PNCallback<Boolean>() {
                public void onResponse(Boolean bool, PNStatus pNStatus) {
                    PNHeartbeatNotificationOptions heartbeatNotificationOptions = SubscriptionManager.this.pubnub.getConfiguration().getHeartbeatNotificationOptions();
                    if (pNStatus.isError()) {
                        if (heartbeatNotificationOptions == PNHeartbeatNotificationOptions.ALL || heartbeatNotificationOptions == PNHeartbeatNotificationOptions.FAILURES) {
                            SubscriptionManager.this.listenerManager.announce(pNStatus);
                        }
                        SubscriptionManager.this.stopHeartbeatTimer();
                    } else if (heartbeatNotificationOptions == PNHeartbeatNotificationOptions.ALL) {
                        SubscriptionManager.this.listenerManager.announce(pNStatus);
                    }
                }
            });
        }
    }

    private synchronized void registerHeartbeatTimer(final PubSubOperation pubSubOperation) {
        stopHeartbeatTimer();
        if (this.pubnub.getConfiguration().getHeartbeatInterval() > 0) {
            Timer timer2 = new Timer("Subscription Manager Heartbeat Timer", true);
            this.timer = timer2;
            timer2.schedule(new TimerTask() {
                public void run() {
                    SubscriptionManager.this.performHeartbeatLoop(pubSubOperation);
                }
            }, 0, (long) (this.pubnub.getConfiguration().getHeartbeatInterval() * 1000));
        }
    }

    private void scheduleDelayedLoopIterationForTemporaryUnavailableChannels() {
        cancelDelayedLoopIterationForTemporaryUnavailableChannels();
        Timer timer2 = new Timer("Subscription Manager TMP Unavailable Channel Delayer", true);
        this.temporaryUnavailableChannelsDelayer = timer2;
        timer2.schedule(new TimerTask() {
            public void run() {
                SubscriptionManager.this.startSubscribeLoop(PubSubOperation.NO_OP);
            }
        }, 2000);
    }

    /* access modifiers changed from: private */
    public void stopHeartbeatTimer() {
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
            this.timer = null;
        }
    }

    private void stopSubscribeLoop() {
        cancelDelayedLoopIterationForTemporaryUnavailableChannels();
        Subscribe subscribe = this.subscribeCall;
        if (subscribe != null) {
            subscribe.silentCancel();
            this.subscribeCall = null;
        }
    }

    public /* synthetic */ void a(PubSubOperation[] pubSubOperationArr, StateManager.SubscriptionStateData subscriptionStateData, SubscribeEnvelope subscribeEnvelope, PNStatus pNStatus) {
        PubSubOperation pubSubOperation;
        this.httpRequestPending = false;
        if (pNStatus.isError()) {
            handleError(pNStatus, pubSubOperationArr);
            return;
        }
        ChangeTemporaryUnavailableOperation.ChangeTemporaryUnavailableOperationBuilder builder = ChangeTemporaryUnavailableOperation.builder();
        if (pNStatus.getCategory() == PNStatusCategory.PNAcknowledgmentCategory) {
            List<String> affectedChannels = pNStatus.getAffectedChannels();
            List<String> affectedChannelGroups = pNStatus.getAffectedChannelGroups();
            if (affectedChannels != null) {
                for (String availableChannel : affectedChannels) {
                    builder.availableChannel(availableChannel);
                }
            }
            if (affectedChannelGroups != null) {
                for (String availableChannelGroup : affectedChannelGroups) {
                    builder.availableChannelGroup(availableChannelGroup);
                }
            }
        }
        if (subscriptionStateData.isShouldAnnounce()) {
            this.listenerManager.announce(createPublicStatus(pNStatus).category(PNStatusCategory.PNConnectedCategory).error(false).build());
            pubSubOperation = PubSubOperation.STATUS_ANNOUNCED;
        } else {
            pubSubOperation = PubSubOperation.NO_OP;
        }
        Integer requestMessageCountThreshold = this.pubnub.getConfiguration().getRequestMessageCountThreshold();
        if (requestMessageCountThreshold != null && requestMessageCountThreshold.intValue() <= subscribeEnvelope.getMessages().size()) {
            this.listenerManager.announce(createPublicStatus(pNStatus).category(PNStatusCategory.PNRequestMessageCountExceededCategory).error(false).build());
        }
        if (subscribeEnvelope.getMessages().size() != 0) {
            this.messageQueue.addAll(subscribeEnvelope.getMessages());
        }
        startSubscribeLoop(new TimetokenAndRegionOperation(subscribeEnvelope.getMetadata().getTimetoken().longValue(), subscribeEnvelope.getMetadata().getRegion()), builder.build(), pubSubOperation);
    }

    public void adaptPresenceBuilder(PresenceOperation presenceOperation) {
        if (!this.pubnub.getConfiguration().isSuppressLeaveEvents() && !presenceOperation.isConnected()) {
            new Leave(this.pubnub, this.telemetryManager, this.retrofitManager, this.tokenManager).channels(presenceOperation.getChannels()).channelGroups(presenceOperation.getChannelGroups()).async(new PNCallback<Boolean>() {
                public void onResponse(Boolean bool, PNStatus pNStatus) {
                    SubscriptionManager.this.listenerManager.announce(pNStatus);
                }
            });
        }
        registerHeartbeatTimer(presenceOperation);
    }

    public void adaptStateBuilder(StateOperation stateOperation) {
        reconnect(stateOperation);
    }

    public void adaptSubscribeBuilder(SubscribeOperation subscribeOperation) {
        reconnect(subscribeOperation);
    }

    public void adaptUnsubscribeBuilder(UnsubscribeOperation unsubscribeOperation) {
        if (!this.pubnub.getConfiguration().isSuppressLeaveEvents()) {
            new Leave(this.pubnub, this.telemetryManager, this.retrofitManager, this.tokenManager).channels(unsubscribeOperation.getChannels()).channelGroups(unsubscribeOperation.getChannelGroups()).async(new PNCallback<Boolean>() {
                public void onResponse(Boolean bool, PNStatus pNStatus) {
                    if (!pNStatus.isError() || pNStatus.getCategory() != PNStatusCategory.PNAccessDeniedCategory) {
                        SubscriptionManager.this.listenerManager.announce(pNStatus);
                    }
                }
            });
        }
        reconnect(unsubscribeOperation);
    }

    public synchronized void destroy(boolean z) {
        Thread thread;
        disconnect();
        if (z && (thread = this.consumerThread) != null) {
            thread.interrupt();
        }
    }

    public synchronized void disconnect() {
        this.connected = false;
        cancelDelayedLoopIterationForTemporaryUnavailableChannels();
        this.subscriptionState.handleOperation(PubSubOperation.DISCONNECT);
        this.delayedReconnectionManager.stop();
        stopHeartbeatTimer();
        stopSubscribeLoop();
    }

    public void reconnect() {
        reconnect(PubSubOperation.NO_OP);
    }

    public synchronized void startSubscribeLoop(PubSubOperation... pubSubOperationArr) {
        if (this.connected) {
            if (this.subscriptionState.handleOperation(pubSubOperationArr) || !this.httpRequestPending) {
                stopSubscribeLoop();
                for (PubSubOperation pubSubOperation : pubSubOperationArr) {
                    if (pubSubOperation instanceof SubscribeOperation) {
                        this.duplicationManager.clearHistory();
                    }
                }
                StateManager.SubscriptionStateData subscriptionStateData = this.subscriptionState.subscriptionStateData(Boolean.TRUE, StateManager.ChannelFilter.WITHOUT_TEMPORARY_UNAVAILABLE);
                if (subscriptionStateData.isAnythingToSubscribe()) {
                    if (subscriptionStateData.isSubscribedToOnlyTemporaryUnavailable()) {
                        scheduleDelayedLoopIterationForTemporaryUnavailableChannels();
                        return;
                    }
                    this.httpRequestPending = true;
                    Subscribe state = new Subscribe(this.pubnub, this.retrofitManager, this.tokenManager).channels(subscriptionStateData.getChannels()).channelGroups(subscriptionStateData.getChannelGroups()).timetoken(subscriptionStateData.getTimetoken()).region(subscriptionStateData.getRegion()).filterExpression(this.pubnub.getConfiguration().getFilterExpression()).state(subscriptionStateData.getStatePayload());
                    this.subscribeCall = state;
                    state.async(new a(this, pubSubOperationArr, subscriptionStateData));
                }
            }
        }
    }

    @Deprecated
    public synchronized void stop() {
        disconnect();
        this.consumerThread.interrupt();
    }

    public void unsubscribeAll() {
        StateManager.SubscriptionStateData subscriptionStateData = this.subscriptionState.subscriptionStateData(Boolean.FALSE);
        adaptUnsubscribeBuilder(UnsubscribeOperation.builder().channelGroups(subscriptionStateData.getChannelGroups()).channels(subscriptionStateData.getChannels()).build());
    }

    /* access modifiers changed from: private */
    public void reconnect(PubSubOperation pubSubOperation) {
        this.connected = true;
        startSubscribeLoop(pubSubOperation);
        registerHeartbeatTimer(PubSubOperation.NO_OP);
    }
}
