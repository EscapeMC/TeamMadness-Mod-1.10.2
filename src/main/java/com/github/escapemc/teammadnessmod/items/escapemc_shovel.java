package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemSpade;

public class escapemc_shovel extends ItemSpade {

	public escapemc_shovel(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(Reference.ModItems.ESCAPEMC_SHOVEL.getUnlocalizedName());
		setRegistryName(Reference.ModItems.ESCAPEMC_SHOVEL.getRegistryName());

		
	}

}
