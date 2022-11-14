package com.example.myproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animal = Animal()
        animal.eachAnimal()

        var dog = Dog()
        var bird = Bird()
        var fish = Fish()

        bird.func2()
        dog.func1()

        var fishn = fish.a
        print("$fishn")
    }
}



