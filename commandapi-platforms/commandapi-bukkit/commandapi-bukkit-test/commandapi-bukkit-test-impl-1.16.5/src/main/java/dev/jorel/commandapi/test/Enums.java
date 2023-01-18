package dev.jorel.commandapi.test;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffectType;

import dev.jorel.commandapi.CommandAPIBukkit;

public abstract class Enums extends ArgumentNMS {

	public Enums(CommandAPIBukkit<?> baseNMS) {
		super(baseNMS);
	}

	@Override
	public final Enchantment[] getEnchantments() {
		return new Enchantment[] {
			Enchantment.PROTECTION_ENVIRONMENTAL,
			Enchantment.PROTECTION_FIRE,
			Enchantment.PROTECTION_FALL,
			Enchantment.PROTECTION_EXPLOSIONS,
			Enchantment.PROTECTION_PROJECTILE,
			Enchantment.OXYGEN,
			Enchantment.WATER_WORKER,
			Enchantment.THORNS,
			Enchantment.DEPTH_STRIDER,
			Enchantment.FROST_WALKER,
			Enchantment.BINDING_CURSE,
			Enchantment.DAMAGE_ALL,
			Enchantment.DAMAGE_UNDEAD,
			Enchantment.DAMAGE_ARTHROPODS,
			Enchantment.KNOCKBACK,
			Enchantment.FIRE_ASPECT,
			Enchantment.LOOT_BONUS_MOBS,
			Enchantment.SWEEPING_EDGE,
			Enchantment.DIG_SPEED,
			Enchantment.SILK_TOUCH,
			Enchantment.DURABILITY,
			Enchantment.LOOT_BONUS_BLOCKS,
			Enchantment.ARROW_DAMAGE,
			Enchantment.ARROW_KNOCKBACK,
			Enchantment.ARROW_FIRE,
			Enchantment.ARROW_INFINITE,
			Enchantment.LUCK,
			Enchantment.LURE,
			Enchantment.LOYALTY,
			Enchantment.IMPALING,
			Enchantment.RIPTIDE,
			Enchantment.CHANNELING,
			Enchantment.MULTISHOT,
			Enchantment.QUICK_CHARGE,
			Enchantment.PIERCING,
			Enchantment.MENDING,
			Enchantment.VANISHING_CURSE,
			Enchantment.SOUL_SPEED
		};
	}

	@Override
	public final EntityType[] getEntityTypes() {
		return new EntityType[] {
			EntityType.DROPPED_ITEM,
			EntityType.EXPERIENCE_ORB,
			EntityType.AREA_EFFECT_CLOUD,
			EntityType.ELDER_GUARDIAN,
			EntityType.WITHER_SKELETON,
			EntityType.STRAY,
			EntityType.EGG,
			EntityType.LEASH_HITCH,
			EntityType.PAINTING,
			EntityType.ARROW,
			EntityType.SNOWBALL,
			EntityType.FIREBALL,
			EntityType.SMALL_FIREBALL,
			EntityType.ENDER_PEARL,
			EntityType.ENDER_SIGNAL,
			EntityType.SPLASH_POTION,
			EntityType.THROWN_EXP_BOTTLE,
			EntityType.ITEM_FRAME,
			EntityType.WITHER_SKULL,
			EntityType.PRIMED_TNT,
			EntityType.FALLING_BLOCK,
			EntityType.FIREWORK,
			EntityType.HUSK,
			EntityType.SPECTRAL_ARROW,
			EntityType.SHULKER_BULLET,
			EntityType.DRAGON_FIREBALL,
			EntityType.ZOMBIE_VILLAGER,
			EntityType.SKELETON_HORSE,
			EntityType.ZOMBIE_HORSE,
			EntityType.ARMOR_STAND,
			EntityType.DONKEY,
			EntityType.MULE,
			EntityType.EVOKER_FANGS,
			EntityType.EVOKER,
			EntityType.VEX,
			EntityType.VINDICATOR,
			EntityType.ILLUSIONER,
			EntityType.MINECART_COMMAND,
			EntityType.BOAT,
			EntityType.MINECART,
			EntityType.MINECART_CHEST,
			EntityType.MINECART_FURNACE,
			EntityType.MINECART_TNT,
			EntityType.MINECART_HOPPER,
			EntityType.MINECART_MOB_SPAWNER,
			EntityType.CREEPER,
			EntityType.SKELETON,
			EntityType.SPIDER,
			EntityType.GIANT,
			EntityType.ZOMBIE,
			EntityType.SLIME,
			EntityType.GHAST,
			EntityType.ZOMBIFIED_PIGLIN,
			EntityType.ENDERMAN,
			EntityType.CAVE_SPIDER,
			EntityType.SILVERFISH,
			EntityType.BLAZE,
			EntityType.MAGMA_CUBE,
			EntityType.ENDER_DRAGON,
			EntityType.WITHER,
			EntityType.BAT,
			EntityType.WITCH,
			EntityType.ENDERMITE,
			EntityType.GUARDIAN,
			EntityType.SHULKER,
			EntityType.PIG,
			EntityType.SHEEP,
			EntityType.COW,
			EntityType.CHICKEN,
			EntityType.SQUID,
			EntityType.WOLF,
			EntityType.MUSHROOM_COW,
			EntityType.SNOWMAN,
			EntityType.OCELOT,
			EntityType.IRON_GOLEM,
			EntityType.HORSE,
			EntityType.RABBIT,
			EntityType.POLAR_BEAR,
			EntityType.LLAMA,
			EntityType.LLAMA_SPIT,
			EntityType.PARROT,
			EntityType.VILLAGER,
			EntityType.ENDER_CRYSTAL,
			EntityType.TURTLE,
			EntityType.PHANTOM,
			EntityType.TRIDENT,
			EntityType.COD,
			EntityType.SALMON,
			EntityType.PUFFERFISH,
			EntityType.TROPICAL_FISH,
			EntityType.DROWNED,
			EntityType.DOLPHIN,
			EntityType.CAT,
			EntityType.PANDA,
			EntityType.PILLAGER,
			EntityType.RAVAGER,
			EntityType.TRADER_LLAMA,
			EntityType.WANDERING_TRADER,
			EntityType.FOX,
			EntityType.BEE,
			EntityType.HOGLIN,
			EntityType.PIGLIN,
			EntityType.STRIDER,
			EntityType.ZOGLIN,
			EntityType.PIGLIN_BRUTE,
			EntityType.FISHING_HOOK,
			EntityType.LIGHTNING,
			EntityType.PLAYER,
			EntityType.UNKNOWN
		};
	}

