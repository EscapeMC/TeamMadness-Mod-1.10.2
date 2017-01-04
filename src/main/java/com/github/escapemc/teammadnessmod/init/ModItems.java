package com.github.escapemc.teammadnessmod.init;

import com.github.escapemc.teammadnessmod.Main;
import com.github.escapemc.teammadnessmod.items.ashley_musicnote;
import com.github.escapemc.teammadnessmod.items.beef_taco;
import com.github.escapemc.teammadnessmod.items.chicken_taco;
import com.github.escapemc.teammadnessmod.items.choco_taco;
import com.github.escapemc.teammadnessmod.items.dark_matter;
import com.github.escapemc.teammadnessmod.items.darkmatter_armor;
import com.github.escapemc.teammadnessmod.items.darkmatter_axe;
import com.github.escapemc.teammadnessmod.items.darkmatter_hoe;
import com.github.escapemc.teammadnessmod.items.darkmatter_pickaxe;
import com.github.escapemc.teammadnessmod.items.darkmatter_shovel;
import com.github.escapemc.teammadnessmod.items.darkmatter_sword;
import com.github.escapemc.teammadnessmod.items.epicbudder22_armor;
import com.github.escapemc.teammadnessmod.items.epicbudder22_axe;
import com.github.escapemc.teammadnessmod.items.epicbudder22_hoe;
import com.github.escapemc.teammadnessmod.items.epicbudder22_ingot;
import com.github.escapemc.teammadnessmod.items.epicbudder22_pickaxe;
import com.github.escapemc.teammadnessmod.items.epicbudder22_shovel;
import com.github.escapemc.teammadnessmod.items.epicbudder22_sword;
import com.github.escapemc.teammadnessmod.items.escapemc_armor;
import com.github.escapemc.teammadnessmod.items.escapemc_axe;
import com.github.escapemc.teammadnessmod.items.escapemc_hoe;
import com.github.escapemc.teammadnessmod.items.escapemc_ingot;
import com.github.escapemc.teammadnessmod.items.escapemc_pickaxe;
import com.github.escapemc.teammadnessmod.items.escapemc_shovel;
import com.github.escapemc.teammadnessmod.items.escapemc_sword;
import com.github.escapemc.teammadnessmod.items.etc_armor;
import com.github.escapemc.teammadnessmod.items.jonahjoe2002_armor;
import com.github.escapemc.teammadnessmod.items.jonahjoe2002_axe;
import com.github.escapemc.teammadnessmod.items.jonahjoe2002_hoe;
import com.github.escapemc.teammadnessmod.items.jonahjoe2002_ingot;
import com.github.escapemc.teammadnessmod.items.jonahjoe2002_pickaxe;
import com.github.escapemc.teammadnessmod.items.jonahjoe2002_shovel;
import com.github.escapemc.teammadnessmod.items.jonahjoe2002_sword;
import com.github.escapemc.teammadnessmod.items.madness_armor;
import com.github.escapemc.teammadnessmod.items.madness_axe;
import com.github.escapemc.teammadnessmod.items.madness_dust;
import com.github.escapemc.teammadnessmod.items.madness_hoe;
import com.github.escapemc.teammadnessmod.items.madness_ingot;
import com.github.escapemc.teammadnessmod.items.madness_pickaxe;
import com.github.escapemc.teammadnessmod.items.madness_shard;
import com.github.escapemc.teammadnessmod.items.madness_shovel;
import com.github.escapemc.teammadnessmod.items.madness_sword;
import com.github.escapemc.teammadnessmod.items.mushrromstew_armor;
import com.github.escapemc.teammadnessmod.items.mushrromstew_axe;
import com.github.escapemc.teammadnessmod.items.mushrromstew_hoe;
import com.github.escapemc.teammadnessmod.items.mushrromstew_ingot;
import com.github.escapemc.teammadnessmod.items.mushrromstew_pickaxe;
import com.github.escapemc.teammadnessmod.items.mushrromstew_shovel;
import com.github.escapemc.teammadnessmod.items.mushrromstew_sword;
import com.github.escapemc.teammadnessmod.items.nick_bag;
import com.github.escapemc.teammadnessmod.items.rabbit_taco;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {


	public static Item escapemc_ingot;
	public static Item mushrromstew_ingot;
	public static Item epicbudder22_ingot;
	public static Item jonahjoe2002_ingot;
	
	public static Item madness_shard;
	public static Item madness_ingot;
	public static Item madness_dust;
	
	public static Item dark_matter;
	
	public static Item escapemc_sword;
	public static Item escapemc_pickaxe;
	public static Item escapemc_axe;
	public static Item escapemc_shovel;
	public static Item escapemc_hoe;
	public static Item escapemc_helmet;
	public static Item escapemc_chestplate;
	public static Item escapemc_leggings;
	public static Item escapemc_boots;
	
	public static Item mushrromstew_sword;
	public static Item mushrromstew_pickaxe;
	public static Item mushrromstew_axe;
	public static Item mushrromstew_shovel;
	public static Item mushrromstew_hoe;
	public static Item mushrromstew_helmet;
	public static Item mushrromstew_chestplate;
	public static Item mushrromstew_leggings;
	public static Item mushrromstew_boots;

	public static Item epicbudder22_sword;
	public static Item epicbudder22_pickaxe;
	public static Item epicbudder22_axe;
	public static Item epicbudder22_shovel;
	public static Item epicbudder22_hoe;
	public static Item epicbudder22_helmet;
	public static Item epicbudder22_chestplate;
	public static Item epicbudder22_leggings;
	public static Item epicbudder22_boots;

	public static Item jonahjoe2002_sword;
	public static Item jonahjoe2002_pickaxe;
	public static Item jonahjoe2002_axe;
	public static Item jonahjoe2002_shovel;
	public static Item jonahjoe2002_hoe;
	public static Item jonahjoe2002_helmet;
	public static Item jonahjoe2002_chestplate;
	public static Item jonahjoe2002_leggings;
	public static Item jonahjoe2002_boots;

	public static Item madness_sword;
	public static Item madness_pickaxe;
	public static Item madness_axe;
	public static Item madness_shovel;
	public static Item madness_hoe;
	public static Item madness_helmet;
	public static Item madness_chestplate;
	public static Item madness_leggings;
	public static Item madness_boots;

	public static Item darkmatter_sword;
	public static Item darkmatter_pickaxe;
	public static Item darkmatter_axe;
	public static Item darkmatter_shovel;
	public static Item darkmatter_hoe;
	public static Item darkmatter_helmet;
	public static Item darkmatter_chestplate;
	public static Item darkmatter_leggings;
	public static Item darkmatter_boots;

	public static Item ashley_musicnote;
	public static Item ashley_headphones;
	
	public static Item beef_taco;
	public static Item chicken_taco;
	public static Item rabbit_taco;
	public static Item choco_taco;
	
	public static Item nick_bag;
	
	
	
	public static final Item.ToolMaterial escapemc_tool_material = EnumHelper.addToolMaterial("escapemc_tool_material", 3, 1401, 2, 7, 30);
	public static final Item.ToolMaterial mushrromstew_tool_material = EnumHelper.addToolMaterial("mushrromstew_tool_material", 3, 1401, 2, 7, 30);
	public static final Item.ToolMaterial epicbudder22_tool_material = EnumHelper.addToolMaterial("epicbudder22_tool_material", 3, 1401, 2, 7, 30);
	public static final Item.ToolMaterial jonahjoe2002_tool_material = EnumHelper.addToolMaterial("jonahjoe2002_tool_material", 3, 1401, 2, 7, 30);


	public static final Item.ToolMaterial darkmatter_tool_material = EnumHelper.addToolMaterial("darkmatter_tool_material", 3, 14001, 26, 22, 30);
	public static final Item.ToolMaterial darkmatter_sword_material = EnumHelper.addToolMaterial("darkmatter_sword_material", 3, 14002, 26, 76, 30);
	
	public static final Item.ToolMaterial madness_tool_material = EnumHelper.addToolMaterial("madness_tool_material", 3, 33001, 30, 54, 30);
	public static final Item.ToolMaterial madness_sword_material = EnumHelper.addToolMaterial("madness_sword_material", 3, 33002, 30, 126, 30);
	
	//public static final Item.ToolMaterial test = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)

	
	public static ArmorMaterial etc_armor_material = EnumHelper.addArmorMaterial("etc_armor_material", "tmm:ashley_armor", 56, new int[] {3, 1, 1, 1}, 1, null, 0);	

	
	public static ArmorMaterial escapemc_armor_material = EnumHelper.addArmorMaterial("escapemc_armor_material", "tmm:escapemc_armor_material", 3148, new int[] {3, 5, 7, 3}, 22, null, 0);	
	public static ArmorMaterial mushrromstew_armor_material = EnumHelper.addArmorMaterial("mushrromstew_armor_material", "tmm:mushrromstew_armor", 3148, new int[] {3, 5, 7, 3}, 22, null, 0);	
	public static ArmorMaterial epicbudder22_armor_material = EnumHelper.addArmorMaterial("epicbudder22_armor_material", "tmm:epicbudder22_armor", 3148, new int[] {3, 5, 7, 3}, 22, null, 0);	
	public static ArmorMaterial jonahjoe2002_armor_material = EnumHelper.addArmorMaterial("jonahjoe2002_armor_material", "tmm:jonahjoe2002_armor", 3148, new int[] {3, 5, 7, 3}, 22, null, 0);	

	public static ArmorMaterial darkmatter_armor_material = EnumHelper.addArmorMaterial("darkmatter_armor_material", "tmm:darkmatter_armor", 7293, new int[] {4, 6, 7, 4}, 30, null, 0);	
	public static ArmorMaterial madness_armor_material = EnumHelper.addArmorMaterial("madness_armor_material", "tmm:madness_armor", 14293, new int[] {5, 6, 8, 5}, 30, null, 0);	
	//public static ArmorMatieral name_of_material = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability)

	
	
	
	public static void init() {
		
		escapemc_ingot = new escapemc_ingot().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		mushrromstew_ingot = new mushrromstew_ingot().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		epicbudder22_ingot = new epicbudder22_ingot().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		jonahjoe2002_ingot = new jonahjoe2002_ingot().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		
		escapemc_sword = new escapemc_sword(escapemc_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		escapemc_pickaxe = new escapemc_pickaxe(escapemc_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		escapemc_axe = new escapemc_axe(escapemc_tool_material, 10, -3).setCreativeTab(Main.TeamMadnessModItemsTab);
		escapemc_shovel = new escapemc_shovel(escapemc_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		escapemc_hoe = new escapemc_hoe(escapemc_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		escapemc_helmet = new escapemc_armor(escapemc_armor_material, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.TeamMadnessModArmorTab);
		escapemc_chestplate = new escapemc_armor(escapemc_armor_material, 0, EntityEquipmentSlot.CHEST).setCreativeTab(Main.TeamMadnessModArmorTab);
		escapemc_leggings = new escapemc_armor(escapemc_armor_material, 0, EntityEquipmentSlot.LEGS).setCreativeTab(Main.TeamMadnessModArmorTab);
		escapemc_boots = new escapemc_armor(escapemc_armor_material, 0, EntityEquipmentSlot.FEET).setCreativeTab(Main.TeamMadnessModArmorTab);

		mushrromstew_sword = new mushrromstew_sword(mushrromstew_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		mushrromstew_pickaxe = new mushrromstew_pickaxe(mushrromstew_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		mushrromstew_axe = new mushrromstew_axe(mushrromstew_tool_material, 10, -3).setCreativeTab(Main.TeamMadnessModItemsTab);
		mushrromstew_shovel = new mushrromstew_shovel(mushrromstew_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		mushrromstew_hoe = new mushrromstew_hoe(mushrromstew_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		mushrromstew_helmet = new mushrromstew_armor(mushrromstew_armor_material, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.TeamMadnessModArmorTab);
		mushrromstew_chestplate = new mushrromstew_armor(mushrromstew_armor_material, 0, EntityEquipmentSlot.CHEST).setCreativeTab(Main.TeamMadnessModArmorTab);
		mushrromstew_leggings = new mushrromstew_armor(mushrromstew_armor_material, 0, EntityEquipmentSlot.LEGS).setCreativeTab(Main.TeamMadnessModArmorTab);
		mushrromstew_boots = new mushrromstew_armor(mushrromstew_armor_material, 0, EntityEquipmentSlot.FEET).setCreativeTab(Main.TeamMadnessModArmorTab);

		epicbudder22_sword = new epicbudder22_sword(epicbudder22_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		epicbudder22_pickaxe = new epicbudder22_pickaxe(epicbudder22_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		epicbudder22_axe = new epicbudder22_axe(epicbudder22_tool_material, 10, -3).setCreativeTab(Main.TeamMadnessModItemsTab);
		epicbudder22_shovel = new epicbudder22_shovel(epicbudder22_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		epicbudder22_hoe = new epicbudder22_hoe(epicbudder22_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		epicbudder22_helmet = new epicbudder22_armor(epicbudder22_armor_material, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.TeamMadnessModArmorTab);
		epicbudder22_chestplate = new epicbudder22_armor(epicbudder22_armor_material, 0, EntityEquipmentSlot.CHEST).setCreativeTab(Main.TeamMadnessModArmorTab);
		epicbudder22_leggings = new epicbudder22_armor(epicbudder22_armor_material, 0, EntityEquipmentSlot.LEGS).setCreativeTab(Main.TeamMadnessModArmorTab);
		epicbudder22_boots = new epicbudder22_armor(epicbudder22_armor_material, 0, EntityEquipmentSlot.FEET).setCreativeTab(Main.TeamMadnessModArmorTab);

		jonahjoe2002_sword = new jonahjoe2002_sword(jonahjoe2002_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		jonahjoe2002_pickaxe = new jonahjoe2002_pickaxe(jonahjoe2002_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		jonahjoe2002_axe = new jonahjoe2002_axe(jonahjoe2002_tool_material, 10, -3).setCreativeTab(Main.TeamMadnessModItemsTab);
		jonahjoe2002_shovel = new jonahjoe2002_shovel(jonahjoe2002_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		jonahjoe2002_hoe = new jonahjoe2002_hoe(jonahjoe2002_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		jonahjoe2002_helmet = new jonahjoe2002_armor(jonahjoe2002_armor_material, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.TeamMadnessModArmorTab);
		jonahjoe2002_chestplate = new jonahjoe2002_armor(jonahjoe2002_armor_material, 0, EntityEquipmentSlot.CHEST).setCreativeTab(Main.TeamMadnessModArmorTab);
		jonahjoe2002_leggings = new jonahjoe2002_armor(jonahjoe2002_armor_material, 0, EntityEquipmentSlot.LEGS).setCreativeTab(Main.TeamMadnessModArmorTab);
		jonahjoe2002_boots = new jonahjoe2002_armor(jonahjoe2002_armor_material, 0, EntityEquipmentSlot.FEET).setCreativeTab(Main.TeamMadnessModArmorTab);

		darkmatter_sword = new darkmatter_sword(darkmatter_sword_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		darkmatter_pickaxe = new darkmatter_pickaxe(darkmatter_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		darkmatter_axe = new darkmatter_axe(darkmatter_tool_material, 10, -3).setCreativeTab(Main.TeamMadnessModItemsTab);
		darkmatter_shovel = new darkmatter_shovel(darkmatter_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		darkmatter_hoe = new darkmatter_hoe(darkmatter_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		darkmatter_helmet = new darkmatter_armor(darkmatter_armor_material, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.TeamMadnessModArmorTab);
		darkmatter_chestplate = new darkmatter_armor(darkmatter_armor_material, 0, EntityEquipmentSlot.CHEST).setCreativeTab(Main.TeamMadnessModArmorTab);
		darkmatter_leggings = new darkmatter_armor(darkmatter_armor_material, 0, EntityEquipmentSlot.LEGS).setCreativeTab(Main.TeamMadnessModArmorTab);
		darkmatter_boots = new darkmatter_armor(darkmatter_armor_material, 0, EntityEquipmentSlot.FEET).setCreativeTab(Main.TeamMadnessModArmorTab);

		madness_sword = new madness_sword(madness_sword_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		madness_pickaxe = new madness_pickaxe(madness_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		madness_axe = new madness_axe(madness_tool_material, 10, -3).setCreativeTab(Main.TeamMadnessModItemsTab);
		madness_shovel = new madness_shovel(madness_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		madness_hoe = new madness_hoe(madness_tool_material).setCreativeTab(Main.TeamMadnessModItemsTab);
		madness_helmet = new madness_armor(madness_armor_material, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.TeamMadnessModArmorTab);
		madness_chestplate = new madness_armor(madness_armor_material, 0, EntityEquipmentSlot.CHEST).setCreativeTab(Main.TeamMadnessModArmorTab);
		madness_leggings = new madness_armor(madness_armor_material, 0, EntityEquipmentSlot.LEGS).setCreativeTab(Main.TeamMadnessModArmorTab);
		madness_boots = new madness_armor(madness_armor_material, 0, EntityEquipmentSlot.FEET).setCreativeTab(Main.TeamMadnessModArmorTab);
		
		ashley_musicnote = new ashley_musicnote().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		ashley_headphones = new etc_armor(etc_armor_material, 0, EntityEquipmentSlot.HEAD).setCreativeTab(Main.TeamMadnessModArmorTab);
		
		madness_shard = new madness_shard().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		dark_matter = new dark_matter().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		madness_ingot = new madness_ingot().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		madness_dust = new madness_dust().setCreativeTab(Main.TeamMadnessModMaterialsTab);
		
		beef_taco = new beef_taco(14, 2, false).setCreativeTab(Main.TeamMadnessModItemsTab);
		chicken_taco = new chicken_taco(12, 2, false).setCreativeTab(Main.TeamMadnessModItemsTab);
		choco_taco = new choco_taco(9, 2, false).setCreativeTab(Main.TeamMadnessModItemsTab);
		rabbit_taco = new rabbit_taco(12, 2, false).setCreativeTab(Main.TeamMadnessModItemsTab);

		nick_bag = new nick_bag().setCreativeTab(Main.TeamMadnessModItemsTab);
		
		
	}
	
	public static void registry() {
		
		GameRegistry.register(escapemc_ingot);
		GameRegistry.register(mushrromstew_ingot);
		GameRegistry.register(epicbudder22_ingot);
		GameRegistry.register(jonahjoe2002_ingot);
		
		GameRegistry.register(escapemc_sword);
		GameRegistry.register(escapemc_pickaxe);
		GameRegistry.register(escapemc_axe);
		GameRegistry.register(escapemc_shovel);
		GameRegistry.register(escapemc_hoe);
		GameRegistry.register(escapemc_helmet);
		GameRegistry.register(escapemc_chestplate);
		GameRegistry.register(escapemc_leggings);
		GameRegistry.register(escapemc_boots);
		
		GameRegistry.register(mushrromstew_sword);
		GameRegistry.register(mushrromstew_pickaxe);
		GameRegistry.register(mushrromstew_axe);
		GameRegistry.register(mushrromstew_shovel);
		GameRegistry.register(mushrromstew_hoe);
		GameRegistry.register(mushrromstew_helmet);
		GameRegistry.register(mushrromstew_chestplate);
		GameRegistry.register(mushrromstew_leggings);
		GameRegistry.register(mushrromstew_boots);

		GameRegistry.register(epicbudder22_sword);
		GameRegistry.register(epicbudder22_pickaxe);
		GameRegistry.register(epicbudder22_axe);
		GameRegistry.register(epicbudder22_shovel);
		GameRegistry.register(epicbudder22_hoe);
		GameRegistry.register(epicbudder22_helmet);
		GameRegistry.register(epicbudder22_chestplate);
		GameRegistry.register(epicbudder22_leggings);
		GameRegistry.register(epicbudder22_boots);

		GameRegistry.register(jonahjoe2002_sword);
		GameRegistry.register(jonahjoe2002_pickaxe);
		GameRegistry.register(jonahjoe2002_axe);
		GameRegistry.register(jonahjoe2002_shovel);
		GameRegistry.register(jonahjoe2002_hoe);
		GameRegistry.register(jonahjoe2002_helmet);
		GameRegistry.register(jonahjoe2002_chestplate);
		GameRegistry.register(jonahjoe2002_leggings);
		GameRegistry.register(jonahjoe2002_boots);

		GameRegistry.register(darkmatter_sword);
		GameRegistry.register(darkmatter_pickaxe);
		GameRegistry.register(darkmatter_axe);
		GameRegistry.register(darkmatter_shovel);
		GameRegistry.register(darkmatter_hoe);
		GameRegistry.register(darkmatter_helmet);
		GameRegistry.register(darkmatter_chestplate);
		GameRegistry.register(darkmatter_leggings);
		GameRegistry.register(darkmatter_boots);

		GameRegistry.register(madness_sword);
		GameRegistry.register(madness_pickaxe);
		GameRegistry.register(madness_axe);
		GameRegistry.register(madness_shovel);
		GameRegistry.register(madness_hoe);
		GameRegistry.register(madness_helmet);
		GameRegistry.register(madness_chestplate);
		GameRegistry.register(madness_leggings);
		GameRegistry.register(madness_boots);

		GameRegistry.register(ashley_headphones);
		GameRegistry.register(ashley_musicnote);
		
		GameRegistry.register(madness_shard);
		GameRegistry.register(dark_matter);
		GameRegistry.register(madness_ingot);
		GameRegistry.register(madness_dust);
		
		GameRegistry.register(beef_taco);
		GameRegistry.register(chicken_taco);
		GameRegistry.register(choco_taco);
		GameRegistry.register(rabbit_taco);

		GameRegistry.register(nick_bag);
		
		
	}
	
	public static void registerRenders() {
		
		registerRender(escapemc_ingot);
		registerRender(mushrromstew_ingot);
		registerRender(epicbudder22_ingot);
		registerRender(jonahjoe2002_ingot);
		
		registerRender(escapemc_sword);
		registerRender(escapemc_pickaxe);
		registerRender(escapemc_axe);
		registerRender(escapemc_shovel);
		registerRender(escapemc_hoe);
		registerRender(escapemc_helmet);
		registerRender(escapemc_chestplate);
		registerRender(escapemc_leggings);
		registerRender(escapemc_boots);

		registerRender(mushrromstew_sword);
		registerRender(mushrromstew_pickaxe);
		registerRender(mushrromstew_axe);
		registerRender(mushrromstew_shovel);
		registerRender(mushrromstew_hoe);
		registerRender(mushrromstew_helmet);
		registerRender(mushrromstew_chestplate);
		registerRender(mushrromstew_leggings);
		registerRender(mushrromstew_boots);
		
		registerRender(epicbudder22_sword);
		registerRender(epicbudder22_pickaxe);
		registerRender(epicbudder22_axe);
		registerRender(epicbudder22_shovel);
		registerRender(epicbudder22_hoe);
		registerRender(epicbudder22_helmet);
		registerRender(epicbudder22_chestplate);
		registerRender(epicbudder22_leggings);
		registerRender(epicbudder22_boots);

		registerRender(jonahjoe2002_sword);
		registerRender(jonahjoe2002_pickaxe);
		registerRender(jonahjoe2002_axe);
		registerRender(jonahjoe2002_shovel);
		registerRender(jonahjoe2002_hoe);
		registerRender(jonahjoe2002_helmet);
		registerRender(jonahjoe2002_chestplate);
		registerRender(jonahjoe2002_leggings);
		registerRender(jonahjoe2002_boots);

		registerRender(darkmatter_sword);
		registerRender(darkmatter_pickaxe);
		registerRender(darkmatter_axe);
		registerRender(darkmatter_shovel);
		registerRender(darkmatter_hoe);
		registerRender(darkmatter_helmet);
		registerRender(darkmatter_chestplate);
		registerRender(darkmatter_leggings);
		registerRender(darkmatter_boots);

		registerRender(madness_sword);
		registerRender(madness_pickaxe);
		registerRender(madness_axe);
		registerRender(madness_shovel);
		registerRender(madness_hoe);
		registerRender(madness_helmet);
		registerRender(madness_chestplate);
		registerRender(madness_leggings);
		registerRender(madness_boots);

		registerRender(ashley_musicnote);
		registerRender(ashley_headphones);
	
	
		registerRender(madness_shard);
		registerRender(dark_matter);
		registerRender(madness_ingot);
		registerRender(madness_dust);
		
		registerRender(beef_taco);
		registerRender(chicken_taco);
		registerRender(choco_taco);
		registerRender(rabbit_taco);

		registerRender(nick_bag);
		
		
	}
	
	
	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item) {
		
	    ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

	    
	    
	}
	
	
	
	
	
}
