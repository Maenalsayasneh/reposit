package n0.c.l;

import com.instabug.library.model.session.config.SessionsConfigParameter;
import kotlinx.serialization.json.internal.WriteMode;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.h;
import n0.c.l.q.d;
import n0.c.l.q.r;
import n0.c.l.q.s;
import n0.c.m.b;

/* compiled from: Json.kt */
public abstract class a implements h {
    public static final C0281a a = new C0281a((f) null);
    public final d b;

    /* renamed from: n0.c.l.a$a  reason: collision with other inner class name */
    /* compiled from: Json.kt */
    public static final class C0281a extends a {
        public C0281a(f fVar) {
            super(new d(false, false, false, false, false, (String) null, false, false, (String) null, false, (b) null, 2047), (f) null);
        }
    }

    public a(d dVar, f fVar) {
        this.b = dVar;
    }

    public b a() {
        return this.b.k;
    }

    public final <T> T b(n0.c.b<T> bVar, String str) {
        i.e(bVar, "deserializer");
        i.e(str, "string");
        n0.c.l.q.i iVar = new n0.c.l.q.i(str);
        T B = new r(this, WriteMode.OBJ, iVar).B(bVar);
        if (iVar.b == 12) {
            return B;
        }
        throw new IllegalStateException(("Reader has not consumed the whole input: " + iVar).toString());
    }

    public final <T> String c(n0.c.f<? super T> fVar, T t) {
        i.e(fVar, "serializer");
        StringBuilder sb = new StringBuilder();
        WriteMode writeMode = WriteMode.OBJ;
        WriteMode.values();
        g[] gVarArr = new g[4];
        i.e(sb, "output");
        i.e(this, "json");
        i.e(writeMode, SessionsConfigParameter.SYNC_MODE);
        i.e(gVarArr, "modeReuseCache");
        new s(new s.a(sb, this), this, writeMode, gVarArr).e(fVar, t);
        String sb2 = sb.toString();
        i.d(sb2, "result.toString()");
        return sb2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: n0.c.l.q.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: n0.c.l.q.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: n0.c.l.q.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: n0.c.l.q.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: n0.c.l.q.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: n0.c.l.q.j} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T d(n0.c.b<T> r8, kotlinx.serialization.json.JsonElement r9) {
        /*
            r7 = this;
            java.lang.String r0 = "deserializer"
            m0.n.b.i.e(r8, r0)
            java.lang.String r1 = "element"
            m0.n.b.i.e(r9, r1)
            java.lang.String r2 = "$this$readJson"
            m0.n.b.i.e(r7, r2)
            m0.n.b.i.e(r9, r1)
            m0.n.b.i.e(r8, r0)
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L_0x0028
            n0.c.l.q.j r0 = new n0.c.l.q.j
            r3 = r9
            kotlinx.serialization.json.JsonObject r3 = (kotlinx.serialization.json.JsonObject) r3
            r4 = 0
            r5 = 0
            r6 = 12
            r1 = r0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0048
        L_0x0028:
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto L_0x0034
            n0.c.l.q.l r0 = new n0.c.l.q.l
            kotlinx.serialization.json.JsonArray r9 = (kotlinx.serialization.json.JsonArray) r9
            r0.<init>(r7, r9)
            goto L_0x0048
        L_0x0034:
            boolean r0 = r9 instanceof n0.c.l.i
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            n0.c.l.k r0 = n0.c.l.k.a
            boolean r0 = m0.n.b.i.a(r9, r0)
            if (r0 == 0) goto L_0x004d
        L_0x0041:
            n0.c.l.q.g r0 = new n0.c.l.q.g
            kotlinx.serialization.json.JsonPrimitive r9 = (kotlinx.serialization.json.JsonPrimitive) r9
            r0.<init>(r7, r9)
        L_0x0048:
            java.lang.Object r8 = r0.B(r8)
            return r8
        L_0x004d:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.c.l.a.d(n0.c.b, kotlinx.serialization.json.JsonElement):java.lang.Object");
    }
}
