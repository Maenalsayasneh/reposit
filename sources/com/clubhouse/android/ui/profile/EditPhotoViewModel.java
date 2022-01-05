package com.clubhouse.android.ui.profile;

import android.content.Context;
import com.clubhouse.android.data.repos.OnboardingRepo;
import com.clubhouse.android.shared.auth.UserManager;
import i0.b.b.b;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.u.f4;
import i0.e.b.g3.u.h5;
import i0.e.b.g3.u.t3;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: EditPhotoViewModel.kt */
public final class EditPhotoViewModel extends i0.e.b.a3.b.a<f4> {
    public static final /* synthetic */ int m = 0;
    public final OnboardingRepo n;
    public final Context o;
    public UserManager p;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.EditPhotoViewModel$1", f = "EditPhotoViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.EditPhotoViewModel$1  reason: invalid class name */
    /* compiled from: EditPhotoViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ EditPhotoViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final c cVar = (c) this.c;
            if (cVar instanceof h5) {
                EditPhotoViewModel editPhotoViewModel = this.d;
                Objects.requireNonNull(editPhotoViewModel);
                editPhotoViewModel.n(new EditPhotoViewModel$savePhoto$1(editPhotoViewModel));
            } else if (cVar instanceof t3) {
                EditPhotoViewModel editPhotoViewModel2 = this.d;
                AnonymousClass1 r1 = new l<f4, f4>() {
                    public Object invoke(Object obj) {
                        f4 f4Var = (f4) obj;
                        i.e(f4Var, "$this$setState");
                        return f4.copy$default(f4Var, (b) null, ((t3) cVar).a, (String) null, 5, (Object) null);
                    }
                };
                int i = EditPhotoViewModel.m;
                editPhotoViewModel2.m(r1);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoViewModel(f4 f4Var, OnboardingRepo onboardingRepo, Context context, UserManager userManager) {
        super(f4Var);
        i.e(f4Var, "initialState");
        i.e(onboardingRepo, "repo");
        i.e(context, "applicationContext");
        i.e(userManager, "userManager");
        this.n = onboardingRepo;
        this.o = context;
        this.p = userManager;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: EditPhotoViewModel.kt */
    public static final class a implements v<EditPhotoViewModel, f4> {
        public final /* synthetic */ i0.e.b.c3.h.c<EditPhotoViewModel, f4> a = new i0.e.b.c3.h.c<>(EditPhotoViewModel.class);

        public a() {
        }

        public EditPhotoViewModel create(j0 j0Var, f4 f4Var) {
            i.e(j0Var, "viewModelContext");
            i.e(f4Var, "state");
            return this.a.create(j0Var, f4Var);
        }

        public f4 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
