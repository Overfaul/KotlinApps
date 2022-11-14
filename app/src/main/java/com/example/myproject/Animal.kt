package com.example.myproject


interface MakeSound {
    fun quietSound(word: String) {
        println("Quiet $word")
    }

    fun loudSound(word: String) {
        println("Loud $word")
    }
}

open class Animal{
    open fun func1(){
        println("Something...")
    }

    fun eachAnimal(){
        var animals = arrayOf("Fish", "Dog", "Bird")
        for (animal in animals) print("$animal ")
    }
}
class Dog(): Animal(), MakeSound{
    override fun func1() {
        //super.func1()
        println("Something different")
        super.loudSound("Bark")
    }
}

class Bird(): Animal(), MakeSound{
    fun func2() {

        super.quietSound("Qwirk")
    }
}

class Fish(): Animal(){
    public var a = 5
    private var b = 15

}



