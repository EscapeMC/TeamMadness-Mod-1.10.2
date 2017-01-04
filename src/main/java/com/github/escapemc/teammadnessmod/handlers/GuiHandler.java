package com.github.escapemc.teammadnessmod.handlers;

import com.github.escapemc.teammadnessmod.client.gui.GuiNickBag;
import com.github.escapemc.teammadnessmod.client.gui.gui_madness_chest;
import com.github.escapemc.teammadnessmod.container.ContainerMadnessChest;
import com.github.escapemc.teammadnessmod.container.ContainerNickBag;
import com.github.escapemc.teammadnessmod.tileentity.TileEntityMadnessChest;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {
	
	public static final int MADNESS_CHEST = 37;
	public static final int NICK_BAG = 38;
	
	
	

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
        switch (ID){
            case MADNESS_CHEST:
            	return new ContainerMadnessChest(player.inventory, (TileEntityMadnessChest) tileEntity);
            case NICK_BAG:
                return new ContainerNickBag(player.inventory);
        }
        return null;
    }
	
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
        switch (ID) {
            case MADNESS_CHEST:
                return new gui_madness_chest(new ContainerMadnessChest(player.inventory, (TileEntityMadnessChest)tileEntity), (TileEntityMadnessChest) tileEntity);
            case NICK_BAG:
                return new GuiNickBag(new ContainerNickBag(player.inventory));
        }
        return null;
    }
}