package h0.t;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import h0.t.m;
import h0.t.s;
import java.util.ArrayDeque;

/* compiled from: NavDeepLinkBuilder */
public final class i {
    public final Context a;
    public final Intent b;
    public m c;
    public int d;
    public Bundle e;

    /* compiled from: NavDeepLinkBuilder */
    public static class a extends t {
        public final s<k> c = new C0066a(this);

        /* renamed from: h0.t.i$a$a  reason: collision with other inner class name */
        /* compiled from: NavDeepLinkBuilder */
        public class C0066a extends s<k> {
            public C0066a(a aVar) {
            }

            public k a() {
                return new k("permissive");
            }

            public k b(k kVar, Bundle bundle, q qVar, s.a aVar) {
                throw new IllegalStateException("navigate is not supported");
            }

            public boolean e() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public a() {
            a(new n(this));
        }

        public s<? extends k> c(String str) {
            try {
                return super.c(str);
            } catch (IllegalStateException unused) {
                return this.c;
            }
        }
    }

    public i(Context context) {
        this.a = context;
        if (context instanceof Activity) {
            this.b = new Intent(context, context.getClass());
        } else {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            this.b = launchIntentForPackage == null ? new Intent() : launchIntentForPackage;
        }
        this.b.addFlags(268468224);
    }

    public PendingIntent a() {
        Bundle bundle = this.e;
        int i = 0;
        if (bundle != null) {
            int i2 = 0;
            for (String str : bundle.keySet()) {
                Object obj = this.e.get(str);
                i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
            }
            i = i2;
        }
        return b().getPendingIntent((i * 31) + this.d, 134217728);
    }

    public TaskStackBuilder b() {
        if (this.b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") != null) {
            TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.a).addNextIntentWithParentStack(new Intent(this.b));
            for (int i = 0; i < addNextIntentWithParentStack.getIntentCount(); i++) {
                addNextIntentWithParentStack.editIntentAt(i).putExtra("android-support-nav:controller:deepLinkIntent", this.b);
            }
            return addNextIntentWithParentStack;
        } else if (this.c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        } else {
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
    }

    public final void c() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.c);
        k kVar = null;
        while (!arrayDeque.isEmpty() && kVar == null) {
            k kVar2 = (k) arrayDeque.poll();
            if (kVar2.q == this.d) {
                kVar = kVar2;
            } else if (kVar2 instanceof m) {
                m.a aVar = new m.a();
                while (aVar.hasNext()) {
                    arrayDeque.add((k) aVar.next());
                }
            }
        }
        if (kVar != null) {
            this.b.putExtra("android-support-nav:controller:deepLinkIds", kVar.c());
            return;
        }
        StringBuilder T0 = i0.d.a.a.a.T0("Navigation destination ", k.j(this.a, this.d), " cannot be found in the navigation graph ");
        T0.append(this.c);
        throw new IllegalArgumentException(T0.toString());
    }

    public i d(int i) {
        this.d = i;
        if (this.c != null) {
            c();
        }
        return this;
    }

    public i e(int i) {
        this.c = new p(this.a, new a()).c(i);
        if (this.d != 0) {
            c();
        }
        return this;
    }
}
