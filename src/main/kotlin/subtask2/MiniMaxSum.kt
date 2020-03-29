package subtask2

class MiniMaxSum {


    fun getResult(input: IntArray): IntArray {
        val min: Int? =input.min()
        val max: Int? =input.max()
        val summa:Int=input.sum()
        return intArrayOf(summa- max!!,summa- min!!)

    }
}
