fun printName(person: Person){
    val print = person.name ?: "Anonym"
    println("Hello $print")
}
fun String.printChangeLine(){
    println("Initial line: $this")
    val changedLine = this.trim().uppercase()
    println("Changed line: $changedLine")

}