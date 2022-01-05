package i0.h.a.d.a.b;

import android.os.Bundle;

public final class m extends i<Void> {
    public final int c;
    public final String d;
    public final int e;
    public final /* synthetic */ n f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(n nVar, i0.h.a.d.a.j.m<Void> mVar, int i, String str, int i2) {
        super(nVar, mVar);
        this.f = nVar;
        this.c = i;
        this.d = str;
        this.e = i2;
    }

    public final void W(Bundle bundle) {
        this.f.e.b();
        int i = bundle.getInt("error_code");
        n.a.b(6, "onError(%d), retrying notifyModuleCompleted...", new Object[]{Integer.valueOf(i)});
        int i2 = this.e;
        if (i2 > 0) {
            this.f.d(this.c, this.d, i2 - 1);
        }
    }
}
