package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.injector.Injector
import com.example.counter.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {

    lateinit var binding: ActivityMainBinding
    var presenter = Injector.fillPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClikers()
    }

    private fun initClikers() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.incrementCount()
            }
            decrementBtn.setOnClickListener {
                presenter.decrementCount()
            }
        }
    }

    override fun updateText(count: String) {
        binding.resultTv.text = count
    }

    override fun showToast() {
        Toast.makeText(this,"Поздравляем вы дошли до 10!", Toast.LENGTH_SHORT).show()
    }

    override fun changerColor(color: Int) {
       binding.resultTv.setTextColor(color)
    }

}