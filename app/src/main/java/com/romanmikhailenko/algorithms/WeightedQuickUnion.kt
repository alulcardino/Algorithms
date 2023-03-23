package com.romanmikhailenko.algorithms

class WeightedQuickUnion(n: Int) {
    private val id = IntArray(n)
    private val sizes = IntArray(n)


    init {
        for (i in 0 until n) {
            id[i] = i
            sizes[i] = 1
        }
    }

    private fun root(i : Int) : Int {
        var temp = i;
        while (temp != id[i]) {
            id[temp] = id[id[temp]]
            temp = id[i]
        }
        return temp;
    }

    fun connected(p: Int, q: Int) : Boolean {
        return root(p) == root(q)
    }

    fun union(p: Int, q: Int) {
        val i = root(p)
        val j = root(q)
        if (sizes[i] < sizes[j]) {
            id[i] = j;
            sizes[j] += sizes[i]
        } else {
            id[j] = i;
            sizes[i] += sizes[j]
        }
    }





}