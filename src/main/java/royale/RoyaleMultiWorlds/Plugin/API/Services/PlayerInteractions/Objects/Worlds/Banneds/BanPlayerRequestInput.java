package royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.Banneds;

import java.util.UUID;

import org.bukkit.entity.Player;

import royale.RoyaleMultiWorlds.Plugin.API.Interfaces.World.IWorld;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class BanPlayerRequestInput extends PlayerRequestInput {

	private IWorld world;
	private UUID bannedPlayer;

	public BanPlayerRequestInput(Player player, IWorld world, UUID bannedPlayer) {
		super(player);
		this.world = world;
		this.bannedPlayer = bannedPlayer;
	}

	public IWorld getWorld() {
		return this.world;
	}

	public UUID getBannedPlayer() {
		return this.bannedPlayer;
	}

	public static BanPlayerRequestInput inst(Player player, IWorld world, UUID bannedPlayer) {
		return new BanPlayerRequestInput(player, world, bannedPlayer);
	}

}
