package com.github.escapemc.teammadnessmod.blocks;

import com.github.escapemc.teammadnessmod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class bossface88_ore extends Block {

	public bossface88_ore(Material materialIn) {
		super(materialIn);
		this.setHardness(2F);
		this.setHarvestLevel("pickaxe", 3);
		this.setResistance(15);

		
		setUnlocalizedName(Reference.ModItems.BOSSFACE88_ORE.getUnlocalizedName());
		setRegistryName(Reference.ModItems.BOSSFACE88_ORE.getRegistryName());
	}

}
