package com.adibayu.learnasynctaskloader;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {


    private String query;

    public BookLoader(@NonNull Context context, String query) {
        super(context);
        this.query = query;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
        super.onStartLoading();
    }

    @Nullable
    @Override
    public String loadInBackground() {
        return NetworkUtilities.getBookInfo(query);
    }
}
