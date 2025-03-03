package cofh.lib.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public class ItemTierCoFH implements IItemTier {

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    public ItemTierCoFH(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {

        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    // region IItemTier
    @Override
    public int getUses() {

        return this.uses;
    }

    @Override
    public float getSpeed() {

        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {

        return this.damage;
    }

    @Override
    public int getLevel() {

        return this.level;
    }

    @Override
    public int getEnchantmentValue() {

        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {

        return this.repairIngredient.get();
    }
    // endregion
}
