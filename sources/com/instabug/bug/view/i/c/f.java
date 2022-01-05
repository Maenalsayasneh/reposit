package com.instabug.bug.view.i.c;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.bug.R;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.operation.DeleteUriDiskOperation;
import com.instabug.library.util.FileUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import h0.v.a.g;
import i0.j.b.p.b;
import i0.j.b.t.e;
import i0.j.b.t.j.b.a;
import i0.j.b.t.j.b.c;
import i0.j.b.t.j.b.d;
import i0.j.b.t.j.b.h;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import k0.b.l;
import k0.b.q;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: VisualUserStepsListFragment */
public class f extends InstabugBaseFragment<h> implements d {
    public static final /* synthetic */ int c = 0;
    public RecyclerView Y1;
    public TextView Z1;
    public LinearLayout a2;
    public ProgressDialog b2;
    public String d;
    public e q;
    public String x = "";
    public c y;

    public void F() {
        ProgressDialog progressDialog = this.b2;
        if (progressDialog != null) {
            if (!progressDialog.isShowing()) {
                this.b2.show();
            }
        } else if (getActivity() != null) {
            ProgressDialog progressDialog2 = new ProgressDialog(getActivity());
            this.b2 = progressDialog2;
            progressDialog2.setCancelable(false);
            this.b2.setMessage(PlaceHolderUtils.getPlaceHolder(getContext(), InstabugCustomTextPlaceHolder.Key.REPRO_STEPS_PROGRESS_DIALOG_BODY, R.string.instabug_str_dialog_message_preparing));
            this.b2.show();
        }
    }

