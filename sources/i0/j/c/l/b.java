package i0.j.c.l;

import com.instabug.chat.settings.AttachmentTypesState;
import com.instabug.library.Feature;
import com.instabug.library.OnSdkDismissCallback;

/* compiled from: PerSessionSettings */
public class b {
    public static b a;
    public AttachmentTypesState b;
    public Runnable c;
    public boolean d = false;
    public String e;
    public OnSdkDismissCallback f;

    public b() {
        Feature.State state = Feature.State.ENABLED;
        this.b = new AttachmentTypesState();
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }
}
