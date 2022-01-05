package i0.m.a.a.a;

import com.pubnub.api.endpoints.files.SendFile;
import com.pubnub.api.endpoints.files.UploadFile;
import com.pubnub.api.endpoints.remoteaction.RemoteAction;
import com.pubnub.api.endpoints.remoteaction.RemoteActionFactory;
import com.pubnub.api.models.server.files.FileUploadRequestDetails;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: lambda */
public final /* synthetic */ class f implements RemoteActionFactory {
    public final /* synthetic */ SendFile a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ UploadFile.Factory c;

    public /* synthetic */ f(SendFile sendFile, AtomicReference atomicReference, UploadFile.Factory factory) {
        this.a = sendFile;
        this.b = atomicReference;
        this.c = factory;
    }

    public final RemoteAction create(Object obj) {
        return this.a.b(this.b, this.c, (FileUploadRequestDetails) obj);
    }
}
