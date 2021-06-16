package api

enum class MyEnum {
    A, B
}

inline fun f(enum: MyEnum): String = when (enum) {
    MyEnum.A -> "A"
    MyEnum.B -> "B"
}
