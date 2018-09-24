package by.home.dartlen.systemtechnologytest

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class AppSchedulers{
    fun ui() = AndroidSchedulers.mainThread()
    fun computation() = Schedulers.computation()
    fun io() = Schedulers.io()
}