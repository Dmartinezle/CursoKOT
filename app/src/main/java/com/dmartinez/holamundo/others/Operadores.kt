package com.dmartinez.holamundo.others

import android.util.Log.w as w1

class Operadores
{
    private fun showcase1()
    {
        var a = 5
        var b = 5

        w1("Operadores-1","Referential equality. Es 'a' igual a 'b'? ${a===b}") //true
        w1("Operadores-1","Structural equality. Es 'a' igual a 'b'? ${a==b}") //true
    }

    private fun showcase2()
    {
        val pn1 = PersonNormal()
        val pn2 = PersonNormal()

        w1("Operadores-2","Referential equality. Es 'pn1' igual a 'pn2'? ${pn1===pn2}") //true
        w1("Operadores-2","Structural equality. Es 'pn1' igual a 'pn2'? ${pn1==pn2}") //true
    }

    private fun showcase3()
    {
        val pn1 = PersonEqualOver()
        val pn2 = PersonEqualOver()

        w1("Operadores-3","Referential equality. Es 'pn1' igual a 'pn2'? ${pn1===pn2}") //true
        w1("Operadores-3","Structural equality. Es 'pn1' igual a 'pn2'? ${pn1==pn2}") //true

    }

    private fun showcase4()
    {
        val pn1 = PersonDataClass()
        val pn2 = PersonDataClass()
        val pn3 = PersonDataClass("Enrique")

        w1("Operadores-4","Referential equality. Es 'pn1' igual a 'pn2'? ${pn1===pn2}") //true
        w1("Operadores-4","Structural equality. Es 'pn1' igual a 'pn2'? ${pn1==pn2}") //true
        w1("Operadores-4","Structural equality. Es 'pn1' igual a 'pn3'? ${pn1==pn3}") //true
    }

    fun ShowCases()
    {
        showcase1()
        showcase2()
        showcase3()
        showcase4()
    }

    class PersonNormal
    {
        val name = "Daniel"
    }

    class PersonEqualOver
    {
        val name = "Daniel"
        override fun equals(other: Any?): Boolean {
            if (other == null) return false
            if (other is PersonEqualOver)
            {
                return other.name == this.name
            }
            return false
        }
    }

    data class PersonDataClass (val name: String = "Daniel", val age: Int = 27)

}