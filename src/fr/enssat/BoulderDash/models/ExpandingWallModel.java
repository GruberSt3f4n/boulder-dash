package fr.enssat.BoulderDash.models;

import fr.enssat.BoulderDash.bridges.PublisherBridge;

public class ExpandingWallModel extends ElementDisplayableModel implements PublisherBridge {
	private static String spriteName;
	private static boolean isDestructible;
	private static boolean canMove;
	private static boolean impactExplosive;
	private static boolean animate;
	private static int priority;

	static {
		spriteName = "field_00";
		isDestructible = true;
		canMove = false;
		impactExplosive = false;
		animate = true;
		priority = 10;
	}

	public ExpandingWallModel(int x, int y) {
		super(isDestructible, canMove, x, y, spriteName, priority,
				impactExplosive, animate);
	}
}