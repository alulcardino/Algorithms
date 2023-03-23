package com.romanmikhailenko.algorithms

class QuickFind(n: Int) {
    val id = IntArray(n)

    init {
        for (i in 0 until n) {
            id[i] = i;
        }
    }

    fun connected(p: Int, q: Int) : Boolean {
        return (id[p] == id[q])
    }

    fun union(p: Int, q: Int) {
        val pId = id[p]
        val qId = id[q]
        for (i in id.indices) {
            if (id[i] == pId) {
                id[i] = qId
            }
         }
    }


}