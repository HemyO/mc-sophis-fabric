package hm.o.sph.init.attr

import hm.o.sph.init.attr.NumberMode.*

object SophisAttributes {

    // region SURVIVAL ATTRIBUTES

    val MAX_HEALTH = Attribute(INTEGER)
    val MAX_HEALTH_MULTIPLIER = Attribute(PERCENT)
    val HEALTH = Attribute(INTEGER)
    val HEALTH_REGENERATION = Attribute(INTEGER)

    val MAX_ENERGY = Attribute(INTEGER)
    val MAX_ENERGY_MULTIPLIER = Attribute(PERCENT)
    val ENERGY = Attribute(INTEGER)
    val ENERGY_REGENERATION = Attribute(INTEGER)
    val CONSTRUCTING_ENERGY = Attribute(INTEGER)
    val EFFICIENT_CONSTRUCTION = Attribute(PERCENT)

    val WARD = Attribute(INTEGER)
    val WARD_THRESHOLD = Attribute(INTEGER)
    val WARD_THRESHOLD_MULTIPLIER = Attribute(PERCENT)
    val WARD_MAINTENANCE = Attribute(PERCENT)

    val MAX_HUNGER = Attribute(INTEGER)
    val HUNGER = Attribute(INTEGER)
    val MAX_SATURATION = Attribute(INTEGER)
    val SATURATION = Attribute(INTEGER)
    val SATURATION_MAINTENANCE = Attribute(PERCENT)

    val MAX_THIRST = Attribute(INTEGER)
    val THIRST = Attribute(INTEGER)
    val MAX_MOISTURIZATION = Attribute(INTEGER)
    val MOISTURIZATION = Attribute(INTEGER)
    val MOISTURIZATION_MAINTENANCE = Attribute(PERCENT)

    val MAX_SPIRIT = Attribute(INTEGER)
    val SPIRIT = Attribute(INTEGER)
    val MAX_JOYMENT = Attribute(INTEGER)
    val JOYMENT = Attribute(INTEGER)
    val JOYMENT_MAINTENANCE = Attribute(PERCENT)

    // endregion
    // region ATTACK ATTRIBUTES

    val BASIC_ATTACK = Attribute(INTEGER)
    val BASIC_ATTACK_MULTIPLIER = Attribute(PERCENT)

    val FIRE_ATTACK = Attribute(INTEGER)
    val FIRE_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val STORM_ATTACK = Attribute(INTEGER)
    val STORM_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val WATER_ATTACK = Attribute(INTEGER)
    val WATER_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val EARTH_ATTACK = Attribute(INTEGER)
    val EARTH_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val HEMY_ATTACK = Attribute(INTEGER)
    val HEMY_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val AETHER_ATTACK = Attribute(INTEGER)
    val AETHER_ATTACK_MULTIPLIER = Attribute(PERCENT)

    val MELEE_ATTACK = Attribute(INTEGER)
    val MELEE_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val PROJECTILE_ATTACK = Attribute(INTEGER)
    val PROJECTILE_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val SPELL_ATTACK = Attribute(INTEGER)
    val SPELL_ATTACK_MULTIPLIER = Attribute(PERCENT)

    val FIRE_MELEE_ATK = Attribute(INTEGER)
    val FIRE_MELEE_ATK_MUL = Attribute(PERCENT)
    val FIRE_PROJECTILE_ATK = Attribute(INTEGER)
    val FIRE_PROJECTILE_ATK_MUL = Attribute(PERCENT)
    val FIRE_SPELL_ATK = Attribute(INTEGER)
    val FIRE_SPELL_ATK_MUL = Attribute(PERCENT)

    val STORM_MELEE_ATK = Attribute(INTEGER)
    val STORM_MELEE_ATK_MUL = Attribute(PERCENT)
    val STORM_PROJECTILE_ATK = Attribute(INTEGER)
    val STORM_PROJECTILE_ATK_MUL = Attribute(PERCENT)
    val STORM_SPELL_ATK = Attribute(INTEGER)
    val STORM_SPELL_ATK_MUL = Attribute(PERCENT)

