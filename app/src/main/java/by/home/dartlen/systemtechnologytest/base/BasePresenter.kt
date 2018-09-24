package by.home.dartlen.systemtechnologytest.base

interface BasePresenter<V> {

    fun subscribe(view: V)

    fun unSubscribe()

    var view: V?

}