package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.R;
import com.google.android.material.textfield.TextInputEditText;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010!\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0005{|}~B'\b\u0007\u0012\u0006\u0010u\u001a\u00020t\u0012\n\b\u0002\u0010w\u001a\u0004\u0018\u00010v\u0012\b\b\u0002\u0010x\u001a\u00020\u0007¢\u0006\u0004\by\u0010zJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\u0007¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00022\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0011\u00109\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\n ;*\u0004\u0018\u00010505H\u0001¢\u0006\u0004\b<\u0010:J\u0019\u0010@\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bB\u0010AJ\u0019\u0010G\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010CH\u0000¢\u0006\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020%8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020>0M8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010PR\u001e\u0010Q\u001a\u0004\u0018\u00010%8\u0014@\u0014X\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010IR\u001c\u0010W\u001a\u00020\u000e8F@\u0007X\u0004¢\u0006\f\u0012\u0004\bV\u0010\u0004\u001a\u0004\bT\u0010UR$\u0010&\u001a\u0004\u0018\u00010%8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b&\u0010R\u001a\u0004\bX\u0010I\"\u0004\bY\u0010(R\u0013\u0010\\\u001a\u00020\u00078G@\u0006¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0018\u0010]\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b]\u0010^R*\u0010`\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\u000e8\u0000@AX\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010U\"\u0004\bc\u0010\u0011R\u0018\u0010d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010aR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010eR\"\u0010f\u001a\b\u0012\u0004\u0012\u0002050M8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bf\u0010O\u001a\u0004\bg\u0010hR\"\u0010i\u001a\u00020\u000b8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bi\u0010j\u001a\u0004\bi\u0010k\"\u0004\bl\u0010mR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010nR*\u0010o\u001a\u00020\u000b2\u0006\u0010o\u001a\u00020\u000b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bo\u0010j\u001a\u0004\bp\u0010k\"\u0004\bq\u0010mR\u0016\u0010r\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010s¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Lm0/i;", "determineDefaultErrorColor", "()V", "listenForTextChanges", "listenForDeleteEmpty", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "isDeleteKey", "(ILandroid/view/KeyEvent;)Z", "Landroid/content/res/ColorStateList;", "colors", "setTextColor", "(Landroid/content/res/ColorStateList;)V", "color", "(I)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "afterTextChangedListener", "setAfterTextChangedListener", "(Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;)V", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "deleteEmptyListener", "setDeleteEmptyListener", "(Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "errorMessageListener", "setErrorMessageListener", "(Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;)V", "", "errorMessage", "setErrorMessage", "(Ljava/lang/String;)V", "errorColor", "setErrorColor", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Landroid/view/View$OnFocusChangeListener;", "listener", "setOnFocusChangeListener", "(Landroid/view/View$OnFocusChangeListener;)V", "getOnFocusChangeListener", "()Landroid/view/View$OnFocusChangeListener;", "kotlin.jvm.PlatformType", "getParentOnFocusChangeListener$payments_core_release", "getParentOnFocusChangeListener", "Landroid/text/TextWatcher;", "watcher", "addTextChangedListener", "(Landroid/text/TextWatcher;)V", "removeTextChangedListener", "", "text", "setTextSilent$payments_core_release", "(Ljava/lang/CharSequence;)V", "setTextSilent", "getFieldText$payments_core_release", "()Ljava/lang/String;", "fieldText", "externalFocusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "", "textWatchers", "Ljava/util/List;", "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "accessibilityText", "Ljava/lang/String;", "getAccessibilityText", "getCachedColorStateList", "()Landroid/content/res/ColorStateList;", "getCachedColorStateList$annotations", "cachedColorStateList", "getErrorMessage$payments_core_release", "setErrorMessage$payments_core_release", "getDefaultErrorColorInt", "()I", "defaultErrorColorInt", "externalErrorColor", "Ljava/lang/Integer;", "<set-?>", "defaultColorStateList", "Landroid/content/res/ColorStateList;", "getDefaultColorStateList$payments_core_release", "setDefaultColorStateList$payments_core_release", "externalColorStateList", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "internalFocusChangeListeners", "getInternalFocusChangeListeners$payments_core_release", "()Ljava/util/List;", "isLastKeyDelete", "Z", "()Z", "setLastKeyDelete", "(Z)V", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "shouldShowError", "getShouldShowError", "setShouldShowError", "defaultErrorColor", "I", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AfterTextChangedListener", "DeleteEmptyListener", "ErrorMessageListener", "SoftDeleteInputConnection", "StripeEditTextState", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeEditText.kt */
public class StripeEditText extends TextInputEditText {
    private final String accessibilityText;
    /* access modifiers changed from: private */
    public AfterTextChangedListener afterTextChangedListener;
    private ColorStateList defaultColorStateList;
    private int defaultErrorColor;
    /* access modifiers changed from: private */
    public DeleteEmptyListener deleteEmptyListener;
    private String errorMessage;
    private ErrorMessageListener errorMessageListener;
    private ColorStateList externalColorStateList;
    private Integer externalErrorColor;
    /* access modifiers changed from: private */
    public View.OnFocusChangeListener externalFocusChangeListener;
    private final List<View.OnFocusChangeListener> internalFocusChangeListeners;
    private boolean isLastKeyDelete;
    private boolean shouldShowError;
    private final List<TextWatcher> textWatchers;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "", "", "text", "Lm0/i;", "onTextChanged", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeEditText.kt */
    public interface AfterTextChangedListener {
        void onTextChanged(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "", "Lm0/i;", "onDeleteEmpty", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeEditText.kt */
    public interface DeleteEmptyListener {
        void onDeleteEmpty();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "", "", "message", "Lm0/i;", "displayErrorMessage", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeEditText.kt */
    public interface ErrorMessageListener {
        void displayErrorMessage(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;", "Landroid/view/inputmethod/InputConnectionWrapper;", "", "beforeLength", "afterLength", "", "deleteSurroundingText", "(II)Z", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "deleteEmptyListener", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "Landroid/view/inputmethod/InputConnection;", "target", "mutable", "<init>", "(Landroid/view/inputmethod/InputConnection;ZLcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeEditText.kt */
    public static final class SoftDeleteInputConnection extends InputConnectionWrapper {
        private final DeleteEmptyListener deleteEmptyListener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SoftDeleteInputConnection(InputConnection inputConnection, boolean z, DeleteEmptyListener deleteEmptyListener2) {
            super(inputConnection, z);
            i.e(inputConnection, "target");
            this.deleteEmptyListener = deleteEmptyListener2;
        }

        public boolean deleteSurroundingText(int i, int i2) {
            DeleteEmptyListener deleteEmptyListener2;
            boolean z = true;
            CharSequence textBeforeCursor = getTextBeforeCursor(1, 0);
            i.d(textBeforeCursor, "getTextBeforeCursor(1, 0)");
            if (textBeforeCursor.length() != 0) {
                z = false;
            }
            if (z && (deleteEmptyListener2 = this.deleteEmptyListener) != null) {
                deleteEmptyListener2.onDeleteEmpty();
            }
            return super.deleteSurroundingText(i, i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ2\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\tR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0003¨\u0006&"}, d2 = {"Lcom/stripe/android/view/StripeEditText$StripeEditTextState;", "Landroid/os/Parcelable;", "component1", "()Landroid/os/Parcelable;", "", "component2", "()Ljava/lang/String;", "", "component3", "()Z", "superState", "errorMessage", "shouldShowError", "copy", "(Landroid/os/Parcelable;Ljava/lang/String;Z)Lcom/stripe/android/view/StripeEditText$StripeEditTextState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getErrorMessage", "Z", "getShouldShowError", "Landroid/os/Parcelable;", "getSuperState", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeEditText.kt */
    public static final class StripeEditTextState implements Parcelable {
        public static final Parcelable.Creator<StripeEditTextState> CREATOR = new Creator();
        private final String errorMessage;
        private final boolean shouldShowError;
        private final Parcelable superState;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<StripeEditTextState> {
            public final StripeEditTextState createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new StripeEditTextState(parcel.readParcelable(StripeEditTextState.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            public final StripeEditTextState[] newArray(int i) {
                return new StripeEditTextState[i];
            }
        }

        public StripeEditTextState(Parcelable parcelable, String str, boolean z) {
            this.superState = parcelable;
            this.errorMessage = str;
            this.shouldShowError = z;
        }

        public static /* synthetic */ StripeEditTextState copy$default(StripeEditTextState stripeEditTextState, Parcelable parcelable, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = stripeEditTextState.superState;
            }
            if ((i & 2) != 0) {
                str = stripeEditTextState.errorMessage;
            }
            if ((i & 4) != 0) {
                z = stripeEditTextState.shouldShowError;
            }
            return stripeEditTextState.copy(parcelable, str, z);
        }

        public final Parcelable component1() {
            return this.superState;
        }

        public final String component2() {
            return this.errorMessage;
        }

        public final boolean component3() {
            return this.shouldShowError;
        }

        public final StripeEditTextState copy(Parcelable parcelable, String str, boolean z) {
            return new StripeEditTextState(parcelable, str, z);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StripeEditTextState)) {
                return false;
            }
            StripeEditTextState stripeEditTextState = (StripeEditTextState) obj;
            return i.a(this.superState, stripeEditTextState.superState) && i.a(this.errorMessage, stripeEditTextState.errorMessage) && this.shouldShowError == stripeEditTextState.shouldShowError;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getShouldShowError() {
            return this.shouldShowError;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public int hashCode() {
            Parcelable parcelable = this.superState;
            int i = 0;
            int hashCode = (parcelable != null ? parcelable.hashCode() : 0) * 31;
            String str = this.errorMessage;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.shouldShowError;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder P0 = a.P0("StripeEditTextState(superState=");
            P0.append(this.superState);
            P0.append(", errorMessage=");
            P0.append(this.errorMessage);
            P0.append(", shouldShowError=");
            return a.D0(P0, this.shouldShowError, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeParcelable(this.superState, i);
            parcel.writeString(this.errorMessage);
            parcel.writeInt(this.shouldShowError ? 1 : 0);
        }
    }

    public StripeEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StripeEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    private final void determineDefaultErrorColor() {
        int i;
        Context context = getContext();
        if (StripeColorUtils.Companion.isColorDark(this.defaultColorStateList.getDefaultColor())) {
            i = com.stripe.android.R.color.stripe_error_text_light_theme;
        } else {
            i = com.stripe.android.R.color.stripe_error_text_dark_theme;
        }
        this.defaultErrorColor = h0.i.b.a.getColor(context, i);
    }

    public static /* synthetic */ void getCachedColorStateList$annotations() {
    }

    /* access modifiers changed from: private */
    public final boolean isDeleteKey(int i, KeyEvent keyEvent) {
        return i == 67 && keyEvent.getAction() == 0;
    }

    private final void listenForDeleteEmpty() {
        setOnKeyListener(new StripeEditText$listenForDeleteEmpty$1(this));
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1(this));
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        if (textWatcher != null) {
            this.textWatchers.add(textWatcher);
        }
    }

    public String getAccessibilityText() {
        return this.accessibilityText;
    }

    public final ColorStateList getCachedColorStateList() {
        return this.defaultColorStateList;
    }

    public final ColorStateList getDefaultColorStateList$payments_core_release() {
        return this.defaultColorStateList;
    }

    public final int getDefaultErrorColorInt() {
        determineDefaultErrorColor();
        return this.defaultErrorColor;
    }

    public final String getErrorMessage$payments_core_release() {
        return this.errorMessage;
    }

    public final String getFieldText$payments_core_release() {
        Editable text = getText();
        String obj = text != null ? text.toString() : null;
        return obj != null ? obj : "";
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners$payments_core_release() {
        return this.internalFocusChangeListeners;
    }

    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.externalFocusChangeListener;
    }

    public final View.OnFocusChangeListener getParentOnFocusChangeListener$payments_core_release() {
        return super.getOnFocusChangeListener();
    }

    public final boolean getShouldShowError() {
        return this.shouldShowError;
    }

    public final boolean isLastKeyDelete() {
        return this.isLastKeyDelete;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        i.e(editorInfo, "outAttrs");
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            return new SoftDeleteInputConnection(onCreateInputConnection, true, this.deleteEmptyListener);
        }
        return null;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        i.e(accessibilityNodeInfo, "info");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setContentInvalid(this.shouldShowError);
        String accessibilityText2 = getAccessibilityText();
        if (accessibilityText2 != null) {
            accessibilityNodeInfo.setText(accessibilityText2);
        }
        String str = this.errorMessage;
        if (!this.shouldShowError) {
            str = null;
        }
        accessibilityNodeInfo.setError(str);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Objects.requireNonNull(parcelable, "null cannot be cast to non-null type com.stripe.android.view.StripeEditText.StripeEditTextState");
        StripeEditTextState stripeEditTextState = (StripeEditTextState) parcelable;
        super.onRestoreInstanceState(stripeEditTextState.getSuperState());
        this.errorMessage = stripeEditTextState.getErrorMessage();
        setShouldShowError(stripeEditTextState.getShouldShowError());
    }

    public Parcelable onSaveInstanceState() {
        return new StripeEditTextState(super.onSaveInstanceState(), this.errorMessage, this.shouldShowError);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        if (textWatcher != null) {
            this.textWatchers.remove(textWatcher);
        }
    }

    public final void setAfterTextChangedListener(AfterTextChangedListener afterTextChangedListener2) {
        this.afterTextChangedListener = afterTextChangedListener2;
    }

    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        i.e(colorStateList, "<set-?>");
        this.defaultColorStateList = colorStateList;
    }

    public final void setDeleteEmptyListener(DeleteEmptyListener deleteEmptyListener2) {
        this.deleteEmptyListener = deleteEmptyListener2;
    }

    public final void setErrorColor(int i) {
        this.externalErrorColor = Integer.valueOf(i);
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.errorMessage = str;
    }

    public final void setErrorMessageListener(ErrorMessageListener errorMessageListener2) {
        this.errorMessageListener = errorMessageListener2;
    }

    public final void setLastKeyDelete(boolean z) {
        this.isLastKeyDelete = z;
    }

    public final void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(new StripeEditText$setOnFocusChangeListener$1(this));
        this.externalFocusChangeListener = onFocusChangeListener;
    }

    public final void setShouldShowError(boolean z) {
        ErrorMessageListener errorMessageListener2;
        String str = this.errorMessage;
        if (!(str == null || (errorMessageListener2 = this.errorMessageListener) == null)) {
            if (!z) {
                str = null;
            }
            errorMessageListener2.displayErrorMessage(str);
        }
        if (this.shouldShowError != z) {
            if (z) {
                Integer num = this.externalErrorColor;
                super.setTextColor(num != null ? num.intValue() : this.defaultErrorColor);
            } else {
                ColorStateList colorStateList = this.externalColorStateList;
                if (colorStateList == null) {
                    colorStateList = this.defaultColorStateList;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.shouldShowError = z;
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.externalColorStateList = getTextColors();
    }

    public final void setTextSilent$payments_core_release(CharSequence charSequence) {
        for (TextWatcher removeTextChangedListener : this.textWatchers) {
            super.removeTextChangedListener(removeTextChangedListener);
        }
        setText(charSequence);
        for (TextWatcher addTextChangedListener : this.textWatchers) {
            super.addTextChangedListener(addTextChangedListener);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.textWatchers = new ArrayList();
        setMaxLines(1);
        listenForTextChanges();
        listenForDeleteEmpty();
        ColorStateList textColors = getTextColors();
        i.d(textColors, "textColors");
        this.defaultColorStateList = textColors;
        determineDefaultErrorColor();
        setOnFocusChangeListener((View.OnFocusChangeListener) null);
        this.internalFocusChangeListeners = new ArrayList();
    }

    public void setTextColor(int i) {
        setTextColor(ColorStateList.valueOf(i));
    }
}
