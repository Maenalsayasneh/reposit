package i0.m.a.a.a;

import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.files.SendFile;
import com.pubnub.api.endpoints.remoteaction.RemoteAction;
import com.pubnub.api.endpoints.remoteaction.RemoteActionFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: lambda */
public final /* synthetic */ class g implements RemoteActionFactory {
    public final /* synthetic */ SendFile a;
    public final /* synthetic */ BuilderSteps.ChannelStep b;
    public final /* synthetic */ AtomicReference c;

    public /* synthetic */ g(SendFile sendFile, BuilderSteps.ChannelStep channelStep, AtomicReference atomicReference) {
        this.a = sendFile;
        this.b = channelStep;
        this.c = atomicReference;
    }

    public final RemoteAction create(Object obj) {
        return this.a.c(this.b, this.c, (Void) obj);
    }
}
