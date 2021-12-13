import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EndMat implements ToolMaterial {
public static final EndMat Instance = new EndMat();

    @Override
    public int getDurability() {
        return 2700;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.5f;
    }

    @Override
    public float getAttackDamage() {
        return 10f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
