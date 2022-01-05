package h0.b.e;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import h0.b.e.a;
import h0.b.e.i.j;
import h0.b.e.i.o;
import h0.f.h;
import h0.i.d.a.b;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper */
public class e extends ActionMode {
    public final Context a;
    public final a b;

    /* compiled from: SupportActionModeWrapper */
    public static class a implements a.C0017a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<e> c = new ArrayList<>();
        public final h<Menu, Menu> d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        public void a(a aVar) {
            this.a.onDestroyActionMode(e(aVar));
        }

        public boolean b(a aVar, Menu menu) {
            return this.a.onCreateActionMode(e(aVar), f(menu));
        }

        public boolean c(a aVar, Menu menu) {
            return this.a.onPrepareActionMode(e(aVar), f(menu));
        }

        public boolean d(a aVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(aVar), new j(this.b, (b) menuItem));
        }

        public ActionMode e(a aVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.c.get(i);
                if (eVar != null && eVar.b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.b, aVar);
            this.c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.b, (h0.i.d.a.a) menu);
            this.d.put(menu, oVar);
            return oVar;
        }
    }

    public e(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    public void finish() {
        this.b.c();
    }

    public View getCustomView() {
        return this.b.d();
    }

    public Menu getMenu() {
        return new o(this.a, (h0.i.d.a.a) this.b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public Object getTag() {
        return this.b.c;
    }

    public CharSequence getTitle() {
        return this.b.h();
    }

    public boolean getTitleOptionalHint() {
        return this.b.d;
    }

    public void invalidate() {
        this.b.i();
    }

    public boolean isTitleOptional() {
        return this.b.j();
    }

    public void setCustomView(View view) {
        this.b.k(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    public void setTag(Object obj) {
        this.b.c = obj;
    }

    public void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    public void setSubtitle(int i) {
        this.b.l(i);
    }

    public void setTitle(int i) {
        this.b.n(i);
    }
}
