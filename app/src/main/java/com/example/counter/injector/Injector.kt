package com.example.counter.injector

import com.example.counter.presenter.Presenter
import com.example.counter.model.CounterModel

class Injector {

    companion object{
        fun fillModel() = CounterModel()
        fun fillPresenter() = Presenter()
    }
}