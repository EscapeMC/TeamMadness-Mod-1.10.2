package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemAxe;

public class mushrromstew_axe extends ItemAxe {

	public mushrromstew_axe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		
		setUnlocalizedName(Reference.ModItems.MUSHRROMSTEW_AXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.MUSHRROMSTEW_AXE.getRegistryName());

	}

}
