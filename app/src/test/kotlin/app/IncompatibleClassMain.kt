package app

import api.MyEnum
import api.f

fun main() {
    f(MyEnum.A)
}

inline fun f2(enum: MyEnum): String = when (enum) {
    MyEnum.A -> "A"
    MyEnum.B -> "B"
}
