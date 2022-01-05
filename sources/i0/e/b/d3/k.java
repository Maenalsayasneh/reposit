package i0.e.b.d3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.R;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.extensions.ViewExtensionsKt$debouncedTextChanges$1;
import com.clubhouse.android.extensions.ViewExtensionsKt$debouncedTextChanges$2;
import com.clubhouse.android.extensions.ViewExtensionsKt$setDebouncedOnClickListener$1;
import com.clubhouse.android.extensions.ViewExtensionsKt$textChanges$1;
import com.clubhouse.android.extensions.ViewExtensionsKt$textChanges$2;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.android.user.model.UserSelf;
import com.google.android.material.tabs.TabLayout;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;
import h0.b0.v;
import h0.i.b.d.h;
import h0.q.r;
import h0.v.a.w;
import i0.b.a.o;
import i0.e.b.b3.a.a.f.b;
import i0.o.a.b0;
import i0.o.a.q;
import i0.o.a.s;
import i0.o.a.t;
import i0.o.a.u;
import i0.o.a.x;
import java.util.List;
import java.util.Objects;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import m0.l.c;
import m0.l.e;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;
import n0.a.f0;
import n0.a.g2.d;

/* compiled from: ImageExtensions.kt */
public final class k {
    public static final ViewGroup.MarginLayoutParams A(View view) {
        i.e(view, "<this>");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return (ViewGroup.MarginLayoutParams) layoutParams;
        }
        throw new RuntimeException("Unsupported LayoutParams!");
    }

    public static final void B(EditText editText, a<m0.i> aVar) {
        i.e(editText, "<this>");
        i.e(aVar, "f");
        editText.setOnEditorActionListener(new d(aVar));
    }

    public static final void C(TabLayout tabLayout, l<? super TabLayout.g, m0.i> lVar) {
        i.e(tabLayout, "<this>");
        i.e(lVar, "f");
        m mVar = new m(lVar);
        if (!tabLayout.B2.contains(mVar)) {
            tabLayout.B2.add(mVar);
        }
    }

    public static final void D(EpoxyRecyclerView epoxyRecyclerView, Fragment fragment, l<? super o, m0.i> lVar) {
        i.e(epoxyRecyclerView, "<this>");
        i.e(fragment, "fragment");
        i.e(lVar, "f");
        o oVar = new o(fragment, epoxyRecyclerView, lVar);
        i.e(oVar, "callback");
        o oVar2 = epoxyRecyclerView.q;
        if (!(oVar2 instanceof EpoxyRecyclerView.ModelBuilderCallbackController)) {
            oVar2 = null;
        }
        EpoxyRecyclerView.ModelBuilderCallbackController modelBuilderCallbackController = (EpoxyRecyclerView.ModelBuilderCallbackController) oVar2;
        if (modelBuilderCallbackController == null) {
            modelBuilderCallbackController = new EpoxyRecyclerView.ModelBuilderCallbackController();
            epoxyRecyclerView.setController(modelBuilderCallbackController);
        }
        modelBuilderCallbackController.setCallback(oVar);
        modelBuilderCallbackController.requestModelBuild();
    }

    public static final void E(EpoxyRecyclerView epoxyRecyclerView, l<? super o, m0.i> lVar) {
        i.e(epoxyRecyclerView, "<this>");
        i.e(lVar, "buildModels");
        v0.a.a.d.i(i.k("withModels RecyclerView: ", epoxyRecyclerView.getResources().getResourceEntryName(epoxyRecyclerView.getId())), new Object[0]);
        i.e(lVar, "buildModels");
        o oVar = epoxyRecyclerView.q;
        if (!(oVar instanceof EpoxyRecyclerView.WithModelsController)) {
            oVar = null;
        }
        EpoxyRecyclerView.WithModelsController withModelsController = (EpoxyRecyclerView.WithModelsController) oVar;
        if (withModelsController == null) {
            withModelsController = new EpoxyRecyclerView.WithModelsController();
            epoxyRecyclerView.setController(withModelsController);
        }
        withModelsController.setCallback(lVar);
        withModelsController.requestModelBuild();
    }

    public static final void F(ScrollView scrollView) {
        i.e(scrollView, "<this>");
        if (scrollView.getScrollY() > 0) {
            i iVar = new i(scrollView);
            Resources resources = scrollView.getResources();
            i.d(resources, "resources");
            scrollView.postDelayed(iVar, v.Y1(resources));
        }
    }

    public static final void G(View view, int i) {
        i.e(view, "<this>");
        ViewGroup.MarginLayoutParams A = A(view);
        A.bottomMargin = i;
        view.setLayoutParams(A);
    }

    public static final void H(View view, f0 f0Var, View.OnClickListener onClickListener) {
        i.e(view, "<this>");
        i.e(f0Var, "scope");
        m0.r.t.a.r.m.a1.a.E2(f0Var, (e) null, (CoroutineStart) null, new ViewExtensionsKt$setDebouncedOnClickListener$1(view, f0Var, onClickListener, (c<? super ViewExtensionsKt$setDebouncedOnClickListener$1>) null), 3, (Object) null);
    }

    public static final void I(View view, int i) {
        i.e(view, "<this>");
        ViewGroup.MarginLayoutParams A = A(view);
        A.topMargin = i;
        view.setLayoutParams(A);
    }

    public static final void J(MenuItem menuItem) {
        i.e(menuItem, "<this>");
        menuItem.setVisible(true);
    }

    public static final void K(View view) {
        i.e(view, "<this>");
        view.setVisibility(0);
    }

    public static final void L(View view, Boolean bool) {
        i.e(view, "<this>");
        if (i.a(bool, Boolean.TRUE)) {
            K(view);
        } else {
            p(view);
        }
    }

    public static final d<String> M(EditText editText) {
        i.e(editText, "<this>");
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new ViewExtensionsKt$textChanges$2(editText, (c<? super ViewExtensionsKt$textChanges$2>) null), m0.r.t.a.r.m.a1.a.k0(new ViewExtensionsKt$textChanges$1(editText, (c<? super ViewExtensionsKt$textChanges$1>) null)));
    }

    public static final void a(TextView textView) {
        i.e(textView, "<this>");
        SpannableStringBuilder append = new SpannableStringBuilder(textView.getText()).append("  ");
        append.setSpan(new ImageSpan(textView.getContext(), R.drawable.ic_club_house_alignment, 0), textView.getText().length() + 1, textView.getText().length() + 2, 18);
        textView.setText(append);
    }

    public static final void b(ImageView imageView, Integer num) {
        m0.i iVar;
        i.e(imageView, "<this>");
        int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(com.clubhouse.core.ui.R.dimen.active_badge_padding);
        if (num == null) {
            iVar = null;
        } else {
            long intValue = (long) num.intValue();
            if (intValue <= b.a) {
                imageView.setBackgroundResource(0);
                c(imageView, Integer.valueOf(com.clubhouse.core.ui.R.drawable.ic_online_dot), true, dimensionPixelSize);
            } else if (intValue <= b.b) {
                imageView.setBackgroundResource(0);
                c(imageView, Integer.valueOf(com.clubhouse.core.ui.R.drawable.ic_active_dot), true, dimensionPixelSize);
            } else {
                d(imageView, (Integer) null, false, 0, 4);
            }
            iVar = m0.i.a;
        }
        if (iVar == null) {
            d(imageView, (Integer) null, false, 0, 4);
        }
    }

    public static final void c(ImageView imageView, Integer num, boolean z, int i) {
        i.e(imageView, "<this>");
        int i2 = 0;
        if (!z || num == null) {
            imageView.setImageDrawable((Drawable) null);
            imageView.setPadding(0, 0, 0, 0);
            i2 = 8;
        } else {
            imageView.setImageResource(num.intValue());
            imageView.setPadding(i, i, i, i);
        }
        imageView.setVisibility(i2);
    }

    public static /* synthetic */ void d(ImageView imageView, Integer num, boolean z, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        c(imageView, num, z, i);
    }

    public static void e(TextView textView, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        i.e(textView, "<this>");
        textView.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    public static final d<String> f(EditText editText) {
        i.e(editText, "<this>");
        return m0.r.t.a.r.m.a1.a.X0(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new ViewExtensionsKt$debouncedTextChanges$2(editText, (c<? super ViewExtensionsKt$debouncedTextChanges$2>) null), m0.r.t.a.r.m.a1.a.k0(new ViewExtensionsKt$debouncedTextChanges$1(editText, (c<? super ViewExtensionsKt$debouncedTextChanges$1>) null))), 400);
    }

    public static final void g(EditText editText) {
        i.e(editText, "<this>");
        editText.setImeOptions(6);
        editText.setRawInputType(147456);
    }

    public static final void h(View view) {
        i.e(view, "<this>");
        view.setAlpha(0.25f);
    }

    public static final <T extends RecyclerView> void i(T t) {
        i.e(t, "<this>");
        t.setOnFlingListener((RecyclerView.q) null);
        new w().a(t);
    }

    public static final void j(View view) {
        i.e(view, "<this>");
        view.setAlpha(1.0f);
    }

    public static final void k(View view, Boolean bool) {
        i.e(view, "<this>");
        if (i.a(bool, Boolean.TRUE)) {
            j(view);
        } else {
            h(view);
        }
    }

    public static final void l(View view) {
        i.e(view, "<this>");
        view.clearAnimation();
        if (view.getVisibility() != 0) {
            view.setAlpha(0.0f);
            view.setVisibility(0);
            view.animate().alpha(1.0f).start();
        }
    }

    public static final void m(View view) {
        i.e(view, "<this>");
        view.clearAnimation();
        if (view.getVisibility() != 8) {
            view.animate().alpha(0.0f).withEndAction(new f(view)).start();
        }
    }

    public static final Bitmap n(String str) {
        Bitmap bitmap;
        String str2 = str;
        i.e(str2, "imageUrl");
        if (Picasso.b == null) {
            synchronized (Picasso.class) {
                if (Picasso.b == null) {
                    Context context = PicassoProvider.c;
                    if (context != null) {
                        Context applicationContext = context.getApplicationContext();
                        q qVar = new q(applicationContext);
                        i0.o.a.o oVar = new i0.o.a.o(applicationContext);
                        s sVar = new s();
                        Picasso.d dVar = Picasso.d.a;
                        x xVar = new x(oVar);
                        Picasso.b = new Picasso(applicationContext, new i0.o.a.i(applicationContext, sVar, Picasso.a, qVar, oVar, xVar), oVar, (Picasso.c) null, dVar, (List<i0.o.a.v>) null, xVar, (Bitmap.Config) null, false, false);
                    } else {
                        throw new IllegalStateException("context == null");
                    }
                }
            }
        }
        u e = Picasso.b.e(str2);
        long nanoTime = System.nanoTime();
        if (b0.e()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        } else if (!e.d) {
            t.b bVar = e.c;
            if (!((bVar.a == null && bVar.b == 0) ? false : true)) {
                bitmap = null;
            } else {
                t a = e.a(nanoTime);
                i0.o.a.l lVar = new i0.o.a.l(e.b, a, 0, 0, (Object) null, b0.a(a, new StringBuilder()));
                Picasso picasso = e.b;
                bitmap = i0.o.a.c.e(picasso, picasso.h, picasso.i, picasso.j, lVar).f();
            }
            if (bitmap == null) {
                return null;
            }
            i.e(bitmap, "<this>");
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            float f = (float) min;
            canvas.drawPath(AvatarView.c.b(f, f, 0.68f, 0.0f), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, ((float) (min - bitmap.getWidth())) / 2.0f, ((float) (min - bitmap.getHeight())) / 2.0f, paint);
            i.d(createBitmap, "dstBitmap");
            return createBitmap;
        } else {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
    }

    public static final void o(MenuItem menuItem) {
        i.e(menuItem, "<this>");
        menuItem.setVisible(false);
    }

    public static final void p(View view) {
        i.e(view, "<this>");
        view.setVisibility(8);
    }

    public static final void q(View view, Boolean bool) {
        i.e(view, "<this>");
        if (i.a(bool, Boolean.TRUE)) {
            p(view);
        } else {
            K(view);
        }
    }

    public static final void r(View view) {
        i.e(view, "<this>");
        view.setVisibility(4);
    }

    public static final boolean s(Fragment fragment) {
        i.e(fragment, "<this>");
        return fragment.getView() != null && ((r) fragment.getViewLifecycleOwner().getLifecycle()).c.isAtLeast(Lifecycle.State.INITIALIZED);
    }

    public static final void t(AvatarView avatarView, Club club) {
        i.e(avatarView, "<this>");
        String str = null;
        String b = club == null ? null : club.b();
        if (club != null) {
            str = club.getName();
        }
        v.R0(avatarView, b, str, 0.88f);
    }

    public static final void u(AvatarView avatarView, User user) {
        i.e(avatarView, "<this>");
        String str = null;
        String b = user == null ? null : user.b();
        if (user != null) {
            str = user.getName();
        }
        v.S0(avatarView, b, str, 0.0f, 4);
    }

    public static final void v(AvatarView avatarView, UserSelf userSelf) {
        i.e(avatarView, "<this>");
        v.S0(avatarView, userSelf.d, userSelf.b, 0.0f, 4);
    }

    public static final SpannableString w(CharSequence charSequence, Context context, int i, int i2) {
        Typeface a;
        i.e(charSequence, "<this>");
        i.e(context, "context");
        SpannableString spannableString = new SpannableString(charSequence);
        if (i > -1 && i2 > i && (a = h.a(context, R.font.nunito_bold)) != null) {
            spannableString.setSpan(new i0.e.b.g3.z.a(a), i, i2, 33);
        }
        return spannableString;
    }

    public static final SpannableString x(CharSequence charSequence, String str, Context context) {
        i.e(charSequence, "<this>");
        i.e(str, "str");
        i.e(context, "context");
        int m = StringsKt__IndentKt.m(charSequence, str, 0, false, 6);
        return w(charSequence, context, m, str.length() + m);
    }

    public static final void y(TextView textView, String str) {
        i.e(textView, "<this>");
        i.e(str, "str");
        CharSequence text = textView.getText();
        i.d(text, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        Context context = textView.getContext();
        i.d(context, "context");
        textView.setText(x(text, str, context));
    }

    public static final void z(TextView textView, String str) {
        i.e(textView, "<this>");
        i.e(str, "str");
        CharSequence text = textView.getText();
        i.d(text, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        int m = StringsKt__IndentKt.m(text, str, 0, false, 6);
        int length = str.length() + m;
        i.e(textView, "<this>");
        if (m > -1 && length > m) {
            SpannableString spannableString = new SpannableString(textView.getText());
            Typeface a = h.a(textView.getContext(), R.font.nunito_italic);
            if (a != null) {
                spannableString.setSpan(new i0.e.b.g3.z.a(a), m, length, 33);
            }
            textView.setText(spannableString);
        }
    }
}
