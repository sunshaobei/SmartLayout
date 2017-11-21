package com.sunsh.layout.smartlayout.api;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * 默认Header创建器
 * Created by sunsh on 2017/11/21.
 */

public interface DefaultRefreshHeaderCreater {
    @NonNull
    RefreshHeader createRefreshHeader(Context context, RefreshLayout layout);
}
