package com.github.escapemc.teammadnessmod;

public class Reference {

	
	public static final String MOD_ID = "tmm";
	public static final String MOD_NAME = "TeamMadness Mod";
	public static final String MOD_VERSION = "1.6.0.1";
	public static final String ACCEPTED_VERSIONS = "[1.9.4,1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.github.escapemc.teammadnessmod.proxies.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.github.escapemc.teammadnessmod.proxies.ServerProxy";
	
			
	public static enum ModItems {
		
		ESCAPEMC_INGOT("escapemc_ingot", "escapemc_ingot"),
		MUSHRROMSTEW_INGOT("mushrromstew_ingot", "mushrromstew_ingot"),
		EPICBUDDER22_INGOT("epicbudder22_ingot", "epicbudder22_ingot"),
		JONAHJOE2002_INGOT("jonahjoe2002_ingot", "jonahjoe2002_ingot"),
		
		MADNESS_DUST("madness-dust", "madness_dust"),
		
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
		
		JONAHJOE2002_SWORD("jonahjoe2002_sword", "jonahjoe2002_sword"),
		JONAHJOE2002_PICKAXE("jonahjoe2002_pickaxe", "jonahjoe2002_pickaxe"),
		JONAHJOE2002_AXE("jonahjoe2002_axe", "jonahjoe2002_axe"),
		JONAHJOE2002_SHOVEL("jonahjoe2002_shovel", "jonahjoe2002_shovel"),
		JONAHJOE2002_HOE("jonahjoe2002_hoe", "jonahjoe2002_hoe"),
		JONAHJOE2002_HELMET("jonahjoe2002_helmet", "jonahjoe2002_helmet"),
		JONAHJOE2002_CHESTPLATE("jonahjoe2002_chestplate", "jonahjoe2002_chestplate"),
		JONAHJOE2002_LEGGINGS("jonahjoe2002_leggings", "jonahjoe2002_leggings"),
		JONAHJOE2002_BOOTS("jonahjoe2002_boots", "jonahjoe2002_boots"),
		
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
		
		ASHLEY_MUSICNOTE("ashley_musicnote", "ashley_musicnote"),
		ASHLEY_HEADPHONES("ashley_headphones", "ashley_headphones"),
		
		BEEF_TACO("beef_taco", "beef_taco"),
		CHICKEN_TACO("chicken_taco", "chicken_taco"),
		CHOCO_TACO("choco_taco", "choco_taco"),
		RABBIT_TACO("rabbit_taco", "rabbit_taco"),	


		MADNESS_CHEST("madness_chest", "madness_chest"),
		
		NICK_BAG("nick_bag", "nick_bag"),

		
		ESCAPEMC_ORE("escapemc_ore", "escapemc_ore"),
		JONAHJOE2002_ORE("jonahjoe2002_ore", "jonahjoe2002_ore"),
		EPICBUDDER22_ORE("epicbudder22_ore", "epicbudder22_ore"),
		MUSHRROMSTEW_ORE("mushrromstew_ore", "mushrromstew_ore"),
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
