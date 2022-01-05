package com.instabug.bug.view.h;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.bug.R;
import com.instabug.bug.h.a$a;
import com.instabug.library.Instabug;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.KeyboardUtils;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.SimpleTextWatcher;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.b.f;
import i0.j.b.t.e;
import i0.j.b.t.i.c;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ExtraFieldsFragment */
public class c extends InstabugBaseFragment<i0.j.b.t.i.c> implements i0.j.b.t.i.a {
    public String Y1 = "";
    public String c;
    public List<i0.j.b.p.a> d;
    public long q;
    public boolean x;
    public e y;

    /* compiled from: ExtraFieldsFragment */
    public class a extends SimpleTextWatcher {
        public WeakReference<EditText> c;

        public a(EditText editText) {
            this.c = new WeakReference<>(editText);
        }

        public void afterTextChanged(Editable editable) {
            List<i0.j.b.p.a> list;
            super.afterTextChanged(editable);
            EditText editText = (EditText) this.c.get();
            if (editText != null && (list = c.this.d) != null) {
                list.get(editText.getId()).d = editable.toString();
            }
        }
    }

    /* compiled from: ExtraFieldsFragment */
    public static class b extends RecyclerView.b0 {
        public EditText a;
        public TextView b;
        public View c;

        public b(View view) {
            super(view);
            if (view instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) view;
                for (int i = 0; i < linearLayout.getChildCount(); i++) {
                    View childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof EditText) {
                        this.a = (EditText) childAt;
                    } else if (childAt instanceof TextView) {
                        this.b = (TextView) childAt;
                    } else {
                        this.c = childAt;
                    }
                }
            }
        }
    }

    public void e(int i) {
        b bVar = new b(findViewById(i));
        TextView textView = bVar.b;
        if (textView != null && bVar.c != null) {
            textView.setText((CharSequence) null);
            bVar.c.setBackgroundColor(AttrResolver.resolveAttributeColor(bVar.itemView.getContext(), R.attr.ibg_bug_vus_separator_color));
        }
    }

    public int getLayout() {
        return R.layout.ibg_bug_lyt_extra_fields;
    }

    public void initViews(View view, Bundle bundle) {
        List<i0.j.b.p.a> list;
        CharSequence charSequence;
        P p = this.presenter;
        if (p != null) {
            i0.j.b.t.i.c cVar = (i0.j.b.t.i.c) p;
            if (f.g().b == null) {
                list = null;
            } else {
                List<i0.j.b.p.a> list2 = f.g().b.c2;
                if (list2 != null) {
                    list = list2;
                } else {
                    a$a d2 = i0.j.b.s.a.h().d();
                    int i = c.a.a[d2.ordinal()];
                    if (i == 1 || i == 2) {
                        i0.j.b.t.i.a aVar = (i0.j.b.t.i.a) cVar.view.get();
                        if (aVar == null || aVar.getViewContext() == null || ((Fragment) aVar.getViewContext()).getContext() == null) {
                            list = list2;
                        } else {
                            Context context = ((Fragment) aVar.getViewContext()).getContext();
                            list = d2 == a$a.ENABLED_WITH_REQUIRED_FIELDS ? i0.h.a.b.c.m.b.d(context, true) : i0.h.a.b.c.m.b.d(context, false);
                        }
                    } else {
                        list = i0.j.b.s.a.h().e();
                    }
                    f.g().b.c2 = list;
                }
            }
            this.d = list;
            if (list != null && getContext() != null) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
                for (int i2 = 0; i2 < this.d.size(); i2++) {
                    LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.ibg_bug_item_edittext, linearLayout, false);
                    linearLayout2.setId(i2);
                    b bVar = new b(linearLayout2);
                    EditText editText = bVar.a;
                    if (editText != null) {
                        if (this.d.get(i2).e) {
                            charSequence = String.valueOf(this.d.get(i2).b + " *");
                        } else {
                            charSequence = this.d.get(i2).b;
                        }
                        editText.setHint(charSequence);
                        if (this.d.get(i2).d != null) {
                            bVar.a.setText(this.d.get(i2).d);
                        }
                        bVar.a.setId(i2);
                        EditText editText2 = bVar.a;
                        editText2.addTextChangedListener(new a(editText2));
                        bVar.a.setImeOptions(6);
                    }
                    if (linearLayout != null) {
                        linearLayout.addView(linearLayout2);
                    }
                }
            }
        }
    }

    public void k(int i) {
        List<i0.j.b.p.a> list = this.d;
        if (list != null) {
            String string = getString(R.string.instabug_err_invalid_extra_field, list.get(i).b);
            b bVar = new b(findViewById(i));
            EditText editText = bVar.a;
            if (editText != null) {
                editText.requestFocus();
            }
            TextView textView = bVar.b;
            if (textView != null && bVar.c != null) {
                textView.setText(string);
                bVar.c.setBackgroundColor(h0.i.b.a.getColor(bVar.itemView.getContext(), R.color.instabug_extrafield_error));
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (getActivity() instanceof e) {
            try {
                this.y = (e) getActivity();
            } catch (Exception unused) {
                throw new RuntimeException("Must implement BugReportingActivityCallback");
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(2);
        }
        if (getArguments() != null) {
            this.c = getArguments().getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        }
        this.presenter = new i0.j.b.t.i.c(this);
        e eVar = this.y;
        if (eVar != null) {
            this.Y1 = eVar.l();
            String str = this.c;
            if (str != null) {
                this.y.f(str);
            }
            this.y.z();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem findItem;
        menuInflater.inflate(R.menu.ibg_bug_menu_extended_reporting, menu);
        int i = R.id.instabug_bugreporting_send;
        MenuItem findItem2 = menu.findItem(i);
        MenuItem findItem3 = menu.findItem(R.id.instabug_bugreporting_next);
        if (findItem3 != null) {
            findItem3.setVisible(false);
        }
        if (findItem2 != null) {
            findItem2.setVisible(true);
        }
        if (getContext() != null && LocaleUtils.isRTL(Instabug.getLocale(getContext())) && (findItem = menu.findItem(i)) != null) {
            menu.findItem(i).setIcon(DrawableUtils.getRotateDrawable(findItem.getIcon(), 180.0f));
        }
    }

    public void onDestroy() {
        e eVar = this.y;
        if (eVar != null) {
            eVar.g();
            this.y.f(this.Y1);
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        i0.j.b.t.i.a aVar;
        boolean z = false;
        if (this.x || SystemClock.elapsedRealtime() - this.q < 1000) {
            return false;
        }
        this.q = SystemClock.elapsedRealtime();
        if (menuItem.getItemId() == R.id.instabug_bugreporting_send) {
            P p = this.presenter;
            if (p != null) {
                i0.j.b.t.i.c cVar = (i0.j.b.t.i.c) p;
                if (f.g().b != null) {
                    List<i0.j.b.p.a> list = f.g().b.c2;
                    if (!(list == null || list.isEmpty() || (aVar = (i0.j.b.t.i.a) cVar.view.get()) == null)) {
                        for (int i = 0; i < list.size(); i++) {
                            aVar.e(i);
                        }
                    }
                    i0.j.b.t.i.a aVar2 = (i0.j.b.t.i.a) cVar.view.get();
                    if (aVar2 != null) {
                        int i2 = 0;
                        while (true) {
                            if (list == null || i2 >= list.size()) {
                                break;
                            }
                            i0.j.b.p.a aVar3 = list.get(i2);
                            if (aVar3.e) {
                                String str = aVar3.d;
                                if (str == null) {
                                    aVar2.k(i2);
                                    break;
                                } else if (str.trim().isEmpty()) {
                                    aVar2.k(i2);
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    z = true;
                }
                if (z) {
                    List<i0.j.b.p.a> list2 = this.d;
                    if (list2 != null) {
                        i0.j.b.t.i.c cVar2 = (i0.j.b.t.i.c) this.presenter;
                        Objects.requireNonNull(cVar2);
                        a$a d2 = i0.j.b.s.a.h().d();
                        if (d2 == a$a.ENABLED_WITH_OPTIONAL_FIELDS || d2 == a$a.ENABLED_WITH_REQUIRED_FIELDS) {
                            if (f.g().b != null) {
                                String str2 = f.g().b.x;
                                JSONArray jSONArray = new JSONArray();
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("id", (Object) InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
                                    jSONObject.put("name", (Object) "Description");
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    jSONObject.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, (Object) str2);
                                    jSONArray.put((Object) jSONObject);
                                    for (i0.j.b.p.a next : list2) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put("id", (Object) next.a);
                                        jSONObject2.put("name", (Object) next.c);
                                        String str3 = next.d;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        jSONObject2.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, (Object) str3);
                                        jSONArray.put((Object) jSONObject2);
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                                f.g().b.x = jSONArray.toString();
                                cVar2.m();
                            }
                        } else if (f.g().b != null) {
                            String str4 = f.g().b.x;
                            StringBuilder sb = new StringBuilder();
                            if (str4 != null) {
                                sb.append(str4);
                            }
                            for (i0.j.b.p.a next2 : list2) {
                                if (sb.length() > 0) {
                                    sb.append("\n");
                                }
                                sb.append(next2.b);
                                sb.append(":");
                                sb.append("\n");
                                sb.append(next2.d);
                            }
                            f.g().b.x = sb.toString();
                            cVar2.m();
                        }
                    }
                    this.x = true;
                    if (getContext() != null) {
                        f g = f.g();
                        Context context = getContext();
                        Objects.requireNonNull(g);
                        ActionsOrchestrator.obtainOrchestrator(PoolProvider.newBackgroundExecutor()).addWorkerThreadAction(new i0.j.b.c(g, context)).orchestrate();
                    } else {
                        InstabugSDKLogger.e("ExtraFieldsFragment", "Couldn't commit the Bug due to Null context");
                    }
                    if (getActivity() != null) {
                        KeyboardUtils.hide(getActivity());
                    }
                    new Handler().postDelayed(new i0.j.b.t.i.b(this), 200);
                }
            }
            return true;
        }
        if (menuItem.getItemId() == 16908332 && getActivity() != null) {
            getActivity().onBackPressed();
        }
        return false;
    }
}
