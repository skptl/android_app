package com.application.application.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.application.application.R;
import com.application.application.ui.activities.BaseActivity;
import com.application.application.utils.Preconditions;

import java.util.ArrayList;
import java.util.List;

/**
 * Scaffold adapter
 */
public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ThumbnailHolder> {

    private final List<String> mData;
    private final BaseActivity mHostActivity;
    private final LayoutInflater mInflater;

    public FeedAdapter(BaseActivity hostActivity) {
        Preconditions.checkNotNull(hostActivity, "Cannot render with null host activity.");
        mHostActivity = hostActivity;
        mData = new ArrayList<>();
        mInflater = LayoutInflater.from(mHostActivity);
    }

    @Override
    public ThumbnailHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View thumbnailView = mInflater.inflate(R.layout.thumbnail_cell, parent, false);
        ThumbnailHolder holder = new ThumbnailHolder(thumbnailView);
        return holder;
    }

    @Override
    public void onBindViewHolder(final ThumbnailHolder holder, final int position) {

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ThumbnailHolder extends RecyclerView.ViewHolder {

        final ImageView thumbnail;

        public ThumbnailHolder(View view) {
            super(view);
            thumbnail = view.findViewById(R.id.thumbnail);
        }
    }

}
