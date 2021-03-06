/*
 * Created by Aditya on 10/4/17 5:01 PM
 * Copyright (c) 2017 All rights reserved.
 *
 * Last modified 10/4/17 5:01 PM
 */

package com.githubapi.repositoryLanguage.presenter;

import com.githubapi.repositoryLanguage.view.LanguageView;

public class LanguagePresenter {

    private LanguageView mLanguageView;

    public LanguagePresenter(LanguageView languageView) {
        mLanguageView = languageView;
    }


    public void isLanguageStringValid(String language) {
        boolean isLanguageStringValid = true;
        if (language == null || language.isEmpty()) {
            isLanguageStringValid = false;
        }

        if (isLanguageStringValid) {
            mLanguageView.moveToLanguageDetailScreen();
        } else {
            mLanguageView.displayMessage();
        }
    }

}
