package acuario

abstract class Pez{
    abstract val Color: String

    abstract fun observar()
}

interface AccionPez{
    fun comer()
}

class Tiburon () : Pez(), AccionPez {
    override val Color: String = "gris"

    override fun observar(){
        println("Vez al tiburón y es de color $Color")
    }
    override fun comer(){
        println("El tiburón esta cazando peces")
    }
}

class PezPayaso () : Pez(), AccionPez {
    override val Color: String = "dorado"

    override fun observar(){
        println("Vez al pez payaso y es de color $Color")
    }

    override fun comer(){
        println("El pez payaso esta comiendo algas")
    }
}

