package h0.b.e.i;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import h0.b.e.i.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter */
public class f extends BaseAdapter {
    public final int Y1;
    public g c;
    public int d = -1;
    public boolean q;
    public final boolean x;
    public final LayoutInflater y;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.x = z;
        this.y = layoutInflater;
        this.c = gVar;
        this.Y1 = i;
        a();
    }

    public void a() {
        g gVar = this.c;
        i iVar = gVar.w;
        if (iVar != null) {
            gVar.i();
            ArrayList<i> arrayList = gVar.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == iVar) {
                    this.d = i;
                    return;
                }
            }
        }
        this.d = -1;
    }

    /* renamed from: b */
    public i getItem(int i) {
        ArrayList<i> arrayList;
        if (this.x) {
            g gVar = this.c;
            gVar.i();
            arrayList = gVar.k;
        } else {
            arrayList = this.c.l();
        }
        int i2 = this.d;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayList.get(i);
    }

    public int getCount() {
        ArrayList<i> arrayList;
        if (this.x) {
            g gVar = this.c;
            gVar.i();
            arrayList = gVar.k;
        } else {
            arrayList = this.c.l();
        }
        if (this.d < 0) {
            return arrayList.size();
        }
        return arrayList.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.y.inflate(this.Y1, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.c.m() && i2 != (i3 >= 0 ? getItem(i3).b : i2));
        n.a aVar = (n.a) view;
        if (this.q) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
