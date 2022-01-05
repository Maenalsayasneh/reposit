package i0.a.a.f;

import android.app.Activity;
import android.content.DialogInterface;
import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.RationaleHandler;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b.a.d;
import kotlin.TypeCastException;
import m0.i;
import m0.n.a.l;
import m0.n.a.r;

/* compiled from: AlertDialogRationaleHandler.kt */
public final class b extends RationaleHandler {
    public d m;
    public final Activity n;
    public final int o;

    /* compiled from: AlertDialogRationaleHandler.kt */
    public static final class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ a c;

        public a(a aVar) {
            this.c = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                ((d) dialogInterface).setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.c.a(true);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        }
    }

    /* renamed from: i0.a.a.f.b$b  reason: collision with other inner class name */
    /* compiled from: AlertDialogRationaleHandler.kt */
    public static final class C0079b implements DialogInterface.OnDismissListener {
        public final /* synthetic */ a c;

        public C0079b(a aVar) {
            this.c = aVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.c.a(false);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity, int i, r<? super Permission[], ? super Integer, ? super RationaleHandler, ? super l<? super AssentResult, i>, i> rVar) {
        super(activity, rVar, (d) null, 4);
        m0.n.b.i.f(activity, "context");
        m0.n.b.i.f(rVar, "requester");
        this.n = activity;
        this.o = i;
    }

    public void c() {
        d dVar = this.m;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.m = null;
    }

    public void e(Permission permission, CharSequence charSequence, a aVar) {
        m0.n.b.i.f(permission, "permission");
        m0.n.b.i.f(charSequence, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        m0.n.b.i.f(aVar, "confirm");
        d.a aVar2 = new d.a(this.n);
        aVar2.e(this.o);
        aVar2.a.f = charSequence;
        aVar2.d(17039370, new a(aVar));
        aVar2.a.m = new C0079b(aVar);
        this.m = aVar2.g();
    }
}
