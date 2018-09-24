package by.home.dartlen.systemtechnologytest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.reactivex.Single

fun <T> Single<T>.with(schedulerProvider: AppSchedulers): Single<T> =
        this.observeOn(schedulerProvider.ui()).subscribeOn(schedulerProvider.io())

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}