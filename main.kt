class Pila (val pila: MutableList<Int> = mutableListOf()) {

    fun Push (input: Int) {
        pila.add(input)
    }


}
fun main() {
    var p = Pila()
    p.Push(4)
    p.Push(8)
    p.Push(5)
    println(p.pila.toString())
}