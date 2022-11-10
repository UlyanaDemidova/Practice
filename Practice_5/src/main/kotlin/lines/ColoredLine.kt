package lines

import points.ColoredPoint
import java.awt.Color

class ColoredLine(pointBedin: ColoredPoint, pointEnd: ColoredPoint, private var _colorLine:Color):
    Line(pointBedin, pointEnd) {
        constructor():this (ColoredPoint(), ColoredPoint(), Color.PINK)
    var colorLine
        set(value) {
            colorLine=_colorLine
        }
        get() = _colorLine

    override fun toString(): String {
        return "${super.toString()} \nЦвет линии: ${colorLine.toString()}"
    }
}