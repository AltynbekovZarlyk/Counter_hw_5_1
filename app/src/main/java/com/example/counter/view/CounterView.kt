package com.example.counter.view

interface CounterView {
    fun updateText(count: String)
    fun showToast()
    fun changerColor(color: Int)
}