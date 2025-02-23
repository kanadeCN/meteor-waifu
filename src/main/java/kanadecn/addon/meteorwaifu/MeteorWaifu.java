package kanadecn.addon.meteorwaifu;

import kanadecn.addon.meteorwaifu.commands.*;
import kanadecn.addon.meteorwaifu.hud.*;
import kanadecn.addon.meteorwaifu.modules.*;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.commands.Commands;
import meteordevelopment.meteorclient.systems.hud.Hud;
import meteordevelopment.meteorclient.systems.hud.HudGroup;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class AddonTemplate extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    public static final Category CATEGORY = new Category("Meteor Waifu");
    public static final HudGroup HUD_GROUP = new HudGroup("MeteorWaifu");

    @Override
    public void onInitialize() {
        LOG.info("Initializing Meteor Waifu(＞人＜;)");

        // Modules
        Modules.get().add(new ShowCenter());

        // Commands
        Commands.add(new CommandHelp());

        // HUD
        Hud.get().register(HudExample.INFO);
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "kanadecn.addon.meteorwaifu";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("kanadeCN", "meteor-waifu");
    }
}
