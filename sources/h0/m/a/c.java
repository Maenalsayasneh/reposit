package h0.m.a;

import android.graphics.Rect;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import h0.m.a.a;
import h0.m.a.f;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: EmojiProcessor */
public final class c {
    public final a.h a;
    public final f b;
    public a c = new a();
    public final boolean d;
    public final int[] e;

    /* compiled from: EmojiProcessor */
    public static class a {
        public static final ThreadLocal<StringBuilder> a = new ThreadLocal<>();
        public final TextPaint b;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.b = textPaint;
            textPaint.setTextSize(10.0f);
        }
    }

    /* compiled from: EmojiProcessor */
    public static final class b {
        public int a = 1;
        public final f.a b;
        public f.a c;
        public f.a d;
        public int e;
        public int f;
        public final boolean g;
        public final int[] h;

        public b(f.a aVar, boolean z, int[] iArr) {
            this.b = aVar;
            this.c = aVar;
            this.g = z;
            this.h = iArr;
        }

        public int a(int i) {
            SparseArray<f.a> sparseArray = this.c.a;
            f.a aVar = sparseArray == null ? null : sparseArray.get(i);
            int i2 = 3;
            if (this.a != 2) {
                if (aVar == null) {
                    b();
                    i2 = 1;
                    this.e = i;
                    return i2;
                }
                this.a = 2;
                this.c = aVar;
                this.f = 1;
            } else if (aVar != null) {
                this.c = aVar;
                this.f++;
            } else {
                boolean z = false;
                if (i == 65038) {
                    b();
                } else {
                    if (i == 65039) {
                        z = true;
                    }
                    if (!z) {
                        f.a aVar2 = this.c;
                        if (aVar2.b != null) {
                            if (this.f != 1) {
                                this.d = aVar2;
                                b();
                            } else if (c()) {
                                this.d = this.c;
                                b();
                            } else {
                                b();
                            }
                            this.e = i;
                            return i2;
                        }
                        b();
                    }
                }
                i2 = 1;
                this.e = i;
                return i2;
            }
            i2 = 2;
            this.e = i;
            return i2;
        }

        public final int b() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
            return 1;
        }

        public final boolean c() {
            h0.a0.a.a.a e2 = this.c.b.e();
            int a2 = e2.a(6);
            if ((a2 == 0 || e2.b.get(a2 + e2.a) == 0) ? false : true) {
                return true;
            }
            if (this.e == 65039) {
                return true;
            }
            if (this.g) {
                if (this.h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.h, this.c.b.a(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public c(f fVar, a.h hVar, boolean z, int[] iArr) {
        this.a = hVar;
        this.b = fVar;
        this.d = z;
        this.e = null;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        d[] dVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (dVarArr = (d[]) editable.getSpans(selectionStart, selectionEnd, d.class)) != null && dVarArr.length > 0) {
            int length = dVarArr.length;
            int i = 0;
            while (i < length) {
                d dVar = dVarArr[i];
                int spanStart = editable.getSpanStart(dVar);
                int spanEnd = editable.getSpanEnd(dVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(CharSequence charSequence, int i, int i2, b bVar) {
        if (bVar.d == 0) {
            a aVar = this.c;
            Objects.requireNonNull(aVar);
            ThreadLocal<StringBuilder> threadLocal = a.a;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = aVar.b;
            String sb2 = sb.toString();
            ThreadLocal<h0.i.h.b<Rect, Rect>> threadLocal2 = h0.i.c.c.a;
            bVar.d = textPaint.hasGlyph(sb2) ? 2 : 1;
        }
        if (bVar.d == 2) {
            return true;
        }
        return false;
    }
}