	@Override
	public final org.bukkit.loot.LootTables[] getLootTables() {
		return new org.bukkit.loot.LootTables[] {
			// org.bukkit.loot.LootTables.EMPTY,
			org.bukkit.loot.LootTables.ABANDONED_MINESHAFT,
			org.bukkit.loot.LootTables.BURIED_TREASURE,
			org.bukkit.loot.LootTables.DESERT_PYRAMID,
			org.bukkit.loot.LootTables.END_CITY_TREASURE,
			org.bukkit.loot.LootTables.IGLOO_CHEST,
			org.bukkit.loot.LootTables.JUNGLE_TEMPLE,
			org.bukkit.loot.LootTables.JUNGLE_TEMPLE_DISPENSER,
			org.bukkit.loot.LootTables.NETHER_BRIDGE,
			org.bukkit.loot.LootTables.PILLAGER_OUTPOST,
			org.bukkit.loot.LootTables.BASTION_TREASURE,
			org.bukkit.loot.LootTables.BASTION_OTHER,
			org.bukkit.loot.LootTables.BASTION_BRIDGE,
			org.bukkit.loot.LootTables.BASTION_HOGLIN_STABLE,
			org.bukkit.loot.LootTables.RUINED_PORTAL,
			org.bukkit.loot.LootTables.SHIPWRECK_MAP,
			org.bukkit.loot.LootTables.SHIPWRECK_SUPPLY,
			org.bukkit.loot.LootTables.SHIPWRECK_TREASURE,
			org.bukkit.loot.LootTables.SIMPLE_DUNGEON,
			org.bukkit.loot.LootTables.SPAWN_BONUS_CHEST,
			org.bukkit.loot.LootTables.STRONGHOLD_CORRIDOR,
			org.bukkit.loot.LootTables.STRONGHOLD_CROSSING,
			org.bukkit.loot.LootTables.STRONGHOLD_LIBRARY,
			org.bukkit.loot.LootTables.UNDERWATER_RUIN_BIG,
			org.bukkit.loot.LootTables.UNDERWATER_RUIN_SMALL,
			org.bukkit.loot.LootTables.VILLAGE_ARMORER,
			org.bukkit.loot.LootTables.VILLAGE_BUTCHER,
			org.bukkit.loot.LootTables.VILLAGE_CARTOGRAPHER,
			org.bukkit.loot.LootTables.VILLAGE_DESERT_HOUSE,
			org.bukkit.loot.LootTables.VILLAGE_FISHER,
			org.bukkit.loot.LootTables.VILLAGE_FLETCHER,
			org.bukkit.loot.LootTables.VILLAGE_MASON,
			org.bukkit.loot.LootTables.VILLAGE_PLAINS_HOUSE,
			org.bukkit.loot.LootTables.VILLAGE_SAVANNA_HOUSE,
			org.bukkit.loot.LootTables.VILLAGE_SHEPHERD,
			org.bukkit.loot.LootTables.VILLAGE_SNOWY_HOUSE,
			org.bukkit.loot.LootTables.VILLAGE_TAIGA_HOUSE,
			org.bukkit.loot.LootTables.VILLAGE_TANNERY,
			org.bukkit.loot.LootTables.VILLAGE_TEMPLE,
			org.bukkit.loot.LootTables.VILLAGE_TOOLSMITH,
			org.bukkit.loot.LootTables.VILLAGE_WEAPONSMITH,
			org.bukkit.loot.LootTables.WOODLAND_MANSION,
			org.bukkit.loot.LootTables.ARMOR_STAND,
			org.bukkit.loot.LootTables.BAT,
			org.bukkit.loot.LootTables.BEE,
			org.bukkit.loot.LootTables.BLAZE,
			org.bukkit.loot.LootTables.CAT,
			org.bukkit.loot.LootTables.CAVE_SPIDER,
			org.bukkit.loot.LootTables.CHICKEN,
			org.bukkit.loot.LootTables.COD,
			org.bukkit.loot.LootTables.COW,
			org.bukkit.loot.LootTables.CREEPER,
			org.bukkit.loot.LootTables.DOLPHIN,
			org.bukkit.loot.LootTables.DONKEY,
			org.bukkit.loot.LootTables.DROWNED,
			org.bukkit.loot.LootTables.ELDER_GUARDIAN,
			org.bukkit.loot.LootTables.ENDERMAN,
			org.bukkit.loot.LootTables.ENDERMITE,
			org.bukkit.loot.LootTables.ENDER_DRAGON,
			org.bukkit.loot.LootTables.EVOKER,
			org.bukkit.loot.LootTables.FOX,
			org.bukkit.loot.LootTables.GHAST,
			org.bukkit.loot.LootTables.GIANT,
			org.bukkit.loot.LootTables.GUARDIAN,
			org.bukkit.loot.LootTables.HOGLIN,
			org.bukkit.loot.LootTables.HORSE,
			org.bukkit.loot.LootTables.HUSK,
			org.bukkit.loot.LootTables.ILLUSIONER,
			org.bukkit.loot.LootTables.IRON_GOLEM,
			org.bukkit.loot.LootTables.LLAMA,
			org.bukkit.loot.LootTables.MAGMA_CUBE,
			org.bukkit.loot.LootTables.MOOSHROOM,
			org.bukkit.loot.LootTables.MULE,
			org.bukkit.loot.LootTables.OCELOT,
			org.bukkit.loot.LootTables.PANDA,
			org.bukkit.loot.LootTables.PARROT,
			org.bukkit.loot.LootTables.PHANTOM,
			org.bukkit.loot.LootTables.PIG,
			org.bukkit.loot.LootTables.PIGLIN,
			org.bukkit.loot.LootTables.PIGLIN_BRUTE,
			org.bukkit.loot.LootTables.PILLAGER,
			org.bukkit.loot.LootTables.PLAYER,
			org.bukkit.loot.LootTables.POLAR_BEAR,
			org.bukkit.loot.LootTables.PUFFERFISH,
			org.bukkit.loot.LootTables.RABBIT,
			org.bukkit.loot.LootTables.RAVAGER,
			org.bukkit.loot.LootTables.SALMON,
			org.bukkit.loot.LootTables.SHULKER,
			org.bukkit.loot.LootTables.SILVERFISH,
			org.bukkit.loot.LootTables.SKELETON,
			org.bukkit.loot.LootTables.SKELETON_HORSE,
			org.bukkit.loot.LootTables.SLIME,
			org.bukkit.loot.LootTables.SNOW_GOLEM,
			org.bukkit.loot.LootTables.SPIDER,
			org.bukkit.loot.LootTables.SQUID,
			org.bukkit.loot.LootTables.STRAY,
			org.bukkit.loot.LootTables.STRIDER,
			org.bukkit.loot.LootTables.TRADER_LLAMA,
			org.bukkit.loot.LootTables.TROPICAL_FISH,
			org.bukkit.loot.LootTables.TURTLE,
			org.bukkit.loot.LootTables.VEX,
			org.bukkit.loot.LootTables.VILLAGER,
			org.bukkit.loot.LootTables.VINDICATOR,
			org.bukkit.loot.LootTables.WANDERING_TRADER,
			org.bukkit.loot.LootTables.WITCH,
			org.bukkit.loot.LootTables.WITHER,
			org.bukkit.loot.LootTables.WITHER_SKELETON,
			org.bukkit.loot.LootTables.WOLF,
			org.bukkit.loot.LootTables.ZOGLIN,
			org.bukkit.loot.LootTables.ZOMBIE,
			org.bukkit.loot.LootTables.ZOMBIE_HORSE,
			org.bukkit.loot.LootTables.ZOMBIE_VILLAGER,
			org.bukkit.loot.LootTables.ZOMBIFIED_PIGLIN,
			org.bukkit.loot.LootTables.ARMORER_GIFT,
			org.bukkit.loot.LootTables.BUTCHER_GIFT,
			org.bukkit.loot.LootTables.CARTOGRAPHER_GIFT,
			org.bukkit.loot.LootTables.CAT_MORNING_GIFT,
			org.bukkit.loot.LootTables.CLERIC_GIFT,
			org.bukkit.loot.LootTables.FARMER_GIFT,
			org.bukkit.loot.LootTables.FISHERMAN_GIFT,
			org.bukkit.loot.LootTables.FISHING,
			org.bukkit.loot.LootTables.FISHING_FISH,
			org.bukkit.loot.LootTables.FISHING_JUNK,
			org.bukkit.loot.LootTables.FISHING_TREASURE,
			org.bukkit.loot.LootTables.FLETCHER_GIFT,
			org.bukkit.loot.LootTables.LEATHERWORKER_GIFT,
			org.bukkit.loot.LootTables.LIBRARIAN_GIFT,
			org.bukkit.loot.LootTables.MASON_GIFT,
			org.bukkit.loot.LootTables.SHEPHERD_GIFT,
			org.bukkit.loot.LootTables.TOOLSMITH_GIFT,
			org.bukkit.loot.LootTables.WEAPONSMITH_GIFT,
			org.bukkit.loot.LootTables.PIGLIN_BARTERING,
			org.bukkit.loot.LootTables.SHEEP,
			org.bukkit.loot.LootTables.SHEEP_BLACK,
			org.bukkit.loot.LootTables.SHEEP_BLUE,
			org.bukkit.loot.LootTables.SHEEP_BROWN,
			org.bukkit.loot.LootTables.SHEEP_CYAN,
			org.bukkit.loot.LootTables.SHEEP_GRAY,
			org.bukkit.loot.LootTables.SHEEP_GREEN,
			org.bukkit.loot.LootTables.SHEEP_LIGHT_BLUE,
			org.bukkit.loot.LootTables.SHEEP_LIGHT_GRAY,
			org.bukkit.loot.LootTables.SHEEP_LIME,
			org.bukkit.loot.LootTables.SHEEP_MAGENTA,
			org.bukkit.loot.LootTables.SHEEP_ORANGE,
			org.bukkit.loot.LootTables.SHEEP_PINK,
			org.bukkit.loot.LootTables.SHEEP_PURPLE,
			org.bukkit.loot.LootTables.SHEEP_RED,
			org.bukkit.loot.LootTables.SHEEP_WHITE,
			org.bukkit.loot.LootTables.SHEEP_YELLOW
		};
	}

