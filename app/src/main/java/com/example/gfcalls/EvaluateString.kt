package com.example.gfcalls

import java.util.*

class EvaluateString {
    fun evaluate(expression: String): Int {
        val tokens = expression.toCharArray()

        val values = Stack<Int>()
        val ops = Stack<Char>()
        var i = 0
        while (i < tokens.size) {
            if (tokens[i] == ' ') {
                i++
                continue
            }
            if (tokens[i] >= '0' &&
                tokens[i] <= '9'
            ) {
                val sbuf = StringBuffer()
                while (i < tokens.size && tokens[i] >= '0' && tokens[i] <= '9') sbuf.append(tokens[i++])
                values.push(sbuf.toString().toInt())
                i--
            } else if (tokens[i] == '(') ops.push(tokens[i]) else if (tokens[i] == ')') {
                while (ops.peek() != '(') values.push(
                    applyOp(
                        ops.pop(),
                        values.pop(),
                        values.pop()
                    )
                )
                ops.pop()
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') {
                while (!ops.empty() &&
                    hasPrecedence(
                        tokens[i],
                        ops.peek()
                    )
                ) values.push(
                    applyOp(
                        ops.pop(),
                        values.pop(),
                        values.pop()
                    )
                )

                ops.push(tokens[i])
            }
            i++
        }
        while (!ops.empty()) values.push(
            applyOp(
                ops.pop(),
                values.pop(),
                values.pop()
            )
        )
        return values.pop()
    }
    fun hasPrecedence(
        op1: Char, op2: Char
    ): Boolean {
        if (op2 == '(' || op2 == ')') return false
        return if ((op1 == '*' || op1 == '/') &&
            (op2 == '+' || op2 == '-')
        ) false else true
    }
    fun applyOp(
        op: Char,
        b: Int, a: Int
    ): Int {
        when (op) {
            '+' -> return a + b
            '-' -> return a - b
            '*' -> return a * b
            '/' -> {
                if (b == 0) throw UnsupportedOperationException(
                    "Cannot divide by zero"
                )
                return a / b
            }
        }
        return 0
    }
}