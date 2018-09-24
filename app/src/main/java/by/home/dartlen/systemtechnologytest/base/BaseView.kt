package by.home.dartlen.systemtechnologytest.base

interface BaseView<out T : BasePresenter<*>> {

    val presenter: T
}