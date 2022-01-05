package i0.b.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ModelGroupHolder.kt */
public final class f0 extends r {
    public ViewGroup a;
    public ViewGroup b;
    public List<n0> c;

    static {
        new b0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r4) {
        /*
            r3 = this;
            java.lang.String r0 = "itemView"
            m0.n.b.i.e(r4, r0)
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x005b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3.a = r4
            r0 = 0
            if (r4 == 0) goto L_0x0055
            int r1 = com.airbnb.viewmodeladapter.R.id.epoxy_model_group_child_container
            android.view.View r1 = r4.findViewById(r1)
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 != 0) goto L_0x001b
            r1 = r0
        L_0x001b:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x0020
            r4 = r1
        L_0x0020:
            r3.b = r4
            java.lang.String r1 = "childContainer"
            if (r4 == 0) goto L_0x0051
            int r4 = r4.getChildCount()
            if (r4 == 0) goto L_0x004c
            android.view.ViewGroup r4 = r3.b
            if (r4 == 0) goto L_0x0048
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r3.b(r4, r0)
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x0040
            goto L_0x004e
        L_0x0040:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "No view stubs found. If viewgroup is not empty it must contain ViewStubs."
            r4.<init>(r0)
            throw r4
        L_0x0048:
            m0.n.b.i.m(r1)
            throw r0
        L_0x004c:
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.c
        L_0x004e:
            r3.c = r0
            return
        L_0x0051:
            m0.n.b.i.m(r1)
            throw r0
        L_0x0055:
            java.lang.String r4 = "rootView"
            m0.n.b.i.m(r4)
            throw r0
        L_0x005b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "The layout provided to EpoxyModelGroup must be a ViewGroup"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.a.f0.a(android.view.View):void");
    }

    public final void b(ViewGroup viewGroup, ArrayList<n0> arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt, arrayList);
            } else if (childAt instanceof ViewStub) {
                arrayList.add(new n0(viewGroup, (ViewStub) childAt, i));
            }
        }
    }
}
