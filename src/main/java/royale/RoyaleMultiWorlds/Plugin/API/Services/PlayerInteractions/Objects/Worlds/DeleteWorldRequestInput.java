package royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds;

import org.bukkit.entity.Player;

import royale.RoyaleMultiWorlds.Plugin.API.Interfaces.World.IWorld;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class DeleteWorldRequestInput extends PlayerRequestInput {

	private IWorld world;
	private boolean forceDelete;

	public DeleteWorldRequestInput(Player player, IWorld world) {
		super(player);
		this.world = world;
	}

	public IWorld getWorld() {
		return this.world;
	}

	public boolean isForceDelete() {
		return this.forceDelete;
	}

	public DeleteWorldRequestInput setForceDelete(boolean forceDelete) {
		this.forceDelete = forceDelete;
		return this;
	}

	public static DeleteWorldRequestInput inst(Player player, IWorld world) {
		return new DeleteWorldRequestInput(player, world);
	}

}
