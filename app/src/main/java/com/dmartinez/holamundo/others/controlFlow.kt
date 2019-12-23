package com.dmartinez.holamundo.others

import android.util.Log.w as w1

class controlFlow
{
    private fun showcase1()
    {
        //sentencia IF
        var a = 1
        var b = 10
        if (a > b)
        {
            w1("Control-Flow-1","a es mayor que b")
        }

        if (a < b)
        {
            w1("Control-Flow-1","a es menor que b")
        }
    }

    private fun showcase2()
    {
        //sentencia IF-ELSE
        val a = 1
        val b = 10
        if (a > b)
        {
            w1("Control-Flow-2", "a es mayor que b")
        }
        else
        {
            w1("Control-Flow-2","a es menor que b")
        }

        //como expresión
        if(a > b) w1("Control-Flow-2", "a es mayor que b") else w1("Control-Flow-2","a es menor que b")
        var resul = if(a > b) a else b
    }

    private fun showcase3()
    {
        //WHEN (swich)
        val x = 1
        when (x)
        {
            1 -> w1("Control-Flow-3", "x = 1")
            3 -> w1("Control-Flow-3", "x = 2")
            else -> w1("Control-Flow-3", "x es otro numero")
        }

        when (x)
        {
            0,1 -> w1("Control-Flow-3 agrp", "x = $x")
        }

        //sin argumento
        when
        {
            (x % 2 == 0) -> w1("Control-Flow-3 S/A", "x es numero par")
            (x % 2 == 1) -> w1("Control-Flow-3 S/A", "x es numero impar")
        }

        //sin argumento y devolviendo un valor
        val esPar = when{
            (x % 2 == 0) -> true
            else -> false
        }
        w1("Control-Flow 3","x es par? $esPar")
    }

    private fun showcase4()
    {
        //bucle for
        val numbers = arrayOf(1,2,3,4,5)
        for (number in numbers) w1("Control-Flow-4", number.toString())

        //Especificando el tipo
        for (number: Int in numbers)
        {
            w1("Control-Flow-4", number.toString())
        }

        //con indice
        for ((index, number) in numbers.withIndex())
        {
            w1("Control-Flow-4","$index: $number")
        }
    }

    private fun showcase5()
    {
        //while do while
        var x = 10
        while (x > 0)
        {
            w1("Control-Flow-4 w","${x--}")
        }

        do {
            w1("Control-Flow-4 dw","Unica vez")
        }while (x > 0)
    }

    fun showCases()
    {
        showcase1()
        showcase2()
        showcase3()
        showcase4()
        showcase5()
    }
}