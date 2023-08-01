package net.nuxvar.modlearning.item;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nuxvar.modlearning.ModLearning;
import net.nuxvar.modlearning.item.custom.EightBallItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModLearning.MOD_ID);

    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB)));
    public static final RegistryObject<Item> NUXVARIUM = ITEMS.register("nuxvarium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB)));
    public static final RegistryObject<Item> RAW_NUXVARIUM = ITEMS.register("raw_nuxvarium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB).stacksTo(1)));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
