package com.instabug.featuresrequest.ui.d;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment;
import com.instabug.featuresrequest.ui.custom.f;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.util.PlaceHolderUtils;
import i0.j.d.h.e.d;
import i0.j.d.h.e.e;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: FeaturesMainFragment */
public class c extends DynamicToolbarFragment<d> implements i0.j.d.h.e.a, View.OnClickListener, i0.j.d.b.c {
    public static final /* synthetic */ int c = 0;
    public Button Y1;
    public Boolean Z1 = Boolean.FALSE;
    public int a2 = 1;
    public ArrayList<i0.j.d.b.b> b2;
    public com.instabug.featuresrequest.ui.d.f.b c2;
    public TabLayout d;
    public com.instabug.featuresrequest.ui.d.g.b d2;
    public e q;
    public LinearLayout x;
    public ViewPager y;

    /* compiled from: FeaturesMainFragment */
    public class a implements f.a {
        public a() {
        }

        public void a() {
            i0.j.d.h.e.a aVar;
            c cVar = c.this;
            int i = c.c;
            P p = cVar.presenter;
            if (p != null && (aVar = ((d) p).c) != null) {
                aVar.l();
            }
        }
    }

    /* compiled from: FeaturesMainFragment */
    public class b implements f.a {
        public b() {
        }

        public void a() {
            i0.j.d.h.e.a aVar;
            c cVar = c.this;
            int i = c.c;
            P p = cVar.presenter;
            if (p != null && (aVar = ((d) p).c) != null) {
                aVar.a();
            }
        }
    }

    public Fragment I0(int i) {
        if (i != 1) {
            if (this.c2 == null) {
                boolean booleanValue = this.Z1.booleanValue();
                Bundle bundle = new Bundle();
                bundle.putBoolean("sort_by_top_voted", booleanValue);
                bundle.putBoolean("my_posts", false);
                com.instabug.featuresrequest.ui.d.f.b bVar = new com.instabug.featuresrequest.ui.d.f.b();
                bVar.setArguments(bundle);
                this.c2 = bVar;
                this.b2.add(bVar);
            }
            return this.c2;
        }
        if (this.d2 == null) {
            boolean booleanValue2 = this.Z1.booleanValue();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("sort_by_top_voted", booleanValue2);
            bundle2.putBoolean("my_posts", true);
            com.instabug.featuresrequest.ui.d.g.b bVar2 = new com.instabug.featuresrequest.ui.d.g.b();
            bVar2.setArguments(bundle2);
            this.d2 = bVar2;
            this.b2.add(bVar2);
        }
        return this.d2;
    }

    public void L(boolean z) {
        Iterator<i0.j.d.b.b> it = this.b2.iterator();
        while (it.hasNext()) {
            it.next().A0(Boolean.valueOf(z));
        }
    }

    public void a() {
        if (getActivity() != null) {
            h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
            aVar.b(R.id.instabug_fragment_container, new com.instabug.featuresrequest.ui.e.c());
            aVar.g("search_features");
            aVar.h();
        }
    }

    public void addToolbarActionButtons() {
        this.toolbarActionButtons.add(new f(R.drawable.ibg_fr_ic_add_white_36dp, -1, new b(), f.b.ICON));
    }

    public int getContentLayout() {
        return R.layout.ib_fr_features_main_fragment;
    }

    public String getTitle() {
        return PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.FEATURES_REQUEST, getString(R.string.instabug_str_features_request_header));
    }

    public f getToolbarCloseActionButton() {
        return new f(R.drawable.ibg_core_ic_close, R.string.close, new a(), f.b.ICON);
    }

    public void initContentViews(View view, Bundle bundle) {
        this.q = new e(getChildFragmentManager(), this);
        this.d = (TabLayout) findViewById(R.id.tab_layout);
        this.x = (LinearLayout) findViewById(R.id.tabsContainer);
        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        this.y = viewPager;
        TabLayout tabLayout = this.d;
        if (!(tabLayout == null || this.x == null || viewPager == null)) {
            TabLayout.g i = tabLayout.i();
            i.b(getString(R.string.features_rq_main_fragment_tab1));
            tabLayout.a(i);
            TabLayout tabLayout2 = this.d;
            TabLayout.g i2 = tabLayout2.i();
            i2.b(getString(R.string.features_rq_main_fragment_tab2));
            tabLayout2.a(i2);
            this.d.setBackgroundColor(Instabug.getPrimaryColor());
            this.d.setTabMode(0);
            this.x.setBackgroundColor(Instabug.getPrimaryColor());
            this.y.setAdapter(this.q);
            this.y.addOnPageChangeListener(new TabLayout.h(this.d));
            TabLayout tabLayout3 = this.d;
            i0.j.d.h.e.b bVar = new i0.j.d.h.e.b(this);
            if (!tabLayout3.B2.contains(bVar)) {
                tabLayout3.B2.add(bVar);
            }
        }
        if (getContext() != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.sortingActionsLayoutRoot);
            ImageView imageView = (ImageView) findViewById(R.id.imgSortActions);
            if (imageView != null) {
                imageView.setImageDrawable(h0.b.b.a.a.a(getContext(), R.drawable.ibg_fr_ic_sort));
            }
            this.Y1 = (Button) findViewById(R.id.btnSortActions);
            if (linearLayout != null) {
                linearLayout.setOnClickListener(this);
            }
            if (this.Y1 != null) {
                if (this.Z1.booleanValue()) {
                    this.Y1.setText(i0.j.c.l.a.E(getString(R.string.sort_by_top_rated)));
                } else {
                    this.Y1.setText(i0.j.c.l.a.E(getString(R.string.sort_by_recently_updated)));
                }
            }
        }
        if (this.x != null && this.d != null) {
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                this.x.setBackgroundColor(Instabug.getPrimaryColor());
                this.d.setBackgroundColor(Instabug.getPrimaryColor());
                return;
            }
            LinearLayout linearLayout2 = this.x;
            Resources resources = getResources();
            int i3 = R.color.ib_fr_toolbar_dark_color;
            linearLayout2.setBackgroundColor(resources.getColor(i3));
            this.d.setBackgroundColor(getResources().getColor(i3));
        }
    }

    public void l() {
        finishActivity();
    }

    public void onClick(View view) {
        ContextThemeWrapper contextThemeWrapper;
        if (view.getId() == R.id.sortingActionsLayoutRoot && getContext() != null) {
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.IbFrPopupMenuOverlapAnchorLight);
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.IbFrPopupMenuOverlapAnchorDark);
            }
            PopupMenu popupMenu = new PopupMenu(contextThemeWrapper, view, 5);
            popupMenu.getMenuInflater().inflate(R.menu.ib_fr_sorting_actions_pop_up, popupMenu.getMenu());
            popupMenu.getMenu().getItem(this.a2).setChecked(true);
            popupMenu.setOnMenuItemClickListener(new i0.j.d.h.e.c(this));
            popupMenu.show();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        boolean z = true;
        setRetainInstance(true);
        this.presenter = new d(this);
        this.b2 = new ArrayList<>();
        if (i0.j.d.e.c.a() == null) {
            i = 0;
        } else {
            i = i0.j.d.e.c.a().b.getInt("last_sort_by_action", 0);
        }
        this.a2 = i;
        if (i != 0) {
            z = false;
        }
        this.Z1 = Boolean.valueOf(z);
    }

    public void onDestroy() {
        super.onDestroy();
        this.b2 = null;
    }
}
