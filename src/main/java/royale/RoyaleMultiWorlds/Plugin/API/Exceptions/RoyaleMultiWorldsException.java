package royale.RoyaleMultiWorlds.Plugin.API.Exceptions;

import org.bukkit.command.CommandSender;

public abstract class RoyaleMultiWorldsException extends Exception {

	private static final long serialVersionUID = 4431313045778030833L;

	public static enum Type {

		// @formatter:off
		
		// World exceptions
		WORLD_CREATE_PERMISSIONDENIED,
		WORLD_CREATE_PERMISSIONDENIEDOTHERS,
		WORLD_CREATE_MAXREACHED,
		WORLD_CREATE_ALREADYEXISTS,
		WORLD_CREATE_ALREADYEXISTSBUKKIT,
		WORLD_CREATE_ALREADYRECOVERED,
		WORLD_CREATE_MISSINGOWNER,
		WORLD_CREATE_MISSINGDISPLAYNAME,
		WORLD_CREATE_SQL,
		WORLD_CREATE_UNKNOWN,

		WORLD_DELETE_PERMISSIONDENIED,
		WORLD_DELETE_PERMISSIONDENIEDOTHERS,
		WORLD_DELETE_ALREADYREQUESTED,
		WORLD_DELETE_NOTFOUND,
		WORLD_DELETE_SQL,
		WORLD_DELETE_UNKNOWN,

		WORLD_LOAD_NOTFOUND,
		WORLD_LOAD_UNKNOWN,
		
		WORLD_UNLOAD_UNKNOWN,
		
		// Member exceptions
		WORLD_MEMBER_SAVE_PERMISSIONDENIED,
		WORLD_MEMBER_SAVE_SQL,
		WORLD_MEMBER_SAVE_UNKNOWN,

		WORLD_MEMBER_DELETE_PERMISSIONDENIED,
		WORLD_MEMBER_DELETE_SQL,
		WORLD_MEMBER_DELETE_UNKNOWN,
		
		// Banned exceptions
		WORLD_BANNED_SAVE_PERMISSIONDENIED,
		WORLD_BANNED_SAVE_SQL,
		WORLD_BANNED_SAVE_UNKNOWN,

		WORLD_BANNED_DELETE_PERMISSIONDENIED,
		WORLD_BANNED_DELETE_SQL,
		WORLD_BANNED_DELETE_UNKNOWN,
		
		// Player settings exceptions
		PLAYERSETTINGS_SAVE_SQL,
		PLAYERSETTINGS_SAVE_UNKNOWN
		
		// @formatter:on
	}

	public RoyaleMultiWorldsException(String message) {
		super(message);
	}

	public RoyaleMultiWorldsException(String message, Throwable exception) {
		super(message, exception);
	}

	public abstract Type getType();

	public abstract void sendError(CommandSender sender);

}
