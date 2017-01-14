package com.github.escapemc.teammadnessmod.blocks;

import com.github.escapemc.teammadnessmod.Reference;
import com.github.escapemc.teammadnessmod.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class cdm extends Block {

	public cdm(Material materialIn) {
		super(materialIn);
		this.setHardness(2F);
		this.setHarvestLevel("pickaxe", 3);
		this.setResistance(15);

	
		setUnlocalizedName(Reference.ModItems.CDM.getUnlocalizedName());
		setRegistryName(Reference.ModItems.CDM.getRegistryName());

		
		

		
		
	}

}