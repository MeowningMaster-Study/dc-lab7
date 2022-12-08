package dc.lab7

import org.w3c.dom.Element
import org.w3c.dom.Node

interface XMLTo {
    fun fill(element: Element)
}

interface XMLFrom<T> {
    fun parse(node: Node): T
}