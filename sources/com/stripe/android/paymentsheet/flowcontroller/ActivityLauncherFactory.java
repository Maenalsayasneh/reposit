package com.stripe.android.paymentsheet.flowcontroller;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import h0.a.f.b;
import h0.a.f.d.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&¢\u0006\u0004\b\t\u0010\n\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "", "I", "O", "Lh0/a/f/d/a;", "contract", "Lh0/a/f/a;", "callback", "Lh0/a/f/b;", "create", "(Lh0/a/f/d/a;Lh0/a/f/a;)Lh0/a/f/b;", "<init>", "()V", "ActivityHost", "FragmentHost", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$ActivityHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$FragmentHost;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ActivityLauncherFactory.kt */
public abstract class ActivityLauncherFactory {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$ActivityHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "I", "O", "Lh0/a/f/d/a;", "contract", "Lh0/a/f/a;", "callback", "Lh0/a/f/b;", "create", "(Lh0/a/f/d/a;Lh0/a/f/a;)Lh0/a/f/b;", "Landroidx/activity/ComponentActivity;", "activity", "Landroidx/activity/ComponentActivity;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ActivityLauncherFactory.kt */
    public static final class ActivityHost extends ActivityLauncherFactory {
        private final ComponentActivity activity;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ActivityHost(ComponentActivity componentActivity) {
            super((f) null);
            i.e(componentActivity, "activity");
            this.activity = componentActivity;
        }

        public <I, O> b<I> create(a<I, O> aVar, h0.a.f.a<O> aVar2) {
            i.e(aVar, "contract");
            i.e(aVar2, "callback");
            b<I> registerForActivityResult = this.activity.registerForActivityResult(aVar, aVar2);
            i.d(registerForActivityResult, "activity.registerForActi…   callback\n            )");
            return registerForActivityResult;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$FragmentHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "I", "O", "Lh0/a/f/d/a;", "contract", "Lh0/a/f/a;", "callback", "Lh0/a/f/b;", "create", "(Lh0/a/f/d/a;Lh0/a/f/a;)Lh0/a/f/b;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ActivityLauncherFactory.kt */
    public static final class FragmentHost extends ActivityLauncherFactory {
        private final Fragment fragment;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FragmentHost(Fragment fragment2) {
            super((f) null);
            i.e(fragment2, "fragment");
            this.fragment = fragment2;
        }

        public <I, O> b<I> create(a<I, O> aVar, h0.a.f.a<O> aVar2) {
            i.e(aVar, "contract");
            i.e(aVar2, "callback");
            b<I> registerForActivityResult = this.fragment.registerForActivityResult(aVar, aVar2);
            i.d(registerForActivityResult, "fragment.registerForActi…   callback\n            )");
            return registerForActivityResult;
        }
    }

    private ActivityLauncherFactory() {
    }

    public abstract <I, O> b<I> create(a<I, O> aVar, h0.a.f.a<O> aVar2);

    public /* synthetic */ ActivityLauncherFactory(f fVar) {
        this();
    }
}
