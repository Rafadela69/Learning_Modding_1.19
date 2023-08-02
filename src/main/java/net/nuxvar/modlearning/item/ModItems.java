package net.nuxvar.modlearning.item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nuxvar.modlearning.ModLearning;
import net.nuxvar.modlearning.block.ModBlocks;
import net.nuxvar.modlearning.item.custom.EightBallItem;
import net.nuxvar.modlearning.item.custom.Heart;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModLearning.MOD_ID);

    public static final RegistryObject<Item> PEACH = ITEMS.register("peach",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));
    public static final RegistryObject<Item> PEACH_SEEDS = ITEMS.register("peach_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PEACH_CROP.get(),
                    new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB)));
    public static final RegistryObject<Item> NUXVARIUM = ITEMS.register("nuxvarium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB)));
    public static final RegistryObject<Item> RAW_NUXVARIUM = ITEMS.register("raw_nuxvarium",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB)));
    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB).stacksTo(1)));
    public static final RegistryObject<Item> HEART = ITEMS.register("heart",
            () -> new Heart(new Item.Properties().tab(ModCreativeModTab.LEARNING_TAB)));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
