package hellfirepvp.astralsorcery.common.crafting;

import hellfirepvp.astralsorcery.common.tile.TileAltar;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: IAltarUpgradeRecipe
 * Created by HellFirePvP
 * Date: 10.10.2016 / 00:04
 */
public interface IAltarUpgradeRecipe {

    public TileAltar.AltarLevel getLevelUpgradingTo();

}