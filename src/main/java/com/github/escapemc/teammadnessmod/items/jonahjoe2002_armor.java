package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class jonahjoe2002_armor extends ItemArmor {

	public jonahjoe2002_armor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);

		if(equipmentSlotIn == EntityEquipmentSlot.HEAD) {
			setUnlocalizedName(Reference.ModItems.JONAHJOE2002_HELMET.getUnlocalizedName());
			setRegistryName(Reference.ModItems.JONAHJOE2002_HELMET.getRegistryName());

		
		
		}
			
		if(equipmentSlotIn == EntityEquipmentSlot.CHEST) {
			setUnlocalizedName(Reference.ModItems.JONAHJOE2002_CHESTPLATE.getUnlocalizedName());
			setRegistryName(Reference.ModItems.JONAHJOE2002_CHESTPLATE.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.LEGS) {
			setUnlocalizedName(Reference.ModItems.JONAHJOE2002_LEGGINGS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.JONAHJOE2002_LEGGINGS.getRegistryName());

		
		
		}

		if(equipmentSlotIn == EntityEquipmentSlot.FEET) {
			setUnlocalizedName(Reference.ModItems.JONAHJOE2002_BOOTS.getUnlocalizedName());
			setRegistryName(Reference.ModItems.JONAHJOE2002_BOOTS.getRegistryName());

		
		
		}
}

}
