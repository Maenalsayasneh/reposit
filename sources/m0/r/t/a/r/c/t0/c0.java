package m0.r.t.a.r.c.t0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.j.u.i.d;

/* compiled from: ReceiverParameterDescriptorImpl */
public class c0 extends d {
    public final i x;
    public final d y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(i iVar, d dVar, f fVar) {
        super(fVar);
        if (iVar == null) {
            D(0);
            throw null;
        } else if (fVar != null) {
            this.x = iVar;
            this.y = dVar;
        } else {
            D(2);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = InstabugDbContract.UserAttributesEntry.COLUMN_VALUE;
        } else if (i == 2) {
            objArr[0] = "annotations";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else if (i != 5) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public i b() {
        i iVar = this.x;
        if (iVar != null) {
            return iVar;
        }
        D(4);
        throw null;
    }

    public d getValue() {
        d dVar = this.y;
        if (dVar != null) {
            return dVar;
        }
        D(3);
        throw null;
    }
}
