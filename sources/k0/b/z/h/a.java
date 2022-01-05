package k0.b.z.h;

import k0.b.y.f;

/* compiled from: AppendOnlyLinkedArrayList */
public class a<T> {
    public final Object[] a;
    public Object[] b;
    public int c;

    /* renamed from: k0.b.z.h.a$a  reason: collision with other inner class name */
    /* compiled from: AppendOnlyLinkedArrayList */
    public interface C0235a<T> extends f<T> {
        boolean test(T t);
    }

    public a(int i) {
        Object[] objArr = new Object[(i + 1)];
        this.a = objArr;
        this.b = objArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(T r4) {
        /*
            r3 = this;
            int r0 = r3.c
            r1 = 4
            if (r0 != r1) goto L_0x000f
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r2 = r3.b
            r2[r1] = r0
            r3.b = r0
            r0 = 0
        L_0x000f:
            java.lang.Object[] r1 = r3.b
            r1[r0] = r4
            int r0 = r0 + 1
            r3.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.z.h.a.a(java.lang.Object):void");
    }

    public void b(C0235a<? super T> aVar) {
        Object[] objArr;
        Object[] objArr2 = this.a;
        while (objArr2 != null) {
            int i = 0;
            while (i < 4 && (objArr = objArr2[i]) != null) {
                if (!aVar.test(objArr)) {
                    i++;
                } else {
                    return;
                }
            }
            objArr2 = objArr2[4];
        }
    }
}
