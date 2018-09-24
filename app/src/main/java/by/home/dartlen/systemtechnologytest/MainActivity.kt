package by.home.dartlen.systemtechnologytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(), MainContract.View {

    override val presenter: MainContract.Presenter by inject()

    override fun onResume() {
        super.onResume()
        presenter.subscribe(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onPause() {
        presenter.unSubscribe()
        super.onPause()
    }

    override fun onStart() {
        super.onStart()
        presenter.start()
    }
}