	@Override
	public final PotionEffectType[] getPotionEffects() {
		return new PotionEffectType[] {
			PotionEffectType.SPEED,
			PotionEffectType.SLOW,
			PotionEffectType.FAST_DIGGING,
			PotionEffectType.SLOW_DIGGING,
			PotionEffectType.INCREASE_DAMAGE,
			PotionEffectType.HEAL,
			PotionEffectType.HARM,
			PotionEffectType.JUMP,
			PotionEffectType.CONFUSION,
			PotionEffectType.REGENERATION,
			PotionEffectType.DAMAGE_RESISTANCE,
			PotionEffectType.FIRE_RESISTANCE,
			PotionEffectType.WATER_BREATHING,
			PotionEffectType.INVISIBILITY,
			PotionEffectType.BLINDNESS,
			PotionEffectType.NIGHT_VISION,
			PotionEffectType.HUNGER,
			PotionEffectType.WEAKNESS,
			PotionEffectType.POISON,
			PotionEffectType.WITHER,
			PotionEffectType.HEALTH_BOOST,
			PotionEffectType.ABSORPTION,
			PotionEffectType.SATURATION,
			PotionEffectType.GLOWING,
			PotionEffectType.LEVITATION,
			PotionEffectType.LUCK,
			PotionEffectType.UNLUCK,
			PotionEffectType.SLOW_FALLING,
			PotionEffectType.CONDUIT_POWER,
			PotionEffectType.DOLPHINS_GRACE,
			PotionEffectType.BAD_OMEN,
			PotionEffectType.HERO_OF_THE_VILLAGE
		};
	}

}
