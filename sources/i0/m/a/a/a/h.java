package i0.m.a.a.a;

import com.pubnub.api.endpoints.remoteaction.PNFunction;
import com.pubnub.api.models.consumer.files.PNBaseFile;
import com.pubnub.api.models.consumer.files.PNFileUploadResult;
import com.pubnub.api.models.consumer.files.PNPublishFileMessageResult;
import com.pubnub.api.models.server.files.FileUploadRequestDetails;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: lambda */
public final /* synthetic */ class h implements PNFunction {
    public final /* synthetic */ AtomicReference a;

    public /* synthetic */ h(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final Object invoke(Object obj) {
        AtomicReference atomicReference = this.a;
        return new PNFileUploadResult(((PNPublishFileMessageResult) obj).getTimetoken(), 200, new PNBaseFile(((FileUploadRequestDetails) atomicReference.get()).getData().getId(), ((FileUploadRequestDetails) atomicReference.get()).getData().getName()));
    }
}
