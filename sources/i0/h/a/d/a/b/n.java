package i0.h.a.d.a.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.bv;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.e.o0;
import i0.h.a.d.a.e.p;
import i0.h.a.d.a.e.q;
import i0.h.a.d.a.j.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class n implements e3 {
    public static final f a = new f("AssetPackServiceImpl");
    public static final Intent b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    public final String c;
    public final r0 d;
    @Nullable
    public p<o0> e;
    @Nullable
    public p<o0> f;
    public final AtomicBoolean g = new AtomicBoolean();

    public n(Context context, r0 r0Var) {
        this.c = context.getPackageName();
        this.d = r0Var;
        if (q.a(context)) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = applicationContext != null ? applicationContext : context;
            f fVar = a;
            Intent intent = b;
            this.e = new p(context2, fVar, "AssetPackService", intent, f3.a);
            Context applicationContext2 = context.getApplicationContext();
            this.f = new p(applicationContext2 != null ? applicationContext2 : context, fVar, "AssetPackService-keepAlive", intent, g3.a);
        }
        a.b(3, "AssetPackService initiated.", new Object[0]);
    }

    public static Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10900);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    public static /* synthetic */ Bundle b(Map map) {
        Bundle a2 = a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        a2.putParcelableArrayList("installed_asset_module", arrayList);
        return a2;
    }

    public static Bundle c(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        bundle.putString(InstabugDbContract.APMUiTraceEntry.COLUMN_MODULE_NAME, str);
        bundle.putString("slice_id", str2);
        bundle.putInt("chunk_number", i2);
        return bundle;
    }

    public static <T> i0.h.a.d.a.j.p<T> e() {
        a.b(6, "onError(%d)", new Object[]{-11});
        AssetPackException assetPackException = new AssetPackException(-11);
        i0.h.a.d.a.j.p<T> pVar = new i0.h.a.d.a.j.p<>();
        pVar.e(assetPackException);
        return pVar;
    }

    public final void d(int i, String str, int i2) {
        if (this.e != null) {
            a.b(4, "notifyModuleCompleted", new Object[0]);
            m mVar = new m();
            this.e.a(new e(this, mVar, i, str, mVar, i2));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final synchronized void h() {
        if (this.f == null) {
            a.b(5, "Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        f fVar = a;
        fVar.b(4, "keepAlive", new Object[0]);
        if (!this.g.compareAndSet(false, true)) {
            fVar.b(4, "Service is already kept alive.", new Object[0]);
            return;
        }
        m mVar = new m();
        this.f.a(new h(this, mVar, mVar));
    }

    public final void i(List<String> list) {
        if (this.e != null) {
            a.b(4, "cancelDownloads(%s)", new Object[]{list});
            m mVar = new m();
            this.e.a(new b(this, mVar, list, mVar));
        }
    }

    public final void j(int i) {
        if (this.e != null) {
            a.b(4, "notifySessionFailed", new Object[0]);
            m mVar = new m();
            this.e.a(new f(this, mVar, i, mVar));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final void k(int i, String str, String str2, int i2) {
        if (this.e != null) {
            a.b(4, "notifyChunkTransferred", new Object[0]);
            m mVar = new m();
            this.e.a(new d(this, mVar, i, str, str2, i2, mVar));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final void l(int i, String str) {
        d(i, str, 10);
    }

    public final i0.h.a.d.a.j.p<ParcelFileDescriptor> m(int i, String str, String str2, int i2) {
        if (this.e == null) {
            return e();
        }
        a.b(4, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{str, str2, Integer.valueOf(i2), Integer.valueOf(i)});
        m mVar = new m();
        this.e.a(new g(this, mVar, i, str, str2, i2, mVar));
        return mVar.a;
    }

    public final i0.h.a.d.a.j.p<List<String>> n(Map<String, Long> map) {
        if (this.e == null) {
            return e();
        }
        a.b(4, "syncPacks", new Object[0]);
        m mVar = new m();
        this.e.a(new c(this, mVar, map, mVar));
        return mVar.a;
    }
}
