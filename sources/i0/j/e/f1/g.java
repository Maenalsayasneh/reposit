package i0.j.e.f1;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.p.a;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: TouchedViewsProcessor */
public class g {
    public static g a;
    public List<b> b = new ArrayList();
    public List<WeakReference<View>> c = new ArrayList();
    public List<WeakReference<ViewGroup>> d = new ArrayList();
    public List<WeakReference<ViewGroup>> e = new ArrayList();
    public List<WeakReference<ViewGroup>> f = new ArrayList();
    public d g = new d();
    public StringBuilder h = new StringBuilder();

    /* compiled from: TouchedViewsProcessor */
    public class a implements BitmapUtils.OnSaveBitmapCallback {
        public final /* synthetic */ b a;
        public final /* synthetic */ c b;
        public final /* synthetic */ View c;

        public a(b bVar, c cVar, View view) {
            this.a = bVar;
            this.b = cVar;
            this.c = view;
        }

        public void onError(Throwable th) {
            if (th.getMessage() != null) {
                InstabugSDKLogger.e("TouchedViewsProcessor", th.getMessage());
            }
            if (g.this.g(this.c)) {
                g.this.g.a = String.format("the button \"%s\"", new Object[]{this.c.getContentDescription()});
                ((a.C0108a) this.a).a(this.b, g.this.g);
                return;
            }
            d dVar = g.this.g;
            dVar.a = "a button";
            dVar.b = null;
            ((a.C0108a) this.a).a(this.b, dVar);
        }

        public void onSuccess(Uri uri) {
            d dVar = g.this.g;
            dVar.a = "the button ";
            uri.toString();
            Objects.requireNonNull(dVar);
            g.this.g.b = uri.getLastPathSegment();
            if (uri.getPath() != null) {
                InstabugCore.encrypt(uri.getPath());
            }
            ((a.C0108a) this.a).a(this.b, g.this.g);
        }
    }

    /* compiled from: TouchedViewsProcessor */
    public interface b {
    }

    public g() {
        a();
    }

    public void a() {
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new StringBuilder();
        this.g = new d();
    }

    public final void b(View view, Drawable drawable, c cVar, b bVar) {
        BitmapUtils.saveDrawableBitmap(drawable, System.currentTimeMillis(), new a(bVar, cVar, view));
    }

    public final void c(ViewGroup viewGroup, List<WeakReference<ViewGroup>> list) {
        for (int i = 0; i < viewGroup.getChildCount() && this.c.size() < 60; i++) {
            this.c.add(new WeakReference(viewGroup.getChildAt(i)));
            if ((viewGroup.getChildAt(i) instanceof ViewGroup) && list != null) {
                list.add(new WeakReference((ViewGroup) viewGroup.getChildAt(i)));
            }
        }
    }

    public final void d(List<WeakReference<ViewGroup>> list, List<WeakReference<ViewGroup>> list2) {
        for (int i = 0; i < list.size() && this.c.size() < 60; i++) {
            ViewGroup viewGroup = (ViewGroup) list.get(i).get();
            if (viewGroup != null) {
                c(viewGroup, list2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.View r4) {
        /*
            r3 = this;
            com.instabug.library.settings.SettingsManager r0 = com.instabug.library.settings.SettingsManager.getInstance()
            java.util.Collection r0 = r0.getPrivateViews()
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1.equals(r4)
            if (r2 != 0) goto L_0x0024
            boolean r1 = r3.f(r4, r1)
            if (r1 == 0) goto L_0x000c
        L_0x0024:
            r4 = 1
            return r4
        L_0x0026:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.f1.g.e(android.view.View):boolean");
    }

    public boolean f(View view, View view2) {
        if (view2 instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view2;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if (childAt.equals(view)) {
                    return true;
                }
                f(view, childAt);
                i++;
            }
        }
        return false;
    }

    public final boolean g(View view) {
        return view.getContentDescription() != null && view.getContentDescription().length() > 0;
    }
}
