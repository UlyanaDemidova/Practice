package points

import java.awt.Color

class ColoredPoint (x:Double, y:Double,private var _color:Color):Point(x,y) {
    constructor(): this(0.0,0.0, Color.PINK)
    var color
        set(value) {
          color=_color
        }
        get() = _color

    override fun toString(): String {
        return "${super.toString()} Цвет точки: ${color.toString()}"
    }
}