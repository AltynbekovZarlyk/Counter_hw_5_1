package com.example.counter.presenter

import android.graphics.Color
import com.example.counter.injector.Injector
import com.example.counter.view.CounterView

class Presenter {

    var model = Injector.fillModel()
    lateinit var view: CounterView

    fun incrementCount() {
        model.increment()
        view.updateText(model.count.toString())
        if (model.count == 10){
            view.showToast()
        }
        if (model.count == 15){
            view.changerColor(Color.BLUE)
        }else{
            view.changerColor(Color.GRAY)
        }
    }

    fun decrementCount() {
        model.decrement()
        view.updateText(model.count.toString())
        if (model.count == 10){
            view.showToast()
        }
        if (model.count == 15){
            view.changerColor(Color.BLUE)
        }else{
            view.changerColor(Color.GRAY)
        }
    }

    fun attachView(view: CounterView) {
        this.view = view
    }
}