package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: DescriptorRenderer.kt */
public enum RenderingFormat {
    ;

    /* compiled from: DescriptorRenderer.kt */
    public static final class HTML extends RenderingFormat {
        public HTML(String str, int i) {
            super(str, i, (f) null);
        }

        public String escape(String str) {
            i.e(str, "string");
            return StringsKt__IndentKt.B(StringsKt__IndentKt.B(str, "<", "&lt;", false, 4), ">", "&gt;", false, 4);
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public static final class PLAIN extends RenderingFormat {
        public PLAIN(String str, int i) {
            super(str, i, (f) null);
        }

        public String escape(String str) {
            i.e(str, "string");
            return str;
        }
    }

    public abstract String escape(String str);
}
