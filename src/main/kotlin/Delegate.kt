interface Transport {
    fun start()
    fun move()
    fun stop()
}

class Car : Transport {
    override fun start() {
        println("Car start move")
    }

    override fun move() {
        println("Car is moving")
    }

    override fun stop() {
        println("Car stop move")
    }
}

class Ferrari(private val car: Car) : Transport by car{
    override fun move() {
        println("Ferrari is moving")
    }
}