    public void H(ArrayList<b> arrayList) {
        LinearLayout linearLayout = this.a2;
        if (linearLayout != null && this.Y1 != null && this.Z1 != null && this.y != null) {
            linearLayout.setVisibility(0);
            if (arrayList.isEmpty()) {
                this.Y1.setVisibility(8);
                this.Z1.setVisibility(0);
                this.Z1.setText(PlaceHolderUtils.getPlaceHolder(getContext(), InstabugCustomTextPlaceHolder.Key.REPRO_STEPS_LIST_EMPTY_STATE_DESCRIPTION, R.string.IBGReproStepsListEmptyStateLabel));
                if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                    this.Z1.setBackgroundDrawable(getResources().getDrawable(R.drawable.ibg_bug_vus_empty_view_background_light));
                    return;
                }
                this.Z1.setBackgroundDrawable(getResources().getDrawable(R.drawable.ibg_bug_vus_empty_view_background_dark));
                ((ViewGroup.MarginLayoutParams) this.Z1.getLayoutParams()).setMargins(0, 0, 0, 0);
                return;
            }
            this.Y1.setVisibility(0);
            this.Z1.setVisibility(8);
            c cVar = this.y;
            g.d a = g.a(new a(cVar.b, arrayList), true);
            cVar.b.clear();
            cVar.b.addAll(arrayList);
            a.b(new h0.v.a.b(cVar));
        }
    }

    public void a() {
        ProgressDialog progressDialog;
        if (getActivity() != null && !getActivity().isFinishing() && (progressDialog = this.b2) != null && progressDialog.isShowing()) {
            this.b2.dismiss();
        }
    }

    public int getLayout() {
        return R.layout.ibg_bug_fragment_repro_steps_list;
    }

    public void initViews(View view, Bundle bundle) {
        d dVar;
        TextView textView = (TextView) findViewById(R.id.instabug_vus_list_header);
        if (textView != null) {
            textView.setText(PlaceHolderUtils.getPlaceHolder(getContext(), InstabugCustomTextPlaceHolder.Key.REPRO_STEPS_LIST_DESCRIPTION, R.string.IBGReproStepsListHeader));
        }
        this.Z1 = (TextView) findViewById(R.id.instabug_vus_empty_label);
        this.Y1 = (RecyclerView) findViewById(R.id.instabug_vus_list);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.instabug_vus_list_container);
        this.a2 = linearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        this.y = new c(this);
        if (getContext() != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
            RecyclerView recyclerView = this.Y1;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(linearLayoutManager);
                this.Y1.setAdapter(this.y);
                this.Y1.addItemDecoration(new h0.v.a.h(this.Y1.getContext(), linearLayoutManager.getOrientation()));
                this.presenter = new h(this);
                F();
                h hVar = (h) this.presenter;
                Context context = getContext();
                WeakReference<V> weakReference = hVar.view;
                if (weakReference != null && (dVar = (d) weakReference.get()) != null) {
                    dVar.F();
                    l v = RxJavaPlugins.onAssembly(new k0.b.z.e.c.h(new i0.j.b.t.j.b.f(hVar, context))).v(k0.b.d0.a.b());
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    Objects.requireNonNull(v);
                    q a = k0.b.d0.a.a();
                    Objects.requireNonNull(timeUnit, "unit is null");
                    Objects.requireNonNull(a, "scheduler is null");
                    hVar.d = RxJavaPlugins.onAssembly(new k0.b.z.e.c.b(v, 1, timeUnit, a, false)).s(k0.b.v.a.a.a()).t(new i0.j.b.t.j.b.e(hVar, dVar), k0.b.z.b.a.e, k0.b.z.b.a.c, k0.b.z.b.a.d);
                }
            }
        }
    }

    public void j0(int i, b bVar) {
        d dVar;
        if (this.presenter != null && getContext() != null) {
            h hVar = (h) this.presenter;
            Context context = getContext();
            if (hVar.c.size() > i) {
                VisualUserStepsHelper.removeScreenshotId(bVar.c);
                hVar.c.remove(i);
                DiskUtils.with(context).deleteOperation(new DeleteUriDiskOperation(Uri.parse(bVar.d))).executeAsync(new i0.j.b.t.j.b.g());
                WeakReference<V> weakReference = hVar.view;
                if (weakReference != null && (dVar = (d) weakReference.get()) != null) {
                    dVar.H(hVar.c);
                }
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof e) {
            try {
                this.q = (e) getActivity();
            } catch (Exception unused) {
                throw new RuntimeException("Must implement BugReportingActivityCallBack");
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
        this.d = getArguments() == null ? "" : getArguments().getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        e eVar = this.q;
        if (eVar != null) {
            this.x = eVar.l();
            String str = this.d;
            if (str != null) {
                this.q.f(str);
            }
            this.q.z();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menu.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (i0.j.b.t.j.b.h) r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r2 = this;
            P r0 = r2.presenter
            if (r0 == 0) goto L_0x0015
            i0.j.b.t.j.b.h r0 = (i0.j.b.t.j.b.h) r0
            k0.b.w.a r1 = r0.d
            if (r1 == 0) goto L_0x0015
            boolean r1 = r1.isDisposed()
            if (r1 == 0) goto L_0x0015
            k0.b.w.a r0 = r0.d
            r0.dispose()
        L_0x0015:
            i0.j.b.t.e r0 = r2.q
            if (r0 == 0) goto L_0x0023
            r0.g()
            i0.j.b.t.e r0 = r2.q
            java.lang.String r1 = r2.x
            r0.f(r1)
        L_0x0023:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.i.c.f.onDestroy():void");
    }

    public void onDestroyView() {
        ProgressDialog progressDialog;
        super.onDestroyView();
        if (getActivity() != null && !getActivity().isFinishing() && (progressDialog = this.b2) != null && progressDialog.isShowing()) {
            this.b2.dismiss();
        }
        this.b2 = null;
        this.Y1 = null;
        this.a2 = null;
        this.Z1 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332 && getActivity() != null) {
            getActivity().onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void r0(String str, String str2) {
        e eVar;
        if (DiskUtils.isFileExist(str2.replace(FileUtils.FLAG_ENCRYPTED, "")) && (eVar = this.q) != null) {
            eVar.v(str, str2);
        }
    }
}
