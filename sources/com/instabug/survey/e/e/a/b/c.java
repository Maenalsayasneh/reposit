package com.instabug.survey.e.e.a.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.instabug.library.ui.custom.InstabugAlertDialog;
import com.instabug.library.util.URLUtil;
import com.instabug.survey.R;
import com.instabug.survey.announcements.ui.activity.AnnouncementActivity;
import h0.b.a.d;
import i0.j.f.p.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: UpdateMessageFragment */
public class c extends com.instabug.survey.e.e.a.a<i0.j.f.l.j.a.a.b> implements i0.j.f.l.j.a.a.a {
    public DialogInterface.OnClickListener Y1;
    public DialogInterface.OnClickListener Z1;
    public i0.j.f.l.j.a.a.b q;
    public i0.j.f.b.c.a.a x;
    public d y;

    /* compiled from: UpdateMessageFragment */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            c.this.g();
        }
    }

    /* compiled from: UpdateMessageFragment */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ArrayList<com.instabug.survey.e.c.c> arrayList;
            c cVar = c.this;
            com.instabug.survey.e.c.a aVar = cVar.d;
            if (aVar != null && (arrayList = aVar.x) != null && cVar.x != null) {
                Iterator<com.instabug.survey.e.c.c> it = arrayList.iterator();
                while (it.hasNext()) {
                    com.instabug.survey.e.c.c next = it.next();
                    ArrayList<String> arrayList2 = next.Y1;
                    if (arrayList2 != null) {
                        next.q = arrayList2.get(1);
                    }
                }
                ((AnnouncementActivity) cVar.x).q0(cVar.d);
            }
        }
    }

    /* renamed from: com.instabug.survey.e.e.a.b.c$c  reason: collision with other inner class name */
    /* compiled from: UpdateMessageFragment */
    public class C0110c implements DialogInterface.OnClickListener {
        public C0110c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            c.this.g();
        }
    }

    private c() {
    }

    public static c I0(com.instabug.survey.e.c.c cVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("announcement_item", cVar);
        c cVar2 = new c();
        cVar2.setArguments(bundle);
        return cVar2;
    }

    public void S(String str, String str2, String str3) {
        this.Y1 = new C0110c();
        if (getContext() != null) {
            this.y = InstabugAlertDialog.getAlertDialog(getContext(), str, str2, str3, (String) null, false, this.Y1, (DialogInterface.OnClickListener) null);
            if (getActivity() != null && !getActivity().isFinishing()) {
                this.y.show();
            }
        }
    }

    public void d() {
        if (getContext() != null && this.d != null && this.x != null) {
            f.a(getContext());
            ((AnnouncementActivity) this.x).t0(this.d);
        }
    }

    public void e0(String str, String str2, String str3, String str4) {
        this.Y1 = new a();
        this.Z1 = new b();
        if (getActivity() != null) {
            this.y = InstabugAlertDialog.getAlertDialog(getActivity(), str, str2, str3, str4, false, this.Y1, this.Z1);
            if (getActivity() != null && !getActivity().isFinishing()) {
                this.y.show();
            }
        }
    }

    public void f(String str) {
        if (getContext() != null && this.d != null && this.x != null) {
            Context context = getContext();
            if (context != null) {
                String resolve = URLUtil.resolve(str);
                if (resolve == null) {
                    Toast.makeText(context, context.getString(R.string.ib_announcement_redirect_error), 0).show();
                } else {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(resolve));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        context.startActivity(intent);
                    } else {
                        Toast.makeText(context, context.getString(R.string.ib_announcement_redirect_error), 0).show();
                    }
                }
            }
            ((AnnouncementActivity) this.x).t0(this.d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r4 = (r4 = r4.c).c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
            r5 = this;
            com.instabug.survey.e.c.a r0 = r5.d
            if (r0 == 0) goto L_0x00a5
            com.instabug.survey.e.c.c r1 = r5.c
            if (r1 != 0) goto L_0x000a
            goto L_0x00a5
        L_0x000a:
            java.util.ArrayList<com.instabug.survey.e.c.c> r0 = r0.x
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r0.next()
            com.instabug.survey.e.c.c r1 = (com.instabug.survey.e.c.c) r1
            java.util.ArrayList<java.lang.String> r3 = r1.Y1
            if (r3 == 0) goto L_0x0010
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.q = r2
            goto L_0x0010
        L_0x002a:
            com.instabug.survey.e.c.c r0 = r5.c
            java.util.ArrayList<java.lang.String> r1 = r0.Y1
            if (r1 == 0) goto L_0x0038
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r0.q = r1
        L_0x0038:
            i0.j.f.l.j.a.a.b r0 = r5.q
            com.instabug.survey.e.c.c r1 = r5.c
            com.instabug.survey.e.c.a r3 = r5.d
            java.util.Objects.requireNonNull(r0)
            com.instabug.survey.e.c.b r4 = r1.b2
            if (r4 == 0) goto L_0x0055
            com.instabug.survey.e.c.d r4 = r4.c
            if (r4 == 0) goto L_0x0055
            java.lang.String r4 = r4.c
            if (r4 == 0) goto L_0x0055
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0055
            r4 = 1
            goto L_0x0056
        L_0x0055:
            r4 = r2
        L_0x0056:
            if (r4 == 0) goto L_0x0074
            java.lang.ref.WeakReference<V> r0 = r0.view
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r0.get()
            i0.j.f.l.j.a.a.a r0 = (i0.j.f.l.j.a.a.a) r0
            if (r0 == 0) goto L_0x0083
            com.instabug.survey.e.c.b r1 = r1.b2
            if (r1 == 0) goto L_0x0083
            com.instabug.survey.e.c.d r1 = r1.c
            if (r1 == 0) goto L_0x0083
            java.lang.String r1 = r1.c
            if (r1 == 0) goto L_0x0083
            r0.f(r1)
            goto L_0x0083
        L_0x0074:
            java.lang.ref.WeakReference<V> r0 = r0.view
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r0.get()
            i0.j.f.l.j.a.a.a r0 = (i0.j.f.l.j.a.a.a) r0
            if (r0 == 0) goto L_0x0083
            r0.d()
        L_0x0083:
            java.util.ArrayList<com.instabug.survey.e.c.c> r0 = r3.x
            if (r0 != 0) goto L_0x0088
            goto L_0x00a5
        L_0x0088:
            java.util.Iterator r0 = r0.iterator()
        L_0x008c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r0.next()
            com.instabug.survey.e.c.c r1 = (com.instabug.survey.e.c.c) r1
            java.util.ArrayList<java.lang.String> r3 = r1.Y1
            if (r3 == 0) goto L_0x008c
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r1.q = r3
            goto L_0x008c
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.e.e.a.b.c.g():void");
    }

    public int getLayout() {
        return R.layout.instabug_dialog_version_update_announce;
    }

    public void initViews(View view, Bundle bundle) {
        i0.j.f.l.j.a.a.a aVar;
        i0.j.f.l.j.a.a.a aVar2;
        super.initViews(view, bundle);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.instabug_announcement_dialog_container);
        com.instabug.survey.e.c.c cVar = this.c;
        if (cVar != null) {
            i0.j.f.l.j.a.a.b bVar = this.q;
            Objects.requireNonNull(bVar);
            ArrayList<String> arrayList = cVar.Y1;
            if (arrayList != null) {
                if (arrayList.size() < 2) {
                    String str = cVar.c;
                    String str2 = cVar.d;
                    ArrayList<String> arrayList2 = cVar.Y1;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        String str3 = cVar.Y1.get(0);
                        WeakReference<V> weakReference = bVar.view;
                        if (weakReference != null && (aVar2 = (i0.j.f.l.j.a.a.a) weakReference.get()) != null) {
                            aVar2.S(str, str2, str3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String str4 = cVar.c;
                String str5 = cVar.d;
                ArrayList<String> arrayList3 = cVar.Y1;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    String str6 = cVar.Y1.get(0);
                    String str7 = cVar.Y1.get(1);
                    WeakReference<V> weakReference2 = bVar.view;
                    if (weakReference2 != null && (aVar = (i0.j.f.l.j.a.a.a) weakReference2.get()) != null) {
                        aVar.e0(str4, str5, str6, str7);
                    }
                }
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.x = (AnnouncementActivity) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.toString() + " must implement AnnouncementActivity");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() != null) {
            this.c = (com.instabug.survey.e.c.c) getArguments().getSerializable("announcement_item");
        }
        this.q = new i0.j.f.l.j.a.a.b(this);
    }

    public void onDestroy() {
        d dVar = this.y;
        if (dVar != null) {
            if (dVar.isShowing()) {
                this.y.cancel();
            }
            this.y.setOnCancelListener((DialogInterface.OnCancelListener) null);
            this.y.setOnShowListener((DialogInterface.OnShowListener) null);
            this.Y1 = null;
            this.Z1 = null;
            this.y = null;
        }
        i0.j.f.l.j.a.a.b bVar = this.q;
        if (bVar != null) {
            bVar.onDestroy();
        }
        super.onDestroy();
    }

    public void onDetach() {
        this.x = null;
        super.onDetach();
    }

    public void onResume() {
        super.onResume();
        d dVar = this.y;
        if (dVar != null && !dVar.isShowing() && getActivity() != null) {
            this.y.show();
        }
    }
}
