package by.home.dartlen.systemtechnologytest

import by.home.dartlen.systemtechnologytest.Constants.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.SimpleXmlConverterFactory
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val appModule = module{
    single(createOnStart = true) { AppSchedulers() }
    single(createOnStart = true) { createOkHttpClient() }
    single(createOnStart = true) { createWebService<ConverterService>(get(), BASE_URL) }
    single(createOnStart = true) { Repository(get()) }
    factory<MainContract.Presenter> { MainPresenter(get(), get()) }
}

fun createOkHttpClient(): OkHttpClient {
    return OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()
}

inline fun <reified T> createWebService(okHttpClient: OkHttpClient, url: String): T {
    val retrofit = Retrofit.Builder()
            .baseUrl(url)
            .client(okHttpClient)
            //.addConverterFactory(GsonConverterFactory.create()
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build()
    return retrofit.create(T::class.java)
}