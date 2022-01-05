package i0.h.a.b.b;

import android.os.Bundle;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
public final class s extends q<Bundle> {
    public s(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(MessageExtension.FIELD_DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    public final boolean d() {
        return false;
    }
}
