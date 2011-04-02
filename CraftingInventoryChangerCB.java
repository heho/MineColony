package net.minecraft.src;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode 

import java.util.List;

public class CraftingInventoryChangerCB extends CraftingInventoryCB
{

    public CraftingInventoryChangerCB(IInventory iinventory, TileEntityChanger tileentitychanger)
    {
        changerInventory = tileentitychanger;
        func_20117_a(new SlotRestricted(tileentitychanger, 1, 12, 24, true, mod_MineColony.moneyBronze));
        func_20117_a(new SlotRestricted(tileentitychanger, 2, 32, 24, true, mod_MineColony.moneySilver));
        func_20117_a(new SlotRestricted(tileentitychanger, 3, 52, 24, true, mod_MineColony.moneyGold));
		func_20117_a(new SlotRestricted(tileentitychanger, 4, 12, 44, true, Item.ingotIron));
        func_20117_a(new SlotRestricted(tileentitychanger, 5, 32, 44, true, Item.ingotGold));
        func_20117_a(new SlotRestricted(tileentitychanger, 6, 52, 44, true, Item.diamond));
		func_20117_a(new SlotRestricted(tileentitychanger, 7, 104, 24, false, mod_MineColony.moneyBronze));
        func_20117_a(new SlotRestricted(tileentitychanger, 8, 124, 24, false, mod_MineColony.moneySilver));
        func_20117_a(new SlotRestricted(tileentitychanger, 9, 144, 24, false, mod_MineColony.moneyGold));
		func_20117_a(new SlotRestricted(tileentitychanger, 10, 104, 44, false, Item.ingotIron));
        func_20117_a(new SlotRestricted(tileentitychanger, 11, 124, 44, false, Item.ingotGold));
        func_20117_a(new SlotRestricted(tileentitychanger, 12, 144, 44, false, Item.diamond));
        for(int i = 0; i < 3; i++)
        {
            for(int k = 0; k < 9; k++)
            {
                func_20117_a(new Slot(iinventory, k + i * 9 + 9, 8 + k * 18, 84 + i * 18));
            }

        }

        for(int j = 0; j < 9; j++)
        {
            func_20117_a(new Slot(iinventory, j, 8 + j * 18, 142));
        }

    }

    public void func_20114_a()
    {
        super.func_20114_a();
    }


    public boolean func_20120_b(EntityPlayer entityplayer)
    {
        return changerInventory.canInteractWith(entityplayer);
    }

    private TileEntityChanger changerInventory;
}
