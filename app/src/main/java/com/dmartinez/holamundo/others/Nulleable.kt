package com.dmartinez.holamundo.others

import java.lang.NullPointerException

class Nulleable
{
    /*

     */

    private lateinit var variable1: String
    private var variable2: String? = null

    private fun showcase1()
    {
        throw NullPointerException()

    }

    private fun showcase2(var1: String?)
    {
        var1.toString() //Devuelve nulo en caso de que var1 sea null
        var1!!.toString() //Devulve un NPE en caso de que var1 sea null
    }

    private fun showcase3()
    {
        //codigo java
    }

    private fun showcase4()
    {
        variable1.length

        variable2?.length
        variable2!!.length
    }

    private fun showcases()
    {
        var val1: String = ""
        showcase1()
        showcase2(val1)
        showcase3()
        showcase4()

    }
}