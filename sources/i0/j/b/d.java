package i0.j.b;

import com.instabug.library.internal.storage.ProcessedUri;
import com.instabug.library.model.Attachment;

/* compiled from: LiveBugManager */
public class d implements k0.b.y.d<ProcessedUri> {
    public final /* synthetic */ f c;

    public d(f fVar) {
        this.c = fVar;
    }

    public void b(Object obj) throws Exception {
        ProcessedUri processedUri = (ProcessedUri) obj;
        if (this.c.b != null) {
            this.c.b.a(processedUri.getUri(), Attachment.Type.VISUAL_USER_STEPS, processedUri.isUriEncrypted());
        }
    }
}
