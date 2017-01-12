package com.github.escapemc.teammadnessmod.blocks;

import javax.annotation.Nullable;

import com.github.escapemc.teammadnessmod.Main;
import com.github.escapemc.teammadnessmod.Reference;
import com.github.escapemc.teammadnessmod.handlers.GuiHandler;
import com.github.escapemc.teammadnessmod.tileentity.TileEntityMadnessChest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class madness_chest extends Block {

	private static boolean keepInventory;
	
	public madness_chest(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 1);
		this.setResistance(15);
		this.setHardness(2F);
		setUnlocalizedName(Reference.ModItems.MADNESS_CHEST.getUnlocalizedName());
		setRegistryName(Reference.ModItems.MADNESS_CHEST.getRegistryName());
		
	}

	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		
		return new TileEntityMadnessChest(); 
	
	}
	
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (worldIn.isRemote)
        {
            return true;
        }
        else
        {
            TileEntity tileentity = worldIn.getTileEntity(pos);
            
            if (tileentity instanceof TileEntityMadnessChest)
            {
        		playerIn.openGui(Main.instance, GuiHandler.MADNESS_CHEST, worldIn, pos.getX(), pos.getY(), pos.getZ());
            }

            return true;
        }
    }
	

	
	@Override
	public boolean removedByPlayer(IBlockState state, World worldIn, BlockPos pos, EntityPlayer player, boolean willHarvest) {
		if(!worldIn.isRemote) {
			TileEntity tileentity = worldIn.getTileEntity(pos);
	
			IItemHandler inventory = worldIn.getTileEntity(pos).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
			for (int i = 0; i < inventory.getSlots(); i++) {
				ItemStack stack = inventory.getStackInSlot(i);
				EntityItem entityIn;
				if (stack != null) {
					entityIn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), stack);
					entityIn.setDefaultPickupDelay();
					worldIn.spawnEntityInWorld(entityIn);
				}
			}
		}
		return super.removedByPlayer(state, worldIn, pos, player, willHarvest);
	}

	
	

	@Override
	public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
	    if (stack.hasDisplayName()) {
	        ((TileEntityMadnessChest) worldIn.getTileEntity(pos)).setCustomName(stack.getDisplayName());
	    }
	}

	public EnumBlockRenderType getRenderType(IBlockState state) {
		return EnumBlockRenderType.MODEL;
	}	
	
}
