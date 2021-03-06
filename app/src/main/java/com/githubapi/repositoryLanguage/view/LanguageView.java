/*
 * Created by Aditya on 11/4/17 2:17 AM
 * Copyright (c) 2017 All rights reserved.
 *
 * Last modified 11/4/17 2:16 AM
 */

package com.githubapi.repositoryLanguage.view;

/**
 * Methods which are invoked by @link {@link com.githubapi.repositoryLanguage.presenter.LanguagePresenter}
 * and implemented by @link {@link RepositoryLanguageActivity}
 */

public interface LanguageView {
    void moveToLanguageDetailScreen();

    void displayMessage();
}
