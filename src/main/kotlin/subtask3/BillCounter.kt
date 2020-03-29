package subtask3

class BillCounter {


    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        if ((bill.sum()-bill[k])/2==b){
            return "bon appetit"
        }else{
            return ((b-(bill.sum()-bill[k])/2).toString())
        }
    }
}
