package i0.h.a.d.a.b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.bv;
import i0.h.a.d.a.e.a0;
import i0.h.a.d.a.e.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

public final class f1 {
    public static final f a = new f("ExtractorSessionStoreView");
    public final y b;
    public final a0<e3> c;
    public final r0 d;
    public final a0<Executor> e;
    public final Map<Integer, c1> f = new HashMap();
    public final ReentrantLock g = new ReentrantLock();

    public f1(y yVar, a0<e3> a0Var, r0 r0Var, a0<Executor> a0Var2) {
        this.b = yVar;
        this.c = a0Var;
        this.d = r0Var;
        this.e = a0Var2;
    }

    public static String c(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new bv("Session without pack received.");
    }

    public final <T> T a(e1<T> e1Var) {
        try {
            this.g.lock();
            return e1Var.a();
        } finally {
            this.g.unlock();
        }
    }

    public final c1 b(int i) {
        Map<Integer, c1> map = this.f;
        Integer valueOf = Integer.valueOf(i);
        c1 c1Var = map.get(valueOf);
        if (c1Var != null) {
            return c1Var;
        }
        throw new bv(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }
}
