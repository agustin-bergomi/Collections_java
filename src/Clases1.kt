fun main() {
    MyCar("BMW").outputCar()
}

class Car() {
    private val carModel = "Lada"

    fun outputCar() {
        println("My car model is $carModel")
    }
}

/*
* Class with primary constructor aka parameters
* */

class MyCar(name: String) {
    private val myCar = name

    fun outputCar() {
        println("My car model is $myCar")
    }
}

/*
* Class with primary constructor and init block
* */

class MyPrivateCar(val myCarName: String, val myCarYear: Int) {

    init {
        println("My car model is  $myCarName")
    }

    fun outPutCarAge() {
        println("My car is ${2020 - myCarYear}")
    }
}