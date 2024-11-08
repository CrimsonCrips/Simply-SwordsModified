package net.sweenus.simplyswords.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;
import net.sweenus.simplyswords.SimplySwords;
import net.sweenus.simplyswords.item.*;

public class ItemsRegistry {

    static float iron_modifier = 3.0f;
    static float gold_modifier = 3.0f;
    static float diamond_modifier = 3.0f;
    static float netherite_modifier = 3.0f;


    static float longsword_positive_modifier = 0.0f;
    static float twinblade_positive_modifier = 0.0f;
    static float rapier_positive_modifier = 0.0f;
    static float katana_positive_modifier = 0.0f;
    static float sai_positive_modifier = 0.0f;
    static float spear_positive_modifier = 0.0f;
    static float glaive_positive_modifier = 0.0f;
    static float warglaive_positive_modifier = 0.0f;
    static float cutlass_positive_modifier = 0.0f;
    static float claymore_positive_modifier = 2.0f;
    static float greataxe_positive_modifier = 3.0f;
    static float greathammer_positive_modifier = 4.0f;
    static float chakram_positive_modifier = 1.0f;
    static float scythe_positive_modifier = 1.0f;
    static float halberd_positive_modifier = 3.0f;

    static float longsword_negative_modifier = 0.0f;
    static float twinblade_negative_modifier = 0.0f;
    static float rapier_negative_modifier = 1.0f;
    static float sai_negative_modifier = 0.0f;
    static float spear_negative_modifier = 3.0f;
    static float katana_negative_modifier = 0.0f;
    static float glaive_negative_modifier = 0.0f;
    static float warglaive_negative_modifier = 0.0f;
    static float cutlass_negative_modifier = 0.0f;
    static float claymore_negative_modifier = 0.0f;
    static float greataxe_negative_modifier = 0.0f;
    static float greathammer_negative_modifier = 0.0f;
    static float chakram_negative_modifier = 1.0f;
    static float scythe_negative_modifier = 0.0f;
    static float halberd_negative_modifier = 0.0f;

