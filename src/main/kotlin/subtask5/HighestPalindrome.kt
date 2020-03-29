package subtask5

class HighestPalindrome {

    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        val length = digitString.length
        val max = getMax(digitString)
        val stringBuilder = StringBuilder(digitString)
        var count = 0

        for (i in 0 until length / 2) {
            if (digitString[i] != digitString[length - i - 1]) {
                stringBuilder[i] = max
                stringBuilder[length - i - 1] = max
                count++
            }
        }
        if (count > k) {
            return (-1).toString()
        }
        return stringBuilder.toString()
    }


    private fun getMax(digitString: String): Char {
        var max = Int.MIN_VALUE
        for (digit in digitString) {
            val i = digit.toInt()
            if (i > max) {
                max = i
            }
        }
        return max.toChar()
    }
}

