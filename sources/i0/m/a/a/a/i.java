package i0.m.a.a.a;

import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.endpoints.files.SendFile;

/* compiled from: lambda */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ SendFile c;
    public final /* synthetic */ PNCallback d;

    public /* synthetic */ i(SendFile sendFile, PNCallback pNCallback) {
        this.c = sendFile;
        this.d = pNCallback;
    }

    public final void run() {
        this.c.a(this.d);
    }
}
