package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemFood;

public class choco_taco extends ItemFood {

	public choco_taco(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(Reference.ModItems.CHOCO_TACO.getUnlocalizedName());
		setRegistryName(Reference.ModItems.CHOCO_TACO.getRegistryName());

		
	}

}
