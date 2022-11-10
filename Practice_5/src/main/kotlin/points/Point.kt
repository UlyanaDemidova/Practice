package points

open class Point (private var _x:Double, private var _y:Double){
    constructor():this (0.0, 0.0)
    var x
        set(value) {
            x = _x
        }
        get() = _x
    var y
        set(value){
            y= _y
        }
        get() = _y

    override fun toString(): String = "\nТочка (x = $x; y = $y)"
}