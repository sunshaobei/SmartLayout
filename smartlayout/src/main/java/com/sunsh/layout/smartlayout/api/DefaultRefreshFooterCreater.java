package com.sunsh.layout.smartlayout.api;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * 默认Footer创建器
 * Created by sunsh on 2017/11/21.
 */

public interface DefaultRefreshFooterCreater {
    @NonNull
    RefreshFooter createRefreshFooter(Context context, RefreshLayout layout);
}
