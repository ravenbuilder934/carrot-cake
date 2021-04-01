package carrotcake;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static carrotcake.BlockRegistry.carrotcake;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CarrotCake.MOD_ID);

    public static final RegistryObject<Item> carrotcake_item = ITEMS.register("carrotcake", () -> new BlockItem(carrotcake.get(), new Item.Properties().tab(ItemGroup.TAB_FOOD)));
}
