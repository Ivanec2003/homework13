fun main() {
    val person = Person("Vlad")
    printName(person)
    person.name = null
    printName(person)

    val text = "   Hello world!   "
    text.printChangeLine()

    val car = Car()
    val ferrari = Ferrari(car)
    ferrari.start()
    ferrari.move()
    ferrari.stop()
}