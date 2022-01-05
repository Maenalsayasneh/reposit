package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import h0.o.a.k;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarter;", "ArgsType", "", "args", "Lm0/i;", "start", "(Ljava/lang/Object;)V", "Host", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AuthActivityStarter.kt */
public interface AuthActivityStarter<ArgsType> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB%\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\u000b\u001a\u00020\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarter$Host;", "", "Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "extras", "", "requestCode", "Lm0/i;", "startActivityForResult$payments_core_release", "(Ljava/lang/Class;Landroid/os/Bundle;I)V", "startActivityForResult", "Landroidx/fragment/app/Fragment;", "getFragment$payments_core_release", "()Landroidx/fragment/app/Fragment;", "fragment", "Ljava/lang/ref/WeakReference;", "fragmentRef", "Ljava/lang/ref/WeakReference;", "statusBarColor", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "Landroid/app/Activity;", "getActivity$payments_core_release", "()Landroid/app/Activity;", "activity", "activityRef", "<init>", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Ljava/lang/Integer;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AuthActivityStarter.kt */
    public static final class Host {
        public static final Companion Companion = new Companion((f) null);
        private final WeakReference<Activity> activityRef;
        private final WeakReference<Fragment> fragmentRef;
        private final Integer statusBarColor;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0005\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarter$Host$Companion;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/stripe/android/view/AuthActivityStarter$Host;", "create$payments_core_release", "(Landroidx/fragment/app/Fragment;)Lcom/stripe/android/view/AuthActivityStarter$Host;", "create", "Landroid/app/Activity;", "activity", "(Landroid/app/Activity;)Lcom/stripe/android/view/AuthActivityStarter$Host;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AuthActivityStarter.kt */
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Host create$payments_core_release(Fragment fragment) {
                i.e(fragment, "fragment");
                k requireActivity = fragment.requireActivity();
                i.d(requireActivity, "fragment.requireActivity()");
                Window window = requireActivity.getWindow();
                return new Host(requireActivity, fragment, window != null ? Integer.valueOf(window.getStatusBarColor()) : null);
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final /* synthetic */ Host create$payments_core_release(Activity activity) {
                i.e(activity, "activity");
                Window window = activity.getWindow();
                return new Host(activity, (Fragment) null, window != null ? Integer.valueOf(window.getStatusBarColor()) : null);
            }
        }

        public Host(Activity activity, Fragment fragment, Integer num) {
            i.e(activity, "activity");
            this.statusBarColor = num;
            this.activityRef = new WeakReference<>(activity);
            this.fragmentRef = fragment != null ? new WeakReference<>(fragment) : null;
        }

        public final Activity getActivity$payments_core_release() {
            return (Activity) this.activityRef.get();
        }

        public final Fragment getFragment$payments_core_release() {
            WeakReference<Fragment> weakReference = this.fragmentRef;
            if (weakReference != null) {
                return (Fragment) weakReference.get();
            }
            return null;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public final void startActivityForResult$payments_core_release(Class<?> cls, Bundle bundle, int i) {
            i.e(cls, "target");
            i.e(bundle, NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
            Activity activity = (Activity) this.activityRef.get();
            if (activity != null) {
                i.d(activity, "activityRef.get() ?: return");
                Intent putExtras = new Intent(activity, cls).putExtras(bundle);
                i.d(putExtras, "Intent(activity, target).putExtras(extras)");
                WeakReference<Fragment> weakReference = this.fragmentRef;
                if (weakReference != null) {
                    Fragment fragment = (Fragment) weakReference.get();
                    if (fragment != null && fragment.isAdded()) {
                        fragment.startActivityForResult(putExtras, i);
                        return;
                    }
                    return;
                }
                activity.startActivityForResult(putExtras, i);
            }
        }
    }

    void start(ArgsType argstype);
}
