package com.github.escapemc.teammadnessmod.container;

import com.github.escapemc.teammadnessmod.hardlib.api.internal.CommonContainerRightClickable;
import com.github.escapemc.teammadnessmod.hardlib.api.inventory.SlotBag;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.EnumHand;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;

public class ContainerNickBag extends CommonContainerRightClickable {
    private int numRows = 2;


	public ContainerNickBag(InventoryPlayer inventory) {
		super(inventory, null);
		IItemHandler inven = inventory.player.getHeldItem(EnumHand.MAIN_HAND).getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
        for (int j = 0; j < this.numRows; ++j)
        {
            for (int k = 0; k < 9; ++k)
            {
                this.addSlotToContainer(new SlotBag(inven, k + j * 9, 8 + k * 18, 12 + j * 18));
            }
        }
		
		
		}
}