     static float longsword_attackspeed = -2.4f;
     static float twinblade_attackspeed = -2.0f;
     static float rapier_attackspeed = -1.8f;
     static float katana_attackspeed = -2.0f;
     static float sai_attackspeed = -1.5f;
     static float spear_attackspeed = -2.7f;
     static float glaive_attackspeed = -2.6f;
     static float warglaive_attackspeed = -2.2f;
     static float cutlass_attackspeed = -2.0f;
     static float claymore_attackspeed = -2.8f;
     static float greataxe_attackspeed = -3.1f;
     static float greathammer_attackspeed = -3.2f;
     static float chakram_attackspeed = -3.0f;
     static float scythe_attackspeed = -2.7f;
     static float halberd_attackspeed = -2.8f;

    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(SimplySwords.MOD_ID, RegistryKeys.ITEM);

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_LONGSWORD = ITEM.register("iron_longsword", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + longsword_positive_modifier - longsword_negative_modifier),
                    longsword_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_TWINBLADE = ITEM.register( "iron_twinblade", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
                    twinblade_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_RAPIER = ITEM.register( "iron_rapier", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + rapier_positive_modifier - rapier_negative_modifier),
                    rapier_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_KATANA = ITEM.register( "iron_katana", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + katana_positive_modifier - katana_negative_modifier),
                    katana_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_SAI = ITEM.register( "iron_sai", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + sai_positive_modifier - sai_negative_modifier),
                    sai_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_SPEAR = ITEM.register( "iron_spear", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + spear_positive_modifier - spear_negative_modifier),
                    spear_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_GLAIVE = ITEM.register( "iron_glaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + glaive_positive_modifier - glaive_negative_modifier),
                    glaive_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_WARGLAIVE = ITEM.register( "iron_warglaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
                    warglaive_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_CUTLASS = ITEM.register( "iron_cutlass", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
                    cutlass_attackspeed,
                    "minecraft:iron_ingot"));
    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_CLAYMORE = ITEM.register( "iron_claymore", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + claymore_positive_modifier - claymore_negative_modifier),
                    claymore_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_GREATHAMMER = ITEM.register( "iron_greathammer", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
                    greathammer_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_GREATAXE = ITEM.register( "iron_greataxe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
                    greataxe_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_CHAKRAM = ITEM.register( "iron_chakram", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + chakram_positive_modifier - chakram_negative_modifier),
                    chakram_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_SCYTHE = ITEM.register( "iron_scythe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + scythe_positive_modifier - scythe_negative_modifier),
                    scythe_attackspeed,
                    "minecraft:iron_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> IRON_HALBERD = ITEM.register( "iron_halberd", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.IRON,
                    (int) (iron_modifier + halberd_positive_modifier - halberd_negative_modifier),
                    halberd_attackspeed,
                    "minecraft:iron_ingot"));

    //GOLD
    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_LONGSWORD = ITEM.register( "gold_longsword", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + longsword_positive_modifier - longsword_negative_modifier),
                    longsword_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_TWINBLADE = ITEM.register( "gold_twinblade", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
                    twinblade_attackspeed,
                    "minecraft:gold_ingot"));
    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_RAPIER = ITEM.register( "gold_rapier", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + rapier_positive_modifier - rapier_negative_modifier),
                    rapier_attackspeed,
                    "minecraft:gold_ingot"));
    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_KATANA = ITEM.register( "gold_katana", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + katana_positive_modifier - katana_negative_modifier),
                    katana_attackspeed,
                    "minecraft:gold_ingot"));
    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_SAI = ITEM.register( "gold_sai", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + sai_positive_modifier - sai_negative_modifier),
                    sai_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_SPEAR = ITEM.register( "gold_spear", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + spear_positive_modifier - spear_negative_modifier),
                    spear_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_GLAIVE = ITEM.register( "gold_glaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + glaive_positive_modifier - glaive_negative_modifier),
                    glaive_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_WARGLAIVE = ITEM.register( "gold_warglaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
                    warglaive_attackspeed,
                    "minecraft:gold_ingot"));
    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_CUTLASS = ITEM.register( "gold_cutlass", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
                    cutlass_attackspeed,
                    "minecraft:gold_ingot"));
    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_CLAYMORE = ITEM.register( "gold_claymore", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + claymore_positive_modifier - claymore_negative_modifier),
                    claymore_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_GREATHAMMER = ITEM.register( "gold_greathammer", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
                    greathammer_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_GREATAXE = ITEM.register( "gold_greataxe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
                    greataxe_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_CHAKRAM = ITEM.register( "gold_chakram", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + chakram_positive_modifier - chakram_negative_modifier),
                    chakram_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_SCYTHE = ITEM.register( "gold_scythe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + scythe_positive_modifier - scythe_negative_modifier),
                    scythe_attackspeed,
                    "minecraft:gold_ingot"));

    public static final RegistrySupplier<SimplySwordsSwordItem> GOLD_HALBERD = ITEM.register( "gold_halberd", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.GOLD,
                    (int) (gold_modifier + halberd_positive_modifier - halberd_negative_modifier),
                    halberd_attackspeed,
                    "minecraft:gold_ingot"));

    //DIAMOND
    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_LONGSWORD = ITEM.register( "diamond_longsword", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + longsword_positive_modifier - longsword_negative_modifier),
                    longsword_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_TWINBLADE = ITEM.register( "diamond_twinblade", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
                    twinblade_attackspeed,
                    "minecraft:diamond"));
    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_RAPIER = ITEM.register( "diamond_rapier", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + rapier_positive_modifier - rapier_negative_modifier),
                    rapier_attackspeed,
                    "minecraft:diamond"));
    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_KATANA = ITEM.register( "diamond_katana", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + katana_positive_modifier - katana_negative_modifier),
                    katana_attackspeed,
                    "minecraft:diamond"));
    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_SAI = ITEM.register( "diamond_sai", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + sai_positive_modifier - sai_negative_modifier),
                    sai_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_SPEAR = ITEM.register( "diamond_spear", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + spear_positive_modifier - spear_negative_modifier),
                    spear_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_GLAIVE = ITEM.register( "diamond_glaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + glaive_positive_modifier - glaive_negative_modifier),
                    glaive_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_WARGLAIVE = ITEM.register( "diamond_warglaive", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
                    warglaive_attackspeed,
                    "minecraft:diamond"));
    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_CUTLASS = ITEM.register( "diamond_cutlass", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
                    cutlass_attackspeed,
                    "minecraft:diamond"));
    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_CLAYMORE = ITEM.register( "diamond_claymore", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + claymore_positive_modifier - claymore_negative_modifier),
                    claymore_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_GREATHAMMER = ITEM.register( "diamond_greathammer", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
                    greathammer_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_GREATAXE = ITEM.register( "diamond_greataxe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
                    greataxe_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_CHAKRAM = ITEM.register( "diamond_chakram", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + chakram_positive_modifier - chakram_negative_modifier),
                    chakram_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_SCYTHE = ITEM.register( "diamond_scythe", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + scythe_positive_modifier - scythe_negative_modifier),
                    scythe_attackspeed,
                    "minecraft:diamond"));

    public static final RegistrySupplier<SimplySwordsSwordItem> DIAMOND_HALBERD = ITEM.register( "diamond_halberd", () ->
            new SimplySwordsSwordItem(
                    ToolMaterials.DIAMOND,
                    (int) (diamond_modifier + halberd_positive_modifier - halberd_negative_modifier),
                    halberd_attackspeed,
                    "minecraft:diamond"));

    //NETHERITE

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_LONGSWORD = ITEM.register( "netherite_longsword", () ->
            new SimplySwordsNetheriteSwordItem(ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + longsword_positive_modifier - longsword_negative_modifier),
                    longsword_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_TWINBLADE = ITEM.register( "netherite_twinblade", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
                    twinblade_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_RAPIER = ITEM.register( "netherite_rapier", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (iron_modifier + rapier_positive_modifier - rapier_negative_modifier),
                    rapier_attackspeed,
                    "minecraft:netherite_ingot"));
    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_KATANA = ITEM.register( "netherite_katana", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + katana_positive_modifier - katana_negative_modifier),
                    katana_attackspeed,
                    "minecraft:netherite_ingot"));
    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_SAI = ITEM.register( "netherite_sai", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + sai_positive_modifier - sai_negative_modifier),
                    sai_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_SPEAR = ITEM.register( "netherite_spear", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + spear_positive_modifier - spear_negative_modifier),
                    spear_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_GLAIVE = ITEM.register( "netherite_glaive", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + glaive_positive_modifier - glaive_negative_modifier),
                    glaive_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_WARGLAIVE = ITEM.register( "netherite_warglaive", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
                    warglaive_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_CUTLASS = ITEM.register( "netherite_cutlass", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
                    cutlass_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_CLAYMORE = ITEM.register( "netherite_claymore", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + claymore_positive_modifier - claymore_negative_modifier),
                    claymore_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_GREATHAMMER = ITEM.register( "netherite_greathammer", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
                    greathammer_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_GREATAXE = ITEM.register( "netherite_greataxe", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
                    greataxe_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_CHAKRAM = ITEM.register( "netherite_chakram", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + chakram_positive_modifier - chakram_negative_modifier),
                    chakram_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_SCYTHE = ITEM.register( "netherite_scythe", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + scythe_positive_modifier - scythe_negative_modifier),
                    scythe_attackspeed,
                    "minecraft:netherite_ingot"));

    public static final RegistrySupplier<SimplySwordsNetheriteSwordItem> NETHERITE_HALBERD = ITEM.register( "netherite_halberd", () ->
            new SimplySwordsNetheriteSwordItem(
                    ToolMaterials.NETHERITE,
                    (int) (netherite_modifier + halberd_positive_modifier - halberd_negative_modifier),
                    halberd_attackspeed,
                    "minecraft:netherite_ingot"));

}
