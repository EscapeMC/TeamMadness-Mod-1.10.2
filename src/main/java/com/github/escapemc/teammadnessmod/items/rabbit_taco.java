package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemFood;

public class rabbit_taco extends ItemFood {

	public rabbit_taco(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(Reference.ModItems.RABBIT_TACO.getUnlocalizedName());
		setRegistryName(Reference.ModItems.RABBIT_TACO.getRegistryName());

		
	}

}
