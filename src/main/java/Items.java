import net.fabricmc.api.ModInitializer;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items implements ModInitializer {

    public static ToolItem End_Pickaxe = new EndPick(EndMat.Instance, -2, -2.5f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem End_Sword = new SwordItem(EndMat.Instance, 0, -2f, new Item.Settings().group(ItemGroup.COMBAT));
    public static ToolItem End_Axe = new EndAxe(EndMat.Instance, 3f, -2.7f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem End_Shovel = new ShovelItem(EndMat.Instance, -3, -2f, new Item.Settings().group(ItemGroup.TOOLS));
    public static ToolItem End_Hoe = new EndHoe(EndMat.Instance, -5, -1.1f, new Item.Settings().group(ItemGroup.TOOLS));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("basic_tools", "end_pick"), End_Pickaxe);
        Registry.register(Registry.ITEM, new Identifier("basic_tools", "end_axe"), End_Axe);
        Registry.register(Registry.ITEM, new Identifier("basic_tools", "end_sword"), End_Sword);
        Registry.register(Registry.ITEM, new Identifier("basic_tools", "end_shovel"), End_Shovel);
        Registry.register(Registry.ITEM, new Identifier("basic_tools", "end_hoe"), End_Hoe);
    }
}
