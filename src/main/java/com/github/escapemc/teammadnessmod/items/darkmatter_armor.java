package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class darkmatter_armor extends ItemArmor {

	public darkmatter_armor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);

		if(equipmentSlotIn == EntityEquipmentSlot.HEAD) {
			setUnlocalizedName(Reference.ModItems.DARKMATTER_HELMET.getUnlocalizedName());
			setRegistryName(Reference.ModItems.DARKMATTER_HELMET.getRegistryName());

		
		
		}
			
		if(equipmentSlotIn == EntityEquipmentSlot.CHEST) {
			setUnlocalizedName(Reference.ModItems.DARKMATTER_CHESTPLATE.getUnlocalizedName());
			setRegistryName(Reference.ModItems.DARKMATTER_CHESTPLATE.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.LEGS) {
			setUnlocalizedName(Reference.ModItems.DARKMATTER_LEGGINGS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.DARKMATTER_LEGGINGS.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.FEET) {
			setUnlocalizedName(Reference.ModItems.DARKMATTER_BOOTS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.DARKMATTER_BOOTS.getRegistryName());

		
		
		}
}

}
