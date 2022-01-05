package i0.h.a.b.c.g.j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import i0.h.a.b.c.g.a;
import i0.h.a.b.c.i.b;
import i0.h.a.b.c.i.g;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class j implements ServiceConnection, a.f {
    static {
        Class<j> cls = j.class;
    }

    public final Set<Scope> a() {
        return Collections.emptySet();
    }

    public final void b(g gVar, Set<Scope> set) {
    }

    public final void c(@RecentlyNonNull String str) {
        Thread.currentThread();
        throw null;
    }

    public final boolean d() {
        Thread.currentThread();
        throw null;
    }

    @RecentlyNonNull
    public final String e() {
        Objects.requireNonNull((Object) null, "null reference");
        throw null;
    }

    public final void f(@RecentlyNonNull b.c cVar) {
        Thread.currentThread();
        throw null;
    }

    public final void g() {
        Thread.currentThread();
        throw null;
    }

    public final void h(@RecentlyNonNull b.e eVar) {
    }

    public final boolean i() {
        return false;
    }

    public final boolean isConnected() {
        Thread.currentThread();
        throw null;
    }

    public final int j() {
        return 0;
    }

    @RecentlyNonNull
    public final Feature[] k() {
        return new Feature[0];
    }

    @RecentlyNullable
    public final String l() {
        return null;
    }

    public final boolean n() {
        return false;
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        throw null;
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        throw null;
    }
}
