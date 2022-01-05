package s0.a.h;

import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class m implements n {
    public Collection c;

    public m(Collection collection) {
        Objects.requireNonNull(collection, "collection cannot be null");
        this.c = collection;
    }

    public Collection a() {
        return new ArrayList(this.c);
    }

    public Object clone() {
        return new m(this.c);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("X509CollectionStoreParameters: [\n");
        StringBuilder P0 = a.P0("  collection: ");
        P0.append(this.c);
        P0.append("\n");
        stringBuffer.append(P0.toString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
