package h0.u;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.d.a.a.a;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: TransformablePage.kt */
public final class f0<T> {
    public static final f0<Object> a = new f0<>(0, EmptyList.c);
    public static final f0 b = null;
    public final int[] c;
    public final List<T> d;
    public final int e;
    public final List<Integer> f;

    public f0(int[] iArr, List<? extends T> list, int i, List<Integer> list2) {
        i.e(iArr, "originalPageOffsets");
        i.e(list, MessageExtension.FIELD_DATA);
        this.c = iArr;
        this.d = list;
        this.e = i;
        this.f = list2;
        boolean z = false;
        if (!(iArr.length == 0)) {
            if (!((list2 == null || list2.size() == list.size()) ? true : z)) {
                StringBuilder sb = new StringBuilder();
                sb.append("If originalIndices (size = ");
                i.c(list2);
                sb.append(list2.size());
                sb.append(") is provided,");
                sb.append(" it must be same length as data (size = ");
                sb.append(list.size());
                sb.append(')');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            return;
        }
        throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.a(f0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        f0 f0Var = (f0) obj;
        return Arrays.equals(this.c, f0Var.c) && !(i.a(this.d, f0Var.d) ^ true) && this.e == f0Var.e && !(i.a(this.f, f0Var.f) ^ true);
    }

    public int hashCode() {
        int H = (a.H(this.d, Arrays.hashCode(this.c) * 31, 31) + this.e) * 31;
        List<Integer> list = this.f;
        return H + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("TransformablePage(originalPageOffsets=");
        P0.append(Arrays.toString(this.c));
        P0.append(", data=");
        P0.append(this.d);
        P0.append(", hintOriginalPageOffset=");
        P0.append(this.e);
        P0.append(", hintOriginalIndices=");
        P0.append(this.f);
        P0.append(")");
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f0(int i, List<? extends T> list) {
        this(new int[]{i}, list, i, (List<Integer>) null);
        i.e(list, MessageExtension.FIELD_DATA);
    }
}
