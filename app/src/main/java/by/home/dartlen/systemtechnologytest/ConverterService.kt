package by.home.dartlen.systemtechnologytest

import by.home.dartlen.systemtechnologytest.pojo.DailyExRates
import io.reactivex.Single
import retrofit2.http.GET

interface ConverterService{
    @GET("/Services/XmlExRates.aspx")
    fun getExRates(): Single<DailyExRates>
}