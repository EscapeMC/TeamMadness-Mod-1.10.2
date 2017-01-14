package com.github.escapemc.teammadnessmod.init;

import com.github.escapemc.teammadnessmod.Main;
import com.github.escapemc.teammadnessmod.blocks.black_hole;
import com.github.escapemc.teammadnessmod.blocks.bossface88_ore;
import com.github.escapemc.teammadnessmod.blocks.cdm;
import com.github.escapemc.teammadnessmod.blocks.diamondtips_ore;
import com.github.escapemc.teammadnessmod.blocks.epicbudder22_ore;
import com.github.escapemc.teammadnessmod.blocks.escapemc_ore;
import com.github.escapemc.teammadnessmod.blocks.ianplaysyt_ore;
import com.github.escapemc.teammadnessmod.blocks.madness_chest;
import com.github.escapemc.teammadnessmod.blocks.madness_furnace;
import com.github.escapemc.teammadnessmod.blocks.madness_ore;
import com.github.escapemc.teammadnessmod.blocks.ms;
import com.github.escapemc.teammadnessmod.blocks.mushrromstew_ore;
import com.github.escapemc.teammadnessmod.blocks.splixfpv_ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	
	public static Block escapemc_ore;
	public static Block mushrromstew_ore;
	public static Block epicbudder22_ore;
	public static Block splixfpv_ore;
	public static Block ianplaysyt_ore;
	public static Block bossface88_ore;
	public static Block diamondtips_ore;
	
	
	public static Block ms;
	public static Block cdm;
	public static Block madness_ore;
	
	public static Block madness_chest;
	public static Block black_hole;
	public static Block madness_furnace;
	public static Block lit_madness_furnace;
	

	public static void init() {
		
		
		escapemc_ore = new escapemc_ore(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		mushrromstew_ore = new mushrromstew_ore(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		epicbudder22_ore = new epicbudder22_ore(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		splixfpv_ore = new splixfpv_ore(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		ianplaysyt_ore = new ianplaysyt_ore(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		bossface88_ore = new bossface88_ore(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		diamondtips_ore = new diamondtips_ore(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		
		ms = new ms(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		cdm = new cdm(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		madness_ore = new madness_ore(Material.IRON).setCreativeTab(Main.TeamMadnessModBlocksTab);
		
		madness_furnace = new madness_furnace(Material.ROCK, false, "madness_furnace").setCreativeTab(Main.TeamMadnessModBlocksTab);
		lit_madness_furnace = new madness_furnace(Material.ROCK, true, "lit_madness_furnace");
		madness_chest = new madness_chest(Material.ROCK).setCreativeTab(Main.TeamMadnessModBlocksTab);

		black_hole = new black_hole(Material.CAKE).setCreativeTab(Main.TeamMadnessModBlocksTab);
		
		
		
	}
	
	public static void registry() {
		
		ModBlocks.registerBlock(escapemc_ore);
		ModBlocks.registerBlock(mushrromstew_ore);
		ModBlocks.registerBlock(epicbudder22_ore);
		ModBlocks.registerBlock(splixfpv_ore);
		ModBlocks.registerBlock(ianplaysyt_ore);
		ModBlocks.registerBlock(bossface88_ore);
		ModBlocks.registerBlock(diamondtips_ore);
		
		ModBlocks.registerBlock(cdm);
		ModBlocks.registerBlock(ms);
		ModBlocks.registerBlock(madness_ore);
		
		ModBlocks.registerBlock(madness_chest);
		ModBlocks.registerBlock(madness_furnace);
		ModBlocks.registerBlock(lit_madness_furnace);
		
		ModBlocks.registerBlock(black_hole);
		
		
		
	}

	
	public static void registerBlock(Block block) {
		
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
		
		
	}
	
	
	
	public static void registerRenders() {
		
		registerRender(escapemc_ore);
		registerRender(mushrromstew_ore);
		registerRender(epicbudder22_ore);
		registerRender(splixfpv_ore);
		registerRender(ianplaysyt_ore);
		registerRender(bossface88_ore);
		registerRender(diamondtips_ore);
		
		registerRender(ms);
		registerRender(cdm);
		registerRender(madness_ore);
		
		registerRender(madness_furnace);
		registerRender(lit_madness_furnace);
		
		registerRender(madness_chest);
		registerRender(black_hole);

	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender(Block block) {
		
	    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	    
	    
	}
	
	
	
	
}
