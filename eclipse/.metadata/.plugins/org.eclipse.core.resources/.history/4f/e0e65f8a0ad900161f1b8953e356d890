package com.github.escapemc.teammadnessmod.container;

import com.github.escapemc.teammadnessmod.hardlib.api.internal.CommonContainer9x5;
import com.github.escapemc.teammadnessmod.hardlib.api.inventory.SlotItem;
import com.github.escapemc.teammadnessmod.tileentity.TileEntityMadnessChest;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class ContainerMadnessChest extends CommonContainer9x5 {
	TileEntityMadnessChest tileEntity;
    private int numRows = 5;


	public ContainerMadnessChest(InventoryPlayer inventory, TileEntityMadnessChest te) {
		super(inventory, inventory, null);
		tileEntity = te;
		IItemHandler inven = tileEntity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
        for (int j = 0; j < this.numRows; ++j)
        {
            for (int k = 0; k < 9; ++k)
            {
                this.addSlotToContainer(new SlotItem(inven, k + j * 9, 8 + k * 18, 12 + j * 18));
            }
        }
		
		
		}
}