    val WATER_MELEE_ATK = Attribute(INTEGER)
    val WATER_MELEE_ATK_MUL = Attribute(PERCENT)
    val WATER_PROJECTILE_ATK = Attribute(INTEGER)
    val WATER_PROJECTILE_ATK_MUL = Attribute(PERCENT)
    val WATER_SPELL_ATK = Attribute(INTEGER)
    val WATER_SPELL_ATK_MUL = Attribute(PERCENT)

    val EARTH_MELEE_ATK = Attribute(INTEGER)
    val EARTH_MELEE_ATK_MUL = Attribute(PERCENT)
    val EARTH_PROJECTILE_ATK = Attribute(INTEGER)
    val EARTH_PROJECTILE_ATK_MUL = Attribute(PERCENT)
    val EARTH_SPELL_ATK = Attribute(INTEGER)
    val EARTH_SPELL_ATK_MUL = Attribute(PERCENT)

    val HEMY_MELEE_ATK = Attribute(INTEGER)
    val HEMY_MELEE_ATK_MUL = Attribute(PERCENT)
    val HEMY_PROJECTILE_ATK = Attribute(INTEGER)
    val HEMY_PROJECTILE_ATK_MUL = Attribute(PERCENT)
    val HEMY_SPELL_ATK = Attribute(INTEGER)
    val HEMY_SPELL_ATK_MUL = Attribute(PERCENT)

    val AETHER_MELEE_ATK = Attribute(INTEGER)
    val AETHER_MELEE_ATK_MUL = Attribute(PERCENT)
    val AETHER_PROJECTILE_ATK = Attribute(INTEGER)
    val AETHER_PROJECTILE_ATK_MUL = Attribute(PERCENT)
    val AETHER_SPELL_ATK = Attribute(INTEGER)
    val AETHER_SPELL_ATK_MUL = Attribute(PERCENT)

    // endregion
    // region DEFENSE ATTRIBUTES

    val BASIC_DEFENSE = Attribute(INTEGER)
    val BASIC_DEFENSE_MULTIPLIER = Attribute(PERCENT)

    val STRESS_THRESHOLD = Attribute(INTEGER)
    val STRESS_THRESHOLD_MULTIPLIER = Attribute(PERCENT)

    val FIRE_RESISTANCE = Attribute(PERCENT)
    val STORM_RESISTANCE = Attribute(PERCENT)
    val WATER_RESISTANCE = Attribute(PERCENT)
    val EARTH_RESISTANCE = Attribute(PERCENT)
    val HEMY_RESISTANCE = Attribute(PERCENT)
    val AETHER_RESISTANCE = Attribute(PERCENT)

    val EFFECT_DISUSE = Attribute(INTEGER)
    val EFFECT_RESISTANCE = Attribute(PERCENT)

    // endregion
    // region EFFECT ATTRIBUTES

    val CRITICAL_STRIKE_CHANCE = Attribute(PERCENT)
    val CRITICAL_STRIKE_LEVEL = Attribute(INTEGER)
    val CRITICAL_STRIKE_LEVEL_MULTIPLIER = Attribute(PERCENT)
    val FATAL_STRIKE_CHANCE = Attribute(PERCENT)

    val SKEW_DEFENSE_CHANCE = Attribute(PERCENT)
    val SKEW_DEFENSE_LEVEL = Attribute(INTEGER)
    val SKEW_DEFENSE_LEVEL_MULTIPLIER = Attribute(PERCENT)
    val DODGE_CHANCE = Attribute(PERCENT)

    val BLEED_CHANCE = Attribute(PERCENT)
    val BLEED_LEVEL = Attribute(INTEGER)
    val BLEED_LEVEL_MULTIPLIER = Attribute(PERCENT)

    val IGNITE_CHANCE = Attribute(PERCENT)
    val IGNITE_LEVEL = Attribute(INTEGER)
    val IGNITE_LEVEL_MULTIPLIER = Attribute(PERCENT)

    val FROSTBITE_CHANCE = Attribute(PERCENT)
    val FROSTBITE_LEVEL = Attribute(INTEGER)
    val FROSTBITE_LEVEL_MULTIPLIER = Attribute(PERCENT)

