package com.sunsh.layout.smartlayout.listener;

import com.sunsh.layout.smartlayout.api.RefreshFooter;
import com.sunsh.layout.smartlayout.api.RefreshHeader;

/**
 * 多功能监听器
 * Created by sunsh on 2017/11/21.
 */

public interface OnMultiPurposeListener extends OnRefreshLoadmoreListener, OnStateChangedListener {
    void onHeaderPulling(RefreshHeader header, float percent, int offset, int headerHeight, int extendHeight);
    void onHeaderReleasing(RefreshHeader header, float percent, int offset, int headerHeight, int extendHeight);
    void onHeaderStartAnimator(RefreshHeader header, int headerHeight, int extendHeight);
    void onHeaderFinish(RefreshHeader header, boolean success);

    void onFooterPulling(RefreshFooter footer, float percent, int offset, int footerHeight, int extendHeight);
    void onFooterReleasing(RefreshFooter footer, float percent, int offset, int footerHeight, int extendHeight);
    void onFooterStartAnimator(RefreshFooter footer, int footerHeight, int extendHeight);
    void onFooterFinish(RefreshFooter footer, boolean success);
}
