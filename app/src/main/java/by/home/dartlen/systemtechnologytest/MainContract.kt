package by.home.dartlen.systemtechnologytest

import by.home.dartlen.systemtechnologytest.base.BasePresenter
import by.home.dartlen.systemtechnologytest.base.BaseView

interface MainContract {
    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter<View> {
        fun start()
    }
}