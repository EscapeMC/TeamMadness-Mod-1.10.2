package com.github.escapemc.teammadnessmod;

public class Reference {

	
	public static final String MOD_ID = "tmm";
	public static final String MOD_NAME = "TeamMadness Mod";
	public static final String MOD_VERSION = "1.7.0.1";
	public static final String ACCEPTED_VERSIONS = "[1.9.4,1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.github.escapemc.teammadnessmod.proxies.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.github.escapemc.teammadnessmod.proxies.ServerProxy";
	
			
	public static enum ModItems {
		
		ESCAPEMC_INGOT("escapemc_ingot", "escapemc_ingot"),
		MUSHRROMSTEW_INGOT("mushrromstew_ingot", "mushrromstew_ingot"),
		EPICBUDDER22_INGOT("epicbudder22_ingot", "epicbudder22_ingot"),
		SPLIXFPV_INGOT("splixfpv_ingot", "splixfpv_ingot"),
		IANPLAYSYT_INGOT("ianplaysyt_ingot", "ianplaysyt_ingot"),
		BOSSFACE88_INGOT("bossface88_ingot", "bossface88_ingot"),
		DIAMONDTIPS_INGOT("diamondtips_ingot", "diamondtips_ingot"),
		
		MADNESS_DUST("madness_dust", "madness_dust"),
		
		ESCAPEMC_SWORD("escapemc_sword", "escapemc_sword"),
		ESCAPEMC_PICKAXE("escapemc_pickaxe", "escapemc_pickaxe"),
		ESCAPEMC_AXE("escapemc_axe", "escapemc_axe"),
		ESCAPEMC_SHOVEL("escapemc_shovel", "escapemc_shovel"),
		ESCAPEMC_HOE("escapemc_hoe", "escapemc_hoe"),
		ESCAPEMC_HELMET("escapemc_helmet", "escapemc_helmet"),
		ESCAPEMC_CHESTPLATE("escapemc_chestplate", "escapemc_chestplate"),
		ESCAPEMC_LEGGINGS("escapemc_leggings", "escapemc_leggings"),
		ESCAPEMC_BOOTS("escapemc_boots", "escapemc_boots"),

		MUSHRROMSTEW_SWORD("mushrromstew_sword", "mushrromstew_sword"),
		MUSHRROMSTEW_PICKAXE("mushrromstew_pickaxe", "mushrromstew_pickaxe"),
		MUSHRROMSTEW_AXE("mushrromstew_axe", "mushrromstew_axe"),
		MUSHRROMSTEW_SHOVEL("mushrromstew_shovel", "mushrromstew_shovel"),
		MUSHRROMSTEW_HOE("mushrromstew_hoe", "mushrromstew_hoe"),
		MUSHRROMSTEW_HELMET("mushrromstew_helmet", "mushrromstew_helmet"),
		MUSHRROMSTEW_CHESTPLATE("mushrromstew_chestplate", "mushrromstew_chestplate"),
		MUSHRROMSTEW_LEGGINGS("mushrromstew_leggings", "mushrromstew_leggings"),
		MUSHRROMSTEW_BOOTS("mushrromstew_boots", "mushrromstew_boots"),

		EPICBUDDER22_SWORD("epicbudder22_sword", "epicbudder22_sword"),
		EPICBUDDER22_PICKAXE("epicbudder22_pickaxe", "epicbudder22_pickaxe"),
		EPICBUDDER22_AXE("epicbudder22_axe", "epicbudder22_axe"),
		EPICBUDDER22_SHOVEL("epicbudder22_shovel", "epicbudder22_shovel"),
		EPICBUDDER22_HOE("epicbudder22_hoe", "epicbudder22_hoe"),
		EPICBUDDER22_HELMET("epicbudder22_helmet", "epicbudder22_helmet"),
		EPICBUDDER22_CHESTPLATE("epicbudder22_chestplate", "epicbudder22_chestplate"),
		EPICBUDDER22_LEGGINGS("epicbudder22_leggings", "epicbudder22_leggings"),
		EPICBUDDER22_BOOTS("epicbudder22_boots", "epicbudder22_boots"),
		
