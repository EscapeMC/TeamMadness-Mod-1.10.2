package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemAxe;

public class escapemc_axe extends ItemAxe {

	public escapemc_axe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		
		setUnlocalizedName(Reference.ModItems.ESCAPEMC_AXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ESCAPEMC_AXE.getRegistryName());

		
	}

}
