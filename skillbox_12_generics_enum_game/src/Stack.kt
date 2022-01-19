//class Stack<T> {
//    val stack = Stack<T>()
//
//    fun push(item: T) {
//    stack.push(item)
//    }
//
//    fun pop(): T?  {
//        val result = stack.pop() ?: return null
//        return result
//    }
//}

class Stack<T> {
    private val stack = mutableListOf<T>()

    fun push(item: T) {
        stack.add(item)
    }

    fun pop(): T? {
        if (isEmpty()) {
            return null
        } else {
            val result = stack.removeAt(stack.count() - 1)
            return result
        }
    }

    fun isEmpty(): Boolean {
        return stack.size == 0
    }
}

