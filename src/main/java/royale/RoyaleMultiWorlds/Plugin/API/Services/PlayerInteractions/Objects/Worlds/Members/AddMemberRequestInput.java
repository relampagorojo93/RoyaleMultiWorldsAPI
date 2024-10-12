package royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.Worlds.Members;

import java.util.UUID;

import org.bukkit.entity.Player;

import royale.RoyaleMultiWorlds.Plugin.API.Interfaces.World.IWorld;
import royale.RoyaleMultiWorlds.Plugin.API.Services.PlayerInteractions.Objects.PlayerRequestInput;

public class AddMemberRequestInput extends PlayerRequestInput {

	private IWorld world;
	private UUID member;

	public AddMemberRequestInput(Player player, IWorld world, UUID member) {
		super(player);
		this.world = world;
		this.member = member;
	}

	public IWorld getWorld() {
		return this.world;
	}

	public UUID getMember() {
		return this.member;
	}

	public static AddMemberRequestInput inst(Player player, IWorld world, UUID member) {
		return new AddMemberRequestInput(player, world, member);
	}

}
