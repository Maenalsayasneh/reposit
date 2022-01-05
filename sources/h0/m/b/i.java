package h0.m.b;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import h0.m.a.d;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SpannableBuilder */
public final class i extends SpannableStringBuilder {
    public final Class<?> c;
    public final List<a> d = new ArrayList();

    /* compiled from: SpannableBuilder */
    public static class a implements TextWatcher, SpanWatcher {
        public final Object c;
        public final AtomicInteger d = new AtomicInteger(0);

        public a(Object obj) {
            this.c = obj;
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.c).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.c).beforeTextChanged(charSequence, i, i2, i3);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.d.get() <= 0 || !(obj instanceof d)) {
                ((SpanWatcher) this.c).onSpanAdded(spannable, obj, i, i2);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            if (this.d.get() <= 0 || !(obj instanceof d)) {
                ((SpanWatcher) this.c).onSpanChanged(spannable, obj, i, i2, i3, i4);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.d.get() <= 0 || !(obj instanceof d)) {
                ((SpanWatcher) this.c).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.c).onTextChanged(charSequence, i, i2, i3);
        }
    }

    public i(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        g0.a.b.b.a.m(cls, "watcherClass cannot be null");
        this.c = cls;
    }

    public final void a() {
        for (int i = 0; i < this.d.size(); i++) {
            this.d.get(i).d.incrementAndGet();
        }
    }

    public Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public void b() {
        f();
        for (int i = 0; i < this.d.size(); i++) {
            ((TextWatcher) this.d.get(i).c).onTextChanged(this, 0, length(), length());
        }
    }

    public final a c(Object obj) {
        for (int i = 0; i < this.d.size(); i++) {
            a aVar = this.d.get(i);
            if (aVar.c == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(Class<?> cls) {
        return this.c == cls;
    }

    public Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final boolean e(Object obj) {
        return obj != null && d(obj.getClass());
    }

    public final void f() {
        for (int i = 0; i < this.d.size(); i++) {
            this.d.get(i).d.decrementAndGet();
        }
    }

    public int getSpanEnd(Object obj) {
        a c2;
        if (e(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        a c2;
        if (e(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        a c2;
        if (e(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (!(this.c == cls)) {
            return super.getSpans(i, i2, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i, i2, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            tArr[i3] = aVarArr[i3].c;
        }
        return tArr;
    }

    public Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public int nextSpanTransition(int i, int i2, Class<a> cls) {
        if (this.c == cls) {
            cls = a.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        a aVar;
        if (e(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.d.remove(aVar);
        }
    }

    public Editable replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        f();
        return this;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (e(obj)) {
            a aVar = new a(obj);
            this.d.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public CharSequence subSequence(int i, int i2) {
        return new i(this.c, this, i, i2);
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m5append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public SpannableStringBuilder m10delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public SpannableStringBuilder m11insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m8append(CharSequence charSequence) throws IOException {
        super.append(charSequence);
        return this;
    }

    public Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public Editable append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public SpannableStringBuilder m12insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    /* renamed from: replace  reason: collision with other method in class */
    public SpannableStringBuilder m13replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        f();
        return this;
    }

    public i(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        g0.a.b.b.a.m(cls, "watcherClass cannot be null");
        this.c = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m4append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m7append(char c2) throws IOException {
        super.append(c2);
        return this;
    }

    public Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        f();
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m6append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m9append(CharSequence charSequence, int i, int i2) throws IOException {
        super.append(charSequence, i, i2);
        return this;
    }

    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* renamed from: replace  reason: collision with other method in class */
    public SpannableStringBuilder m14replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        f();
        return this;
    }
}
