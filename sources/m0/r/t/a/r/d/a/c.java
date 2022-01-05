package m0.r.t.a.r.d.a;

import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import m0.n.b.i;

/* compiled from: LookupTracker.kt */
public interface c {

    /* compiled from: LookupTracker.kt */
    public static final class a implements c {
        public static final a a = new a();

        public boolean a() {
            return false;
        }

        public void b(String str, Position position, String str2, ScopeKind scopeKind, String str3) {
            i.e(str, "filePath");
            i.e(position, "position");
            i.e(str2, "scopeFqName");
            i.e(scopeKind, "scopeKind");
            i.e(str3, "name");
        }
    }

    boolean a();

    void b(String str, Position position, String str2, ScopeKind scopeKind, String str3);
}
