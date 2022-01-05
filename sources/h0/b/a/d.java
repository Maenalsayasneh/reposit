package h0.b.a;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import h0.b.f.f0;
import h0.i.i.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AlertDialog */
public class d extends m implements DialogInterface {
    public final AlertController q = new AlertController(getContext(), this, getWindow());

    /* compiled from: AlertDialog */
    public static class a {
        public final AlertController.b a;
        public final int b;

        public a(Context context) {
            this(context, d.e(context, 0));
        }

        public d a() {
            int i;
            d dVar = new d(this.a.a, this.b);
            AlertController.b bVar = this.a;
            AlertController alertController = dVar.q;
            View view = bVar.e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.d;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f;
            if (charSequence2 != null) {
                alertController.f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.g;
            if (charSequence3 != null) {
                alertController.d(-1, charSequence3, bVar.h, (Message) null, (Drawable) null);
            }
            CharSequence charSequence4 = bVar.i;
            if (charSequence4 != null) {
                alertController.d(-2, charSequence4, bVar.j, (Message) null, (Drawable) null);
            }
            if (!(bVar.o == null && bVar.p == null)) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.L, (ViewGroup) null);
                if (bVar.s) {
                    i = alertController.N;
                } else {
                    i = alertController.O;
                }
                ListAdapter listAdapter = bVar.p;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.a, i, 16908308, bVar.o);
                }
                alertController.H = listAdapter;
                alertController.I = bVar.t;
                if (bVar.q != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                }
                if (bVar.s) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.g = recycleListView;
            }
            View view2 = bVar.r;
            if (view2 != null) {
                alertController.h = view2;
                alertController.i = 0;
                alertController.n = false;
            }
            dVar.setCancelable(this.a.k);
            if (this.a.k) {
                dVar.setCanceledOnTouchOutside(true);
            }
            dVar.setOnCancelListener(this.a.l);
            dVar.setOnDismissListener(this.a.m);
            DialogInterface.OnKeyListener onKeyListener = this.a.n;
            if (onKeyListener != null) {
                dVar.setOnKeyListener(onKeyListener);
            }
            return dVar;
        }

        public a b(int i) {
            AlertController.b bVar = this.a;
            bVar.f = bVar.a.getText(i);
            return this;
        }

        public a c(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.i = bVar.a.getText(i);
            this.a.j = onClickListener;
            return this;
        }

        public a d(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.g = bVar.a.getText(i);
            this.a.h = onClickListener;
            return this;
        }

        public a e(int i) {
            AlertController.b bVar = this.a;
            bVar.d = bVar.a.getText(i);
            return this;
        }

        public a f(View view) {
            this.a.r = view;
            return this;
        }

        public d g() {
            d a2 = a();
            a2.show();
            return a2;
        }

        public a(Context context, int i) {
            this.a = new AlertController.b(new ContextThemeWrapper(context, d.e(context, i)));
            this.b = i;
        }
    }

    public d(Context context, int i) {
        super(context, e(context, i));
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button d(int i) {
        AlertController alertController = this.q;
        Objects.requireNonNull(alertController);
        if (i == -3) {
            return alertController.w;
        }
        if (i == -2) {
            return alertController.s;
        }
        if (i != -1) {
            return null;
        }
        return alertController.o;
    }

    public void onCreate(Bundle bundle) {
        int i;
        boolean z;
        View view;
        ListAdapter listAdapter;
        View view2;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.q;
        if (alertController.K == 0) {
            i = alertController.J;
        } else {
            i = alertController.J;
        }
        alertController.b.setContentView(i);
        View findViewById2 = alertController.c.findViewById(R.id.parentPanel);
        int i2 = R.id.topPanel;
        View findViewById3 = findViewById2.findViewById(i2);
        int i3 = R.id.contentPanel;
        View findViewById4 = findViewById2.findViewById(i3);
        int i4 = R.id.buttonPanel;
        View findViewById5 = findViewById2.findViewById(i4);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view3 = alertController.h;
        int i5 = 0;
        if (view3 == null) {
            view3 = alertController.i != 0 ? LayoutInflater.from(alertController.a).inflate(alertController.i, viewGroup, false) : null;
        }
        boolean z2 = view3 != null;
        if (!z2 || !AlertController.a(view3)) {
            alertController.c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.c.findViewById(R.id.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
            }
            if (alertController.g != null) {
                ((f0.a) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(i2);
        View findViewById7 = viewGroup.findViewById(i3);
        View findViewById8 = viewGroup.findViewById(i4);
        ViewGroup c = alertController.c(findViewById6, findViewById3);
        ViewGroup c2 = alertController.c(findViewById7, findViewById4);
        ViewGroup c3 = alertController.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.c.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c2.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c2.setVisibility(8);
                }
            }
        }
        Button button = (Button) c3.findViewById(16908313);
        alertController.o = button;
        button.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.p) || alertController.r != null) {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                int i6 = alertController.d;
                drawable.setBounds(0, 0, i6, i6);
                alertController.o.setCompoundDrawables(alertController.r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.o.setVisibility(0);
            z = true;
        } else {
            alertController.o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) c3.findViewById(16908314);
        alertController.s = button2;
        button2.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.t) || alertController.v != null) {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                int i7 = alertController.d;
                drawable2.setBounds(0, 0, i7, i7);
                alertController.s.setCompoundDrawables(alertController.v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            alertController.s.setVisibility(0);
            z |= true;
        } else {
            alertController.s.setVisibility(8);
        }
        Button button3 = (Button) c3.findViewById(16908315);
        alertController.w = button3;
        button3.setOnClickListener(alertController.R);
        if (!TextUtils.isEmpty(alertController.x) || alertController.z != null) {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                int i8 = alertController.d;
                drawable3.setBounds(0, 0, i8, i8);
                view = null;
                alertController.w.setCompoundDrawables(alertController.z, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            z |= true;
        } else {
            alertController.w.setVisibility(8);
            view = null;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                alertController.b(alertController.o);
            } else if (z) {
                alertController.b(alertController.s);
            } else if (z) {
                alertController.b(alertController.w);
            }
        }
        if (!(z)) {
            c3.setVisibility(8);
        }
        if (alertController.G != null) {
            c.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.e)) || !alertController.P) {
                alertController.c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                c.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.c.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i9 = alertController.B;
                if (i9 != 0) {
                    alertController.D.setImageResource(i9);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i10 = (c == null || c.getVisibility() == 8) ? 0 : 1;
        boolean z4 = c3.getVisibility() != 8;
        if (!z4 && (findViewById = c2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i10 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f == null && alertController.g == null) {
                view2 = view;
            } else {
                view2 = c.findViewById(R.id.titleDividerNoCustom);
            }
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            View findViewById9 = c2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        ListView listView = alertController.g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z4 || i10 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i10 != 0 ? recycleListView.getPaddingTop() : recycleListView.c, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.d);
            }
        }
        if (!z3) {
            View view4 = alertController.g;
            if (view4 == null) {
                view4 = alertController.A;
            }
            if (view4 != null) {
                if (z4) {
                    i5 = 2;
                }
                View findViewById10 = alertController.c.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = alertController.c.findViewById(R.id.scrollIndicatorDown);
                AtomicInteger atomicInteger = q.a;
                view4.setScrollIndicators(i10 | i5, 3);
                if (findViewById10 != null) {
                    c2.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    c2.removeView(findViewById11);
                }
            }
        }
        ListView listView2 = alertController.g;
        if (listView2 != null && (listAdapter = alertController.H) != null) {
            listView2.setAdapter(listAdapter);
            int i11 = alertController.I;
            if (i11 > -1) {
                listView2.setItemChecked(i11, true);
                listView2.setSelection(i11);
            }
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.q.A;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.q.A;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.q;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
