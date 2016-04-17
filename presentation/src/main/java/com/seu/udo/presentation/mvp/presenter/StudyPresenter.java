package com.seu.udo.presentation.mvp.presenter;

import com.seu.udo.presentation.mvp.view.StudyMvpView;

import javax.inject.Inject;

/**
 * Author: Jeremy Xu on 2016/4/17 18:25
 * E-mail: jeremy_xm@163.com
 */
public class StudyPresenter implements MvpPresenter<StudyMvpView> {

    private StudyMvpView studyView;

    @Inject
    public StudyPresenter() {}

    @Override
    public void takeView(StudyMvpView studyView) {
        this.studyView = studyView;
    }

    @Override
    public void dropView() {
        studyView = null;
    }

    public void showDetail() {
        studyView.showDetail();
    }
}
