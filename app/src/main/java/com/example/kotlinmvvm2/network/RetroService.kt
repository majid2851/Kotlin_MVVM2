package com.example.kotlinmvvm2.network

import com.example.kotlinmvvm2.network.model.BooksListModel
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService
{
    @GET("volumes")
    fun getBooks(@Query("q") title:String ):Observable<BooksListModel>


}