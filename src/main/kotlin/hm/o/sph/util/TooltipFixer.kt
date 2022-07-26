@file:Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package hm.o.sph.util

import hm.o.sph.util.CharacterChecker.Of.lastPlacedCharLs
import net.minecraft.client.font.TextRenderer
import net.minecraft.text.Text
import net.minecraft.text.Text.literal
import kotlin.collections.ArrayList

/**
 * @property x The rendering position of tooltip component.
 * @property width The width of game screen.
 * @property mouseX The mouse position in game.
 * @property reversed The flipping state of component.
 */
object TooltipFixer {

    private var x: Int = 0
    private var width: Int = 0
    private var mouseX = 0
    private var reversed = false

    fun set(xValue: Int, widthValue: Int) {
        x = xValue
        width = widthValue
        mouseX = x - 24
        reversed = false
    }

    @Suppress("PLATFORM_CLASS_MAPPED_TO_KOTLIN")
    fun fix(textResource: List<Text>, renderer: TextRenderer): ArrayList<Text> {
        val text = ArrayList(textResource)
        val fintxt = arrayListOf<Text>()
        val currln = StringBuilder()

        if (!reversed && x > width / 2) { reversed = true; return fix(text, renderer) }

        if (text.size > 1) {
            outside@for (i in 0 until text.size) {
                val style = text[i].style

                /*if (text[i].string.hasCJK) {
                    if (i == 0) {
                        fintxt += text[i]
                        continue
                    }
                    val sentences = ArrayList(text[i].string cut lastPlacedCharLs().string)
                    if (sentences.isEmpty()) return text
                    currln.append(sentences.removeAt(0))
                    do {
                        if (currln.toString() isLooseOn renderer) {
                            val punchar = sentences.removeAt(0)
                            if (currln.toString() + punchar isTightOn renderer) {
                                nextln.append(punchar)
                                nextln.append(currln.last())
                                currln.deleteCharAt(currln.length - 1)
                                fintxt += literal(currln.toString()).setStyle(style)
                                currln.clear()
                                currln.append(nextln.reverse())
                            } else {
                                fintxt += literal(currln.toString() + punchar).setStyle(style)
                                currln.clear()
                                currln.append(nextln.reverse())
                            }
                            fintxt += literal(currln.toString() + punchar).setStyle(style) // ..
                            currln.clear()
                            currln.append(nextln.reverse())
                            break
                        }
                        nextln.append(currln.last())
                        currln.deleteCharAt(currln.length - 1)
                    } while (currln.toString() isTightOn renderer)
                    continue
                }*/
                val sentences = ArrayList(text[i].string.split(" ") )
                if (sentences.isEmpty()) return text
                do {
                    if (sentences.size == 1 || currln.toString() + " " + sentences.head isTightOn renderer) {
                        if (sentences.size == 1) {
                            if (currln.toString() + " " + sentences.head isTightOn renderer) { fintxt += literal(currln.toString()).setStyle(style); currln.clear() }
                            currln.append(sentences.removeAt(0))
                        }
                        fintxt += literal(currln.toString()).setStyle(style)
                        currln.clear()
                        if (sentences.size == 0) continue@outside
                    }
                    currln.append("${sentences.removeAt(0)} ")
                } while (currln.toString() isLooseOn renderer)
            }
            return fintxt
        }
        return text
    }

    private infix fun String.isTightOn(renderer: TextRenderer): Boolean {
        return renderer.getWidth(this) > 150
    }

    private infix fun String.isLooseOn(renderer: TextRenderer): Boolean {
        return renderer.getWidth(this) <= 150
    }

    private inline val String.hasCJK: Boolean
        get() = CharacterChecker.hasCJK(this)

    private inline val Char.isLastPlaced: Boolean
        get() = this in lastPlacedCharLs()
}