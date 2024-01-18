package net.tuvscore.camg.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tuvscore.camg.camg;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
             DeferredRegister.create(ForgeRegistries.ITEMS, camg.MOD_ID);

    public  static final RegistryObject<Item> HILT = ITEMS.register("hilt",
            () -> new Item(new Item.Properties().stacksTo(4).tab(ModCreativeModTab.ITEMS_TAB)));

    public  static final RegistryObject<Item> PLUME = ITEMS.register("plume",
            () -> new Item(new Item.Properties().stacksTo(8).tab(ModCreativeModTab.ITEMS_TAB)));

    public  static final RegistryObject<Item> CLOTH = ITEMS.register("cloth",
            () -> new Item(new Item.Properties().stacksTo(5).tab(ModCreativeModTab.ITEMS_TAB)));

    public  static final RegistryObject<Item> WOOLEN_FABRIC = ITEMS.register("woolen_fabric",
            () -> new Item(new Item.Properties().stacksTo(6).tab(ModCreativeModTab.ITEMS_TAB)));

    public  static final RegistryObject<Item> CROCODILE_SCALE = ITEMS.register("crocodile_scale",
            () -> new Item(new Item.Properties().stacksTo(4).tab(ModCreativeModTab.ITEMS_TAB)));
    public  static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
