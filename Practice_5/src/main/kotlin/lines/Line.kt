package lines

import points.ColoredPoint
import java.awt.Color

open class Line (private var _pointBedin: ColoredPoint, private var _pointEnd: ColoredPoint) {
    constructor(): this (ColoredPoint(), ColoredPoint())
    var pointBegin
        set(value) {
            pointBegin=_pointBedin
        }
        get() = _pointBedin
    var pointEnd
        set(value) {
            pointEnd=_pointEnd
        }
        get() = _pointEnd

    override fun toString(): String = "Линия: \nточка 1 - $pointBegin,\nточка 2 - $pointEnd"
}