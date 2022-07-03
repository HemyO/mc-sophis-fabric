package hm.o.sph.init.item

val genItemCategory = { mod: String -> { category: Category -> "tooltip.${mod}.${category.name}" } }

const val genDivide = "tooltip.sph.divide"
// TODO: INHABITANTS TO ENUM
val genInhabiting = { mod: String -> { inhabitants: String -> "tooltip.${mod}.${inhabitants}"}}

val genItemTips = { mod: String -> { item: String -> "tooltip.${mod}.${item}.tip" } }
// TODO: ITEM TO SOPHIS ITEM WITH ID
val genItemStory = { mod: String -> { item: String -> "tooltip.${mod}.${item}.story" } }
// TODO: ENERGY TO ENUM
val genViana = { mod: String -> { energy: String -> { "tooltip.${mod}.${energy}.viana" } } }
// TODO: ATTR TO ATTRIBUTE WITH ID
val genAttr = { mod: String -> { attr: String -> { "tooltip.${mod}.${attr}.attr" } } }
// TODO: ATTR TO ATTRIBUTE WITH ID
val genSpecialAttr = { mod: String -> { attr: String -> { "tooltip.${mod}.${attr}.spec" } } }

const val genRental = "tooltip.sph.rental"

const val genBinding = "tooltip.sph.binding"