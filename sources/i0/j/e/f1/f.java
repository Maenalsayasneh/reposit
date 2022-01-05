package i0.j.e.f1;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.material.tabs.TabLayout;
import com.instabug.library.p.a;
import com.instabug.library.util.BitmapUtils;
import i0.j.e.f1.g;
import java.util.Objects;

/* compiled from: TouchedViewsProcessor */
public class f implements TabLayout.c<TabLayout.g> {
    public final /* synthetic */ TabLayout a;
    public final /* synthetic */ g.b b;
    public final /* synthetic */ c c;
    public final /* synthetic */ g d;

    public f(g gVar, TabLayout tabLayout, g.b bVar, c cVar) {
        this.d = gVar;
        this.a = tabLayout;
        this.b = bVar;
        this.c = cVar;
    }

    public void a(TabLayout.g gVar) {
        d(gVar, this.a);
    }

    public void b(TabLayout.g gVar) {
        d(gVar, this.a);
    }

    public void c(TabLayout.g gVar) {
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public final void d(TabLayout.g gVar, TabLayout tabLayout) {
        if (gVar == null) {
            ((a.C0108a) this.b).a(this.c, this.d.g);
        } else if (!TextUtils.isEmpty(gVar.b)) {
            String format = String.format("the button \"%s\"", new Object[]{gVar.b.toString()});
            d dVar = this.d.g;
            dVar.a = format;
            ((a.C0108a) this.b).a(this.c, dVar);
        } else if (gVar.a == null || this.d.e(tabLayout)) {
            TabLayout.i iVar = gVar.g;
            CharSequence charSequence = null;
            if (!TextUtils.isEmpty(iVar == null ? null : iVar.getContentDescription())) {
                Object[] objArr = new Object[1];
                TabLayout.i iVar2 = gVar.g;
                if (iVar2 != null) {
                    charSequence = iVar2.getContentDescription();
                }
                objArr[0] = charSequence;
                String format2 = String.format("the button \"%s\"", objArr);
                d dVar2 = this.d.g;
                dVar2.a = format2;
                ((a.C0108a) this.b).a(this.c, dVar2);
            } else {
                d dVar3 = this.d.g;
                dVar3.a = "a button";
                ((a.C0108a) this.b).a(this.c, dVar3);
            }
        } else {
            g gVar2 = this.d;
            Drawable drawable = gVar.a;
            c cVar = this.c;
            g.b bVar = this.b;
            Objects.requireNonNull(gVar2);
            BitmapUtils.saveDrawableBitmap(drawable, System.currentTimeMillis(), new h(gVar2, bVar, cVar));
        }
        tabLayout.B2.remove(this);
    }
}
