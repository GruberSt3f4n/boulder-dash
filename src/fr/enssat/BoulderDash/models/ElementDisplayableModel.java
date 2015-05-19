package fr.enssat.BoulderDash.models;

public abstract class ElementDisplayableModel {
	private static spriteStoragePath;

	private boolean isDestructible;
	private boolean isMoving;
	private boolean animate;
	private boolean impactExplosive;
	private String spriteName;
	private int x;
	private int y;
	private int priority;

	static {
		spriteStoragePath = "./res/drawable/field";
	}

	public ElementDisplayableModel(boolean isDestructible, boolean isMoving, int x,
			int y, String spriteName, int priority, boolean impactExplosive,
			boolean animate) {
		this.isMoving = isMoving;
		this.isDestructible = isDestructible;
		this.spriteName = spriteName;
		this.x = x;
		this.y = y;
		this.animate = animate;
		this.impactExplosive = impactExplosive;
		this.setPriority(priority);
	}

	public boolean isDestructible() {
		return isDestructible;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public String getSpriteName() {
		return spriteName;
	}

	public static String getSpriteStoragePath() {
		return this.spriteStoragePath;
	}

	public String getPathToSprite() {
		return this.getSpriteStoragePath + "/" + this.getSpriteName() + ".png";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isAnimate() {
		return animate;
	}

	public void setAnimate(boolean animate) {
		this.animate = animate;
	}

	public boolean isImpactExplosive() {
		return impactExplosive;
	}

	public void setImpactExplosive(boolean impactExplosive) {
		this.impactExplosive = impactExplosive;
	}

}
