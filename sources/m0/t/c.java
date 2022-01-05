package m0.t;

import java.util.List;
import java.util.regex.Matcher;
import m0.n.b.i;

/* compiled from: Regex.kt */
public final class c {
    public List<String> a;
    public final Matcher b;

    /* compiled from: Regex.kt */
    public static final class a extends m0.j.a<String> {
        public final /* synthetic */ c c;

        public a(c cVar) {
            this.c = cVar;
        }

        public int b() {
            return this.c.b.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return super.contains((String) obj);
            }
            return false;
        }

        public Object get(int i) {
            String group = this.c.b.group(i);
            return group != null ? group : "";
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return super.indexOf((String) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return super.lastIndexOf((String) obj);
            }
            return -1;
        }
    }

    public c(Matcher matcher, CharSequence charSequence) {
        i.e(matcher, "matcher");
        i.e(charSequence, "input");
        this.b = matcher;
    }

    public List<String> a() {
        if (this.a == null) {
            this.a = new a(this);
        }
        List<String> list = this.a;
        i.c(list);
        return list;
    }
}
