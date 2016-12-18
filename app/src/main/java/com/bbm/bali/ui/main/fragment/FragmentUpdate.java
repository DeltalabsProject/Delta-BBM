package com.bbm.bali.ui.main.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.bbm.bali.ui.main.a.h;

import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class FragmentUpdate extends h {

    String deltaUrl;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(PreferenceUtils.getID("fragment_blog", "layout"), container, false);

        WebView webView = (WebView)rootview.findViewById(PreferenceUtils.getID("webview_blog","id"));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new DeltaWebClient());

        if (deltaUrl == null){
            deltaUrl = PreferenceKeys.STR_URL_UPDATE;
        }
        webView.loadUrl(deltaUrl);

        return rootview;
    }

    public class DeltaWebClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            if(Uri.parse(url).getHost().endsWith("deltabbm.com")) {
                return false;
            }

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            view.getContext().startActivity(intent);
            return true;
        }
    }




}
