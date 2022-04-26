package com.example.kotlinmvvm2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinmvvm2.network.model.BooksListModel
import com.example.kotlinmvvm2.viewmodel.MainViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        viewModel().getBooksObserver("harry").observe(this, Observer {
            if(it==null) Log.i("mag2851","mag2851-null-it")
            else Log.i("mag2851-result",it.toString())
        })





    }
    private fun viewModel():MainViewModel{

        return ViewModelProvider(this).get(MainViewModel::class.java)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}