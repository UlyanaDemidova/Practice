import lines.ColoredLine
import lines.Line
import points.ColoredPoint
import points.Point
import java.awt.Color

fun main(args: Array<String>) {
    var point: ColoredPoint = ColoredPoint(6.8, 5.2, Color.PINK)
    println(point)
    var line: ColoredLine = ColoredLine(ColoredPoint(3.5, 5.3, Color.BLUE),
        ColoredPoint(2.8, 16.4, Color.GRAY), Color.PINK)
    println(line)
}