package kotlin.jvm.internal;

import i0.d.a.a.a;
import m0.n.b.i;
import m0.r.c;
import m0.r.k;

public abstract class PropertyReference extends CallableReference implements k {
    public PropertyReference() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            if (!getOwner().equals(propertyReference.getOwner()) || !getName().equals(propertyReference.getName()) || !getSignature().equals(propertyReference.getSignature()) || !i.a(getBoundReceiver(), propertyReference.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof k) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode = getName().hashCode();
        return getSignature().hashCode() + ((hashCode + (getOwner().hashCode() * 31)) * 31);
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder P0 = a.P0("property ");
        P0.append(getName());
        P0.append(" (Kotlin reflection is not available)");
        return P0.toString();
    }

    public PropertyReference(Object obj) {
        super(obj);
    }

    public k getReflected() {
        return (k) super.getReflected();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }
}
