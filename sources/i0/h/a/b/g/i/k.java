package i0.h.a.b.g.i;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.g.c;
import java.util.Objects;

public final class k extends j {
    public final /* synthetic */ byte[] m;
    public final /* synthetic */ String n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(c cVar, byte[] bArr, String str) {
        super(cVar);
        this.m = bArr;
        this.n = str;
    }

    public final void i(a.b bVar) throws RemoteException {
        m mVar = (m) bVar;
        e eVar = this.l;
        byte[] bArr = this.m;
        String str = this.n;
        if (TextUtils.isEmpty(str)) {
            Objects.requireNonNull(mVar);
            try {
                PackageManager packageManager = mVar.A.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(mVar.A.getPackageName(), 128);
                    if (applicationInfo != null) {
                        Bundle bundle = applicationInfo.metaData;
                        if (bundle != null) {
                            str = (String) bundle.get("com.google.android.safetynet.ATTEST_API_KEY");
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            str = null;
        }
        ((g) mVar.u()).x(eVar, bArr, str);
    }
}
