package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class splixfpv_armor extends ItemArmor {

	public splixfpv_armor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);

		if(equipmentSlotIn == EntityEquipmentSlot.HEAD) {
			setUnlocalizedName(Reference.ModItems.SPLIXFPV_HELMET.getUnlocalizedName());
			setRegistryName(Reference.ModItems.SPLIXFPV_HELMET.getRegistryName());

		
		
		}
			
		if(equipmentSlotIn == EntityEquipmentSlot.CHEST) {
			setUnlocalizedName(Reference.ModItems.SPLIXFPV_CHESTPLATE.getUnlocalizedName());
			setRegistryName(Reference.ModItems.SPLIXFPV_CHESTPLATE.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.LEGS) {
			setUnlocalizedName(Reference.ModItems.SPLIXFPV_LEGGINGS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.SPLIXFPV_LEGGINGS.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.FEET) {
			setUnlocalizedName(Reference.ModItems.SPLIXFPV_BOOTS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.SPLIXFPV_BOOTS.getRegistryName());

		
		
		}
}

}
