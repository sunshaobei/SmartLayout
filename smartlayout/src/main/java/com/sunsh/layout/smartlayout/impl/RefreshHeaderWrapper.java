package com.sunsh.layout.smartlayout.impl;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import com.sunsh.layout.smartlayout.api.RefreshHeader;
import com.sunsh.layout.smartlayout.api.RefreshKernel;
import com.sunsh.layout.smartlayout.api.RefreshLayout;
import com.sunsh.layout.smartlayout.constant.RefreshState;
import com.sunsh.layout.smartlayout.constant.SpinnerStyle;
import com.sunsh.layout.smartlayout.SmartLayout;

/**
 * 刷新头部包装
 * Created by sunsh on 2017/11/21.
 */

public class RefreshHeaderWrapper implements RefreshHeader {

    private View mWrapperView;
    private SpinnerStyle mSpinnerStyle;

    public RefreshHeaderWrapper(View wrapper) {
        this.mWrapperView = wrapper;
    }

    @NonNull
    public View getView() {
        return mWrapperView;
    }

    @Override
    public int onFinish(RefreshLayout layout, boolean success) {
        return 0;
    }

    @Override@Deprecated
    public void setPrimaryColors(@ColorInt int ... colors) {

    }

    @NonNull
    @Override
    public SpinnerStyle getSpinnerStyle() {
        if (mSpinnerStyle != null) {
            return mSpinnerStyle;
        }
        ViewGroup.LayoutParams params = mWrapperView.getLayoutParams();
        if (params instanceof SmartLayout.LayoutParams) {
            mSpinnerStyle = ((SmartLayout.LayoutParams) params).spinnerStyle;
            if (mSpinnerStyle != null) {
                return mSpinnerStyle;
            }
        }
        if (params != null) {
            if (params.height == ViewGroup.LayoutParams.MATCH_PARENT) {
                return mSpinnerStyle = SpinnerStyle.Scale;
            }
        }
        return mSpinnerStyle = SpinnerStyle.Translate;
    }

    @Override
    public void onInitialized(RefreshKernel kernel, int height, int extendHeight) {
        ViewGroup.LayoutParams params = mWrapperView.getLayoutParams();
        if (params instanceof SmartLayout.LayoutParams) {
            kernel.requestDrawBackgoundForHeader(((SmartLayout.LayoutParams) params).backgroundColor);
        }
    }

    @Override
    public boolean isSupportHorizontalDrag() {
        return false;
    }

    @Override
    public void onHorizontalDrag(float percentX, int offsetX, int offsetMax) {
    }

    @Override
    public void onPullingDown(float percent, int offset, int headHeight, int extendHeight) {

    }

    @Override
    public void onReleasing(float percent, int offset, int headHeight, int extendHeight) {

    }

    @Override
    public void onRefreshReleased(RefreshLayout layout, int headerHeight, int extendHeight) {
        
    }

    @Override
    public void onStartAnimator(RefreshLayout layout, int headHeight, int extendHeight) {

    }

    @Override
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState oldState, RefreshState newState) {

    }
}