    val SHOCK_CHANCE = Attribute(PERCENT)
    val SHOCK_LEVEL = Attribute(INTEGER)
    val SHOCK_LEVEL_MULTIPLIER = Attribute(PERCENT)

    val POISON_CHANCE = Attribute(PERCENT)
    val POISON_LEVEL = Attribute(INTEGER)
    val POISON_LEVEL_MULTIPLIER = Attribute(PERCENT)

    val WITHER_CHANCE = Attribute(PERCENT)
    val WITHER_LEVEL = Attribute(INTEGER)
    val WITHER_LEVEL_MULTIPLIER = Attribute(PERCENT)

    val DESECRATE_CHANCE = Attribute(PERCENT)
    val DESECRATE_LEVEL = Attribute(INTEGER)
    val DESECRATE_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // MOVEMENT SPEED -
    val FREEZE_CHANCE = Attribute(PERCENT)
    val FREEZE_LEVEL = Attribute(INTEGER)
    val FREEZE_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // MOVEMENT SPEED +
    val BUOYANCY_CHANCE = Attribute(PERCENT)
    val BUOYANCY_LEVEL = Attribute(INTEGER)
    val BUOYANCY_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // BEHAVIOR
    val DIZZY_CHANCE = Attribute(PERCENT)

    // ATTACK BEHAVIOR
    val DISARM_CHANCE = Attribute(PERCENT)

    // DAMAGE -
    val CURSE_CHANCE = Attribute(PERCENT)
    val CURSE_LEVEL = Attribute(INTEGER)
    val CURSE_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // DAMAGE +
    val BLESS_CHANCE = Attribute(PERCENT)
    val BLESS_LEVEL = Attribute(INTEGER)
    val BLESS_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // DEFENSE -
    val CRACK_CHANCE = Attribute(PERCENT)
    val CRACK_LEVEL = Attribute(INTEGER)
    val CRACK_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // DEFENSE +
    val STABLE_CHANCE = Attribute(PERCENT)
    val STABLE_LEVEL = Attribute(INTEGER)
    val STABLE_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // HP +
    val HEAL_CHANCE = Attribute(PERCENT)
    val HEAL_LEVEL = Attribute(INTEGER)
    val HEAL_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // EP +
    val EXCITE_CHANCE = Attribute(PERCENT)
    val EXCITE_LEVEL = Attribute(INTEGER)
    val EXCITE_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // endregion
    // region MINION ATTRIBUTES

    val MINION_HEALTH = Attribute(INTEGER)
    val MINION_HEALTH_MULTIPLIER = Attribute(PERCENT)

    val MINION_ENERGY = Attribute(INTEGER)
    val MINION_ENERGY_MULTIPLIER = Attribute(PERCENT)

    val MINION_BASIC_ATTACK = Attribute(INTEGER)
    val MINION_BASIC_ATTACK_MULTIPLIER = Attribute(PERCENT)

    val MINION_FIRE_ATTACK = Attribute(INTEGER)
    val MINION_FIRE_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val MINION_WATER_ATTACK = Attribute(INTEGER)
    val MINION_WATER_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val MINION_EARTH_ATTACK = Attribute(INTEGER)
    val MINION_EARTH_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val MINION_STORM_ATTACK = Attribute(INTEGER)
    val MINION_STORM_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val MINION_HEMY_ATTACK = Attribute(INTEGER)
    val MINION_HEMY_ATTACK_MULTIPLIER = Attribute(PERCENT)
    val MINION_AETHER_ATTACK = Attribute(INTEGER)
    val MINION_AETHER_ATTACK_MULTIPLIER = Attribute(PERCENT)

    val MINION_MELEE_ATTACK = Attribute(INTEGER)
    val MINION_MELEE_MULTIPLIER = Attribute(PERCENT)
    val MINION_PROJECTILE_ATTACK = Attribute(INTEGER)
    val MINION_PROJECTILE_MULTIPLIER = Attribute(PERCENT)
    val MINION_SPELL_ATTACK = Attribute(INTEGER)
    val MINION_SPELL_MULTIPLIER = Attribute(PERCENT)

