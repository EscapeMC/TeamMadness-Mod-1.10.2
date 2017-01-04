package com.github.escapemc.teammadnessmod.handlers;

import com.github.escapemc.teammadnessmod.client.gui.gui_madness_chest;
import com.github.escapemc.teammadnessmod.container.ContainerMadnessChest;
import com.github.escapemc.teammadnessmod.tileentity.TileEntityMadnessChest;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public static final int MADNESS_CHEST = 37;
	
	
	

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		if(ID == MADNESS_CHEST) {
			TileEntity tileEntity = world.getTileEntity(pos);
			if(tileEntity instanceof TileEntityMadnessChest){
				return new ContainerMadnessChest(player.inventory, (TileEntityMadnessChest) tileEntity);
			}
		}
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		if(ID == MADNESS_CHEST) {
			TileEntity tileEntity = world.getTileEntity(pos);
			if(tileEntity instanceof TileEntityMadnessChest){
				return new gui_madness_chest(new ContainerMadnessChest(player.inventory, (TileEntityMadnessChest)tileEntity), (TileEntityMadnessChest) tileEntity);
			}
		}
		return null;
	}
}