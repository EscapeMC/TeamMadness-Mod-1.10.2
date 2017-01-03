package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemPickaxe;

public class madness_pickaxe extends ItemPickaxe {

	public madness_pickaxe(ToolMaterial material) {
		super(material);
		
		
		setUnlocalizedName(Reference.ModItems.MADNESS_PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.MADNESS_PICKAXE.getRegistryName());

	}

}
