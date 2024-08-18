package acuario

import kotlin.math.PI


class Acuario(open var largo: Int = 100, open var ancho: Int = 20, open var alto: Int = 40) {

    var volumen: Int
        get() = ancho * alto * largo / 1000  // 1000 cm^3 = 1 l
        set(valor) {
            alto = (valor * 1000) / (ancho * largo) //la formula para el volumen se invierte para hallar el alto
        }
    //open var forma = "rectangulo"

    //open var agua:Double = 0.0
        //get() = Math.floor(volumen * 0.9) //para evitar numeros decimal muy extensos se redondea con Math.floor()

    init {
        println("inicializando acuario")
    }

    constructor(numeroDePeces: Int) : this() {
        // 2,000 cm^3 por pez + espacio extra para que no se derrame

        val tanque = numeroDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt() //La variable tanque es el volumen en cm^3 por lo
                                                  //que con el largo y ancho se saca un nuevo alto de acuerdo al volumen
    }


    open fun imprimirTamano() {// La funcion se coloco en open para poder sobre escribirla en la subclase TanqueTorre
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        println("Volumen: $volumen l")
    }
}
/*
class TanqueTorre (override var alto: Int, var diametro: Int): Acuario(alto = alto, ancho = diametro, largo = diametro) {
    override var volumen: Int
        // área elíptica = π * r1 * r2
        get() = (ancho/2 * largo/2 * alto / 1000 * PI).toInt()
        set(valor) {
            alto = ((valor * 1000 / PI) / (ancho/2 * largo/2)).toInt()
        }

    override var agua = volumen * 0.8
    override var forma = "cilindro"

    override fun imprimirTamano() {
        super.imprimirTamano()
        println("Alto: $alto cm "+
                "radio: ${diametro/2} cm")
        println("Volumen: $volumen l Agua: $agua l (${Math.floor(agua/volumen*100.0)}% lleno)")
    }
}

 */
