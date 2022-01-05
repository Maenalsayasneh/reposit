package i0.m.a.a.a;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.files.DownloadFile;
import com.pubnub.api.endpoints.remoteaction.PNFunction3;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;

/* compiled from: lambda */
public final /* synthetic */ class b implements PNFunction3 {
    public final /* synthetic */ PubNub a;
    public final /* synthetic */ TelemetryManager b;
    public final /* synthetic */ RetrofitManager c;
    public final /* synthetic */ TokenManager d;

    public /* synthetic */ b(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        this.a = pubNub;
        this.b = telemetryManager;
        this.c = retrofitManager;
        this.d = tokenManager;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new DownloadFile((String) obj, (String) obj2, (String) obj3, this.a, this.b, this.c, this.d);
    }
}
