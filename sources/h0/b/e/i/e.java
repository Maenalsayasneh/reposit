package h0.b.e.i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import h0.b.a.d;
import h0.b.e.i.m;
import h0.b.e.i.n;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: ListMenuPresenter */
public class e implements m, AdapterView.OnItemClickListener {
    public m.a Y1;
    public a Z1;
    public Context c;
    public LayoutInflater d;
    public g q;
    public ExpandedMenuView x;
    public int y;

    /* compiled from: ListMenuPresenter */
    public class a extends BaseAdapter {
        public int c = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.q;
            i iVar = gVar.w;
            if (iVar != null) {
                gVar.i();
                ArrayList<i> arrayList = gVar.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == iVar) {
                        this.c = i;
                        return;
                    }
                }
            }
            this.c = -1;
        }

        /* renamed from: b */
        public i getItem(int i) {
            g gVar = e.this.q;
            gVar.i();
            ArrayList<i> arrayList = gVar.k;
            Objects.requireNonNull(e.this);
            int i2 = i + 0;
            int i3 = this.c;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        public int getCount() {
            g gVar = e.this.q;
            gVar.i();
            int size = gVar.k.size();
            Objects.requireNonNull(e.this);
            int i = size + 0;
            return this.c < 0 ? i : i - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.d.inflate(eVar.y, viewGroup, false);
            }
            ((n.a) view).d(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i) {
        this.y = i;
        this.c = context;
        this.d = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.Z1 == null) {
            this.Z1 = new a();
        }
        return this.Z1;
    }

    public void c(g gVar, boolean z) {
        m.a aVar = this.Y1;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    public void d(boolean z) {
        a aVar = this.Z1;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean e() {
        return false;
    }

    public boolean f(g gVar, i iVar) {
        return false;
    }

    public boolean g(g gVar, i iVar) {
        return false;
    }

    public void h(m.a aVar) {
        this.Y1 = aVar;
    }

    public void i(Context context, g gVar) {
        if (this.c != null) {
            this.c = context;
            if (this.d == null) {
                this.d = LayoutInflater.from(context);
            }
        }
        this.q = gVar;
        a aVar = this.Z1;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean k(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        d.a aVar = new d.a(rVar.b);
        e eVar = new e(aVar.a.a, R.layout.abc_list_menu_item_layout);
        hVar.q = eVar;
        eVar.Y1 = hVar;
        g gVar = hVar.c;
        gVar.b(eVar, gVar.b);
        ListAdapter a2 = hVar.q.a();
        AlertController.b bVar = aVar.a;
        bVar.p = a2;
        bVar.q = hVar;
        View view = rVar.p;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.c = rVar.o;
            bVar.d = rVar.n;
        }
        bVar.n = hVar;
        d a3 = aVar.a();
        hVar.d = a3;
        a3.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.d.show();
        m.a aVar2 = this.Y1;
        if (aVar2 == null) {
            return true;
        }
        aVar2.d(rVar);
        return true;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.q.s(this.Z1.getItem(i), this, 0);
    }
}
