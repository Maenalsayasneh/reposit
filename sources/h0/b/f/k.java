package h0.b.f;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.core.R;
import g0.a.b.b.a;
import h0.i.i.c;
import h0.i.i.h0.b;
import h0.i.i.h0.c;
import h0.i.i.o;
import h0.i.i.q;
import h0.i.j.e;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatEditText */
public class k extends EditText implements o {
    private final e mBackgroundTintHelper;
    private final e mDefaultOnReceiveContentListener;
    private final u mTextClassifierHelper;
    private final v mTextHelper;

    public k(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        u uVar;
        if (Build.VERSION.SDK_INT >= 28 || (uVar = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return uVar.a();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArr;
        InputConnection cVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.g(this, onCreateInputConnection, editorInfo);
        a.j0(onCreateInputConnection, editorInfo, this);
        AtomicInteger atomicInteger = q.a;
        String[] strArr2 = (String[]) getTag(R.id.tag_on_receive_content_mime_types);
        if (onCreateInputConnection == null || strArr2 == null) {
            return onCreateInputConnection;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 25) {
            editorInfo.contentMimeTypes = strArr2;
        } else {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr2);
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr2);
        }
        r rVar = new r(this);
        if (editorInfo != null) {
            if (i >= 25) {
                cVar = new b(onCreateInputConnection, false, rVar);
            } else {
                if (i >= 25) {
                    strArr = editorInfo.contentMimeTypes;
                    if (strArr == null) {
                        strArr = h0.i.i.h0.a.a;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle == null) {
                        strArr = h0.i.i.h0.a.a;
                    } else {
                        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        strArr = stringArray == null ? editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES") : stringArray;
                        if (strArr == null) {
                            strArr = h0.i.i.h0.a.a;
                        }
                    }
                }
                if (strArr.length == 0) {
                    return onCreateInputConnection;
                }
                cVar = new c(onCreateInputConnection, false, rVar);
            }
            return cVar;
        }
        throw new IllegalArgumentException("editorInfo must be non-null");
    }

    /* JADX INFO: finally extract failed */
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (dragEvent.getLocalState() == null) {
            AtomicInteger atomicInteger = q.a;
            if (((String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                Context context = getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (activity == null) {
                    Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
                } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                    activity.requestDragAndDropPermissions(dragEvent);
                    int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                    beginBatchEdit();
                    try {
                        Selection.setSelection((Spannable) getText(), offsetForPosition);
                        q.l(this, new h0.i.i.c(new c.a(dragEvent.getClipData(), 3)));
                        endBatchEdit();
                        z = true;
                    } catch (Throwable th) {
                        endBatchEdit();
                        throw th;
                    }
                }
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public h0.i.i.c onReceiveContent(h0.i.i.c cVar) {
        return this.mDefaultOnReceiveContentListener.a(this, cVar);
    }

    public boolean onTextContextMenuItem(int i) {
        ClipData clipData;
        int i2 = 0;
        if (i == 16908322 || i == 16908337) {
            AtomicInteger atomicInteger = q.a;
            if (((String[]) getTag(R.id.tag_on_receive_content_mime_types)) != null) {
                ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
                if (clipboardManager == null) {
                    clipData = null;
                } else {
                    clipData = clipboardManager.getPrimaryClip();
                }
                if (clipData != null && clipData.getItemCount() > 0) {
                    c.a aVar = new c.a(clipData, 1);
                    if (i != 16908322) {
                        i2 = 1;
                    }
                    aVar.c = i2;
                    q.l(this, new h0.i.i.c(aVar));
                }
                i2 = 1;
            }
        }
        if (i2 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.G0(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.f(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        u uVar;
        if (Build.VERSION.SDK_INT >= 28 || (uVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            uVar.b = textClassifier;
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.a(context);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.d(attributeSet, i);
        v vVar = new v(this);
        this.mTextHelper = vVar;
        vVar.e(attributeSet, i);
        vVar.b();
        this.mTextClassifierHelper = new u(this);
        this.mDefaultOnReceiveContentListener = new e();
    }
}
