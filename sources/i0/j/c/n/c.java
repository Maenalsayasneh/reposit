package i0.j.c.n;

import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.e.a;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.core.ui.BasePresenter;
import i0.j.c.l.b;
import java.lang.ref.WeakReference;

/* compiled from: ChatPresenter */
public class c extends BasePresenter<b> implements a {
    public c(b bVar) {
        super(bVar);
    }

    public void e(int i) {
        WeakReference<V> weakReference;
        b bVar;
        b bVar2;
        WeakReference<V> weakReference2;
        b bVar3;
        if (i == 160) {
            if (m() && (weakReference2 = this.view) != null && (bVar3 = (b) weakReference2.get()) != null) {
                bVar3.o();
            }
        } else if (i == 161) {
            WeakReference<V> weakReference3 = this.view;
            if (weakReference3 != null && (bVar2 = (b) weakReference3.get()) != null && bVar2.x() != null) {
                q(bVar2.x());
            }
        } else if (i == 164 && (weakReference = this.view) != null && (bVar = (b) weakReference.get()) != null && bVar.x() != null && bVar.m() != null) {
            String x = bVar.x();
            a m = bVar.m();
            WeakReference<V> weakReference4 = this.view;
            b bVar4 = weakReference4 != null ? (b) weakReference4.get() : null;
            if (m() && bVar4 != null) {
                bVar4.o();
            }
            if (bVar4 != null) {
                bVar4.C(x, m);
            }
        }
    }

    public void f() {
        OnSdkDismissCallback onSdkDismissCallback = b.a().f;
        if (onSdkDismissCallback != null) {
            onSdkDismissCallback.call(OnSdkDismissCallback.DismissType.CANCEL, OnSdkDismissCallback.ReportType.OTHER);
        }
    }

    public final boolean m() {
        return ChatsCacheManager.getValidChats().size() > 0;
    }

    public final void q(String str) {
        WeakReference<V> weakReference = this.view;
        b bVar = weakReference != null ? (b) weakReference.get() : null;
        if (m() && bVar != null) {
            bVar.o();
        }
        if (bVar != null) {
            bVar.q(str);
        }
    }

    public void f(String str) {
        q(str);
    }
}
