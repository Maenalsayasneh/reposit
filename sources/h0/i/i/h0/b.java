package h0.i.i.h0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import h0.b.f.r;
import h0.i.i.h0.e;

/* compiled from: InputConnectionCompat */
public class b extends InputConnectionWrapper {
    public final /* synthetic */ d a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, boolean z, d dVar) {
        super(inputConnection, z);
        this.a = dVar;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        d dVar = this.a;
        e eVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            eVar = new e(new e.a(inputContentInfo));
        }
        if (((r) dVar).a(eVar, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
