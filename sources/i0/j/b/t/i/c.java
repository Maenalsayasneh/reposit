package i0.j.b.t.i;

import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BasePresenter;

/* compiled from: ExtraFieldsPresenter */
public class c extends BasePresenter<a> implements BaseContract.Presenter {

    /* compiled from: ExtraFieldsPresenter */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            /*
                com.instabug.bug.h.a$a.values()
                r0 = 3
                int[] r1 = new int[r0]
                a = r1
                com.instabug.bug.h.a$a r2 = com.instabug.bug.h.a$a.ENABLED_WITH_OPTIONAL_FIELDS     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.bug.h.a$a r2 = com.instabug.bug.h.a$a.ENABLED_WITH_REQUIRED_FIELDS     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0026 }
                com.instabug.bug.h.a$a r2 = com.instabug.bug.h.a$a.DISABLED     // Catch:{ NoSuchFieldError -> 0x0026 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0026 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0026 }
            L_0x0026:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.b.t.i.c.a.<clinit>():void");
        }
    }

    public c(a aVar) {
        super(aVar);
    }

    public final void m() {
        for (i0.j.b.p.a aVar : i0.j.b.s.a.h().e()) {
            aVar.d = null;
        }
    }
}
