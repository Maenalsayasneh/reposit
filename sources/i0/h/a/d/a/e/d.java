package i0.h.a.d.a.e;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.review.a;

public abstract class d extends f0 implements e {
    public d() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    public final boolean L(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        i0.h.a.d.a.h.d dVar = (i0.h.a.d.a.h.d) this;
        dVar.c.b.b();
        dVar.a.b(4, "onGetLaunchReviewFlowInfo", new Object[0]);
        dVar.b.b(new a((PendingIntent) ((Bundle) g0.a(parcel, Bundle.CREATOR)).get("confirmation_intent")));
        return true;
    }
}
