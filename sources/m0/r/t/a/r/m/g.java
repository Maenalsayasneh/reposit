package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.k0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.l.l;

/* compiled from: ClassTypeConstructorImpl */
public class g extends b implements j0 {
    public final d c;
    public final List<m0> d;
    public final Collection<v> e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(d dVar, List<? extends m0> list, Collection<v> collection, l lVar) {
        super(lVar);
        if (list == null) {
            o(1);
            throw null;
        } else if (collection == null) {
            o(2);
            throw null;
        } else if (lVar != null) {
            this.c = dVar;
            this.d = Collections.unmodifiableList(new ArrayList(list));
            this.e = Collections.unmodifiableCollection(collection);
        } else {
            o(3);
            throw null;
        }
    }

    public static /* synthetic */ void o(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS;
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean d() {
        return true;
    }

    public Collection<v> g() {
        Collection<v> collection = this.e;
        if (collection != null) {
            return collection;
        }
        o(6);
        throw null;
    }

    public List<m0> getParameters() {
        List<m0> list = this.d;
        if (list != null) {
            return list;
        }
        o(4);
        throw null;
    }

    public k0 j() {
        return k0.a.a;
    }

    public d p() {
        d dVar = this.c;
        if (dVar != null) {
            return dVar;
        }
        o(5);
        throw null;
    }

    public String toString() {
        return m0.r.t.a.r.j.d.g(this.c).b();
    }
}