    val MINION_BASIC_DEFENSE = Attribute(INTEGER)
    val MINION_BASIC_DEFENSE_MULTIPLIER = Attribute(PERCENT)

    val MINION_EFFECT_CHANCE = Attribute(PERCENT)
    val MINION_EFFECT_LEVEL = Attribute(INTEGER)
    val MINION_EFFECT_LEVEL_MULTIPLIER = Attribute(PERCENT)

    // endregion
    // region POTION ATTRIBUTES

    // POTION EFFICIENT
    val POTION_ABSORPTION = Attribute(PERCENT)

    // POTION DURATION
    val POTION_PURIFICATION = Attribute(PERCENT)

    // POTION SIDE EFFECT
    val POTION_SUPERSESSION = Attribute(PERCENT)

    // endregion
    // region TRANSFORM ATTRIBUTES

    val FIRE_TO_WATER = Attribute(PERCENT)
    val FIRE_TO_STORM = Attribute(PERCENT)
    val FIRE_TO_EARTH = Attribute(PERCENT)
    val FIRE_TO_HEMY = Attribute(PERCENT)
    val FIRE_TO_AETHER = Attribute(PERCENT)

    val WATER_TO_FIRE = Attribute(PERCENT)
    val WATER_TO_STORM = Attribute(PERCENT)
    val WATER_TO_EARTH = Attribute(PERCENT)
    val WATER_TO_HEMY = Attribute(PERCENT)
    val WATER_TO_AETHER = Attribute(PERCENT)

    val STORM_TO_FIRE = Attribute(PERCENT)
    val STORM_TO_WATER = Attribute(PERCENT)
    val STORM_TO_EARTH = Attribute(PERCENT)
    val STORM_TO_HEMY = Attribute(PERCENT)
    val STORM_TO_AETHER = Attribute(PERCENT)

    val EARTH_TO_FIRE = Attribute(PERCENT)
    val EARTH_TO_WATER = Attribute(PERCENT)
    val EARTH_TO_STORM = Attribute(PERCENT)
    val EARTH_TO_HEMY = Attribute(PERCENT)
    val EARTH_TO_AETHER = Attribute(PERCENT)

    val HEMY_TO_FIRE = Attribute(PERCENT)
    val HEMY_TO_WATER = Attribute(PERCENT)
    val HEMY_TO_STORM = Attribute(PERCENT)
    val HEMY_TO_EARTH = Attribute(PERCENT)
    val HEMY_TO_AETHER = Attribute(PERCENT)

    val AETHER_TO_FIRE = Attribute(PERCENT)
    val AETHER_TO_WATER = Attribute(PERCENT)
    val AETHER_TO_STORM = Attribute(PERCENT)
    val AETHER_TO_EARTH = Attribute(PERCENT)
    val AETHER_TO_HEMY = Attribute(PERCENT)

    val FIRE_TO_NULL = Attribute(PERCENT)
    val WATER_TO_NULL = Attribute(PERCENT)
    val STORM_TO_NULL = Attribute(PERCENT)
    val EARTH_TO_NULL = Attribute(PERCENT)
    val AETHER_TO_NULL = Attribute(PERCENT)
    val HEMY_TO_NULL = Attribute(PERCENT)

    // endregion
    // region SPEED ATTRIBUTES

    val PLAYER_MOVING_SPEED = Attribute(PERCENT)
    val SKILL_ATTACKING_SPEED = Attribute(PERCENT)
    val SKILL_CASTING_SPEED = Attribute(PERCENT)
    val SKILL_COOLING_SPEED = Attribute(PERCENT)
    val ENERGY_REGULATING_SPEED = Attribute(PERCENT)

    val GATHERING_SPEED = Attribute(PERCENT)
    val RESEARCHING_SPEED = Attribute(PERCENT)
    val TEACHING_SPEED = Attribute(PERCENT)
    val LEADING_SPEED = Attribute(PERCENT)

    // endregion
    // region SKILL ATTRIBUTES

    // SPECIFIC SKILL ATTRIBUTES

    // endregion

}