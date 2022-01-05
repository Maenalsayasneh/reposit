package h0.t;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.R;
import h0.t.s;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@s.b("activity")
/* compiled from: ActivityNavigator */
public class b extends s<a> {
    public Context a;
    public Activity b;

    /* compiled from: ActivityNavigator */
    public static class a extends k {
        public Intent b2;
        public String c2;

        public a(s<? extends a> sVar) {
            super((s<? extends k>) sVar);
        }

        public void o(Context context, AttributeSet attributeSet) {
            super.o(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.ActivityNavigator);
            String string = obtainAttributes.getString(R.styleable.ActivityNavigator_targetPackage);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.b2 == null) {
                this.b2 = new Intent();
            }
            this.b2.setPackage(string);
            String string2 = obtainAttributes.getString(R.styleable.ActivityNavigator_android_name);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.b2 == null) {
                    this.b2 = new Intent();
                }
                this.b2.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(R.styleable.ActivityNavigator_action);
            if (this.b2 == null) {
                this.b2 = new Intent();
            }
            this.b2.setAction(string3);
            String string4 = obtainAttributes.getString(R.styleable.ActivityNavigator_data);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.b2 == null) {
                    this.b2 = new Intent();
                }
                this.b2.setData(parse);
            }
            this.c2 = obtainAttributes.getString(R.styleable.ActivityNavigator_dataPattern);
            obtainAttributes.recycle();
        }

        public String toString() {
            ComponentName componentName;
            Intent intent = this.b2;
            String str = null;
            if (intent == null) {
                componentName = null;
            } else {
                componentName = intent.getComponent();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (componentName != null) {
                sb.append(" class=");
                sb.append(componentName.getClassName());
            } else {
                Intent intent2 = this.b2;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: h0.t.b$b  reason: collision with other inner class name */
    /* compiled from: ActivityNavigator */
    public static final class C0065b implements s.a {
    }

    public b(Context context) {
        this.a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    public k a() {
        return new a(this);
    }

    public k b(k kVar, Bundle bundle, q qVar, s.a aVar) {
        Intent intent;
        int intExtra;
        a aVar2 = (a) kVar;
        if (aVar2.b2 != null) {
            Intent intent2 = new Intent(aVar2.b2);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar2.c2;
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z = aVar instanceof C0065b;
            if (z) {
                Objects.requireNonNull((C0065b) aVar);
                intent2.addFlags(0);
            }
            if (!(this.a instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (qVar != null && qVar.a) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.b;
            if (!(activity == null || (intent = activity.getIntent()) == null || (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) == 0)) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar2.q);
            Resources resources = this.a.getResources();
            if (qVar != null) {
                int i = qVar.f;
                int i2 = qVar.g;
                if ((i <= 0 || !resources.getResourceTypeName(i).equals("animator")) && (i2 <= 0 || !resources.getResourceTypeName(i2).equals("animator"))) {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i2);
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0("Activity destinations do not support Animator resource. Ignoring popEnter resource ");
                    P0.append(resources.getResourceName(i));
                    P0.append(" and popExit resource ");
                    P0.append(resources.getResourceName(i2));
                    P0.append("when launching ");
                    P0.append(aVar2);
                    Log.w("ActivityNavigator", P0.toString());
                }
            }
            if (z) {
                Objects.requireNonNull((C0065b) aVar);
                this.a.startActivity(intent2);
            } else {
                this.a.startActivity(intent2);
            }
            if (qVar == null || this.b == null) {
                return null;
            }
            int i3 = qVar.d;
            int i4 = qVar.e;
            if ((i3 > 0 && resources.getResourceTypeName(i3).equals("animator")) || (i4 > 0 && resources.getResourceTypeName(i4).equals("animator"))) {
                StringBuilder P02 = i0.d.a.a.a.P0("Activity destinations do not support Animator resource. Ignoring enter resource ");
                P02.append(resources.getResourceName(i3));
                P02.append(" and exit resource ");
                P02.append(resources.getResourceName(i4));
                P02.append("when launching ");
                P02.append(aVar2);
                Log.w("ActivityNavigator", P02.toString());
                return null;
            } else if (i3 < 0 && i4 < 0) {
                return null;
            } else {
                this.b.overridePendingTransition(Math.max(i3, 0), Math.max(i4, 0));
                return null;
            }
        } else {
            throw new IllegalStateException(i0.d.a.a.a.u0(i0.d.a.a.a.P0("Destination "), aVar2.q, " does not have an Intent set."));
        }
    }

    public boolean e() {
        Activity activity = this.b;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
