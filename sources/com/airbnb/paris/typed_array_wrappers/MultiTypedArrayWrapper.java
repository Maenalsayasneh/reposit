package com.airbnb.paris.typed_array_wrappers;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import i0.b.c.h.c;
import i0.j.f.p.h;
import java.util.HashMap;
import java.util.List;
import m0.j.g;
import m0.n.b.i;

/* compiled from: MultiTypedArrayWrapper.kt */
public final class MultiTypedArrayWrapper extends c {
    public final m0.c b = h.H2(new MultiTypedArrayWrapper$styleableAttrIndexes$2(this));
    public final m0.c c = h.H2(new MultiTypedArrayWrapper$styleableAttrIndexToWrapperMap$2(this));
    public final List<c> d;

    public MultiTypedArrayWrapper(List<? extends c> list, int[] iArr) {
        i.e(list, "wrappers");
        i.e(iArr, "styleableAttrs");
        this.d = list;
    }

    public boolean a(int i) {
        return p(i).a(i);
    }

    public ColorStateList b(int i) {
        return p(i).b(i);
    }

    public int c(int i) {
        return p(i).c(i);
    }

    public Drawable d(int i) {
        return p(i).d(i);
    }

    public float e(int i) {
        return p(i).e(i);
    }

    public int f(int i) {
        Object obj = ((List) this.b.getValue()).get(i);
        i.d(obj, "styleableAttrIndexes[at]");
        return ((Number) obj).intValue();
    }

    public int g() {
        return o().size();
    }

    public int h(int i) {
        return p(i).h(i);
    }

    public int i(int i) {
        return p(i).i(i);
    }

    public int j(int i) {
        return p(i).j(i);
    }

    public CharSequence k(int i) {
        return p(i).k(i);
    }

    public boolean l(int i) {
        return o().get(Integer.valueOf(i)) != null;
    }

    public void n() {
        for (c n : this.d) {
            n.n();
        }
    }

    public final HashMap<Integer, List<c>> o() {
        return (HashMap) this.c.getValue();
    }

    public final c p(int i) {
        List<c> list = o().get(Integer.valueOf(i));
        i.c(list);
        return (c) g.G(list);
    }
}