		SPLIXFPV_SWORD("splixfpv_sword", "splixfpv_sword"),
		SPLIXFPV_PICKAXE("splixfpv_pickaxe", "splixfpv_pickaxe"),
		SPLIXFPV_AXE("splixfpv_axe", "splixfpv_axe"),
		SPLIXFPV_SHOVEL("splixfpv_shovel", "splixfpv_shovel"),
		SPLIXFPV_HOE("splixfpv_hoe", "splixfpv_hoe"),
		SPLIXFPV_HELMET("splixfpv_helmet", "splixfpv_helmet"),
		SPLIXFPV_CHESTPLATE("splixfpv_chestplate", "splixfpv_chestplate"),
		SPLIXFPV_LEGGINGS("splixfpv_leggings", "splixfpv_leggings"),
		SPLIXFPV_BOOTS("splixfpv_boots", "splixfpv_boots"),
		
		IANPLAYSYT_SWORD("ianplaysyt_sword", "ianplaysyt_sword"),
		IANPLAYSYT_PICKAXE("ianplaysyt_pickaxe", "ianplaysyt_pickaxe"),
		IANPLAYSYT_AXE("ianplaysyt_axe", "ianplaysyt_axe"),
		IANPLAYSYT_SHOVEL("ianplaysyt_shovel", "ianplaysyt_shovel"),
		IANPLAYSYT_HOE("ianplaysyt_hoe", "ianplaysyt_hoe"),
		IANPLAYSYT_HELMET("ianplaysyt_helmet", "ianplaysyt_helmet"),
		IANPLAYSYT_CHESTPLATE("ianplaysyt_chestplate", "ianplaysyt_chestplate"),
		IANPLAYSYT_LEGGINGS("ianplaysyt_leggings", "ianplaysyt_leggings"),
		IANPLAYSYT_BOOTS("ianplaysyt_boots", "ianplaysyt_boots"),

		BOSSFACE88_SWORD("bossface88_sword", "bossface88_sword"),
		BOSSFACE88_PICKAXE("bossface88_pickaxe", "bossface88_pickaxe"),
		BOSSFACE88_AXE("bossface88_axe", "bossface88_axe"),
		BOSSFACE88_SHOVEL("bossface88_shovel", "bossface88_shovel"),
		BOSSFACE88_HOE("bossface88_hoe", "bossface88_hoe"),
		BOSSFACE88_HELMET("bossface88_helmet", "bossface88_helmet"),
		BOSSFACE88_CHESTPLATE("bossface88_chestplate", "bossface88_chestplate"),
		BOSSFACE88_LEGGINGS("bossface88_leggings", "bossface88_leggings"),
		BOSSFACE88_BOOTS("bossface88_boots", "bossface88_boots"),

		DIAMONDTIPS_SWORD("diamondtips_sword", "diamondtips_sword"),
		DIAMONDTIPS_PICKAXE("diamondtips_pickaxe", "diamondtips_pickaxe"),
		DIAMONDTIPS_AXE("diamondtips_axe", "diamondtips_axe"),
		DIAMONDTIPS_SHOVEL("diamondtips_shovel", "diamondtips_shovel"),
		DIAMONDTIPS_HOE("diamondtips_hoe", "diamondtips_hoe"),
		DIAMONDTIPS_HELMET("diamondtips_helmet", "diamondtips_helmet"),
		DIAMONDTIPS_CHESTPLATE("diamondtips_chestplate", "diamondtips_chestplate"),
		DIAMONDTIPS_LEGGINGS("diamondtips_leggings", "diamondtips_leggings"),
		DIAMONDTIPS_BOOTS("diamondtips_boots", "diamondtips_boots"),

