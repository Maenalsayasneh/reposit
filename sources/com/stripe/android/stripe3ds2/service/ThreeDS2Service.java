package com.stripe.android.stripe3ds2.service;

import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.exceptions.SDKAlreadyInitializedException;
import com.stripe.android.stripe3ds2.exceptions.SDKNotInitializedException;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00078&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/service/ThreeDS2Service;", "", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "uiCustomization", "Lm0/i;", "initialize", "(Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;)V", "", "directoryServerID", "messageVersion", "Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "createTransaction", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/Transaction;", "cleanup", "()V", "", "Lcom/stripe/android/stripe3ds2/init/Warning;", "getWarnings", "()Ljava/util/List;", "warnings", "getSdkVersion", "()Ljava/lang/String;", "sdkVersion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ThreeDS2Service.kt */
public interface ThreeDS2Service {
    void cleanup() throws SDKNotInitializedException;

    Transaction createTransaction(String str, String str2) throws InvalidInputException, SDKNotInitializedException, SDKRuntimeException;

    String getSdkVersion();

    List<Warning> getWarnings();

    void initialize(UiCustomization uiCustomization) throws InvalidInputException, SDKAlreadyInitializedException, SDKRuntimeException;
}
