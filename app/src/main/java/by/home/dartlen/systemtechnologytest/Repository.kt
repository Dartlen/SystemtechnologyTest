package by.home.dartlen.systemtechnologytest

import by.home.dartlen.systemtechnologytest.pojo.DailyExRates
import io.reactivex.Single

class Repository(private val converterService: ConverterService){

    fun getExRatesResponse(): Single<DailyExRates> {
        return converterService.getExRates()
    }
}