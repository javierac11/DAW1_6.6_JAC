
class Pila {
    val pila = mutableListOf<Int>()
    fun push(elemento:Int) {
        pila.add(elemento)
    }
    fun pop():Int?{
        if (pila.size > 0){
        return {pila.removeAt(pila.lastIndex)}}
        else null
    }
    fun vacia():String{
        if (pila.size == 0){
            return "Vacia"
        }
        else {
            return "Llena"
        }

    }
    fun tope {
        return pila[pila.lastIndex]
    }


    override fun toString():String {

        return pila.toString()

    }

}
fun main() {
    var p = Pila()
    p.push(4)
    p.push(8)
    p.push(5)
    println(p)
    p.pop()
    println(p)
}