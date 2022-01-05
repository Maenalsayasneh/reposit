package i0.m.a.a.a;

import com.pubnub.api.PubNubException;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.endpoints.files.GetFileUrl;
import com.pubnub.api.models.consumer.PNErrorData;
import com.pubnub.api.models.consumer.PNStatus;
import java.util.Objects;

/* compiled from: lambda */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ GetFileUrl c;
    public final /* synthetic */ PNCallback d;

    public /* synthetic */ c(GetFileUrl getFileUrl, PNCallback pNCallback) {
        this.c = getFileUrl;
        this.d = pNCallback;
    }

    public final void run() {
        GetFileUrl getFileUrl = this.c;
        PNCallback pNCallback = this.d;
        Objects.requireNonNull(getFileUrl);
        try {
            pNCallback.onResponse(getFileUrl.sync(), PNStatus.builder().statusCode(200).build());
        } catch (PubNubException e) {
            pNCallback.onResponse(null, PNStatus.builder().statusCode(500).errorData(new PNErrorData(e.getErrormsg(), e)).error(true).build());
        }
    }
}
