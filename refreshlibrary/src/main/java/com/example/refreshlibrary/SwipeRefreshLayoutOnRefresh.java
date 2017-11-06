package com.example.refreshlibrary;

import android.support.v4.widget.SwipeRefreshLayout;

/**
 *  Created by LEE on 2017/11/6.
 */
public class SwipeRefreshLayoutOnRefresh implements SwipeRefreshLayout.OnRefreshListener {
    private PullLoadMoreRecyclerView mPullLoadMoreRecyclerView;

    public SwipeRefreshLayoutOnRefresh(PullLoadMoreRecyclerView pullLoadMoreRecyclerView) {
        this.mPullLoadMoreRecyclerView = pullLoadMoreRecyclerView;
    }

    @Override
    public void onRefresh() {
        if (!mPullLoadMoreRecyclerView.isRefresh()) {
            mPullLoadMoreRecyclerView.setIsRefresh(true);
            mPullLoadMoreRecyclerView.refresh();
        }
    }
}
