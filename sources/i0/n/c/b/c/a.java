package i0.n.c.b.c;

import i0.n.c.a.c.c.b;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FlashCallVerificationConfig.kt */
public final class a extends b<i0.n.c.b.b> {

    /* renamed from: i0.n.c.b.c.a$a  reason: collision with other inner class name */
    /* compiled from: FlashCallVerificationConfig.kt */
    public static final class C0087a extends i0.n.c.a.a<?> implements i0.n.c.a.c.a {
        public static final C0088a Companion = new C0088a((f) null);
        public i0.n.c.a.c.b.a e;

        /* renamed from: i0.n.c.b.c.a$a$a  reason: collision with other inner class name */
        /* compiled from: FlashCallVerificationConfig.kt */
        public static final class C0088a {
            public C0088a(f fVar) {
            }
        }

        public C0087a(f fVar) {
        }

        public Object a(String str) {
            this.d = str;
            return this;
        }

        public Object build() {
            i0.n.c.a.c.b.a aVar = this.e;
            if (aVar != null) {
                String str = this.b;
                if (str != null) {
                    return new a(aVar, str, this.c, (String) null, this.d);
                }
                i.m("number");
                throw null;
            }
            i.m("globalConfig");
            throw null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(i0.n.c.a.c.b.a r11, java.lang.String r12, boolean r13, java.lang.String r14, java.lang.String r15) {
        /*
            r10 = this;
            java.lang.String r14 = "globalConfig"
            m0.n.b.i.e(r11, r14)
            java.lang.String r14 = "number"
            m0.n.b.i.e(r12, r14)
            t0.w r14 = r11.a()
            java.lang.Class<i0.n.c.b.b> r0 = i0.n.c.b.b.class
            java.lang.Object r7 = r14.b(r0)
            java.lang.String r14 = "globalConfig.retrofit.cr…ationService::class.java)"
            m0.n.b.i.d(r7, r14)
            kotlin.collections.EmptyList r6 = kotlin.collections.EmptyList.c
            i0.n.b.a r9 = new i0.n.b.a
            android.content.Context r14 = r11.getContext()
            java.lang.String r0 = "2.1.7"
            java.lang.String r1 = "production"
            r9.<init>(r14, r0, r1)
            r3 = 0
            r1 = r10
            r2 = r12
            r4 = r15
            r5 = r13
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.n.c.b.c.a.<init>(i0.n.c.a.c.b.a, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }
}
