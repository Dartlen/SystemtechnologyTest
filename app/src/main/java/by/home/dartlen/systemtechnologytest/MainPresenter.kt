package by.home.dartlen.systemtechnologytest

import android.util.Log
import by.home.dartlen.systemtechnologytest.base.RxPresenter

class MainPresenter(val repository: Repository, val appSchedulers: AppSchedulers) :
        RxPresenter<MainContract.View>(), MainContract.Presenter {
    override var view: MainContract.View? = null

    override fun start() {
        launch {
            repository.getExRatesResponse().with(appSchedulers).subscribe(
                {
                    Log.d(it.toString(),"")
                },{
                    Log.d(it.toString(),"")
                }
            )
        }
    }
}