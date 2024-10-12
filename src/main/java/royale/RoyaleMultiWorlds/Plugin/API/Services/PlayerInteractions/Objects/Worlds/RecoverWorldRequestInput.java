package royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds;

import org.bukkit.entity.Player;

import royale.RoyaleMultiWorlds.Plugin.API.Interfaces.World.IWorld;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class RecoverWorldRequestInput extends PlayerRequestInput {

	private IWorld world;

	public RecoverWorldRequestInput(Player player, IWorld world) {
		super(player);
		this.world = world;
	}

	public IWorld getWorld() {
		return this.world;
	}

	public static RecoverWorldRequestInput inst(Player player, IWorld world) {
		return new RecoverWorldRequestInput(player, world);
	}

}
