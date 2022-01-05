package i0.h.d.a.a.a;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: UnicodeEscaper */
public abstract class b {
    public static final ThreadLocal<char[]> a = new a();

    /* compiled from: UnicodeEscaper */
    public class a extends ThreadLocal<char[]> {
        public Object initialValue() {
            return new char[RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE];
        }
    }
}
