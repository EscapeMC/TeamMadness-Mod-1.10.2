package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemSword;

public class madness_sword extends ItemSword {

	public madness_sword(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(Reference.ModItems.MADNESS_SWORD.getUnlocalizedName());
		setRegistryName(Reference.ModItems.MADNESS_SWORD.getRegistryName());

		
	}

}
