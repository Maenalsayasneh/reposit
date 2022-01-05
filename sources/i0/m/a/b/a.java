package i0.m.a.b;

import com.pubnub.api.builder.dto.PubSubOperation;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.managers.StateManager;
import com.pubnub.api.managers.SubscriptionManager;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.server.SubscribeEnvelope;

/* compiled from: lambda */
public final /* synthetic */ class a implements PNCallback {
    public final /* synthetic */ SubscriptionManager a;
    public final /* synthetic */ PubSubOperation[] b;
    public final /* synthetic */ StateManager.SubscriptionStateData c;

    public /* synthetic */ a(SubscriptionManager subscriptionManager, PubSubOperation[] pubSubOperationArr, StateManager.SubscriptionStateData subscriptionStateData) {
        this.a = subscriptionManager;
        this.b = pubSubOperationArr;
        this.c = subscriptionStateData;
    }

    public final void onResponse(Object obj, PNStatus pNStatus) {
        this.a.a(this.b, this.c, (SubscribeEnvelope) obj, pNStatus);
    }
}
