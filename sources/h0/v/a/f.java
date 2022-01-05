package h0.v.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultItemAnimator */
public class f extends y {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    public ArrayList<RecyclerView.b0> mAddAnimations = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.b0>> mAdditionsList = new ArrayList<>();
    public ArrayList<RecyclerView.b0> mChangeAnimations = new ArrayList<>();
    public ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    public ArrayList<RecyclerView.b0> mMoveAnimations = new ArrayList<>();
    public ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    private ArrayList<RecyclerView.b0> mPendingAdditions = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<RecyclerView.b0> mPendingRemovals = new ArrayList<>();
    public ArrayList<RecyclerView.b0> mRemoveAnimations = new ArrayList<>();

    /* compiled from: DefaultItemAnimator */
    public class a implements Runnable {
        public final /* synthetic */ ArrayList c;

        public a(ArrayList arrayList) {
            this.c = arrayList;
        }

        public void run() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                f.this.animateMoveImpl(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e);
            }
            this.c.clear();
            f.this.mMovesList.remove(this.c);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class b implements Runnable {
        public final /* synthetic */ ArrayList c;

        public b(ArrayList arrayList) {
            this.c = arrayList;
        }

        public void run() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                f.this.animateChangeImpl((i) it.next());
            }
            this.c.clear();
            f.this.mChangesList.remove(this.c);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class c implements Runnable {
        public final /* synthetic */ ArrayList c;

        public c(ArrayList arrayList) {
            this.c = arrayList;
        }

        public void run() {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                f.this.animateAddImpl((RecyclerView.b0) it.next());
            }
            this.c.clear();
            f.this.mAdditionsList.remove(this.c);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.b0 a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public d(RecyclerView.b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = b0Var;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            f.this.dispatchRemoveFinished(this.a);
            f.this.mRemoveAnimations.remove(this.a);
            f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            f.this.dispatchRemoveStarting(this.a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.b0 a;
        public final /* synthetic */ View b;
        public final /* synthetic */ ViewPropertyAnimator c;

        public e(RecyclerView.b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = b0Var;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.c.setListener((Animator.AnimatorListener) null);
            f.this.dispatchAddFinished(this.a);
            f.this.mAddAnimations.remove(this.a);
            f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            f.this.dispatchAddStarting(this.a);
        }
    }

    /* renamed from: h0.v.a.f$f  reason: collision with other inner class name */
    /* compiled from: DefaultItemAnimator */
    public class C0071f extends AnimatorListenerAdapter {
        public final /* synthetic */ RecyclerView.b0 a;
        public final /* synthetic */ int b;
        public final /* synthetic */ View c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ViewPropertyAnimator e;

        public C0071f(RecyclerView.b0 b0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = b0Var;
            this.b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.e.setListener((Animator.AnimatorListener) null);
            f.this.dispatchMoveFinished(this.a);
            f.this.mMoveAnimations.remove(this.a);
            f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            f.this.dispatchMoveStarting(this.a);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class g extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            f.this.dispatchChangeFinished(this.a.a, true);
            f.this.mChangeAnimations.remove(this.a.a);
            f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            f.this.dispatchChangeStarting(this.a.a, true);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ i a;
        public final /* synthetic */ ViewPropertyAnimator b;
        public final /* synthetic */ View c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.b.setListener((Animator.AnimatorListener) null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            f.this.dispatchChangeFinished(this.a.b, false);
            f.this.mChangeAnimations.remove(this.a.b);
            f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            f.this.dispatchChangeStarting(this.a.b, false);
        }
    }

    /* compiled from: DefaultItemAnimator */
    public static class i {
        public RecyclerView.b0 a;
        public RecyclerView.b0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        public i(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i, int i2, int i3, int i4) {
            this.a = b0Var;
            this.b = b0Var2;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ChangeInfo{oldHolder=");
            P0.append(this.a);
            P0.append(", newHolder=");
            P0.append(this.b);
            P0.append(", fromX=");
            P0.append(this.c);
            P0.append(", fromY=");
            P0.append(this.d);
            P0.append(", toX=");
            P0.append(this.e);
            P0.append(", toY=");
            return i0.d.a.a.a.s0(P0, this.f, '}');
        }
    }

    /* compiled from: DefaultItemAnimator */
    public static class j {
        public RecyclerView.b0 a;
        public int b;
        public int c;
        public int d;
        public int e;

        public j(RecyclerView.b0 b0Var, int i, int i2, int i3, int i4) {
            this.a = b0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void animateRemoveImpl(RecyclerView.b0 b0Var) {
        View view = b0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(b0Var);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(b0Var, animate, view)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.b0 b0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, b0Var) && iVar.a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.b0 b0Var = iVar.a;
        if (b0Var != null) {
            endChangeAnimationIfNecessary(iVar, b0Var);
        }
        RecyclerView.b0 b0Var2 = iVar.b;
        if (b0Var2 != null) {
            endChangeAnimationIfNecessary(iVar, b0Var2);
        }
    }

    private void resetAnimation(RecyclerView.b0 b0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        b0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(b0Var);
    }

    public boolean animateAdd(RecyclerView.b0 b0Var) {
        resetAnimation(b0Var);
        b0Var.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(b0Var);
        return true;
    }

    public void animateAddImpl(RecyclerView.b0 b0Var) {
        View view = b0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(b0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(b0Var, view, animate)).start();
    }

    public boolean animateChange(RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2, int i2, int i3, int i4, int i5) {
        if (b0Var == b0Var2) {
            return animateMove(b0Var, i2, i3, i4, i5);
        }
        float translationX = b0Var.itemView.getTranslationX();
        float translationY = b0Var.itemView.getTranslationY();
        float alpha = b0Var.itemView.getAlpha();
        resetAnimation(b0Var);
        int i6 = (int) (((float) (i4 - i2)) - translationX);
        int i7 = (int) (((float) (i5 - i3)) - translationY);
        b0Var.itemView.setTranslationX(translationX);
        b0Var.itemView.setTranslationY(translationY);
        b0Var.itemView.setAlpha(alpha);
        if (b0Var2 != null) {
            resetAnimation(b0Var2);
            b0Var2.itemView.setTranslationX((float) (-i6));
            b0Var2.itemView.setTranslationY((float) (-i7));
            b0Var2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new i(b0Var, b0Var2, i2, i3, i4, i5));
        return true;
    }

    public void animateChangeImpl(i iVar) {
        View view;
        RecyclerView.b0 b0Var = iVar.a;
        View view2 = null;
        if (b0Var == null) {
            view = null;
        } else {
            view = b0Var.itemView;
        }
        RecyclerView.b0 b0Var2 = iVar.b;
        if (b0Var2 != null) {
            view2 = b0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.a);
            duration.translationX((float) (iVar.e - iVar.c));
            duration.translationY((float) (iVar.f - iVar.d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public boolean animateMove(RecyclerView.b0 b0Var, int i2, int i3, int i4, int i5) {
        View view = b0Var.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) b0Var.itemView.getTranslationY());
        resetAnimation(b0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            dispatchMoveFinished(b0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.mPendingMoves.add(new j(b0Var, translationX, translationY, i4, i5));
        return true;
    }

    public void animateMoveImpl(RecyclerView.b0 b0Var, int i2, int i3, int i4, int i5) {
        View view = b0Var.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(b0Var);
        animate.setDuration(getMoveDuration()).setListener(new C0071f(b0Var, i6, view, i7, animate)).start();
    }

    public boolean animateRemove(RecyclerView.b0 b0Var) {
        resetAnimation(b0Var);
        this.mPendingRemovals.add(b0Var);
        return true;
    }

    public boolean canReuseUpdatedViewHolder(RecyclerView.b0 b0Var, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(b0Var, list);
    }

    public void cancelAll(List<RecyclerView.b0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public void endAnimation(RecyclerView.b0 b0Var) {
        View view = b0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(b0Var);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, b0Var);
        if (this.mPendingRemovals.remove(b0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(b0Var);
        }
        if (this.mPendingAdditions.remove(b0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(b0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, b0Var);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(b0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(b0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(b0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(b0Var);
        this.mAddAnimations.remove(b0Var);
        this.mChangeAnimations.remove(b0Var);
        this.mMoveAnimations.remove(b0Var);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.b0 b0Var = this.mPendingAdditions.get(size3);
            b0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(b0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.b0 b0Var2 = (RecyclerView.b0) arrayList2.get(size8);
                    b0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(b0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        return !this.mPendingAdditions.isEmpty() || !this.mPendingChanges.isEmpty() || !this.mPendingMoves.isEmpty() || !this.mPendingRemovals.isEmpty() || !this.mMoveAnimations.isEmpty() || !this.mRemoveAnimations.isEmpty() || !this.mAddAnimations.isEmpty() || !this.mChangeAnimations.isEmpty() || !this.mMovesList.isEmpty() || !this.mAdditionsList.isEmpty() || !this.mChangesList.isEmpty();
    }

    public void runPendingAnimations() {
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.b0> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                a aVar = new a(arrayList);
                if (z) {
                    View view = ((j) arrayList.get(0)).a.itemView;
                    long removeDuration = getRemoveDuration();
                    AtomicInteger atomicInteger = q.a;
                    view.postOnAnimationDelayed(aVar, removeDuration);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    View view2 = ((i) arrayList2.get(0)).a.itemView;
                    long removeDuration2 = getRemoveDuration();
                    AtomicInteger atomicInteger2 = q.a;
                    view2.postOnAnimationDelayed(bVar, removeDuration2);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                c cVar = new c(arrayList3);
                if (z || z2 || z3) {
                    long j2 = 0;
                    long removeDuration3 = z ? getRemoveDuration() : 0;
                    long moveDuration = z2 ? getMoveDuration() : 0;
                    if (z3) {
                        j2 = getChangeDuration();
                    }
                    View view3 = ((RecyclerView.b0) arrayList3.get(0)).itemView;
                    AtomicInteger atomicInteger3 = q.a;
                    view3.postOnAnimationDelayed(cVar, Math.max(moveDuration, j2) + removeDuration3);
                    return;
                }
                cVar.run();
            }
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.b0 b0Var) {
        boolean z = false;
        if (iVar.b == b0Var) {
            iVar.b = null;
        } else if (iVar.a != b0Var) {
            return false;
        } else {
            iVar.a = null;
            z = true;
        }
        b0Var.itemView.setAlpha(1.0f);
        b0Var.itemView.setTranslationX(0.0f);
        b0Var.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(b0Var, z);
        return true;
    }
}
