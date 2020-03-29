package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArray: IntArray = sadArray
        var checkHappy = true
        var i = 1
        while (checkHappy) {
            checkHappy = false
            while (i < happyArray.size - 1) {
                if (happyArray[i] > happyArray[i + 1] + happyArray[i - 1]) {
                    var reducedArray = emptyArray<Int>()
                    for (x in 0 until happyArray.size) {
                        if (x != i) {
                            reducedArray = reducedArray + happyArray[x]
                        }
                    }
                    happyArray = reducedArray.toIntArray()
                    checkHappy = true
                }
                i++
            }
            i = 1
        }
        return happyArray
    }
}
