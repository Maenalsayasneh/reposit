package i0.h.a.d.a.e;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import i0.h.a.d.a.a.m;
import i0.h.a.d.a.a.n;
import i0.h.a.d.a.a.p;
import i0.h.a.d.a.a.r;
import java.io.File;
import java.util.Objects;

public abstract class k0 extends f0 implements l0 {
    public k0() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    public final boolean L(int i, Parcel parcel) throws RemoteException {
        int i2 = i;
        Parcel parcel2 = parcel;
        if (i2 == 2) {
            Bundle bundle = (Bundle) g0.a(parcel2, Bundle.CREATOR);
            m mVar = (m) this;
            mVar.c.c.b();
            mVar.a.b(4, "onRequestInfo", new Object[0]);
            if (bundle.getInt("error.code", -2) != 0) {
                mVar.b.a(new InstallException(bundle.getInt("error.code", -2)));
                return true;
            }
            i0.h.a.d.a.j.m<T> mVar2 = mVar.b;
            n nVar = mVar.e;
            String str = mVar.d;
            int i3 = bundle.getInt("version.code", -1);
            int i4 = bundle.getInt("update.availability");
            int i5 = bundle.getInt("install.status", 0);
            Integer valueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
            int i6 = bundle.getInt("in.app.update.priority", 0);
            long j = bundle.getLong("bytes.downloaded");
            long j2 = bundle.getLong("total.bytes.to.download");
            long j3 = bundle.getLong("additional.size.required");
            p pVar = nVar.f;
            Objects.requireNonNull(pVar);
            mVar2.b(new r(str, i3, i4, i5, valueOf, i6, j, j2, j3, p.a(new File(pVar.a.getFilesDir(), "assetpacks")), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) g0.a(parcel2, Bundle.CREATOR);
            m mVar3 = (m) this;
            mVar3.c.c.b();
            mVar3.a.b(4, "onCompleteUpdate", new Object[0]);
            return true;
        }
    }
}
