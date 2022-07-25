package hm.o.sph.init.item

import net.minecraft.text.Text.translatable

val itemCategoryTexts = { mod: String -> { category: SophisCategory -> translatable("tooltip.${mod}.category.${category}")!! } }

val divideText = translatable("tooltip.sph.divide")!!

val undroppableText = translatable("tooltip.sph.droppable")!!

val inhabitingText = { mod: String -> { inhabitant: SophisInhabitant -> translatable("tooltip.${mod}.inhabitant.${inhabitant}")!! } }

//tipText addon

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