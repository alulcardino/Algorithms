package com.romanmikhailenko.algorithms

class QuickUnion(n : Int) {
    private val id = IntArray(n)

    init {
        for (i in 0 until n) {
            id[i] = i;
        }
    }

    private fun root(i : Int) : Int {
        var temp = i;
        while (temp != id[i]) {
            temp = id[i]
        }
        return temp;
    }

    fun connected(p: Int, q: Int) : Boolean {
        return root(p) == root(q)
    }

    fun union(p: Int, q: Int) {
        id[root(p)] = root(q)
    }


}