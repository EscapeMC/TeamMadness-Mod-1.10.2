package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class escapemc_armor extends ItemArmor {

	public escapemc_armor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
	
		if(equipmentSlotIn == EntityEquipmentSlot.HEAD) {
			setUnlocalizedName(Reference.ModItems.ESCAPEMC_HELMET.getUnlocalizedName());
			setRegistryName(Reference.ModItems.ESCAPEMC_HELMET.getRegistryName());

		
		
		}
			
		if(equipmentSlotIn == EntityEquipmentSlot.CHEST) {
			setUnlocalizedName(Reference.ModItems.ESCAPEMC_CHESTPLATE.getUnlocalizedName());
			setRegistryName(Reference.ModItems.ESCAPEMC_CHESTPLATE.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.LEGS) {
			setUnlocalizedName(Reference.ModItems.ESCAPEMC_LEGGINGS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.ESCAPEMC_LEGGINGS.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.FEET) {
			setUnlocalizedName(Reference.ModItems.ESCAPEMC_BOOTS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.ESCAPEMC_BOOTS.getRegistryName());

		
		
		}
	}

}
