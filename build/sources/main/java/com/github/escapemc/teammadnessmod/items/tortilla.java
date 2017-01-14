package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemFood;

public class tortilla extends ItemFood {

	public tortilla(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		
		
		
		setUnlocalizedName(Reference.ModItems.TORTILLA.getUnlocalizedName());
		setRegistryName(Reference.ModItems.TORTILLA.getRegistryName());
		
	}

}
