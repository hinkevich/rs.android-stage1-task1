package subtask4

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val array = inputString.toCharArray()
        val result = ArrayList<String>()
        var chek: Int
        val start = charArrayOf('<', '[', '(')
        val end = charArrayOf('>', ']', ')')
        var count: Int
        for (i in array.indices) {
            chek = start.indexOf(array[i])
            if (chek != -1) {
                count = 0
                var temp = ""
                loop@ for (i1 in i + 1 until array.size) {
                    if ((array[i1] == end[chek]) && (count == 0))
                        break@loop
                    temp += array[i1].toString()
                    if (array[i1] == array[i]) count++
                    if (array[i1] == end[chek]) count--
                }
                result.add(temp)
            }
        }
        return result.toTypedArray()
    }
}

