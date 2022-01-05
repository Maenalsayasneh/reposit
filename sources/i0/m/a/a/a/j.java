package i0.m.a.a.a;

import com.pubnub.api.endpoints.files.SendFile;
import com.pubnub.api.endpoints.remoteaction.RemoteAction;
import com.pubnub.api.endpoints.remoteaction.RemoteActionFactory;
import com.pubnub.api.models.consumer.files.PNPublishFileMessageResult;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: lambda */
public final /* synthetic */ class j implements RemoteActionFactory {
    public final /* synthetic */ SendFile a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ j(SendFile sendFile, AtomicReference atomicReference) {
        this.a = sendFile;
        this.b = atomicReference;
    }

    public final RemoteAction create(Object obj) {
        return this.a.d(this.b, (PNPublishFileMessageResult) obj);
    }
}
