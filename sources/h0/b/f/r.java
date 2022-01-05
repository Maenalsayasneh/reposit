package h0.b.f;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import h0.i.i.c;
import h0.i.i.h0.d;
import h0.i.i.h0.e;
import h0.i.i.q;

/* compiled from: AppCompatReceiveContentHelper */
public class r implements d {
    public final /* synthetic */ View a;

    public r(View view) {
        this.a = view;
    }

    public boolean a(e eVar, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                eVar.a.b();
                InputContentInfo inputContentInfo = (InputContentInfo) eVar.a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        c.a aVar = new c.a(new ClipData(eVar.a.getDescription(), new ClipData.Item(eVar.a.a())), 2);
        aVar.d = eVar.a.c();
        aVar.e = bundle;
        if (q.l(this.a, new c(aVar)) == null) {
            return true;
        }
        return false;
    }
}
