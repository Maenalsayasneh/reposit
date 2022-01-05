package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.stripe.android.view.ActivityStarter.Args;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u00020\u0005:\u0002\u001b\u001cB?\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0018B3\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u0019B3\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0017\u0010\u001aJ\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/ActivityStarter;", "Landroid/app/Activity;", "TargetActivityType", "Lcom/stripe/android/view/ActivityStarter$Args;", "ArgsType", "", "args", "Lm0/i;", "startForResult", "(Lcom/stripe/android/view/ActivityStarter$Args;)V", "", "intentFlags", "Ljava/lang/Integer;", "activity", "Landroid/app/Activity;", "Ljava/lang/Class;", "targetClass", "Ljava/lang/Class;", "requestCode", "I", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Ljava/lang/Class;ILjava/lang/Integer;)V", "(Landroid/app/Activity;Ljava/lang/Class;ILjava/lang/Integer;)V", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;ILjava/lang/Integer;)V", "Args", "Result", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ActivityStarter.kt */
public abstract class ActivityStarter<TargetActivityType extends Activity, ArgsType extends Args> {
    private final Activity activity;
    private final Fragment fragment;
    private final Integer intentFlags;
    private final int requestCode;
    private final Class<TargetActivityType> targetClass;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Args;", "Landroid/os/Parcelable;", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ActivityStarter.kt */
    public interface Args extends Parcelable {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EXTRA = "extra_activity_args";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Args$Companion;", "", "", "EXTRA", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ActivityStarter.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String EXTRA = "extra_activity_args";

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Result;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ActivityStarter.kt */
    public interface Result extends Parcelable {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EXTRA = "extra_activity_result";

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/ActivityStarter$Result$Companion;", "", "", "EXTRA", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ActivityStarter.kt */
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String EXTRA = "extra_activity_result";

            private Companion() {
            }
        }

        Bundle toBundle();
    }

    public ActivityStarter(Activity activity2, Fragment fragment2, Class<TargetActivityType> cls, int i, Integer num) {
        i.e(activity2, "activity");
        i.e(cls, "targetClass");
        this.activity = activity2;
        this.fragment = fragment2;
        this.targetClass = cls;
        this.requestCode = i;
        this.intentFlags = num;
    }

    public final void startForResult(ArgsType argstype) {
        i.e(argstype, "args");
        Intent putExtra = new Intent(this.activity, this.targetClass).putExtra("extra_activity_args", argstype);
        Integer num = this.intentFlags;
        if (num != null) {
            putExtra.addFlags(num.intValue());
        }
        i.d(putExtra, "Intent(activity, targetC…          }\n            }");
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            fragment2.startActivityForResult(putExtra, this.requestCode);
        } else {
            this.activity.startActivityForResult(putExtra, this.requestCode);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityStarter(Activity activity2, Fragment fragment2, Class cls, int i, Integer num, int i2, f fVar) {
        this(activity2, (i2 & 2) != 0 ? null : fragment2, cls, i, (i2 & 16) != 0 ? null : num);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityStarter(Activity activity2, Class cls, int i, Integer num, int i2, f fVar) {
        this(activity2, cls, i, (i2 & 8) != 0 ? null : num);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ActivityStarter(Activity activity2, Class<TargetActivityType> cls, int i, Integer num) {
        this(activity2, (Fragment) null, cls, i, num);
        i.e(activity2, "activity");
        i.e(cls, "targetClass");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActivityStarter(Fragment fragment2, Class cls, int i, Integer num, int i2, f fVar) {
        this(fragment2, cls, i, (i2 & 8) != 0 ? null : num);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActivityStarter(androidx.fragment.app.Fragment r8, java.lang.Class<TargetActivityType> r9, int r10, java.lang.Integer r11) {
        /*
            r7 = this;
            java.lang.String r0 = "fragment"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = "targetClass"
            m0.n.b.i.e(r9, r0)
            h0.o.a.k r2 = r8.requireActivity()
            java.lang.String r0 = "fragment.requireActivity()"
            m0.n.b.i.d(r2, r0)
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.ActivityStarter.<init>(androidx.fragment.app.Fragment, java.lang.Class, int, java.lang.Integer):void");
    }
}
