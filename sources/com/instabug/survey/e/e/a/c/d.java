package com.instabug.survey.e.e.a.c;

import android.content.Context;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.Instabug;
import com.instabug.survey.R;
import com.instabug.survey.announcements.ui.activity.AnnouncementActivity;
import com.instabug.survey.e.c.e;
import com.instabug.survey.e.e.a.a;
import i0.j.f.l.j.a.b.b;
import i0.j.f.l.j.a.b.c;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WhatsNewFragment */
public class d extends a<c> implements View.OnTouchListener, View.OnClickListener, i0.j.f.l.j.a.b.a {
    public static final /* synthetic */ int q = 0;
    public Button Y1;
    public TextView Z1;
    public c a2;
    public AnnouncementActivity b2;
    public b x;
    public RecyclerView y;

    public void c() {
        com.instabug.survey.e.c.a aVar;
        AnnouncementActivity announcementActivity = this.b2;
        if (announcementActivity != null && (aVar = this.d) != null) {
            announcementActivity.q0(aVar);
        }
    }

    public int getLayout() {
        return R.layout.instabug_dialog_whats_new_announce;
    }

    public void initViews(View view, Bundle bundle) {
        i0.j.f.l.j.a.b.a aVar;
        super.initViews(view, bundle);
        this.Z1 = (TextView) view.findViewById(R.id.instabug_announcement_title);
        this.y = (RecyclerView) view.findViewById(R.id.instabug_announcement_features_grid_view);
        this.Y1 = (Button) view.findViewById(R.id.instabug_btn_submit);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.instabug_announcement_dialog_container);
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(this);
        }
        if (getArguments() != null) {
            this.c = (com.instabug.survey.e.c.c) getArguments().getSerializable("announcement_item");
        }
        c cVar = new c(this);
        this.a2 = cVar;
        com.instabug.survey.e.c.c cVar2 = this.c;
        if (cVar2 != null && (aVar = (i0.j.f.l.j.a.b.a) cVar.view.get()) != null) {
            cVar2.a2 = true;
            ArrayList<e> arrayList = cVar2.y;
            if (arrayList != null) {
                Iterator<e> it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = it.next().x;
                    if (str != null && !str.equals("")) {
                        cVar2.a2 = false;
                    }
                }
            }
            aVar.w0(cVar2);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.b2 = (AnnouncementActivity) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.toString() + " must implement AnnouncementActivity");
        }
    }

    public void onClick(View view) {
        com.instabug.survey.e.c.a aVar;
        ArrayList<com.instabug.survey.e.c.c> arrayList;
        if (view.getId() == R.id.instabug_btn_submit && (aVar = this.d) != null && (arrayList = aVar.x) != null) {
            Iterator<com.instabug.survey.e.c.c> it = arrayList.iterator();
            while (it.hasNext()) {
                com.instabug.survey.e.c.c next = it.next();
                ArrayList<String> arrayList2 = next.Y1;
                if (arrayList2 != null) {
                    next.q = arrayList2.get(0);
                }
            }
            AnnouncementActivity announcementActivity = this.b2;
            if (announcementActivity != null) {
                announcementActivity.t0(this.d);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public void onDetach() {
        this.b2 = null;
        super.onDetach();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        c cVar = this.a2;
        if (cVar == null) {
            return true;
        }
        if (i0.j.f.s.e.b.f == null) {
            i0.j.f.s.e.b.f = cVar;
        }
        View view2 = (View) view.getParent();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (i0.j.f.s.e.b.c == -1) {
            i0.j.f.s.e.b.c = layoutParams.height;
        }
        i0.j.f.s.e.b.a(motionEvent, false, false, cVar, view2, layoutParams);
        if (cVar.c == null) {
            cVar.c = new GestureDetector(view.getContext(), new i0.j.f.s.e.a(cVar));
        }
        cVar.c.onTouchEvent(motionEvent);
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setFocusableInTouchMode(true);
    }

    public void w0(com.instabug.survey.e.c.c cVar) {
        ArrayList<String> arrayList;
        if (getActivity() != null) {
            this.x = new b(getActivity(), cVar);
            RecyclerView recyclerView = this.y;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                this.y.setAdapter(this.x);
            }
            TextView textView = this.Z1;
            if (textView != null) {
                String str = cVar.c;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                this.Z1.setTextColor(Instabug.getPrimaryColor());
            }
            if (this.Y1 != null && (arrayList = cVar.Y1) != null && arrayList.size() > 0) {
                this.Y1.setText(cVar.Y1.get(0));
                this.Y1.setBackgroundColor(Instabug.getPrimaryColor());
                this.Y1.setOnClickListener(this);
            }
        }
    }
}
