package h0.b.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatTextView;
import h0.b.f.d;
import h0.b.f.f;
import h0.b.f.g;
import h0.b.f.p;
import h0.f.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater */
public class n {
    public static final Class<?>[] a = {Context.class, AttributeSet.class};
    public static final int[] b = {16843375};
    public static final String[] c = {"android.widget.", "android.view.", "android.webkit."};
    public static final h<String, Constructor<? extends View>> d = new h<>();
    public final Object[] e = new Object[2];

    /* compiled from: AppCompatViewInflater */
    public static class a implements View.OnClickListener {
        public final View c;
        public final String d;
        public Method q;
        public Context x;

        public a(View view, String str) {
            this.c = view;
            this.d = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.q == null) {
                for (Context context = this.c.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.d, new Class[]{View.class})) != null) {
                            this.q = method;
                            this.x = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.c.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0(" with id '");
                    P0.append(this.c.getContext().getResources().getResourceEntryName(id));
                    P0.append("'");
                    str = P0.toString();
                }
                StringBuilder P02 = i0.d.a.a.a.P0("Could not find method ");
                P02.append(this.d);
                P02.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                P02.append(this.c.getClass());
                P02.append(str);
                throw new IllegalStateException(P02.toString());
            }
            try {
                this.q.invoke(this.x, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    public d a(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public p d(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet, R.attr.radioButtonStyle);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public View f() {
        return null;
    }

    public final View g(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        h<String, Constructor<? extends View>> hVar = d;
        Constructor<? extends U> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(a);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.e);
    }

    public final void h(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
