package com.github.escapemc.teammadnessmod.items;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.item.ItemAxe;

public class diamondtips_axe extends ItemAxe {

	public diamondtips_axe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		
		setUnlocalizedName(Reference.ModItems.DIAMONDTIPS_AXE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.DIAMONDTIPS_AXE.getRegistryName());

		
	}

}
