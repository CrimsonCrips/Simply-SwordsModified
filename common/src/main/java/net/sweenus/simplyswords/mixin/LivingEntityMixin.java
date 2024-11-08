package net.sweenus.simplyswords.mixin;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.sweenus.simplyswords.registry.SoundRegistry;
import net.sweenus.simplyswords.util.HelperMethods;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Inject(at = @At("HEAD"), method = "isDead", cancellable = true)
    public void simplyswords$tick(CallbackInfoReturnable<Boolean> cir) {
        LivingEntity livingEntity = (LivingEntity) (Object) this;
        if (!livingEntity.getWorld().isClient()) {
            if (livingEntity instanceof PlayerEntity player) {
                World world = player.getWorld();
                ItemStack stack = player.getMainHandStack();

                if (player.getHealth() <= 0.0F && !player.getItemCooldownManager().isCoolingDown(stack.getItem())) {

                    player.setHealth(player.getMaxHealth());
                    HelperMethods.incrementStatusEffect(player, StatusEffects.RESISTANCE, 100, 2, 3);
                    world.playSound(null, player.getBlockPos(), SoundRegistry.MAGIC_SWORD_SPELL_02.get(),
                            player.getSoundCategory(), 0.7f, 1.0f);
                    world.playSound(null, player.getBlockPos(), SoundRegistry.SPELL_MISC_02.get(),
                            player.getSoundCategory(), 0.8f, 1.0f);
                    cir.setReturnValue(false);
                }
            }
        }
    }


}