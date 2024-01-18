package net.tuvscore.camg.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab ITEMS_TAB = new CreativeModeTab("coreitemstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLUME.get());
        }
    };

    public static final CreativeModeTab WEAPONS_TAB = new CreativeModeTab("coreweaponstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLUME.get());
        }
    };

    public static final CreativeModeTab TOOLS_TAB = new CreativeModeTab("coretoolstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLUME.get());
        }
    };

    public static final CreativeModeTab ARMOR_TAB = new CreativeModeTab("corearmorstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PLUME.get());
        }
    };
}
