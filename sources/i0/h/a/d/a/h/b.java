package i0.h.a.d.a.h;

import android.os.IBinder;
import android.os.IInterface;
import i0.h.a.d.a.e.a;
import i0.h.a.d.a.e.c;
import i0.h.a.d.a.e.l;

public final /* synthetic */ class b implements l {
    public static final l a = new b();

    public final Object a(IBinder iBinder) {
        int i = i0.h.a.d.a.e.b.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
    }
}
