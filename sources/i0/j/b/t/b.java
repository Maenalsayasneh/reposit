package i0.j.b.t;

import android.view.View;
import com.instabug.library.model.Attachment;
import com.instabug.library.util.SystemServiceUtils;
import i0.j.b.t.c;
import i0.j.b.t.k.d;

/* compiled from: AttachmentsAdapter */
public class b implements View.OnClickListener {
    public final /* synthetic */ Attachment c;
    public final /* synthetic */ c d;

    public b(c cVar, Attachment attachment) {
        this.d = cVar;
        this.c = attachment;
    }

    public void onClick(View view) {
        c.b bVar = this.d.d;
        Attachment attachment = this.c;
        com.instabug.bug.view.reporting.b bVar2 = (com.instabug.bug.view.reporting.b) bVar;
        bVar2.d.clearFocus();
        bVar2.d.setError((CharSequence) null);
        bVar2.q.clearFocus();
        bVar2.q.setError((CharSequence) null);
        if (bVar2.getActivity() != null) {
            SystemServiceUtils.hideInputMethod(bVar2.getActivity());
        }
        int id = view.getId();
        if (bVar2.m2 == null) {
            bVar2.m2 = new d(bVar2, id, view, attachment);
        }
        bVar2.n2.postDelayed(bVar2.m2, 200);
    }
}
