package org.main;

import object.OBJ_Key;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {

        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 25 * gp.tileSize;
        gp.obj[0].worldY = 25 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 21 * gp.tileSize;
        gp.obj[1].worldY = 25 * gp.tileSize;
    }
}
