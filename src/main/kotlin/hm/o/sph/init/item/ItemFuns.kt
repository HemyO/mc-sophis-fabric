package hm.o.sph.init.item

import hm.o.sph.util.SpecialChar.Of.isSpaceChar
import net.minecraft.text.Text
import net.minecraft.text.Text.translatable

val itemCategoryTexts = { mod: String -> { category: SophisCategory -> translatable("tooltip.${mod}.category.${category}")!! } }

val divideText = translatable("tooltip.sph.divide")!!

val undroppableText = translatable("tooltip.sph.droppable")!!

val inhabitingText = { mod: String -> { inhabitant: SophisInhabitant -> translatable("tooltip.${mod}.inhabitant.${inhabitant}")!! } }

val tipTexts = { mod: String ->
    { item: SophisItem ->
        {
            var tips = translatable("tooltip.${mod}.tip.${item.id}")!!.string
            val rawString = StringBuilder()
            val isPunctuation = { tip: Char ->
                // TODO: Check the unicode which Korean, Japanese punctuation will use.
                // This predicate only supports Chinese, Japanese, and Korean which according Wikipedia.
                tip == '\uFF0C'             // Chinese Full-width Comma
                        || tip == '\u3002'  // Chinese Full-width Stop [CJK]
                        || tip == '\u3001'  // Chinese Full-width Listable Comma [CJK]
                        || tip == '\uFF1A'  // Chinese Full-width Colon
                        || tip == '\uFF1B'  // Chinese Full-width Semicolon
                        || tip == '\uFF1F'  // Chinese Full-width Question Mark
                        || tip == '\uFF01'  // Chinese Full-width Exclamation
                        || tip == '\uFF0E'  // Chinese Full-width Full Stop
                        || tip == '\uFF5E'  // Chinese Full-width Tilde
                        || tip == '\u2014'  // Chinese Em Dash
            }
            val resultTexts = mutableListOf<Text>()
            var resultIndex = 0

            while (tips.isNotEmpty()) {
                tips.forEachIndexed { index, tip ->
                    if (index <= 12) rawString[index] = tip
                    else if (isPunctuation(tip)) {
                        TODO()
                    }
                    else if (!isSpaceChar(tip)) rawString[index] = tip
                    else {
                        resultTexts[resultIndex] = translatable(rawString.toString())
                        resultIndex++
                        rawString.clear()
                        tips = tips.substring(IntRange(index + 1, tips.length - 1))
                    }
                }
            }
            resultTexts
        }
    }
}

val genItemCategory = { mod: String -> { category: SophisCategory -> "tooltip.${mod}.category.${category}" } }

const val genDivide = "tooltip.sph.divide"

val genItemTips = { mod: String -> { item: SophisItem -> "tooltip.${mod}.${item.id}.tip" } }

// TODO: ITEM TO SOPHIS ITEM WITH ID
val genItemStory = { mod: String -> { item: String -> "tooltip.${mod}.${item}.story" } }

// TODO: ENERGY TO ENUM
val genViana = { mod: String -> { energy: String -> { "tooltip.${mod}.viana.${energy}" } } }

// TODO: ATTR TO ATTRIBUTE WITH ID
val genAttr = { mod: String -> { attr: String -> { "tooltip.${mod}.attr.${attr}" } } }

// TODO: ATTR TO ATTRIBUTE WITH ID
val genSpecialAttr = { mod: String -> { attr: String -> { "tooltip.${mod}.attr_spec.${attr}" } } }