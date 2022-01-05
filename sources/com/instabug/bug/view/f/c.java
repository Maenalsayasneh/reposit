package com.instabug.bug.view.f;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.instabug.bug.R;
import com.instabug.library.annotation.AnnotationLayout;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.BitmapUtils;
import h0.i.i.q;
import i0.j.b.t.e;
import i0.j.b.t.g.b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AnnotationFragment */
public class c extends InstabugBaseFragment<b> implements i0.j.b.t.g.a {
    public e Y1;
    public Bitmap Z1;
    public String c;
    public String d = "";
    public Uri q;
    public AnnotationLayout x;
    public a y;

    /* compiled from: AnnotationFragment */
    public interface a {
        void O(Bitmap bitmap, Uri uri);
    }

    public int getLayout() {
        return R.layout.ibg_bug_fragment_annotation;
    }

    public void initViews(View view, Bundle bundle) {
        Bitmap bitmap;
        WeakReference<V> weakReference;
        i0.j.b.t.g.a aVar;
        AnnotationLayout annotationLayout = (AnnotationLayout) findViewById(com.instabug.library.R.id.annotationLayout);
        this.x = annotationLayout;
        if (!(annotationLayout == null || getArguments() == null || getArguments().getString("name") == null)) {
            View findViewById = this.x.findViewById(R.id.instabug_annotation_image);
            String string = getArguments().getString("name");
            AtomicInteger atomicInteger = q.a;
            findViewById.setTransitionName(string);
        }
        P p = this.presenter;
        if (!(p == null || (bitmap = this.Z1) == null || (weakReference = ((b) p).view) == null || (aVar = (i0.j.b.t.g.a) weakReference.get()) == null)) {
            aVar.m(bitmap);
        }
        startPostponedEnterTransition();
    }

    public void m(Bitmap bitmap) {
        AnnotationLayout annotationLayout = this.x;
        if (annotationLayout != null) {
            annotationLayout.setBitmap(bitmap);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.y = (a) getActivity();
        if (getActivity() instanceof e) {
            try {
                this.Y1 = (e) getActivity();
            } catch (Exception unused) {
                throw new RuntimeException("Must implement AnnotationFragment.Callbacks ");
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Uri uri;
        postponeEnterTransition();
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        if (getContext() != null) {
            setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(17760257));
            setSharedElementReturnTransition(TransitionInflater.from(getContext()).inflateTransition(17760257));
        }
        if (getArguments() != null) {
            this.c = getArguments().getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
            this.q = (Uri) getArguments().getParcelable("image_uri");
        }
        e eVar = this.Y1;
        if (eVar != null) {
            this.d = eVar.l();
            String str = this.c;
            if (str != null) {
                this.Y1.f(str);
            }
            this.Y1.g();
        }
        this.presenter = new b(this);
        if (getActivity() != null && (uri = this.q) != null && uri.getPath() != null) {
            BitmapUtils.compressBitmapAndSave(getActivity(), new File(this.q.getPath()));
            this.Z1 = BitmapUtils.getBitmapFromUri(this.q);
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(R.menu.ibg_bug_instabug_bug_annoataion, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    public void onDestroy() {
        e eVar = this.Y1;
        if (eVar != null) {
            eVar.g();
            this.Y1.f(this.d);
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        a aVar;
        AnnotationLayout annotationLayout;
        if (menuItem.getItemId() == R.id.instabug_bugreporting_annotaion_done) {
            if (!(getActivity() == null || (aVar = this.y) == null || (annotationLayout = this.x) == null)) {
                if (this.q != null) {
                    aVar.O(annotationLayout.getAnnotatedBitmap(), this.q);
                }
                h0.o.a.a aVar2 = new h0.o.a.a(getActivity().getSupportFragmentManager());
                aVar2.n(this);
                aVar2.h();
                FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
                supportFragmentManager.A(new FragmentManager.n("annotation_fragment_for_bug", -1, 1), false);
            }
            return true;
        }
        if (menuItem.getItemId() == 16908332 && getActivity() != null) {
            getActivity().onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
