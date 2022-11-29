package com.example.gfcalls

open class nullds {
     open fun removeLastChar(s: String?): String? {
        return if (s == null || s.length == 0) {
            s
        } else s.substring(0, s.length - 1)
    }

}
