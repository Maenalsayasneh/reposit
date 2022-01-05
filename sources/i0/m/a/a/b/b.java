package i0.m.a.a.b;

import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction;
import com.pubnub.api.models.consumer.PNStatus;

/* compiled from: lambda */
public final /* synthetic */ class b implements PNCallback {
    public final /* synthetic */ ComposableRemoteAction a;
    public final /* synthetic */ PNCallback b;

    public /* synthetic */ b(ComposableRemoteAction composableRemoteAction, PNCallback pNCallback) {
        this.a = composableRemoteAction;
        this.b = pNCallback;
    }

    public final void onResponse(Object obj, PNStatus pNStatus) {
        this.a.b(this.b, obj, pNStatus);
    }
}
