package com.dmartinez.holamundo.others

//import android.util.Log
import androidx.annotation.BoolRes
import android.util.Log.w as w1

/*
    En kotlin todo es un objeto
    No hay básicos, y no existe void. Si algo no devuelve nada está devolviendo unit object.
    Las variables pueden ser mutables o inmutables, usaremos inmutables siempre que sea posible. ( var -> mutables vs val -> inmutables)
    Los tipos son definidos después del nombre de la variable, con dos puntos y espacio (e.j. var nombre: tipo )
 */

class Variables
{
    private var variable0 = 1
    private var variable1 = 1.toByte()
    private var variable2 = -123
    private var variable3 = 2147483648
    private var variable4 = 1.1.toFloat()
    private var variable5 = 1.9
    private var variable6 = 'a'
    private var variable7 = "a"
    private var variable8 = true
    private var variable9 = arrayOf(6,2,3,4,5,6,8,9)
    private var variable10 = arrayOfNulls<Int>(15)
    //private val var1 : Int = 2


    //SHOWCASE PARA BYTE
    private fun showcase1()
    {
        w1( "Variable0", "¿Es variable0 un Int? ---> " + (variable0 is Int) + "¿Por qué no un Byte?" )
        w1( "Variable1", "¿Es variable1 un Byte? ---> " + (variable1 is Byte) )
    }

    //SHOWCASE PARA INT
    private fun showcase2()
    {
        w1( "Variable2", "Es un valor de tipo Int " )
        variable2 = Int.MAX_VALUE
    }

    //SHOWCASE PARA LONG
    private fun showcase3()
    {
        w1( "Variable3", "¿Es un valor de tipo LONG? --> " + (variable3 is Long) )
    }

    //SHOWCASE PARA FLOAT
    private fun showcase4()
    {
        w1( "Variable4", "¿Es un valor de tipo FLOAT? --> " + (variable4 is Float) )
    }

    //SHOWCASE PARA DOUBLE
    private fun showcase5()
    {
        w1( "Variable5", "¿Es un valor de tipo DOUBLE? --> " + (variable5 is Double) )
    }

    //SHOWCASE PARA CHAR
    private fun showcase6()
    {
        w1( "Variable6", "¿Es un valor de tipo CHAR? --> " + (variable6 is Char) )
    }

    //SHOWCASE PARA STRING
    private fun showcase7()
    {
        w1( "Variable7", "¿Es un valor de tipo STRING? --> " + (variable7 is String) )

        //String literals
        variable7 = "'Hola Mundo!\nAdios Mundo!" //JAVA'S STYLE
        variable7 = """
                        ¡HOLA MUNDO!
                        ¡ADIOS MUNDO!
                    """.trimIndent() //KOTLIN'S STYLE

        //String Templates
        var points = 9
        var maxPoints = 10
        variable7 = "Hola, tengo " + points + " puntos sobre " + maxPoints //JAVA'S STYLE
        variable7 = "Hola, tengo $points puntos sobre $maxPoints" //KOTLIN'S STYLE
        variable7 = "Hola, tengo ${points - 1} puntos sobre $maxPoints" //KOTLIN'S STYLE
    }

    //SHOWCASE PARA BOOLEAN
    private fun showcase8()
    {
        w1( "Variable8", "¿Es un valor de tipo BOOLEAN? --> " + (variable8 is Boolean) )
    }

    //SHOWCASE PARA Array<Int>
    private fun showcase9()
    {
        w1( "Variable9", "¿Es un valor de tipo ARRAY<INT>? --> " + (variable9 is Array<Int>) )
    }

    //SHOWCASE PARA ArrayOfNULLS
    private fun showcase10()
    {
        w1( "Variable10", "¿Es un valor de tipo ARRAYOFNULLS? --> " + (variable10 is Array<Int?>) )

        variable10 = arrayOfNulls(2)
        variable10 = arrayOf(1,2,3,4)

        variable10[0]?.toFloat() //Safe calls -- En caso de ser NULL devuelve NULL
        variable10[0]?.toFloat() ?: "Error" //Elvis Operator -- En caso de ser NULL devuelve un STRING
        variable10[0]!!.toFloat() //El operador !! -- Cuando estamos seguros que no es nulo al 100%, si lo fuera lanza un null exception
    }

    fun showcases()
    {
        showcase1()
        showcase2()
        showcase3()
        showcase4()
        showcase5()
        showcase6()
        showcase7()
        showcase8()
        showcase9()
        showcase10()
    }
}