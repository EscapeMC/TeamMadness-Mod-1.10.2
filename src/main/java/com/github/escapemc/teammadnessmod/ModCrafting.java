package com.github.escapemc.teammadnessmod;

import com.github.escapemc.teammadnessmod.init.ModBlocks;
import com.github.escapemc.teammadnessmod.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void initCrafting() {

		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_sword), new Object[] {"#", "#", "S", '#', ModItems.escapemc_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_pickaxe), new Object[] {"###", " S ", " S ", '#', ModItems.escapemc_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_axe), new Object[] {"##", "S#", "S ", '#', ModItems.escapemc_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_axe), new Object[] {"##", "#S", " S", '#', ModItems.escapemc_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_shovel), new Object[] {"#", "S", "S", '#', ModItems.escapemc_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_hoe), new Object[] {"##", "S ", "S ", '#', ModItems.escapemc_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_hoe), new Object[] {"##", " S", " S", '#', ModItems.escapemc_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_helmet), new Object[] {"###", "# #", '#', ModItems.escapemc_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_chestplate), new Object[] {"# #", "###", "###", '#', ModItems.escapemc_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_leggings), new Object[] {"###", "# #", "# #", '#', ModItems.escapemc_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.escapemc_boots), new Object[] {"# #", "# #", '#', ModItems.escapemc_ingot});

		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_sword), new Object[] {"#", "#", "S", '#', ModItems.mushrromstew_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_pickaxe), new Object[] {"###", " S ", " S ", '#', ModItems.mushrromstew_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_axe), new Object[] {"##", "S#", "S ", '#', ModItems.mushrromstew_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_axe), new Object[] {"##", "#S", " S", '#', ModItems.mushrromstew_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_shovel), new Object[] {"#", "S", "S", '#', ModItems.mushrromstew_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_hoe), new Object[] {"##", "S ", "S ", '#', ModItems.mushrromstew_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_hoe), new Object[] {"##", " S", " S", '#', ModItems.mushrromstew_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_helmet), new Object[] {"###", "# #", '#', ModItems.mushrromstew_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_chestplate), new Object[] {"# #", "###", "###", '#', ModItems.mushrromstew_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_leggings), new Object[] {"###", "# #", "# #", '#', ModItems.mushrromstew_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.mushrromstew_boots), new Object[] {"# #", "# #", '#', ModItems.mushrromstew_ingot});

		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_sword), new Object[] {"#", "#", "S", '#', ModItems.epicbudder22_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_pickaxe), new Object[] {"###", " S ", " S ", '#', ModItems.epicbudder22_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_axe), new Object[] {"##", "S#", "S ", '#', ModItems.epicbudder22_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_axe), new Object[] {"##", "#S", " S", '#', ModItems.epicbudder22_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_shovel), new Object[] {"#", "S", "S", '#', ModItems.epicbudder22_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_hoe), new Object[] {"##", "S ", "S ", '#', ModItems.epicbudder22_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_hoe), new Object[] {"##", " S", " S", '#', ModItems.epicbudder22_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_helmet), new Object[] {"###", "# #", '#', ModItems.epicbudder22_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_chestplate), new Object[] {"# #", "###", "###", '#', ModItems.epicbudder22_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_leggings), new Object[] {"###", "# #", "# #", '#', ModItems.epicbudder22_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.epicbudder22_boots), new Object[] {"# #", "# #", '#', ModItems.epicbudder22_ingot});

		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_sword), new Object[] {"#", "#", "S", '#', ModItems.splixfpv_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_pickaxe), new Object[] {"###", " S ", " S ", '#', ModItems.splixfpv_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_axe), new Object[] {"##", "S#", "S ", '#', ModItems.splixfpv_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_axe), new Object[] {"##", "#S", " S", '#', ModItems.splixfpv_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_shovel), new Object[] {"#", "S", "S", '#', ModItems.splixfpv_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_hoe), new Object[] {"##", "S ", "S ", '#', ModItems.splixfpv_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_hoe), new Object[] {"##", " S", " S", '#', ModItems.splixfpv_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_helmet), new Object[] {"###", "# #", '#', ModItems.splixfpv_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_chestplate), new Object[] {"# #", "###", "###", '#', ModItems.splixfpv_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_leggings), new Object[] {"###", "# #", "# #", '#', ModItems.splixfpv_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.splixfpv_boots), new Object[] {"# #", "# #", '#', ModItems.splixfpv_ingot});

		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_sword), new Object[] {"#", "#", "S", '#', ModItems.ianplaysyt_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_pickaxe), new Object[] {"###", " S ", " S ", '#', ModItems.ianplaysyt_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_axe), new Object[] {"##", "S#", "S ", '#', ModItems.ianplaysyt_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_axe), new Object[] {"##", "#S", " S", '#', ModItems.ianplaysyt_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_shovel), new Object[] {"#", "S", "S", '#', ModItems.ianplaysyt_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_hoe), new Object[] {"##", "S ", "S ", '#', ModItems.ianplaysyt_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_hoe), new Object[] {"##", " S", " S", '#', ModItems.ianplaysyt_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_helmet), new Object[] {"###", "# #", '#', ModItems.ianplaysyt_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_chestplate), new Object[] {"# #", "###", "###", '#', ModItems.ianplaysyt_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_leggings), new Object[] {"###", "# #", "# #", '#', ModItems.ianplaysyt_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ianplaysyt_boots), new Object[] {"# #", "# #", '#', ModItems.ianplaysyt_ingot});

		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_sword), new Object[] {"#", "#", "S", '#', ModItems.bossface88_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_pickaxe), new Object[] {"###", " S ", " S ", '#', ModItems.bossface88_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_axe), new Object[] {"##", "S#", "S ", '#', ModItems.bossface88_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_axe), new Object[] {"##", "#S", " S", '#', ModItems.bossface88_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_shovel), new Object[] {"#", "S", "S", '#', ModItems.bossface88_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_hoe), new Object[] {"##", "S ", "S ", '#', ModItems.bossface88_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_hoe), new Object[] {"##", " S", " S", '#', ModItems.bossface88_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_helmet), new Object[] {"###", "# #", '#', ModItems.bossface88_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_chestplate), new Object[] {"# #", "###", "###", '#', ModItems.bossface88_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_leggings), new Object[] {"###", "# #", "# #", '#', ModItems.bossface88_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.bossface88_boots), new Object[] {"# #", "# #", '#', ModItems.bossface88_ingot});

		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_sword), new Object[] {"#", "#", "S", '#', ModItems.diamondtips_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_pickaxe), new Object[] {"###", " S ", " S ", '#', ModItems.diamondtips_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_axe), new Object[] {"##", "S#", "S ", '#', ModItems.diamondtips_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_axe), new Object[] {"##", "#S", " S", '#', ModItems.diamondtips_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_shovel), new Object[] {"#", "S", "S", '#', ModItems.diamondtips_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_hoe), new Object[] {"##", "S ", "S ", '#', ModItems.diamondtips_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_hoe), new Object[] {"##", " S", " S", '#', ModItems.diamondtips_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_helmet), new Object[] {"###", "# #", '#', ModItems.diamondtips_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_chestplate), new Object[] {"# #", "###", "###", '#', ModItems.diamondtips_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_leggings), new Object[] {"###", "# #", "# #", '#', ModItems.diamondtips_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondtips_boots), new Object[] {"# #", "# #", '#', ModItems.diamondtips_ingot});

		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_sword), new Object[] {"#", "#", "S", '#', ModBlocks.cdm, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_pickaxe), new Object[] {"###", " S ", " S ", '#', ModBlocks.cdm, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_axe), new Object[] {"##", "S#", "S ", '#', ModBlocks.cdm, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_axe), new Object[] {"##", "#S", " S", '#', ModBlocks.cdm, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_shovel), new Object[] {"#", "S", "S", '#', ModBlocks.cdm, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_hoe), new Object[] {"##", "S ", "S ", '#', ModBlocks.cdm, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_hoe), new Object[] {"##", " S", " S", '#', ModBlocks.cdm, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_helmet), new Object[] {"###", "# #", '#', ModBlocks.cdm});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_chestplate), new Object[] {"# #", "###", "###", '#', ModBlocks.cdm});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_leggings), new Object[] {"###", "# #", "# #", '#', ModBlocks.cdm});
		GameRegistry.addRecipe(new ItemStack(ModItems.darkmatter_boots), new Object[] {"# #", "# #", '#', ModBlocks.cdm});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_ingot), new Object[] {"##", "##", '#', ModItems.madness_shard});
		GameRegistry.addRecipe(new ItemStack(ModItems.midm), new Object[] {" # ", "#D#", " # ", '#', ModItems.madness_shard, 'D', ModItems.dark_matter});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cdm), new Object[] {"##", "##", '#', ModItems.dark_matter});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_helmet), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_helmet, '#', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_chestplate), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_chestplate, '#', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_leggings), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_leggings, '#', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_boots), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_boots, '#', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_sword), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_sword, '#', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_pickaxe), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_pickaxe, '#', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_axe), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_axe, '#', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_shovel), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_shovel, '#', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_hoe), new Object[] {" # ", "#M#", " # ", 'M', ModItems.darkmatter_hoe, '#', ModItems.madness_ingot});

		GameRegistry.addRecipe(new ItemStack(ModItems.ashley_musicnote), new Object[] {"#", "#", '#', ModItems.escapemc_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.ashley_headphones), new Object[] {"III", "#E#", "I I", 'I', Items.IRON_INGOT, '#', ModItems.ashley_musicnote, 'E', new ItemStack(Items.DYE, 1, 1)});
				
		GameRegistry.addRecipe(new ItemStack(ModItems.tortilla, 3), new Object[] {" W ", "WWW", " W ", 'W', Items.WHEAT});
		GameRegistry.addRecipe(new ItemStack(ModItems.beef_taco), new Object[] {"B", "W", 'W', ModItems.tortilla, 'B', Items.COOKED_BEEF});
		GameRegistry.addRecipe(new ItemStack(ModItems.beef_taco), new Object[] {"B", "W", 'W', ModItems.tortilla, 'B', Items.COOKED_PORKCHOP});
		GameRegistry.addRecipe(new ItemStack(ModItems.chicken_taco), new Object[] {"B", "W", 'W', ModItems.tortilla, 'B', Items.COOKED_CHICKEN});
		GameRegistry.addRecipe(new ItemStack(ModItems.rabbit_taco), new Object[] {"B", "W", 'W', ModItems.tortilla, 'B', Items.COOKED_RABBIT});
		GameRegistry.addRecipe(new ItemStack(ModItems.choco_taco), new Object[] {"B", "W", 'W', ModItems.tortilla, 'B', Items.COOKIE});
		
		GameRegistry.addRecipe(new ItemStack(ModBlocks.madness_chest), new Object[] {"MMM", "MCM", "MMM", 'M', ModItems.madness_shard, 'C', Blocks.CHEST});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.madness_furnace), new Object[] {"MMM", "MCM", "MMM", 'M', ModItems.madness_ingot, 'C', Blocks.FURNACE});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.black_hole), new Object[] {"DMD", "MCM", "DMD", 'C', ModBlocks.madness_chest, 'D', ModItems.midm, 'M', ModItems.madness_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.nick_bag), new Object[] {" N ", "NCN", " N ", 'C', Blocks.CHEST, 'N', ModItems.midm});
		GameRegistry.addRecipe(new ItemStack(ModItems.ian_bow), new Object[] {" N ", "NCN", " N ", 'C', Items.BOW, 'N', ModItems.midm});
		
		
		
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_dust), new Object[] {"#", '#', ModItems.escapemc_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_dust), new Object[] {"#", '#', ModItems.mushrromstew_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_dust), new Object[] {"#", '#', ModItems.epicbudder22_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_dust), new Object[] {"#", '#', ModItems.splixfpv_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_dust), new Object[] {"#", '#', ModItems.ianplaysyt_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_dust), new Object[] {"#", '#', ModItems.bossface88_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_dust), new Object[] {"#", '#', ModItems.diamondtips_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.madness_shard), new Object[] {"###", "###", "###", '#', ModItems.madness_dust});

		GameRegistry.addRecipe(new ItemStack(ModItems.water_breathing_wand), new Object[] {"#E#", "ESE", "#E#", '#', ModItems.madness_dust, 'E', ModItems.escapemc_ingot, 'S', Items.STICK});
		GameRegistry.addRecipe(new ItemStack(ModItems.jump_boost_wand), new Object[] {"#I#", "ESE", "#I#", '#', ModItems.madness_dust, 'E', ModItems.ianplaysyt_ingot, 'S', Items.STICK, 'I', ModItems.epicbudder22_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.speed_wand), new Object[] {"#I#", "ESE", "#I#", '#', ModItems.madness_dust, 'E', ModItems.bossface88_ingot, 'S', Items.STICK, 'I', ModItems.splixfpv_ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.haste_wand), new Object[] {"#I#", "ESE", "#I#", '#', ModItems.madness_dust, 'E', ModItems.diamondtips_ingot, 'S', Items.STICK, 'I', ModItems.mushrromstew_ingot});

		
		
		
		GameRegistry.addSmelting(ModBlocks.escapemc_ore, new ItemStack(ModItems.escapemc_ingot), 5.0F);
		GameRegistry.addSmelting(ModBlocks.mushrromstew_ore, new ItemStack(ModItems.mushrromstew_ingot), 5.0F);
		GameRegistry.addSmelting(ModBlocks.epicbudder22_ore, new ItemStack(ModItems.epicbudder22_ingot), 5.0F);
		GameRegistry.addSmelting(ModBlocks.splixfpv_ore, new ItemStack(ModItems.splixfpv_ingot), 5.0F);
		GameRegistry.addSmelting(ModBlocks.madness_ore, new ItemStack(ModItems.madness_shard), 25.0F);
		GameRegistry.addSmelting(ModBlocks.ianplaysyt_ore, new ItemStack(ModItems.ianplaysyt_ingot), 5.0F);
		GameRegistry.addSmelting(ModBlocks.bossface88_ore, new ItemStack(ModItems.bossface88_ingot), 5.0F);
		GameRegistry.addSmelting(ModBlocks.diamondtips_ore, new ItemStack(ModItems.diamondtips_ingot), 5.0F);

		
		
		
		
	}

}
