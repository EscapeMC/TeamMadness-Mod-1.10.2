package com.github.escapemc.teammadnessmod.blocks;

import java.util.ArrayList;

import com.github.escapemc.teammadnessmod.Reference;
import com.github.escapemc.teammadnessmod.init.ModBlocks;
import com.github.escapemc.teammadnessmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class ms extends Block {

    public ms(Material material) {
        super(material);
        this.setHarvestLevel("pickaxe", 3);
        this.setHardness(2F);
        this.setResistance(15);

        
		setUnlocalizedName(Reference.ModItems.MS.getUnlocalizedName());
		setRegistryName(Reference.ModItems.MS.getRegistryName());

        

		
		
    }

    @Override
    public ArrayList getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
        ArrayList drops = new ArrayList();
        drops.add(new ItemStack(ModItems.dark_matter, RANDOM.nextInt(3) + 1));
        if (RANDOM.nextFloat() < 0.4F)
            drops.add(new ItemStack(Items.DIAMOND));
        if (RANDOM.nextFloat() < 0.2F)
        	drops.add(new ItemStack(ModItems.escapemc_ingot));
        if (RANDOM.nextFloat() < 0.2F)
        	drops.add(new ItemStack(ModItems.mushrromstew_ingot));
        if (RANDOM.nextFloat() < 0.2F)
        	drops.add(new ItemStack(ModItems.epicbudder22_ingot));
        if (RANDOM.nextFloat() < 0.2F)
        	drops.add(new ItemStack(ModItems.splixfpv_ingot));
        return drops;
    }
}