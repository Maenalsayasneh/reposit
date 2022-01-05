package com.instabug.library.invocation.invocationdialog;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.ListUtils;
import com.instabug.library.view.ViewUtils;
import h0.i.i.q;
import i0.j.e.m0.e.e;
import i0.j.e.m0.e.f;
import i0.j.e.m0.e.h;
import i0.j.e.m0.e.i;
import i0.j.e.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: InstabugDialogFragment */
public class g extends InstabugBaseFragment<i> implements h, AdapterView.OnItemClickListener {
    public i0.j.e.m0.e.a Y1;
    public ListView Z1;
    public TextView c;
    public e d;
    public ArrayList<InstabugDialogItem> q;
    public a x = null;
    public b y;

    /* compiled from: InstabugDialogFragment */
    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            b bVar;
            g gVar = g.this;
            a aVar = gVar.x;
            if (aVar != null && (bVar = gVar.y) != null) {
                bVar.removeScreenshotIfNeeded(aVar);
                g gVar2 = g.this;
                gVar2.y.onDialogItemClicked(gVar2.x, gVar2.findViewById(R.id.instabug_main_prompt_container), g.this.findViewById(R.id.instabug_pbi_container));
            }
        }
    }

    /* compiled from: InstabugDialogFragment */
    public interface b {
        void onDialogItemClicked(InstabugDialogItem instabugDialogItem, View... viewArr);

        void removeScreenshotIfNeeded(InstabugDialogItem instabugDialogItem);
    }

    public void a() {
        View findViewById = findViewById(R.id.instabug_pbi_container);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(R.id.image_instabug_logo);
        if (imageView != null) {
            imageView.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP);
            imageView.setImageResource(R.drawable.ibg_core_ic_instabug_logo);
        }
    }

    public void b() {
        View findViewById = findViewById(R.id.instabug_pbi_container);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public void d() {
        if (this.c != null && getArguments() != null && getArguments().getString(InstabugDialogActivity.KEY_DIALOG_TITLE) != null) {
            this.c.setText(getArguments().getString(InstabugDialogActivity.KEY_DIALOG_TITLE));
        }
    }

    public int getLayout() {
        return R.layout.ib_core_lyt_dialog_fragment;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void initViews(View view, Bundle bundle) {
        View findViewById = findViewById(R.id.instabug_main_prompt_container);
        if (!(findViewById == null || getContext() == null)) {
            if (getActivity() != null) {
                WindowManager windowManager = (WindowManager) getActivity().getSystemService("window");
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                }
                Context applicationContext = Instabug.getApplicationContext();
                if (!(this.q == null || applicationContext == null)) {
                    if (ViewUtils.convertDpToPx(applicationContext, 200.0f) + (this.q.size() * ViewUtils.convertDpToPx(applicationContext, 56.0f)) > displayMetrics.heightPixels) {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, displayMetrics.heightPixels - ViewUtils.convertDpToPx(applicationContext, 110.0f));
                        layoutParams.addRule(13);
                        findViewById.setLayoutParams(layoutParams);
                    }
                }
            }
            DrawableUtils.setColor(findViewById, AttrResolver.resolveAttributeColor(getContext(), R.attr.instabug_background_color));
        }
        TextView textView = (TextView) findViewById(R.id.instabug_fragment_title);
        this.c = textView;
        if (textView != null) {
            AtomicInteger atomicInteger = q.a;
            textView.setTransitionName(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        }
        if (this.x != null) {
            View findViewById2 = findViewById(R.id.instabug_chats_list_icon_container);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
                if (this.y != null) {
                    findViewById2.setOnClickListener(new a());
                }
            }
            ImageView imageView = (ImageView) findViewById(R.id.instabug_chats_list_icon);
            if (imageView != null) {
                imageView.getDrawable().setColorFilter(Instabug.getPrimaryColor(), PorterDuff.Mode.SRC_IN);
            }
            TextView textView2 = (TextView) findViewById(R.id.instabug_notification_count);
            if (this.x.getBadgeCount() > 0) {
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                int color = getResources().getColor(R.color.ib_core_notification_dot_color);
                if (!(textView2 == null || getContext() == null)) {
                    Drawable drawable = h0.i.b.a.getDrawable(getContext(), R.drawable.ibg_core_bg_white_oval);
                    Drawable drawable2 = null;
                    if (drawable != null) {
                        drawable2 = Colorizer.getTintedDrawable(color, drawable);
                    }
                    textView2.setBackgroundDrawable(drawable2);
                }
                if (textView2 != null) {
                    textView2.setText(String.valueOf(this.x.getBadgeCount()));
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        int i = R.id.instabug_prompt_options_list_view;
        ListView listView = (ListView) findViewById(i);
        this.Z1 = listView;
        if (listView != null) {
            listView.setOnItemClickListener(this);
            e eVar = new e();
            this.d = eVar;
            this.Z1.setAdapter(eVar);
        }
        ArrayList<InstabugDialogItem> arrayList = this.q;
        if (!(arrayList == null || this.d == null || arrayList.size() <= 0)) {
            e eVar2 = this.d;
            eVar2.c = this.q;
            eVar2.notifyDataSetChanged();
        }
        Context context = getContext();
        if (context != null && this.Y1 != null) {
            View findViewById3 = findViewById(R.id.layout_title_container);
            if (findViewById3 != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, this.Y1.getEnterAnimation());
                loadAnimation.setStartOffset(100);
                findViewById3.setAnimation(loadAnimation);
            }
            ListView listView2 = (ListView) findViewById(i);
            if (listView2 != null) {
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, this.Y1.getEnterAnimation());
                loadAnimation2.setStartOffset(100);
                loadAnimation2.setAnimationListener(new f(listView2));
                listView2.setScrollBarDefaultDelayBeforeFade(0);
                listView2.setAnimation(loadAnimation2);
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof b) || !(context instanceof i0.j.e.m0.e.a)) {
            throw new RuntimeException(context.toString() + " must implement InstabugDialogFragment.Callbacks and AnimationProvider");
        }
        this.y = (b) context;
        this.Y1 = (i0.j.e.m0.e.a) context;
    }

    public void onCreate(Bundle bundle) {
        setRetainInstance(true);
        super.onCreate(bundle);
        Context context = getContext();
        if (context != null) {
            setSharedElementEnterTransition(TransitionInflater.from(context).inflateTransition(17760257));
        }
        if (this.presenter == null) {
            this.presenter = new i(this);
        }
        ArrayList arrayList = null;
        if (getArguments() != null) {
            arrayList = (ArrayList) getArguments().getSerializable(InstabugDialogActivity.KEY_DIALOG_ITEMS);
        }
        if (arrayList != null) {
            ArrayList<InstabugDialogItem> arrayList2 = new ArrayList<>(arrayList);
            this.q = arrayList2;
            Collections.copy(arrayList2, arrayList);
            int i = 0;
            while (true) {
                if (i >= this.q.size()) {
                    i = -1;
                    break;
                } else if (this.q.get(i) instanceof a) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.x = (a) this.q.remove(i);
            }
        }
    }

    public void onDestroyView() {
        Context context = getContext();
        if (!(context == null || this.Y1 == null)) {
            View findViewById = findViewById(R.id.layout_title_container);
            if (findViewById != null) {
                findViewById.setAnimation(AnimationUtils.loadAnimation(context, this.Y1.getExitAnimation()));
            }
            ListView listView = (ListView) findViewById(R.id.instabug_prompt_options_list_view);
            if (listView != null) {
                Animation loadAnimation = AnimationUtils.loadAnimation(context, this.Y1.getExitAnimation());
                loadAnimation.setAnimationListener(new i0.j.e.m0.e.g(listView));
                listView.setAnimation(loadAnimation);
            }
        }
        this.c = null;
        this.Z1 = null;
        super.onDestroyView();
    }

    public void onDetach() {
        super.onDetach();
        this.y = null;
        this.Y1 = null;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListView listView = this.Z1;
        if (listView != null) {
            listView.setOnItemClickListener((AdapterView.OnItemClickListener) null);
        }
        b bVar = this.y;
        if (bVar != null) {
            bVar.onDialogItemClicked((InstabugDialogItem) ListUtils.safeGet(this.q, i), findViewById(R.id.instabug_main_prompt_container), findViewById(R.id.instabug_pbi_container));
        }
    }

    public void onStart() {
        i iVar;
        WeakReference<V> weakReference;
        h hVar;
        h hVar2;
        super.onStart();
        P p = this.presenter;
        if (p != null && (weakReference = iVar.view) != null && (hVar = (h) weakReference.get()) != null) {
            WeakReference<V> weakReference2 = (iVar = (i) p).view;
            if (!(weakReference2 == null || (hVar2 = (h) weakReference2.get()) == null)) {
                hVar2.d();
            }
            if (z.j().h(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
                hVar.b();
            } else {
                hVar.a();
            }
        }
    }

    public void onStop() {
        super.onStop();
        P p = this.presenter;
        if (p != null) {
            i iVar = (i) p;
        }
    }
}