		DARKMATTER_SWORD("darkmatter_sword", "darkmatter_sword"),
		DARKMATTER_PICKAXE("darkmatter_pickaxe", "darkmatter_pickaxe"),
		DARKMATTER_AXE("darkmatter_axe", "darkmatter_axe"),
		DARKMATTER_SHOVEL("darkmatter_shovel", "darkmatter_shovel"),
		DARKMATTER_HOE("darkmatter_hoe", "darkmatter_hoe"),
		DARKMATTER_HELMET("darkmatter_helmet", "darkmatter_helmet"),
		DARKMATTER_CHESTPLATE("darkmatter_chestplate", "darkmatter_chestplate"),
		DARKMATTER_LEGGINGS("darkmatter_leggings", "darkmatter_leggings"),
		DARKMATTER_BOOTS("darkmatter_boots", "darkmatter_boots"),
		
		MADNESS_SWORD("madness_sword", "madness_sword"),
		MADNESS_PICKAXE("madness_pickaxe", "madness_pickaxe"),
		MADNESS_AXE("madness_axe", "madness_axe"),
		MADNESS_SHOVEL("madness_shovel", "madness_shovel"),
		MADNESS_HOE("madness_hoe", "madness_hoe"),
		MADNESS_HELMET("madness_helmet", "madness_helmet"),
		MADNESS_CHESTPLATE("madness_chestplate", "madness_chestplate"),
		MADNESS_LEGGINGS("madness_leggings", "madness_leggings"),
		MADNESS_BOOTS("madness_boots", "madness_boots"),

		MADNESS_SHARD("madness_shard", "madness_shard"),
		DARK_MATTER("dark_matter", "dark_matter"),
		MADNESS_INGOT("madness_ingot", "madness_ingot"),
		MIDM("midm", "midm"),
		
		ASHLEY_MUSICNOTE("ashley_musicnote", "ashley_musicnote"),
		ASHLEY_HEADPHONES("ashley_headphones", "ashley_headphones"),
		
		BEEF_TACO("beef_taco", "beef_taco"),
		CHICKEN_TACO("chicken_taco", "chicken_taco"),
		CHOCO_TACO("choco_taco", "choco_taco"),
		RABBIT_TACO("rabbit_taco", "rabbit_taco"),
		TORTILLA("tortilla", "tortilla"),


		MADNESS_CHEST("madness_chest", "madness_chest"),
		BLACK_HOLE("black_hole", "black_hole"),
		
		NICK_BAG("nick_bag", "nick_bag"),
		
		WATER_BREATHING_WAND("water_breathing_wand", "water_breathing_wand"),
		JUMP_BOOST_WAND("jump_boost_wand", "jump_boost_wand"),
		SPEED_WAND("speed_wand", "speed_wand"),
		HASTE_WAND("haste_wand", "haste_wand"),
		
		IAN_BOW("ian_bow", "ian_bow"),

		
		ESCAPEMC_ORE("escapemc_ore", "escapemc_ore"),
		SPLIXFPV_ORE("splixfpv_ore", "splixfpv_ore"),
		EPICBUDDER22_ORE("epicbudder22_ore", "epicbudder22_ore"),
		MUSHRROMSTEW_ORE("mushrromstew_ore", "mushrromstew_ore"),
		IANPLAYSYT_ORE("ianplaysyt_ore", "ianplaysyt_ore"),
		BOSSFACE88_ORE("bossface88_ore", "bossface88_ore"),
		DIAMONDTIPS_ORE("diamondtips_ore", "diamondtips_ore"),
		CDM("cdm", "cdm"),
		MS("ms", "ms"),
		MADNESS_ORE("madness_ore", "madness_ore");

		
		
		
		
		private String unlocalizedName;
		private String registryName;
		
		
		ModItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
			
			
		}
		
		public String getUnlocalizedName() {
			
			return unlocalizedName;
			
		}
		
		public String getRegistryName() {
			
			return registryName;
			
		}
		
		
	}
	
	
	
}
