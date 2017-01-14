package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class diamondtips_armor extends ItemArmor {

	public diamondtips_armor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
	
		if(equipmentSlotIn == EntityEquipmentSlot.HEAD) {
			setUnlocalizedName(Reference.ModItems.DIAMONDTIPS_HELMET.getUnlocalizedName());
			setRegistryName(Reference.ModItems.DIAMONDTIPS_HELMET.getRegistryName());

		
		
		}
			
		if(equipmentSlotIn == EntityEquipmentSlot.CHEST) {
			setUnlocalizedName(Reference.ModItems.DIAMONDTIPS_CHESTPLATE.getUnlocalizedName());
			setRegistryName(Reference.ModItems.DIAMONDTIPS_CHESTPLATE.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.LEGS) {
			setUnlocalizedName(Reference.ModItems.DIAMONDTIPS_LEGGINGS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.DIAMONDTIPS_LEGGINGS.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.FEET) {
			setUnlocalizedName(Reference.ModItems.DIAMONDTIPS_BOOTS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.DIAMONDTIPS_BOOTS.getRegistryName());

		
		
		}
	}

}
