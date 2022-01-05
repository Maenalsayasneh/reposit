package h0.g0;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import h0.g0.o;

/* compiled from: OneTimeWorkRequest */
public final class j extends o {

    /* compiled from: OneTimeWorkRequest */
    public static final class a extends o.a<a, j> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.b.d = OverwritingInputMerger.class.getName();
        }
    }

    public j(a aVar) {
        super(aVar.a, aVar.b, aVar.c);
    }
}
