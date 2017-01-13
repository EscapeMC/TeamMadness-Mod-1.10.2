package com.github.escapemc.teammadnessmod.hardlib.api.internal;

import javax.annotation.Nullable;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class CommonContainerBlackHole extends Container {

	
    private final int numRows;

    public CommonContainerBlackHole(IInventory playerInventory, IInventory chestInventory, EntityPlayer player)
    {
        this.numRows = chestInventory.getSizeInventory() / 9;
        chestInventory.openInventory(player);
        int i = (this.numRows - 5) * 18;

        
		//Player Inventory
		for (int k = 0; k < 3; ++k) {
			for (int j = 0; j < 9; ++j) {
			this.addSlotToContainer(new Slot(playerInventory, j + k * 9 + 9, 129 + j * 18, 185 + k * 18));
			}

        //Player Hotbar
        for (int i1 = 0; i1 < 9; ++i1)
        {
            this.addSlotToContainer(new Slot(playerInventory, i1, 129 + i1 * 18, 261 + i));
        }
    }
}    
    
	@Override
    @Nullable
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
        ItemStack itemstack = null;
        Slot slot = (Slot)this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack())
        {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < this.numRows * 18)
            {
                if (!this.mergeItemStack(itemstack1, this.numRows * 18, this.inventorySlots.size(), true))
                {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack1, 0, this.numRows * 18, false))
            {
                return null;
            }

            if (itemstack1.stackSize == 0)
            {
                slot.putStack((ItemStack)null);
            }
            else
            {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return true;
	}
}