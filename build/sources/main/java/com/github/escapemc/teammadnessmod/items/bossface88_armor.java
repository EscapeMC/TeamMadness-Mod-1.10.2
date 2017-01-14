package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class bossface88_armor extends ItemArmor {

	public bossface88_armor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
	
		if(equipmentSlotIn == EntityEquipmentSlot.HEAD) {
			setUnlocalizedName(Reference.ModItems.BOSSFACE88_HELMET.getUnlocalizedName());
			setRegistryName(Reference.ModItems.BOSSFACE88_HELMET.getRegistryName());

		
		
		}
			
		if(equipmentSlotIn == EntityEquipmentSlot.CHEST) {
			setUnlocalizedName(Reference.ModItems.BOSSFACE88_CHESTPLATE.getUnlocalizedName());
			setRegistryName(Reference.ModItems.BOSSFACE88_CHESTPLATE.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.LEGS) {
			setUnlocalizedName(Reference.ModItems.BOSSFACE88_LEGGINGS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.BOSSFACE88_LEGGINGS.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.FEET) {
			setUnlocalizedName(Reference.ModItems.BOSSFACE88_BOOTS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.BOSSFACE88_BOOTS.getRegistryName());

		
		
		}
	}

}
