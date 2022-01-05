package m0.r;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NotImplementedError;
import m0.n.b.i;

/* compiled from: TypesJVM.kt */
public final class q implements TypeVariable<GenericDeclaration>, Type {
    public final o c;

    public q(o oVar) {
        i.e(oVar, "typeParameter");
        this.c = oVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !i.a(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    public Type[] getBounds() {
        List<n> upperBounds = this.c.getUpperBounds();
        ArrayList arrayList = new ArrayList(h.K(upperBounds, 10));
        for (n b : upperBounds) {
            arrayList.add(r.b(b, true));
        }
        Object[] array = arrayList.toArray(new Type[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (Type[]) array;
    }

    public GenericDeclaration getGenericDeclaration() {
        StringBuilder P0 = a.P0("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        P0.append(this.c);
        throw new NotImplementedError(a.n0("An operation is not implemented: ", P0.toString()));
    }

    public String getName() {
        return this.c.getName();
    }

    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public String toString() {
        return getName();
    }
}
