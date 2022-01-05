package androidx.work;

import android.net.Uri;
import h0.g0.d;
import h0.g0.l;
import h0.g0.q;
import h0.g0.r.t.m;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    public UUID a;
    public d b;
    public Executor c;
    public h0.g0.r.t.q.a d;
    public q e;

    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, d dVar, Collection<String> collection, a aVar, int i, Executor executor, h0.g0.r.t.q.a aVar2, q qVar, l lVar, m mVar) {
        this.a = uuid;
        this.b = dVar;
        new HashSet(collection);
        this.c = executor;
        this.d = aVar2;
        this.e = qVar;
    }
}
